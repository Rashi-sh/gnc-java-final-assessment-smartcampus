package src;
import java.io.*;
import java.util.*;

public class FileManagerRsh {

    public static void saveDataRsh(
            HashMap<Integer, StudentRsh> studentMapRsh,
            HashMap<Integer, CourseRsh> courseMapRsh) {

        try {

            ObjectOutputStream rsh = new ObjectOutputStream(
                    new FileOutputStream("rshData.txt"));

            rsh.writeObject(studentMapRsh);
            rsh.writeObject(courseMapRsh);

            rsh.close();

            System.out.println("Data Saved Successfully");

        } catch (Exception e) {

            System.out.println("Error Saving Data");

        }
    }

    public static void loadDataRsh(
            HashMap<Integer, StudentRsh> studentMapRsh,
            HashMap<Integer, CourseRsh> courseMapRsh) {

        try {

            ObjectInputStream rsh = new ObjectInputStream(
                    new FileInputStream("rshData.txt"));

            studentMapRsh.putAll(
                    (HashMap<Integer, StudentRsh>) rsh.readObject());

            courseMapRsh.putAll(
                    (HashMap<Integer, CourseRsh>) rsh.readObject());

            rsh.close();

            System.out.println("Data Loaded Successfully");

        } catch (Exception e) {

            System.out.println("No Previous Data Found");

        }
    }
}