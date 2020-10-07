package Classes;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static MainMenu mainWindow;
    public static AddMenu addWindow;
    public static RegistrationMenu registrationWindow;
    public static AccessedMenu accessWindow;
    public static EditMenu editWindow;
    public static ListMenu listWindow;
    public static Delete deleteWindow;
    public static Edit editMenuWindow;
    public MainFrame()
    {
        setTitle("Students DB");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dimension=toolkit.getScreenSize();
        setBounds(dimension.width-225,dimension.height-175,450,350);
        setLayout(null);

        mainWindow=new MainMenu();
        setLocation(0,0);
        mainWindow.setVisible(true);
        add(mainWindow);

        addWindow=new AddMenu();
        setLocation(0,0);
        addWindow.setVisible(false);
        add(addWindow);

        registrationWindow=new RegistrationMenu();
        setLocation(0,0);
        registrationWindow.setVisible(false);
        add(registrationWindow);

        accessWindow=new AccessedMenu();
        setLocation(0,0);
        accessWindow.setVisible(false);
        add(accessWindow);

        editWindow=new EditMenu();
        setLocation(0,0);
        editWindow.setVisible(false);
        add(editWindow);

        listWindow=new ListMenu();
        setLocation(0,0);
        listWindow.setVisible(false);
        add(listWindow);

        editMenuWindow=new Edit();
        setLocation(0,0);
        editMenuWindow.setVisible(false);
        add(editMenuWindow);

        deleteWindow=new Delete();
        setLocation(0,0);
        deleteWindow.setVisible(false);
        add(deleteWindow);
    }
}
