package com.sam.designpattern.proxy;

public class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void executeCommand(String command) {
		System.out.println("Command executed-----" + command);
		
	}

}
