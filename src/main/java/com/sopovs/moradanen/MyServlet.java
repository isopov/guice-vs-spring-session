package com.sopovs.moradanen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

@Singleton
public class MyServlet extends HttpServlet implements HttpRequestHandler {
	private static final long serialVersionUID = 1L;

	@Inject
	Provider<FirstPojo> firstProvider;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter respWriter = resp.getWriter();
		respWriter.print(firstProvider.get().secondSayHello());
		respWriter.flush();
	}

	@Override
	public void handleRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
