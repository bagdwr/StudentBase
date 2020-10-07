package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Delete extends Container{
    private JButton delete,back;
    private JLabel label;
    private JTextField textField;
    public Delete()
    {
        setVisible(true);
        setSize(450,350);
        setLayout(null);
        Font font=new Font(Font.SANS_SERIF,Font.BOLD,15);
        label=new JLabel("Enter ID of the student who you want to delete");
        label.setBounds(50,50,350,25);
        label.setFont(font);
        add(label);

        textField=new JTextField();
        textField.setFont(font);
        textField.setBounds(120,100,150,25);
        add(textField);

        delete=new JButton("Delete");
        delete.setFont(font);
        delete.setBounds(120,150,150,25);
        add(delete);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int k=Integer.parseInt(textField.getText());
                    boolean f=false;
                    for(int i=0; i<Main.StudentBase.size(); i++)
                    {
                        if(Main.StudentBase.get(i).getID()==k)
                        {
                            Main.StudentBase.remove(i);
                            JOptionPane.showMessageDialog(null,"Student deleted");
                            textField.setText("");
                            f=true;
                            break;
                        }
                    }
                    if(!f)
                    {
                        JOptionPane.showMessageDialog(null,"There is no student with ID="+k);
                        textField.setText("");
                    }
            }
        });

        back=new JButton("Back");
        back.setFont(font);
        back.setBounds(120,200,150,25);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.editWindow.setVisible(true);
                MainFrame.deleteWindow.setVisible(false);
            }
        });
    }
}
