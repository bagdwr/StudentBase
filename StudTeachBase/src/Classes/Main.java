package Classes;

import Classes.MainFrame;
import Classes.Users;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static MainFrame frame;
    public static ArrayList<Users> users=new ArrayList<>();
    public static ArrayList<Student> StudentBase=new ArrayList<>();
    public static void AddUser(Users us)
    {
        boolean f=true;
        for(int i=0; i<users.size(); i++)
        {
            if(users.get(i).getLogin().equals(us.getLogin()))
            {
                JOptionPane.showMessageDialog(null,"Account with such login exists");
                f=false;
                break;
            }
            else
            {
                if(users.get(i).getEmail().equals(us.getEmail()))
                {
                    JOptionPane.showMessageDialog(null,"Account with such email exists");
                    f=false;
                    break;
                }
            }
        }
        if(f)
        {
            if(us.getLogin().equals("") || us.getEmail().equals("") || us.getPassword().equals("") || us.getFullname().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You didn't enter a data");
            }
            else {
                users.add(us);
                JOptionPane.showMessageDialog(null, "User added");
                Users.k++;
                MainFrame.registrationWindow.setVisible(false);
                MainFrame.mainWindow.setVisible(true);
            }
        }
    }
    public static String GetAllStd()
    {
        String s="ID Fullname Faculy-Group\n";
        for(int i=0; i<StudentBase.size(); i++)
        {
            s=s+StudentBase.get(i).toString()+"\n";
        }
        return s;
    }
    public static boolean CheckAcc(String login,String password)
    {
        for(int i=0; i<users.size(); i++)
        {
            if(users.get(i).getLogin().equals(login) && users.get(i).getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }
    public static void CheckStd(Student std)
    {
        boolean f=true;
        for(int i=0; i<StudentBase.size(); i++)
        {
            if(StudentBase.get(i).getGroup().equals(std.getGroup())&& StudentBase.get(i).getFullname().equals(std.getFullname())
            && StudentBase.get(i).getFaculty().equals(std.getFaculty())) {
                JOptionPane.showMessageDialog(null, "DB has already had this student");
                f = false;
                break;
            }
        }
        if(f)
        {
            StudentBase.add(std);
            Student.k++;
            JOptionPane.showMessageDialog(null,"New student added");
        }

    }
    public static void main(String[] args) {
        frame=new MainFrame();
        frame.setVisible(true);
    }

}
