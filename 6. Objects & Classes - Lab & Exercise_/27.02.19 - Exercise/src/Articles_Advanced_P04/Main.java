package Articles_Advanced_P04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Articles> articlesList = new ArrayList<>();
        int inputNum = Integer.parseInt(reader.readLine());
        for (int i = 0; i < inputNum; i++) {
            String[] inputArticles = reader.readLine().split(", ");
            String title = inputArticles[0];
            String content = inputArticles[1];
            String author = inputArticles[2];
            Articles article = new Articles(title, content, author);
            articlesList.add(article);
        }
        String filterBy = reader.readLine();
        if ("title".equals(filterBy)) {
            articlesList.stream().sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())).collect(Collectors.toList()).forEach(e -> System.out.println(e));
        }
        if ("content".equals(filterBy)) {
            articlesList.stream().sorted(((a1, a2) -> a1.getContent().compareTo(a2.getContent()))).collect(Collectors.toList()).forEach(e -> System.out.println(e));
        }
        if ("author".equals(filterBy)) {
            articlesList.stream().sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor())).collect(Collectors.toList()).forEach(e -> System.out.println(e));
        }

    }
}