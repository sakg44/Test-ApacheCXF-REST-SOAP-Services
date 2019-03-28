package org.abdou.security;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class AuthentificationChecker implements CallbackHandler {

	@Override
	public void handle(Callback[] arg0) throws IOException, UnsupportedCallbackException {
		
		     WSPasswordCallback password = (WSPasswordCallback) arg0[0];
		     System.out.println("look le pwd"+password.getIdentifier());
		    // password.setPassword("test");
		
	}

}
