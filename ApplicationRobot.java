import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot {
    public static void main(String[]args) throws Exception {
        Robot melissa = new Robot();
        melissa.delay(5);
        melissa.mouseMove(100, 20);
        melissa.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        int k = 0;
        while (k < 100) {
            melissa.keyPress(82);
            melissa.keyRelease(82);
            melissa.keyPress(79);
            melissa.keyRelease(79);
            melissa.keyPress(66);
            melissa.keyRelease(66);
            melissa.keyPress(79);
            melissa.keyRelease(79);
            melissa.keyPress(84);
            melissa.keyRelease(84);
            k += 1;
        }
    }
}