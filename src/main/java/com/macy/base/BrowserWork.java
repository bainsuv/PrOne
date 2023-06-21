package com.macy.base;


import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserWork {
	
	public static ChromeDriver dr=null;
	
	public static ChromeDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src//main//resources//Drivers//chromedriver.exe");
		 dr=new ChromeDriver();
		dr.get("https://www.macys.com");
		return dr;	
		}
}
