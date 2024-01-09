package TestCases;

import org.testng.annotations.Test;
import PageObjects.LandingPagePO;

import java.awt.*;

public class LandingPage extends BaseClass {

    @Test(description = "Verify the BusTickets logo Landing Page")
    public void verifyBusTickets()
    {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.clickBusTickets();
    }
    @Test(description = "Verify the OTP is enabled in Login account with valid Number")
    public void verifyOtpisEnabled() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.clickAccount();
        lPO.clickLogin();
        lPO.switchToFrame();
        lPO.enterPhoneNum("Valid NUmber");

    }
    @Test(description = "Entering the Input to From Text Field in Landing Page ")
    public void verifyFromInput() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.setFromStart("chennai","Koyambedu");

    }

    @Test(description = "Entering the Input to To Text Field in Landing Page")
    public void verifyToInput() throws InterruptedException {
        LandingPagePO lPO=new LandingPagePO(driver);
        getUrl();
        lPO.setTodest("hyderabad","Ameerpet");
    }

    @Test(description = "clicking the BookCab which is in bottom of Landing page")
    public void verifyBookCab() throws AWTException {
        LandingPagePO lpo=new LandingPagePO(driver);
        getUrl();
        // cp.scrollPagedownWithRobot();
        lpo.clickOnBookCab();

    }
}