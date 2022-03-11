
import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class P {
    public static void main(String[] args) throws InterruptedException {
        Robot R = null;
        try {
            R = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        while (true == true) {
            TimeUnit.SECONDS.sleep(3/4);
            double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
            double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
            int MX = (int)Math.round(mouseX);
            int MY = (int)Math.round(mouseY);
            System.out.println("(X:" + mouseX + ")" + " | " + "(Y:" + mouseY + ")");
            Random random = new Random();
            MX = MX + ( random.nextBoolean() ? 1 : -1 );
            MY= MY + ( random.nextBoolean() ? 1 : -1 );
            R.mouseMove(MX, MY );
            System.out.println("NEW (X:" + MX + ")" + " | " + "(Y:" + MY + ")");
        }
    }
}