package TestCases;

import org.testng.annotations.Test;
import PageObjects.LandingPagePO;
import PageObjects.TrainTicketBookingPagePO;

public class TrainTicketBookingPage extends BaseClass{

    @Test(description = "Verify the PNRRadio button on TTB page")
    public void verifyPNRRadioButton() throws InterruptedException {
        LandingPagePO lpo=new LandingPagePO(driver);
        TrainTicketBookingPagePO tpo=new TrainTicketBookingPagePO(driver);
        getUrl();
        lpo.clickTrainTickets();
        Thread.sleep(5000);
        //tpo.verifyGetdateText();
        tpo.clickOnCheckPNRRadio();
    }
    @Test(description = "Getting the current month and year from date calender field")
    public void verifyGetDateText() throws InterruptedException {
        LandingPagePO lpo=new LandingPagePO(driver);
        getUrl();
        lpo.clickTrainTickets();
        TrainTicketBookingPagePO tpo=new TrainTicketBookingPagePO(driver);
        tpo.getdateText();
    }



}

