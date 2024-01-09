package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TrainTicketBookingPagePO {
    WebDriver driver;

    @FindBy(xpath = "//p[text()='Book Train tickets']")
    WebElement BookTrainRadioButton;
    @FindBy(xpath = "//p[text()='Check PNR Status']")
    WebElement CheckPNRRadioButton;
    @FindBy(xpath = "//input[@id='src']")
    WebElement From;
    @FindBy(xpath = "//input[@id='dst']")
    WebElement To;
    @FindBy(xpath = "//div[@class='home_calendar']")
    WebElement Date;
    @FindBy(xpath = "//button[@class='search-btn ']")
    WebElement SearchTrains;



    public TrainTicketBookingPagePO(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnCheckPNRRadio()
    {
        CheckPNRRadioButton.click();
    }
    public void clickOnTrainBookRadio()
    {
        BookTrainRadioButton.click();
    }
    public void setFrom(String a) throws InterruptedException {
        From.sendKeys(a);
        List<WebElement> list =driver.findElements(By.xpath("//div[@class='stn_code stn_pop_code']"));
        for(int i=0;i<list.size();i++)
        {
            String Actual =list.get(i).getText();
            if(Actual.contains(a))
            {
                list.get(i).click();
                Thread.sleep(5000);
                System.out.println("selected area");
                break;
            }
        }

    }
    public void getdateText() throws InterruptedException {
        WebElement d=driver.findElement(By.xpath("//img[@alt='calendar_icon']"));
        d.click();
        d.click();
        Thread.sleep(5000);
        WebElement e=driver.findElement(By.xpath("(//div[@class='sc-gqjmRU fnURhG'])[2]"));
        String s=e.getText();
        System.out.println(s);
    }

}

