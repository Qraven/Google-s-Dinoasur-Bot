import java.awt.*;
import java.awt.image.BufferedImage;

public class main {

    public static void main  (String args[]) throws AWTException{

        int jumpX = 330;
        int jumpY = 434;



        functions functions = new functions();

        functions.restartGame(500, 400);




        while(true) {

            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            int colour = image.getRGB(jumpX, jumpY);

            int  restartRed = (colour & 0x00ff0000) >> 16;
            int  restartGreen = (colour & 0x0000ff00) >> 8;
            int  restartBlue = colour & 0x000000ff;

            int  red = (colour & 0x00ff0000) >> 16;
            int  green = (colour & 0x0000ff00) >> 8;
            int  blue = colour & 0x000000ff;

            if (red == 83 && green == 83 && blue == 83) {

                functions.jump();
            }else if (red == 86 && blue == 86 && green == 86){

                functions.jump();
            }

        }

    }
}
