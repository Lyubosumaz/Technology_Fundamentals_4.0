import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoftUni_Course_Planning_P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputCoursesArray = reader.readLine().split("\\,+");
        List<String> inputCoursesList = new ArrayList<>();
        for (int i = 0; i < inputCoursesArray.length; i++) {
            inputCoursesList.add(inputCoursesArray[i].trim());
        }

        String commands = "";
        while (!"course start".equals(commands = reader.readLine())) {
            String[] keyCommands = commands.split("\\:+");


            switch (keyCommands[0]) {
                case "Add":
                    String courseToAdd = keyCommands[1];
                    if (!inputCoursesList.contains(courseToAdd)) {
                        inputCoursesList.add(courseToAdd);
                    }
                    break;
                case "Insert":
                    String courseToInsert = keyCommands[1];
                    int indexInsert = Integer.parseInt(keyCommands[2]);
                    if (!inputCoursesList.contains(courseToInsert) && (indexInsert >= 0 && indexInsert < inputCoursesList.size())) {
                        inputCoursesList.add(indexInsert, courseToInsert);
                    }
                    break;
                case "Remove":
                    String courseToRemove = keyCommands[1];
                    String courseExerciseToRemove = keyCommands[1] + "-Exercise";
                    if (inputCoursesList.contains(courseToRemove) && inputCoursesList.contains(courseExerciseToRemove)) {
                        inputCoursesList.remove(courseToRemove);
                        inputCoursesList.remove(courseExerciseToRemove);
                    }
                    if (inputCoursesList.contains(courseExerciseToRemove)) {
                        inputCoursesList.remove(courseExerciseToRemove);
                    }
                    if (inputCoursesList.contains(courseToRemove)) {
                        inputCoursesList.remove(courseToRemove);
                    }

                    break;
                case "Swap":
                    String firstCourse = keyCommands[1];
                    int firstIndex = 0;
                    String secondCourse = keyCommands[2];
                    int secondIndex = 0;

                    if ((inputCoursesList.contains(firstCourse) && inputCoursesList.contains(firstCourse + "-Exercise"))
                            && inputCoursesList.contains(secondCourse) && inputCoursesList.contains(secondCourse + "-Exercise")) {

                        firstIndex = inputCoursesList.indexOf(firstCourse);
                        secondIndex = inputCoursesList.indexOf(secondCourse);

                        Collections.swap(inputCoursesList, firstIndex, secondIndex);
                        Collections.swap(inputCoursesList, firstIndex + 1, secondIndex + 1);
                    }

                    if ((inputCoursesList.contains(firstCourse) && inputCoursesList.contains(firstCourse + "-Exercise")
                            && inputCoursesList.contains(secondCourse))) {

                        firstIndex = inputCoursesList.indexOf(firstCourse);
                        secondIndex = inputCoursesList.indexOf(secondCourse);

                        inputCoursesList.remove(firstIndex + 1);
                        Collections.swap(inputCoursesList, firstIndex, secondIndex);
                        inputCoursesList.add(secondIndex + 1, firstCourse + "-Exercise");
                    }

                    if ((inputCoursesList.contains(secondCourse) && inputCoursesList.contains(secondCourse + "-Exercise"))
                            && (inputCoursesList.contains(firstCourse))) {

                        secondIndex = inputCoursesList.indexOf(secondCourse);
                        firstIndex = inputCoursesList.indexOf(firstCourse);

                        inputCoursesList.remove(secondIndex + 1);
                        Collections.swap(inputCoursesList, firstIndex, secondIndex);
                        inputCoursesList.add(firstIndex + 1, secondCourse + "-Exercise");
                    }

                    if ((inputCoursesList.contains(firstCourse) && inputCoursesList.contains(secondCourse))
                            && (!inputCoursesList.contains(firstCourse + "-Exercise") && !inputCoursesList.contains(secondCourse + "-Exercise"))) {

                        firstIndex = inputCoursesList.indexOf(firstCourse);
                        secondIndex = inputCoursesList.indexOf(secondCourse);

                        inputCoursesList.set(firstIndex, secondCourse);
                        inputCoursesList.set(secondIndex, firstCourse);
                    }
                    break;
                case "Exercise":
                    String onlyTheCourse = keyCommands[1];
                    String courseExercise = keyCommands[1] + "-Exercise";

                    if (inputCoursesList.contains(onlyTheCourse) && !inputCoursesList.contains(courseExercise)) {
                        inputCoursesList.add(inputCoursesList.indexOf(onlyTheCourse) + 1, courseExercise);
                    } else if (!inputCoursesList.contains(courseExercise)) {
                        inputCoursesList.add(onlyTheCourse);
                        inputCoursesList.add(courseExercise);
                    }
                    break;
            }
        }

        String output = "";
        for (int i = 0; i < inputCoursesList.size(); i++) {
            output += i + 1 + "." + inputCoursesList.get(i) + "\n";
        }
        System.out.println(output);
    }
}