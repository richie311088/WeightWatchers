package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MeetingLink {
	 private static WebElement element = null;
	 
	 public static WebElement meetingLink(WebDriver driver){
	 
	    element = driver.findElement(By.id("ela-menu-visitor-desktop-supplementa_find-a-meeting"));
	 
	    return element;
	     
}
}
