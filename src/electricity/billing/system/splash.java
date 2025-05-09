package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class splash extends JFrame {
    splash(){
        //to set image
        ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("icon/splash/Splash.jpg"));
        Image i1=ic1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon ic2=new ImageIcon(i1);
        JLabel l1=new JLabel(ic2);
        add(l1);



        setSize(500,500);
        setLocation(400,200);
        setVisible(true);
        //hold time of frame by try and catch method
        try {
            Thread.sleep(2000);
            setVisible(false);
            new login();//to go into new frame by try and catch method
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new splash();
    }
}
