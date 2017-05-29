package com.sam.designpattern.proxy;

import javax.naming.NoPermissionException;

public interface CommandExecutor {
	
	public void executeCommand(String command) throws NoPermissionException;

}
