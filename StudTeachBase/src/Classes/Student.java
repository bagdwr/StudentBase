package Classes;

public class Student {
    private String fullname;
    private String faculty;
    private String group;
    private int ID;
    public static int k=0;
    public Student(){}
    public Student(int ID,String fullname,String faculty,String group)
    {
        this.ID=ID;
        this.fullname=fullname;
        this.faculty=faculty;
        this.group=group;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return ID+" "+fullname+" "+faculty+"-"+group;
    }
}
