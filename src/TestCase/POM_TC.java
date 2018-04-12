package TestCase;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.FindMeetingPage;
import PageObjects.MeetingLink;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class POM_TC extends ScriptBase {


    @Test
    public void test1(){
    	WebDriverWait wait = new WebDriverWait(driver, 20);
       
       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ela-menu-visitor-desktop-supplementa_find-a-meeting")));
        String titleOfHomePage=driver.getTitle();
        
        Assert.assertEquals("Weight Loss Program, Recipes & Help | Weight Watchers",titleOfHomePage);
        System.out.println("HomePageTitle: "+titleOfHomePage);


       MeetingLink.meetingLink(driver).click();
        
        String titleOfPage=driver.getTitle();
        Assert.assertEquals("Find A Meeting: Get Schedules & Times Near You | Weight Watchers",titleOfPage);
        System.out.println("MeetingPageTitle: "+titleOfPage);
        

        FindMeetingPage.meetingSearch(driver).click();
        FindMeetingPage.meetingSearch(driver).sendKeys("10011");
        FindMeetingPage.meetingSearch(driver).sendKeys(Keys.ENTER);


        String text =FindMeetingPage.firstResult(driver).getText();

        
        System.out.println("TitleOfTheFisrtSearchResult: "+text);
        

        String distance =FindMeetingPage.locationDistance(driver).getText();
        System.out.println("DistanceOfTheFisrtResult"+distance);
      

        FindMeetingPage.firstResult(driver).click();
        String search=FindMeetingPage.firstResult(driver).getText();
        Assert.assertEquals(text,search);
        System.out.println("The first search result matches the displayed location name");
        System.out.println(search);
        



        List<WebElement> todaysTiming = FindMeetingPage.hoursOfOperation(driver);

        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEE", Locale.US);
        String str = dateFormat.format(d);

        for(int i=0;i<todaysTiming.size();i++){

            String item=todaysTiming.get(i).getText();
            if(item.contains(str)){
                System.out.println(item);
                break;
            }


        }

    }



}