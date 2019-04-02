package Company_Roster_P01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());

        List<Employee> employeesList = new ArrayList<>();

        for (int i = 0; i < inputNum; i++) {
            String[] inputLine = reader.readLine().split("\\s+");

            String name = inputLine[0];
            double salary = Double.parseDouble(inputLine[1]);
            String position = inputLine[2];
            String department = inputLine[3];
            String email = inputLine[4];
            int age = Integer.parseInt(inputLine[5]);

            Employee employee = new Employee(name, salary, position, department, email, age);
            employeesList.add(employee);
        }
    }

    private String highestAverageSalary() {
        List<Employee>

    }
}
