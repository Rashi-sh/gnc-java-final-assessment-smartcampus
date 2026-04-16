package src;
import java.io.Serializable;

public class StudentRsh implements Serializable {

    int studentIdRsh;
    String nameRsh;
    String emailRsh;

    public StudentRsh(int studentIdRsh, String nameRsh, String emailRsh) {
        this.studentIdRsh = studentIdRsh;
        this.nameRsh = nameRsh;
        this.emailRsh = emailRsh;
    }

    public int getStudentIdRsh() {
        return studentIdRsh;
    }

    public String getEmailRsh() {
        return emailRsh;
    }

    public String toString() {
        return studentIdRsh + " | " + nameRsh + " | " + emailRsh;
    }
}