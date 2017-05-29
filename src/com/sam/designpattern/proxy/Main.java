package com.sam.designpattern.proxy;

import javax.naming.NoPermissionException;

public class Main {
	public static void main(String args[]) throws NoPermissionException {
		
		CommandExecutor commandExe = new ProxyCommandExecutor("sambitc", "mindfire");
		commandExe.executeCommand("save");
	}
}
