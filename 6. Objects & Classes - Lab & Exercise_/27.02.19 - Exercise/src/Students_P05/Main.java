package Students_P05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();
        int inputNum = Integer.parseInt(scanner.nextLine());
        while (inputNum-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String firstName = inputData[0];
            String lastName = inputData[1];
            double grade = Double.parseDouble(inputData[2]);
            Student studentInfo = new Student(firstName, lastName, grade);
            studentsList.add(studentInfo);
        }
        studentsList.stream().sorted((g1, g2) -> Double.compare(g2.getGrade(), g1.getGrade())).collect(Collectors.toList()).forEach(e -> System.out.println(e));
    }
}