package Opinion_Poll_P03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());
        List<Person> peopleList = new ArrayList<>();

        while (inputNum-- > 0) {
            String[] inputArray = reader.readLine().split("\\s+");
            String name = inputArray[0];
            int age = Integer.parseInt(inputArray[1]);

            Person person = new Person(name, age);
            peopleList.add(person);
        }
        peopleList.stream().filter(person -> person.getAge() > 30).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList()).forEach(e -> System.out.println(e));
    }
}