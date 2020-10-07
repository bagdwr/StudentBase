package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccessedMenu extends Container {

    private JButton AddStudentButton,EditStudentButton,ListStudentButton,ExitButton;
    public AccessedMenu()
    {
        setLayout(null);
        setSize(450,350);
        setVisible(true);

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 15);
        AddStudentButton=new JButton("Add student");
        AddStudentButton.setFont(font);
        AddStudentButton.setBounds(70,50, 310,25);
        add(AddStudentButton);
        AddStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.accessWindow.setVisible(false);
                MainFrame.addWindow.setVisible(true);
            }
        });

        EditStudentButton=new JButton("Edit");
        EditStudentButton.setFont(font);
        EditStudentButton.setBounds(70,100,310,25);
        add(EditStudentButton);
        EditStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.accessWindow.setVisible(false);
                MainFrame.editWindow.setVisible(true);
            }
        });

        ListStudentButton=new JButton("List");
        ListStudentButton.setFont(font);
        ListStudentButton.setBounds(70,150,310,25);
        add(ListStudentButton);
        ListStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.accessWindow.setVisible(false);
                MainFrame.listWindow.setVisible(true);
            }
        });

        ExitButton=new JButton("Exit");
        ExitButton.setFont(font);
        ExitButton.setBounds(70,200,310,25);
        add(ExitButton);
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.accessWindow.setVisible(false);
                MainFrame.mainWindow.setVisible(true);
            }
        });
    }
}
