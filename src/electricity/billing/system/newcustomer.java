package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class newcustomer extends JFrame {
    newcustomer(){
        super("New customer ");
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(252,186,3));
        setSize(500,700);
        setLocation(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {

        new newcustomer();
    }
}
