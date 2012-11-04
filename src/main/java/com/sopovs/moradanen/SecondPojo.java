package com.sopovs.moradanen;

import com.google.inject.servlet.SessionScoped;
import javax.inject.Inject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@SessionScoped
@Component
@Scope("session")
public class SecondPojo {

	@Inject
	private FirstPojo first;

	public String sayHello() {
		return first.sayHello();
	}

}
