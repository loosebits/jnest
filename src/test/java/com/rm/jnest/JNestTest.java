package com.rm.jnest;

import org.junit.Test;

import com.lo9ic.research.nest.Credentials;
import com.lo9ic.research.nest.JNest;

public class JNestTest {

	@Test
	public void test() {
		JNest jnest = new JNest();
		Credentials credentials = new Credentials(System.getProperty("user"), System.getProperty("password"));
		jnest.setCredentials(credentials );
		jnest.login();
		jnest.getStatus();
		for (String deviceId : jnest.getStatusResponse().getDevices().getDeviceIds()) {
			System.out.println(jnest.getStatusResponse().getDevices().getDevice(deviceId));
		}
	}

}
