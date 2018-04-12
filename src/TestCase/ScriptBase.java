package TestCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ScriptBase {
    protected WebDriver driver=null;

    @BeforeMethod
    public void setUp(){

        System.out.println("****starting the browseR*****");

        System.setProperty("webdriver.chrome.driver", ".\\src\\chromedriver.exe");
        
        //System.out.println("ProjectDriverpath:"+System.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        
        driver.navigate().to("https://www.weightwatchers.com/us/");
        

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}