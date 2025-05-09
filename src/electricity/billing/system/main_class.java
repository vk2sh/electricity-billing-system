package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class main_class extends JFrame {
    main_class(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/off2.png"));
        Image image=imageIcon.getImage().getScaledInstance(1530,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel imagelabel=new JLabel(imageIcon1);
        add(imagelabel);

        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu=new JMenu("Menu");
        menu.setFont(new Font("srif",Font.PLAIN,20));
        menuBar.add(menu);

        JMenuItem newcustomer=new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon costomerimg=new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image costomerimage=costomerimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(costomerimage));
        menu.add(newcustomer);

        JMenuItem customerdetails=new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerdetailsimg=new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image customerdetailsimage=customerdetailsimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(customerdetailsimage));
        menu.add(customerdetails);
        JMenuItem depositdetails=new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon depositdetailsimg=new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
        Image depositdetailsimage=depositdetailsimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(depositdetailsimage));
        menu.add(depositdetails);
        JMenuItem calculatebill=new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatebillimg=new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image calculatebillimage=calculatebillimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(calculatebillimage));
        menu.add(calculatebill);

        JMenu info=new JMenu("Information");
        info.setFont(new Font("srif",Font.PLAIN,20));
        menuBar.add(info);

        JMenuItem upinfo=new JMenuItem("Update Information");
        upinfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon upinfoimg=new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image upinfoimage=upinfoimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        upinfo.setIcon(new ImageIcon(upinfoimage));
        info.add(upinfo);

        JMenuItem viewinfo=new JMenuItem("View Information");
        viewinfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon viewinfoimg=new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewinfoimage=customerdetailsimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(viewinfoimage));
        info.add(viewinfo);

        JMenu user=new JMenu("User");
        user.setFont(new Font("srif",Font.PLAIN,20));
        menuBar.add(user);

        JMenuItem paybill=new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon paybillimg=new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image paybillimage=paybillimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(paybillimage));
        user.add(paybill);

        JMenuItem billdetails=new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon billdetailsimg=new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image billdetailsimage=customerdetailsimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(billdetailsimage));
        user.add(billdetails);

        JMenu bill=new JMenu("Bill");
        bill.setFont(new Font("srif",Font.PLAIN,20));
        menuBar.add(bill);

        JMenuItem genbill=new JMenuItem("Gen Bill");
        genbill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon genbillimg=new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image genbillimage=genbillimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genbill.setIcon(new ImageIcon(genbillimage));
        bill.add(genbill);

        JMenu utility=new JMenu("Utility");
        utility.setFont(new Font("srif",Font.PLAIN,20));
        menuBar.add(utility);

        JMenuItem notepad=new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon notepadimg=new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadimage=notepadimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadimage));
        utility.add(notepad);

        JMenuItem calculator=new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatorimg=new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculatorimage=calculatorimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorimage));
        utility.add(calculator);

        JMenu exit=new JMenu("Exit");
        exit.setFont(new Font("srif",Font.PLAIN,20));
        menuBar.add(exit);

        JMenuItem eexit=new JMenuItem("Exit");
        eexit.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon eexitimg=new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image eexitimage=eexitimg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        eexit.setIcon(new ImageIcon(eexitimage));
        exit.add(eexit);


        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new main_class();
    }
}
