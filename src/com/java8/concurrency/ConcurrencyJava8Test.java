package com.java8.concurrency;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class ConcurrencyJava8Test {
	public static void main(String args[]) {
		new ConcurrencyJava8Test().call();
	}

	private void call() {
		// TODO Auto-generated method stub

	}

	public void renderPage(CharSequence source) {
		List<ImageInfo> info = scanForImageInfo(source);
		
		// create Callable representing download of all images
		final Callable<List<ImageData>> task = () -> info.stream().map(ImageInfo::downloadImage)
				.collect(Collectors.toList());
		
		// submit download task to the executor
		Future<List<ImageData>> images = executor.submit(task);
		// renderText(source);
		try {
			// get all downloaded images (blocking until all are available)
			final List<ImageData> imageDatas = images.get();
			// render images
			imageDatas.forEach(this::renderImage);
		} catch (InterruptedException e) {
			// Re-assert the thread’s interrupted status
			Thread.currentThread().interrupt();
			// We don’t need the result, so cancel the task too
			images.cancel(true);
		} catch (ExecutionException e) {
			throw launderThrowable(e.getCause());
		}
	}
	
	Function<ImageInfo, ImageData> infoToData = imageInfo -> { 
		   CompletableFuture<ImageData> imageDataFuture = 
		       CompletableFuture.supplyAsync(imageInfo::downloadImage, executor); 
		   try { 
		       return imageDataFuture.get(5, TimeUnit.SECONDS); 
		   } catch (InterruptedException e) { 
		       Thread.currentThread().interrupt(); 
		       imageDataFuture.cancel(true); 
		       return ImageData.createIcon(e); 
		   } catch (ExecutionException e) { 
		       throw launderThrowable(e.getCause()); 
		   } catch (TimeoutException e) { 
		       return ImageData.createIcon(e); 
		   } 
		}
}
