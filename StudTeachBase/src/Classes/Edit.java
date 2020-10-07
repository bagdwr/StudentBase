package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Edit extends Container {
    private JLabel fullnameLabel,groupLabel,facultyLabel,IdLabel;
    private String[] faculties={"ITSE","ITML","RET","SIS","CS"};
    private JComboBox facultiesComboBox;
    private JTextField fullnameField,groupField,idField;
    private JButton addButton,cancelButton,findButton;
    public Edit(){
            setSize(450,350);
            setLayout(null);
            setVisible(true);

            Font font=new Font(Font.SANS_SERIF,Font.BOLD,15);
            IdLabel=new JLabel("ID");
            IdLabel.setFont(font);
            IdLabel.setBounds(40,25,110,25);
            add(IdLabel);

            idField=new JTextField();
            idField.setFont(font);
            idField.setBounds(140,25,200,25);
            add(idField);

            findButton=new JButton("Find");
            findButton.setFont(font);
            findButton.setBounds(350,25,80,25);
            add(findButton);
            findButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        int k=Integer.parseInt(idField.getText());
                        boolean f=false;
                        for(int i=0; i<Main.StudentBase.size(); i++)
                        {
                            if(Main.StudentBase.get(i).getID()==k)
                            {
                                Student std=Main.StudentBase.get(i);
                                fullnameField.setText(std.getFullname());
                                groupField.setText(std.getGroup());
                                facultiesComboBox.setSelectedItem(std.getFaculty());
                                f=true;
                                break;
                            }
                        }
                        if(!f)
                        {
                            JOptionPane.showMessageDialog(null,"There is no student with ID="+k);
                        }
                }
            });

            fullnameLabel=new JLabel("Fullname");
            fullnameLabel.setFont(font);
            fullnameLabel.setBounds(40,70,110,25);
            add(fullnameLabel);

            fullnameField=new JTextField();
            fullnameField.setBounds(140,70,200,25);
            fullnameField.setFont(font);
            add(fullnameField);

            facultyLabel=new JLabel("Faculty");
            facultyLabel.setFont(font);
            facultyLabel.setBounds(40,120,110,25);
            add(facultyLabel);

            facultiesComboBox=new JComboBox(faculties);
            facultiesComboBox.setBounds(140,120,200,25);
            facultiesComboBox.setBackground(Color.WHITE);
            facultiesComboBox.setFont(font);
            add(facultiesComboBox);

            groupLabel=new JLabel("group");
            groupLabel.setFont(font);
            groupLabel.setBounds(40,170,110,25);
            add(groupLabel);

            groupField=new JTextField();
            groupField.setBounds(140,170,200,25);
            add(groupField);
            groupField.setFont(font);

            addButton=new JButton("Save");
            addButton.setBounds(80,220,100,25);
            add(addButton);
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int id=Integer.parseInt(idField.getText());
                    String fullname=fullnameField.getText();
                    String Faculty= (String)facultiesComboBox.getSelectedItem();
                    String group=groupField.getText();
                    for(int i=0; i<Main.StudentBase.size(); i++)
                    {
                        if(Main.StudentBase.get(i).getID()==id)
                        {
                            Main.StudentBase.set(i,new Student(id,fullname,Faculty,group));
                            JOptionPane.showMessageDialog(null,"Information about student was changed");
                            fullnameField.setText("");
                            groupField.setText("");
                            idField.setText("");
                            break;
                        }
                    }
                }
            });

            cancelButton=new JButton("Back");
            cancelButton.setBounds(240,220,100,25);
            add(cancelButton);
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MainFrame.editMenuWindow.setVisible(false);
                    MainFrame.editWindow.setVisible(true);
                }
            });
    }
}
