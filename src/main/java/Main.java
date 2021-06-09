import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"безлесье","доработка","геологоразведка","безлесье","предплужник","подтяжка", "пилотирование","дрозофила", "привлекательность","двоешка","пилотирование", "киноискусство","сопряжённость", "зарисовывание","поддирка", "скорбность","миокардий","пилотирование"};

        WordCounter wordCounter = new WordCounter();
        for (String word:words)
        {
            wordCounter.add(word);
        }

        System.out.println(wordCounter);
 
        //z2
        PhoneBook pb = new PhoneBook();
        pb.add("Сыроежкин","123");
        pb.add("Сыроежкин","231");
        pb.add("Гусев","111");
        pb.add("Кукушкина","333");
        pb.add("Кукушкина","222");
        System.out.println(pb.get("Сыроежкин"));
        System.out.println(pb.get("Гусев"));
        System.out.println(pb.get("Кукушкина"));
    }
}
