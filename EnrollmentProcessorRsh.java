package src;
public class EnrollmentProcessorRsh extends Thread {

    int studentIdRsh;
    int courseIdRsh;

    public EnrollmentProcessorRsh(int studentIdRsh, int courseIdRsh) {
        this.studentIdRsh = studentIdRsh;
        this.courseIdRsh = courseIdRsh;
    }

    public void run() {

        try {

            System.out.println(
                    "Processing enrollment for Student "
                            + studentIdRsh
                            + " into Course "
                            + courseIdRsh);

            Thread.sleep(2000);

            System.out.println(
                    "Enrollment Completed for Student "
                            + studentIdRsh);

        } catch (InterruptedException rsh) {

            System.out.println("Thread Interrupted");

        }
    }
}