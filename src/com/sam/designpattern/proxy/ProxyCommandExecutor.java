package com.sam.designpattern.proxy;

import javax.naming.NoPermissionException;

public class ProxyCommandExecutor implements CommandExecutor {

	CommandExecutor commandExecutor;

	boolean isAdmin;

	public ProxyCommandExecutor(String uname, String pwd) {
		if (uname.equals("sambitc") && pwd.equalsIgnoreCase("mindfire")) {
			isAdmin = true;
			commandExecutor = new CommandExecutorImpl();

		} else {
			isAdmin = false;
		}
	}

	@Override
	public void executeCommand(String command) throws NoPermissionException {
		try {
			if (isAdmin)
				commandExecutor.executeCommand(command);
			else
				throw new NoPermissionException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
