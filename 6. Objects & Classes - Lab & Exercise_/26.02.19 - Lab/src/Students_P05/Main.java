package Students_P05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Student> studentsList = new ArrayList<>();

        String inputLine = reader.readLine();
        while (!("end").equals(inputLine)) {
            String[] inputArray = inputLine.split("\\s+");

            String firstName = inputArray[0];
            String lastName = inputArray[1];
            int age = Integer.parseInt(inputArray[2]);
            String city = inputArray[3];

            Student studentInfo = new Student(firstName, lastName, age, city);

            studentsList.add(studentInfo);
            inputLine = reader.readLine();
        }
        String filterCity = reader.readLine();
        for (Student student : studentsList) {
            if (student.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}