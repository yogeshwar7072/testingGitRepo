package com.first.org.Log4J;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class TestWithLoop {
	 private  static final Logger logger = Logger.getLogger(TestWithLoop.class);  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DOMConfigurator.configure("log4j.xml"); 
		for (int i = 0; i < 10; i++) {
			logger.warn("warning "+i);
		}

	}

}
