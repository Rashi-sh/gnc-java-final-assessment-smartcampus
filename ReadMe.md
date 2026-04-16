# Smart Campus Management System (Java)
Project Title

Smart Campus Management System using Java (OOP, Collections, Multithreading & File Handling)

##  Developed By

Rashi Sharma

##  Project Description

The Smart Campus Management System is a Java-based console application developed to manage students, courses, and enrollments efficiently.

This system allows the admin to:

* Add students
* Add courses
* Enroll students into courses
* View student details
* View enrollment details
* Process enrollment using multithreading
* Save and load data using file handling
* Handle invalid inputs using exception handling

# Features Implemented

## 1 Student Management

* Add new student
* Store:

  * Student ID
  * Name
  * Email
* View all students

##  Course Management

* Add new course
* Store:

  * Course ID
  * Course Name
  * Course Fee

##  Enrollment System

* Students can enroll in multiple courses
* Uses:

  * HashMap
  * ArrayList

##  Menu Driven System

User can select:

1 Add Student
2 Add Course
3 Enroll Student
4 View Students
5 View Enrollments
6 Process Enrollment
7 Search Student by Email (Unique Feature)
8 Save Data
9 Exit

#  Unique Feature Added

## Search Student by Email

This feature allows searching a student using their email address.

Why it is useful:

* Quickly find student details
* Improves usability
* Added for anti-plagiarism and uniqueness



#  Technical Concepts Used

This project includes:

* Classes and Objects
* Constructors
* Encapsulation
* Collections (HashMap, ArrayList)
* Exception Handling
* Custom Exception
* Multithreading
* File Handling
* Menu Driven Programming



#  Exception Handling

Custom Exception Used:

InvalidFeeExceptionRsh

Used to handle:

* Negative course fee
* Invalid user input


#  Multithreading Used

Class Used:

EnrollmentProcessorRsh

Purpose:

* Simulates enrollment processing
* Improves system responsiveness
* Uses Thread class

# File Handling

Class Used:

FileManagerRsh

Functions:

* Save student data
* Save course data
* Load saved data
* Store data in file

File Used:

rshData.txt

---

#  Project File Structure

```
SmartCampusProject/

│── MainRsh.java  
│── StudentRsh.java  
│── CourseRsh.java  
│── EnrollmentProcessorRsh.java  
│── InvalidFeeExceptionRsh.java  
│── FileManagerRsh.java  
│── README.md  
│── rshData.txt (created automatically)


## How to Run the Project

## Step 1: Compile All Files

Open terminal and run:


javac *.java


## Step 2: Run Main Class
java MainRsh


output 
===== SMART CAMPUS MENU =====

1 Add Student
2 Add Course
3 Enroll Student
4 View Students
5 View Enrollments
6 Process Enrollment
7 Search Student by Email
8 Save Data
9 Exit

# Conclusion

The Smart Campus Management System successfully demonstrates the implementation of Java programming concepts such as OOP, collections, exception handling, multithreading, and file handling.

This system improves campus management by efficiently handling student enrollments and maintaining records securely.
