package autmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GroupPractice {
    public static void main(String[] args) throws InterruptedException {
            String chromeDriver="webdriver.chrome.driver";
    String chromePath="lib\\browser\\chromedriver.exe";
    String url="https://www.amazon.com/";
    // String todaysDeal="//*[@id=\"nav-xshop\"]/a[1]";
    String todaysDeals="//*[@id=\"nav-xshop\"]/a[3]";
    String expectedTodaysDeal="Today's Deals";
    String actualTodaysDeals="//*[@id=\"gbox-item-0.0.0\"]/div/div/div[1]/h1/div[1]";

System.setProperty(chromeDriver,chromePath);
        WebDriver myDriver= new ChromeDriver();
        myDriver.get(url);
        myDriver.findElement(By.xpath(todaysDeals)).click();
        Thread.sleep(3000);
        Assert.assertEquals(actualTodaysDeals,expectedTodaysDeal);

        Thread.sleep(3000);
            myDriver.close();
    }
}
