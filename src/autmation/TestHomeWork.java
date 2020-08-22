package autmation;

import org.testng.annotations.Test;

public class TestHomeWork extends HomeWorkSelenium{
    @Test
    public void testIphone11Case() throws InterruptedException {
        iPhone11Case();

    }
    @Test
    public void testServiceButton() throws InterruptedException {
        service();
    }
    @Test
    public void testSellButton() throws InterruptedException {
        sell();
    }
    @Test
    public void testCouponsButton() throws InterruptedException {
        coupons();
    }
    @Test
    public void testRegistryButton() throws InterruptedException {
        registry();
    }
    @Test
    public void testBestSellers() throws InterruptedException {
        bestSellers();
    }
    @Test
    public void testNewReleasesButton() throws InterruptedException {
        newReleases();
    }
@Test
    public void testFindAGiftButton() throws InterruptedException {
        findAGiftButton();
}

}
