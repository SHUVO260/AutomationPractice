package autmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException, IOException {
/*Test case-1
          #Search i phone11case  test:
            Open Chrome browser:
            Enter amazon url in address bar and click enter:
            Click on search box:
            Enter i phone11case:
            Click on search button:
            Verify i phone11case is displayed properly:
            ExpectedResult: i phone11case should display properly
            ActualResult: i phone11case display properly */

   /* String chromeDriver="webdriver.chrome.driver";
    String chromeDriverPath="lib\\browser\\chromedriver.exe";
    String url="https://www.amazon.com/";
    String searchBox="//*[@id=\"twotabsearchtextbox\"]";
    String productName="i phone11case";
    String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
    String expectedText="Xundd Case for Apple iPhone 11 (6.1-Inch) with Tempered Glass Screen Protector, Arc-Shaped Handle with Heat Dissipation Hole Design for Gaming, Shockproof Bumper Cover, Dark Green";
    String iphoneActualText="//*[@id=\"landingImage\"]";

        System.setProperty(chromeDriver, chromeDriverPath);
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        //driver.findElement(By.xpath(searchBox)).sendKeys(productName);
        driver.findElement(By.xpath(searchBox)).sendKeys(productName);
        driver.findElement(By.xpath(searchButton)).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath(iphoneActualText)).getText();
        Assert.assertEquals(iphoneActualText,expectedText);
        Thread.sleep(5000);
        driver.close();*/

          /*Test case-2
          #Customer Service tab  test:
            Open Chrome browser:
            Enter amazon url in address bar and click enter:
            Click on Customer Service tab:
            Enter i phone11case:
            Click on search button:
            Verify i phone11case is displayed properly:
            ExpectedResult: Hello. What can we help you with? displayed
            ActualResult: i phone11case display properly */
       /* String chromeDriver="webdriver.chrome.driver";
        String chromeDriverPath="lib\\browser\\chromedriver.exe";
        String url1="https://www.amazon.com/";
        String customerServiceTab="//*[@id=\"nav-xshop\"]/a[2]";
        String expectedText="Hello. What can we help you with? displayed";
        String actualText="[@id=\"nav-xshop\"]/a[2]";

        System.setProperty(chromeDriver,chromeDriverPath);
        WebDriver driver1= new ChromeDriver();
        driver1.get(url1);
        driver1.findElement(By.xpath(customerServiceTab)).click();
        driver1.findElement(By.xpath(actualText)).getText();
        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(5000);
        driver1.close();*/

 /*  Test case-3
 Test Try sell button
 # Sign in Functionality test
• Open Chrome browser
• Enter amazon home page url in address bar hit enter
• Click on Try sell button
• Verify Try sell button displayed properly */


        String chromeDriver = "webdriver.gecko.driver";
        String chromeDriverPath = "lib\\webBrowser\\geckodriver.exe";
        String url = "https://www.amazon.com/";
        String searchBox = "//*[@id=\"twotabsearchtextbox\"]";
        String productName = "i phone11case";
        String searchButton = "//*[@id=\"nav-search\"]/form/div[2]/div/input";
        String expectedText = "Xundd Case for Apple iPhone 11 (6.1-Inch) with Tempered Glass Screen Protector, Arc-Shaped Handle with Heat Dissipation Hole Design for Gaming, Shockproof Bumper Cover, Dark Green";
        String iphoneActualText = "//*[@id=\"landingImage\"]";
        System.setProperty(chromeDriver, chromeDriverPath);
        /*WebDriver driver = new Geck
        driver.get(url);
        //driver.findElement(By.xpath(searchBox)).sendKeys(productName);
        driver.findElement(By.xpath(searchBox)).sendKeys(productName);
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(iphoneActualText)).getText();
        Assert.assertEquals(iphoneActualText, expectedText);
        Thread.sleep(5000);
        driver.close();*/
    }
}

