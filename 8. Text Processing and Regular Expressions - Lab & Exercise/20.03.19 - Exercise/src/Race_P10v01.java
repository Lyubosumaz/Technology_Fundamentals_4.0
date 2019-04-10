import java.util.*;
import java.util.stream.Collectors;

public class Race_P10v01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> participantsArray = Arrays.stream(scanner.nextLine()
                .split(", "))
                .collect(Collectors.toCollection(ArrayList::new));

        HashMap<String, Integer> participants = new LinkedHashMap<>();

        while (true) {

            String inputLine = scanner.nextLine();

            if (inputLine.equalsIgnoreCase("end of race")) {
                break;
            }

            StringBuilder builder = new StringBuilder();
            int currentDistance = 0;

            for (int i = 0; i < inputLine.length(); i++) {

                char currentCharacter = inputLine.charAt(i);

                if (Character.isLetter(currentCharacter)) {

                    builder.append(currentCharacter);

                } else if (Character.isDigit(currentCharacter)) {

                    currentDistance += Character.getNumericValue(currentCharacter);

                }
            }

            String participantName = builder.toString();

            if (participantsArray.contains(participantName)) {

                if (!participants.containsKey(participantName)) {

                    participants.putIfAbsent(participantName, currentDistance);

                } else {

                    participants.put(participantName, participants.get(participantName) + currentDistance);

                }
            }
        }

        participants = participants.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(3).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int placeCounter = 1;

        for (Map.Entry<String, Integer> kvp : participants.entrySet()) {

            String participantName = kvp.getKey();
            //Integer participantDistance = kvp.getValue();

            String placeConst = "1st";

            if (placeCounter == 2) {

                placeConst = "2nd";

            } else if (placeCounter == 3) {

                placeConst = "3rd";

            }

            System.out.println(String.format("%s place: %s", placeConst, participantName));
            placeCounter++;
        }
    }
}