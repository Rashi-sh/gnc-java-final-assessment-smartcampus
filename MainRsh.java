package src;
import java.util.*;

public class MainRsh {

    static HashMap<Integer, StudentRsh> studentMapRsh = new HashMap<>();

    static HashMap<Integer, CourseRsh> courseMapRsh = new HashMap<>();

    static HashMap<Integer, ArrayList<Integer>>
            enrollmentMapRsh = new HashMap<>();

    static Scanner rsh = new Scanner(System.in);

    public static void main(String[] args) {

        FileManagerRsh.loadDataRsh(
                studentMapRsh,
                courseMapRsh);

        while (true) {

            System.out.println("\n===== SMART CAMPUS MENU =====");

            System.out.println("1 Add Student");
            System.out.println("2 Add Course");
            System.out.println("3 Enroll Student");
            System.out.println("4 View Students");
            System.out.println("5 View Enrollments");
            System.out.println("6 Process Enrollment");
            System.out.println("7 Search Student by Email (UNIQUE)");
            System.out.println("8 Save Data");
            System.out.println("9 Exit");

            try {

                int choiceRsh = rsh.nextInt();

                switch (choiceRsh) {

                    case 1:
                        addStudentRsh();
                        break;

                    case 2:
                        addCourseRsh();
                        break;

                    case 3:
                        enrollStudentRsh();
                        break;

                    case 4:
                        viewStudentsRsh();
                        break;

                    case 5:
                        viewEnrollmentsRsh();
                        break;

                    case 6:
                        processEnrollmentRsh();
                        break;

                    case 7:
                        searchByEmailRsh();
                        break;

                    case 8:
                        FileManagerRsh.saveDataRsh(
                                studentMapRsh,
                                courseMapRsh);
                        break;

                    case 9:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid Choice");

                }

            } catch (Exception e) {

                System.out.println("Invalid Input!");
                rsh.nextLine();

            }
        }
    }

    static void addStudentRsh() {

        System.out.print("Enter Student ID: ");
        int idRsh = rsh.nextInt();

        rsh.nextLine();

        System.out.print("Enter Name: ");
        String nameRsh = rsh.nextLine();

        System.out.print("Enter Email: ");
        String emailRsh = rsh.nextLine();

        StudentRsh student =
                new StudentRsh(idRsh, nameRsh, emailRsh);

        studentMapRsh.put(idRsh, student);

        System.out.println("Student Added");
    }

    static void addCourseRsh() {

        try {

            System.out.print("Enter Course ID: ");
            int idRsh = rsh.nextInt();

            rsh.nextLine();

            System.out.print("Enter Course Name: ");
            String nameRsh = rsh.nextLine();

            System.out.print("Enter Fee: ");
            double feeRsh = rsh.nextDouble();

            CourseRsh course =
                    new CourseRsh(idRsh, nameRsh, feeRsh);

            courseMapRsh.put(idRsh, course);

            System.out.println("Course Added");

        } catch (InvalidFeeExceptionRsh e) {

            System.out.println(e.getMessage());

        }
    }

    static void enrollStudentRsh() {

        System.out.print("Enter Student ID: ");
        int sidRsh = rsh.nextInt();

        System.out.print("Enter Course ID: ");
        int cidRsh = rsh.nextInt();

        enrollmentMapRsh
                .computeIfAbsent(
                        sidRsh,
                        k -> new ArrayList<>())
                .add(cidRsh);

        System.out.println("Enrollment Added");
    }

    static void viewStudentsRsh() {

        for (StudentRsh s : studentMapRsh.values()) {

            System.out.println(s);

        }
    }

    static void viewEnrollmentsRsh() {

        for (Integer sid : enrollmentMapRsh.keySet()) {

            System.out.println(
                    "Student "
                            + sid
                            + " -> "
                            + enrollmentMapRsh.get(sid));

        }
    }

    static void processEnrollmentRsh() {

        System.out.print("Enter Student ID: ");
        int sidRsh = rsh.nextInt();

        System.out.print("Enter Course ID: ");
        int cidRsh = rsh.nextInt();

        EnrollmentProcessorRsh thread =
                new EnrollmentProcessorRsh(sidRsh, cidRsh);

        thread.start();
    }

    // ⭐ UNIQUE FEATURE

    static void searchByEmailRsh() {

        rsh.nextLine();

        System.out.print("Enter Email: ");
        String emailRsh = rsh.nextLine();

        for (StudentRsh s : studentMapRsh.values()) {

            if (s.getEmailRsh().equals(emailRsh)) {

                System.out.println("Student Found:");
                System.out.println(s);

                return;
            }
        }

        System.out.println("Student Not Found");
    }
}