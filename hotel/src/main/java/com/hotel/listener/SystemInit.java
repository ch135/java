package com.hotel.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SystemInit implements ServletContextListener{


	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("System Start.");
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("System Stop.");
		
	}

}
