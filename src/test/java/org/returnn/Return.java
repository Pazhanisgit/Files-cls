package org.returnn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Return {

 public static void main(String[] args) {
	
	 WebDriver driver=new ChromeDriver();
	 ChromeOptions co=new ChromeOptions();
	 co.setBinary("C:\\Users\\Admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	 driver.get("www.facebook.com");
}
 

	
		
	
	
}
