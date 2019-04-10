import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Merging_Lists_P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        List<Integer> numbersListOne = Arrays.stream(reader.readLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
//        List<Integer> numbersListTwo = Arrays.stream(reader.readLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        String[] arrayInputOne = reader.readLine().split("\\s+");
        List<Integer> listInputOne = new ArrayList<>();
        for (int i = 0; i < arrayInputOne.length; i++) {
            listInputOne.add(Integer.parseInt(arrayInputOne[i]));
        }
        String[] arrayInputTwo = reader.readLine().split("\\s+");
        List<Integer> listInputTwo = new ArrayList<>();
        for (int i = 0; i < arrayInputTwo.length; i++) {
            listInputTwo.add(Integer.parseInt(arrayInputTwo[i]));
        }
        System.out.println(resultList(listInputOne, listInputTwo).toString().replaceAll("\\[|,|\\]", ""));
    }

    private static List<Integer> resultList(List<Integer> listInputOne, List<Integer> listInputTwo) {
        int biggerList = smallerListLength(listInputOne, listInputTwo);
        List<Integer> combineTheLists = new ArrayList<>();
        for (int i = 0; i < biggerList; i++) {
            combineTheLists.add(listInputOne.get(i));
            combineTheLists.add(listInputTwo.get(i));
        }
        if (listInputOne.size() > listInputTwo.size()) {
            combineTheLists.addAll(listInputOne.subList(biggerList, listInputOne.size()));
        } else {
            combineTheLists.addAll(listInputTwo.subList(biggerList, listInputTwo.size()));
        }
        return combineTheLists;
    }

    private static int smallerListLength(List<Integer> one, List<Integer> two) {
        int biggerList = two.size();
        if (one.size() < two.size()) {
            biggerList = one.size();
        }
        return biggerList;
    }
}