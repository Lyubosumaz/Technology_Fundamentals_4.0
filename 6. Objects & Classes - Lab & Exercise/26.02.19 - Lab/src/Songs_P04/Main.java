package Songs_P04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new ArrayList<>();

        while (inputNum-- > 0) {
            String[] inputData = scanner.nextLine().split("_");

            String type = inputData[0];
            String name = inputData[1];
            String time = inputData[2];

            Song inputSong = new Song();

            inputSong.setTypeList(type);
            inputSong.setName(name);
            inputSong.setTime(time);

            songsList.add(inputSong);
        }

        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songsList) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}