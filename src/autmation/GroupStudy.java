package autmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GroupStudy {

    public static void main(String[] args) throws InterruptedException {

        String chromeDriver="webdriver.chrome.driver";
        String chromeDriverPath="lib\\browser\\chromedriver.exe";
        String url="https://www.amazon.com/";
        String searchBox="//*[@id=\"twotabsearchtextbox\"]";
        String productSearch="watch for men";
        String searchButton="//*[@id=\"nav-search-submit-text\"]/input";
// String watchActualText="//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]";
        String fiziliWatch="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[3]/h2/a/span";
        String actualTextforFizili="//*[@id=\"titleBlockRightSection\"]";
        String expectedText="\"Mens Watches Ultra-Thin Minimalist Waterproof - Fashion Wrist Watch for Men Unisex Dress with Stainless Steel Mesh Band\"";


        System.setProperty(chromeDriver,chromeDriverPath);
        WebDriver webDriver= new ChromeDriver();
        webDriver.get(url);
        webDriver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        webDriver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath(fiziliWatch)).click();
        Thread.sleep(3000);
        String actualText=webDriver.findElement(By.xpath(actualTextforFizili)).getText();
        Assert.assertEquals(actualTextforFizili,expectedText);
        Thread.sleep(3000);
        webDriver.close();

    }
}
