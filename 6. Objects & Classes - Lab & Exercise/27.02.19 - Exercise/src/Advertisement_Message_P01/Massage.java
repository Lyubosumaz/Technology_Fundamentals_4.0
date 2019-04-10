package Advertisement_Message_P01;

import java.util.Random;

public class Massage {

    String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
            "Exceptional product.", "I can’t live without this product."};

    String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

    String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

    String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    Random random = new Random();

    public String randomMessage() {
        return String.format("%s %s %s - %s", this.phrases[random.nextInt(phrases.length)], this.events[random.nextInt(events.length)],
                this.authors[random.nextInt(authors.length)], this.cities[random.nextInt(cities.length)]);
    }
}
