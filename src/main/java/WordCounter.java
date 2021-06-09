import java.util.HashMap;

public class WordCounter {
    private HashMap<String,Integer> words;

    public WordCounter() {
        this.words=new HashMap<>();
    }

    public WordCounter(String[] words) {
        this.words=new HashMap<>();

    }

    public void add(String word){
        Integer count = getCount(word);
        count++;
        words.put(word,count);
    }

    public Integer getCount(String word){
        Integer count = words.get(word);
        if (count==null) return 0;
        return count;
    }

    @Override
    public String toString() {
        String rezult="";
        for (String key:words.keySet()){
            rezult+=String.format("Слово %s встречается %d\n",key,words.get(key));
        }
        return rezult;
    }
}
