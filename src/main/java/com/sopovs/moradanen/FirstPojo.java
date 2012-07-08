package com.sopovs.moradanen;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.google.inject.servlet.SessionScoped;

@SessionScoped
@Component
@Scope("session")
public class FirstPojo {

	@Inject
	private SecondPojo second;

	public String sayHello() {
		return "Hello";
	}

	public String secondSayHello() {
		return second.sayHello();
		// return "Hello";
	}

}
