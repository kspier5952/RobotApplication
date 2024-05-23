import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot {
    public static void main(String[]args) throws Exception {
        Robot melissa = new Robot();
        melissa.delay(3000);
        melissa.mouseMove(1300, 60);
        melissa.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        melissa.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        int k = 1;
        while (k < 2) {
            melissa.keyPress(68);
            melissa.keyRelease(68);
            melissa.keyPress(79);
            melissa.keyRelease(79);
            melissa.keyPress(71);
            melissa.keyRelease(71);
            melissa.keyPress(79);
            melissa.keyRelease(79);
            melissa.keyPress(32);
            melissa.keyRelease(32);
            melissa.keyPress(65);
            melissa.keyRelease(65);
            melissa.keyPress(82);
            melissa.keyRelease(82);
            melissa.keyPress(71);
            melissa.keyRelease(71);
            melissa.keyPress(69);
            melissa.keyRelease(69);
            melissa.keyPress(78);
            melissa.keyRelease(78);
            melissa.keyPress(84);
            melissa.keyRelease(84);
            melissa.keyPress(73);
            melissa.keyRelease(73);
            melissa.keyPress(78);
            melissa.keyRelease(78);
            melissa.keyPress(79);
            melissa.keyRelease(79);
            melissa.keyPress(32);
            melissa.keyRelease(32);
            k += 1;
        }
        melissa.keyPress(10);
        melissa.keyRelease(10);

        melissa.mouseMove(0, 1050);
        melissa.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        melissa.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        melissa.delay(1000);
        melissa.mouseMove(125, 700);
        melissa.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        melissa.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        melissa.delay(500);
        melissa.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        melissa.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        melissa.delay(500);
        melissa.mouseMove(1250, 600);
        melissa.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        melissa.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        melissa.delay(500);
        melissa.mouseMove(1225, 525);
        melissa.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        melissa.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        melissa.delay(500);
        melissa.mouseMove(1250, 925);
        melissa.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        melissa.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}