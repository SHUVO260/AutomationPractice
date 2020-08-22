package autmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HomeWorkSelenium {
    public WebDriver myDriver;
    String chromeDriver="webdriver.chrome.driver";
    String chromeDriverPath="lib\\browser\\chromedriver.exe";
    String url="https://www.amazon.com/";
    String signInUrl="";

    @BeforeMethod
    public void welcome(){
        System.out.println("Welcome to Amazon Home page");
    }
    public void launchBrowser(String driverUrl,String driverPath,String signInUrl){
        System.setProperty(driverUrl,driverPath);
        myDriver=new ChromeDriver();
        myDriver.get(url);
    }
    public void setUp(String driverUrl, String driverPath,String url){
        System.setProperty(driverUrl,driverPath);
        myDriver=new ChromeDriver();
        myDriver.get(url);
    }
    @AfterMethod
    public  void closeBrowser(){
        myDriver.close();
    }
     /*Search i phone11case  test:
    Open Chrome browser:
    Enter amazon url in address bar and click enter:
    Click on search box:
    Enter i phone11case:
    Click on search button:
    Verify i phone11case is displayed properly:
    ExpectedResult: i phone11case should display properly
    ActualResult: "//*[@id=\"landingImage\"]"; */
    public String searchBox="//*[@id=\"twotabsearchtextbox\"]";
    public String productName="i phone11case";
    public String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
    public String expectedText="Xundd Case for Apple iPhone 11 (6.1-Inch) with Tempered Glass Screen Protector, Arc-Shaped Handle with Heat Dissipation Hole Design for Gaming, Shockproof Bumper Cover, Dark Green";
    public String iphoneActualText="//*[@id=\"landingImage\"]";

    public void iPhone11Case() throws InterruptedException {
        setUp(chromeDriver,chromeDriverPath,url);
//        myDriver.findElement(By.xpath(searchBox)).sendKeys(productName);
        myDriver.findElement(By.xpath(searchBox)).sendKeys(productName);
        myDriver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(4000);
//        myDriver.findElement(By.xpath(iphoneActualText)).getText();
//        Assert.assertEquals(iphoneActualText,expectedText);
//        Thread.sleep(5000);
    }
     /*Test case-2
          #Customer Service button  test:
            Open Chrome browser:
            Enter amazon url in address bar and click enter:
            Click on Customer Service tab:
            Enter i phone11case:
            Click on search button:
            Verify i phone11case is displayed properly:
            ExpectedResult: Hello. What can we help you with? displayed
            ActualResult: [@id=\"nav-xshop\"]/a[2] */
    public String customerServiceTab="//*[@id=\"nav-xshop\"]/a[2]";
    public String expectedTextForTab="Hello. What can we help you with? displayed";
    public String actualText="[@id=\"nav-xshop\"]/a[2]";

    public void service() throws InterruptedException {
        setUp(chromeDriver,chromeDriverPath,url);
        System.setProperty(chromeDriver,chromeDriverPath);

        myDriver.findElement(By.xpath(customerServiceTab)).click();
//        myDriver.findElement(By.xpath(actualText)).getText();
//        Assert.assertEquals(actualText,expectedText);
//        Thread.sleep(5000);
    }
 /*  Test case-3
 Test sell button
 # Sign in Functionality test
• Open Chrome browser
• Enter amazon home page url in address bar hit enter
• Click on Try sell button
• Verify Try sell button displayed properly
 ExpectedResult: Hello. Become an Amazon seller
  ActualResult: //*[@id="eventColor"]/div[3]/div/div/div[1]/div/div[4]/div/div[1]/div[1]/div[2]/h1 **/

    public String sellButton="//*[@id=\"nav-xshop\"]/a[10]";
    public String expectedTextForSell="Become an Amazon seller";
    public String actualTextForSell="//*[@id=\"eventColor\"]/div[3]/div/div/div[1]/div/div[4]/div/div[1]/div[1]/div[2]/h1";

    public void sell() throws InterruptedException {
        setUp(chromeDriver,chromeDriverPath,url);
        myDriver.manage().window().fullscreen();
        System.setProperty(chromeDriver,chromeDriverPath);
        Thread.sleep(3000);
        myDriver.findElement(By.xpath(sellButton)).click();
        Thread.sleep(3000);

//        myDriver.findElement(By.xpath(actualTextForSell)).getText();
//        Assert.assertEquals(actualTextForSell,expectedTextForSell);
//        Thread.sleep(5000);
    }
/*  Test case-4
 Test coupons button
 # Sign in Functionality test
• Open Chrome browser
• Enter amazon home page url in address bar hit enter
• Click on coupons button
• Verify Amazon  coupons displayed properly
ExpectedResult: Amazon coupons
ActualResult: "//*[@id="merchandised-content"]/div[1]/div[1]/div/h1";*/
    public String couponsButton="//*[@id=\"nav-xshop\"]/a[11]";
    public String expectedTextForCoupons="Amazon coupons";
    public String actualTextForCoupons="//*[@id=\"merchandised-content\"]/div[1]/div[1]/div/h1";

    public void coupons() throws InterruptedException {
        setUp(chromeDriver,chromeDriverPath,url);
        myDriver.manage().window().fullscreen();
        System.setProperty(chromeDriver,chromeDriverPath);
        Thread.sleep(3000);
        myDriver.findElement(By.xpath(couponsButton)).click();
        Thread.sleep(3000);
//       myDriver.findElement(By.xpath(actualTextForCoupons)).getText();
//       Assert.assertEquals(actualTextForCoupons,expectedTextForCoupons);
//       Thread.sleep(3000);
    }
/*  Test case-5
 Test Registry button
 # Sign in Functionality test
• Open Chrome browser
• Enter amazon home page url in address bar hit enter
• Click on Registry button
• Verify Register with Amazon displayed properly
ExpectedResult: Register with Amazon
ActualResult: "//*[@id="merchandised-content"]/div[1]/div[1]/div/h1";*/

    public String registryButton="//*[@id=\"nav-xshop\"]/a[9]";
    public String expectedTextForRegistry="Register with Amazon";
    public String actualTextForRegistry="//*[@id=\"contentGrid_509848\"]/div/div[1]/div/div/div/img";

    public void registry() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        myDriver.manage().window().fullscreen();
        System.setProperty(chromeDriver, chromeDriverPath);
        Thread.sleep(3000);
        myDriver.findElement(By.xpath(registryButton)).click();
        Thread.sleep(3000);
//        myDriver.findElement(By.xpath(actualTextForRegistry)).getText();
//       Assert.assertEquals(actualTextForRegistry,expectedTextForRegistry);
//       Thread.sleep(3000);

    }
