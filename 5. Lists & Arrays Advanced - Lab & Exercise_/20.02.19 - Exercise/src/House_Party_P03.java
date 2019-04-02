import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class House_Party_P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputs = Integer.parseInt(reader.readLine());
        List<String> partyList = new ArrayList<>();
        for (int i = 0; i < inputs; i++) {
            String[] friendWill = reader.readLine().split("\\s+");
            switch (friendWill[2]) {
                case "going!":
                    int counterYes = 0;
                    for (int j = 0; j < partyList.size(); j++) {
                        if (partyList.get(j).equals(friendWill[0])) {
                            counterYes++;
                            System.out.printf("%s is already in the list!\n", friendWill[0]);
                        }
                    }
                    if (counterYes == 0) {
                        partyList.add(friendWill[0]);
                        break;
                    }
                    break;
                case "not":
                    int counterNot = 0;
                    for (int j = 0; j < partyList.size(); j++) {
                        if (partyList.get(j).equals(friendWill[0])) {
                            counterNot++;
                            partyList.remove(String.valueOf(friendWill[0]));
                        }
                    }
                    if (counterNot == 0) {
                        System.out.printf("%s is not in the list!\n", friendWill[0]);
                        break;
                    }
                    break;
            }
        }
        String output = "";
        for (String friendName : partyList) {
            output += friendName + "\n";
        }
        System.out.println(output);
    }
}