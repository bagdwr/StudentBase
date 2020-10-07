package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditMenu extends Container {
    private JButton DeleteButton,EditButton,BackButton;
    public EditMenu() {
        setVisible(true);
        setLayout(null);
        setSize(450,350);

        Font font=new Font(Font.SANS_SERIF,Font.BOLD,15);
        EditButton=new JButton("Edit");
        EditButton.setFont(font);
        EditButton.setBounds(120,50,200,35);
        add(EditButton);
        EditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.editWindow.setVisible(false);
                MainFrame.editMenuWindow.setVisible(true);
            }
        });

        DeleteButton=new JButton("Delete");
        DeleteButton.setFont(font);
        DeleteButton.setBounds(120,150,200,35);
        add(DeleteButton);
        DeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.editWindow.setVisible(false);
                MainFrame.deleteWindow.setVisible(true);
            }
        });

        BackButton=new JButton("Back");
        BackButton.setFont(font);
        BackButton.setBounds(120,250,200,35);
        add(BackButton);
        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.accessWindow.setVisible(true);
                MainFrame.editWindow.setVisible(false);
            }
        });
    }
}
