package Order_by_Age_P07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<PersonID> personsList = new ArrayList<>();
        String inputCommands = "";
        while (!"End".equalsIgnoreCase(inputCommands = reader.readLine())) {
            String[] commandsArray = inputCommands.split("\\s+");
            String name = commandsArray[0];
            String ID = commandsArray[1];
            int age = Integer.parseInt(commandsArray[2]);
            PersonID personInfo = new PersonID(name, ID, age);
            personsList.add(personInfo);
        }
        personsList.stream().sorted((n1, n2) -> Integer.compare(n1.getAge(), n2.getAge())).collect(Collectors.toList()).forEach(e -> System.out.println(e));
    }
}