import java.awt.*;
import java.awt.event.MouseEvent;


public class functions  {

    Robot robot = new Robot();

    public functions() throws AWTException {
    }


    public void restartGame(int restartX, int restartY){
        robot.mouseMove(restartX, restartY);
        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        robot.delay(5);
        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);

    }

    public void jump(){

        robot.keyPress(32);
        robot.delay(1);
        robot.keyRelease(32);

    }
}
