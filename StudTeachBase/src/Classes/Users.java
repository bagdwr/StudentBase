package Classes;

import javax.swing.*;
import java.util.ArrayList;

public class Users {
    private String login;
    private String password;
    private String email;
    private String fullname;
    private int id;
    public static int k=0;

    public Users(int id,String login, String password, String email, String fullname) {
        this.id=id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.fullname = fullname;
    }

    public Users() {}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
