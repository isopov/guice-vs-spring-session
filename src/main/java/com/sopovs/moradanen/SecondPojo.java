package com.sopovs.moradanen;

import javax.inject.Inject;

import com.google.inject.servlet.SessionScoped;

@SessionScoped
public class SecondPojo {

	@Inject
	private FirstPojo first;

	public String sayHello() {
		return first.sayHello();
	}

}
