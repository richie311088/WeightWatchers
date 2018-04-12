package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindMeetingPage {
	private static WebElement element = null;
	private static List<WebElement> element1 =null;
	 
	 public static WebElement meetingSearch(WebDriver driver){
	 
		 element = driver.findElement(By.id("meetingSearch"));
	 
	    return element;
	 }
	    
	    public static WebElement firstResult(WebDriver driver){
	   	 
	    	element = driver.findElement(By.className("location__name"));
		 
		    return element;
	     
}
	    public static WebElement locationDistance(WebDriver driver){
		   	 
	    	element = driver.findElement(By.className("location__distance"));
		 
		    return element;
}
	    public static List<WebElement> hoursOfOperation(WebDriver driver){
		   	 
	    	element1 = driver.findElements(By.className("hours-list-item"));
		 
		    return element1;
}
}
