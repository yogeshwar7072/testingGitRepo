package com.first.org.Log4J;
import org.apache.log4j.Logger;  

import java.io.*;  
import java.sql.SQLException;  
import java.util.*;  
  
import org.apache.log4j.Logger;  
import org.apache.log4j.xml.DOMConfigurator;  
  
public class HelloWorld {  
  
    static Logger logger = Logger.getLogger(HelloWorld.class);  
      
    public static void main(String[] args) {  
        DOMConfigurator.configure("log4j.xml");  
        logger.debug("Sample debug message");  
        logger.info("Sample  message");  
        logger.warn("Sample warn message");  
   
    }  
}  