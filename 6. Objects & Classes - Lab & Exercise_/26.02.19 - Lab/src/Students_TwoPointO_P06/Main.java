package Students_TwoPointO_P06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String inputLine = "";
        while (!"end".equals(inputLine = scanner.nextLine())) {
            String[] inputArray = inputLine.split("\\s+");

            String firstName = inputArray[0];
            String lastName = inputArray[1];
            int age = Integer.parseInt(inputArray[2]);
            String city = inputArray[3];

            if (IsStudentExisting(studentList, firstName, lastName)) {
                Student studentInfo = getStudent(studentList, firstName, lastName);

                studentInfo.setFirstName(firstName);
                studentInfo.setLastName(lastName);
                studentInfo.setAge(age);
                studentInfo.setCity(city);
            } else {
                Student studentInfo = new Student(firstName, lastName, age, city);
                studentList.add(studentInfo);
            }
        }
        String filterCity = scanner.nextLine();

        for (Student name : studentList) {
            if (name.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old\n", name.getFirstName(), name.getLastName(), name.getAge());
            }
        }
    }

    private static boolean IsStudentExisting(List<Student> studentList, String firstName, String lastName) {
        for (Student name : studentList) {
            if (name.getFirstName().equals(firstName) && name.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> studentList, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student name : studentList) {
            if (name.getFirstName().equals(firstName) && name.getLastName().equals(lastName)) {
                existingStudent = name;
            }
        }
        return existingStudent;
    }
}
