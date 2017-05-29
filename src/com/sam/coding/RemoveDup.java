package com.sam.coding;

public class RemoveDup {
	public static void main(String args[]) {
		//new RemoveDup().removeDup();
		new RemoveDup().reverseString();
	}

	private void reverseString() {
		String name = "sambitsssc";
		int size = name.length();
		char arr[] = new char[size];
		
		for (int i = 0; i < size; i++) {
			arr[size- (i+1)] = name.charAt(i);
		}
		
		System.out.println(new String(arr));
		
	}

	private void removeDup() {
		String name = "sambitsssc";
		int size = name.length();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < size; i++) {
			char ch = name.charAt(i);

			int indexOf = name.indexOf(ch, i + 1);

			if (indexOf == -1) {

				sb.append(ch);
			}
		}

		System.out.println(sb.toString());

	}
}
