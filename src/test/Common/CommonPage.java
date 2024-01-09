package Common;
import java.awt.*;
import java.awt.event.KeyEvent;

public class CommonPage {


    public void closeWindowWithRobotClass() throws AWTException {
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_ESCAPE);

    }
    public void scrollPagedownWithRobot() throws AWTException {
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_PAGE_DOWN);
    }
    public void scrollPagEuPWithRobot() throws AWTException {
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_PAGE_UP);
    }

}