/*  Test case-6
 Test Best sellers button
 # Sign in Functionality test
• Open Chrome browser
• Enter amazon home page url in address bar hit enter
• Click on Best sellers button
ExpectedResult: Register with Amazon
ActualResult: "//*[@id="merchandised-content"]/div[1]/div[1]/div/h1";*/
    public String bestSellersButton="//*[@id=\"nav-xshop\"]/a[1]";
    public String expectedTextForBestSellersButton=" Amazon Best Sellers page displayed";
    public String actualTextForBestSellersButton="//*[@id=\"zg_col1\"]";

    public void bestSellers() throws InterruptedException {
        setUp(chromeDriver,chromeDriverPath,url);
        System.setProperty(chromeDriver,chromeDriverPath);
        Thread.sleep(2000);
        myDriver.findElement(By.xpath(bestSellersButton)).click();
        Thread.sleep(2000);
//        myDriver.findElement(By.xpath(actualTextForBestSellersButton)).getText();
//        Assert.assertEquals(actualTextForBestSellersButton,expectedTextForBestSellersButton);
//        Thread.sleep(2000);
//
    }
/*  Test case-6
 Test New Releases button
 # Sign in Functionality test
• Open Chrome browser
• Enter amazon home page url in address bar hit enter
• Click on New Release button
ExpectedResult: Amazon Hot New Release
ActualResult: "//*[@id="zg_col1"]";*/
    public String newReleasesButton="//*[@id=\"nav-xshop\"]/a[1]";
    public String expectedTextForNewReleasesButton=" Amazon Best Sellers page displayed";
    public String actualTextForNewReleasesButton="//*[@id=\"zg_col1\"]";

    public void newReleases() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        myDriver.manage().window().fullscreen();
        System.setProperty(chromeDriver, chromeDriverPath);
        Thread.sleep(2000);
        myDriver.findElement(By.xpath(newReleasesButton)).click();
        Thread.sleep(2000);
//        myDriver.findElement(By.xpath(actualTextForNewReleasesButton)).getText();
//       Assert.assertEquals(actualTextForNewReleasesButton,expectedTextForBestSellersButton);
//        Thread.sleep(2000);
//
    }
    /*  Test case-7
     Test Find a Gift button
     # Sign in Functionality test
    • Open Chrome browser
    • Enter amazon home page url in address bar hit enter
    • Click on Find a Gift button
    ExpectedResult:All types of Gift page displayed
    ActualResult: "//*[@id="zg_col1"]";*/
    public String findAGift="//*[@id=\"nav-xshop\"]/a[5]";
    public String expectedTextForFindAGift=" All types of Gift page displayed";
    public String actualTextForFindAGift="//*[@id=\"a-page\"]";

    public void findAGiftButton() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        myDriver.manage().window().fullscreen();
        System.setProperty(chromeDriver, chromeDriverPath);
        Thread.sleep(2000);
        myDriver.findElement(By.xpath(findAGift)).click();
        Thread.sleep(3000);
//        myDriver.findElement(By.xpath(actualTextForFindAGift)).getText();
//        Assert.assertEquals(actualTextForFindAGift,expectedTextForFindAGift);
//        Thread.sleep(2000);

    }
}
