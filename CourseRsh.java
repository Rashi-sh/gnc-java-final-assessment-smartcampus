package src;
import java.io.Serializable;

public class CourseRsh implements Serializable {

    int courseIdRsh;
    String courseNameRsh;
    double feeRsh;

    public CourseRsh(int courseIdRsh, String courseNameRsh, double feeRsh)
            throws InvalidFeeExceptionRsh {

        if (feeRsh < 0) {
            throw new InvalidFeeExceptionRsh("Fee cannot be negative!");
        }

        this.courseIdRsh = courseIdRsh;
        this.courseNameRsh = courseNameRsh;
        this.feeRsh = feeRsh;
    }

    public int getCourseIdRsh() {
        return courseIdRsh;
    }

    public String toString() {
        return courseIdRsh + " | " + courseNameRsh + " | Fee: " + feeRsh;
    }
}