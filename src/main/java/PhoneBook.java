import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<PhoneRecord> phoneBook = new ArrayList<>();

    public void add(String family, String phone){
        phoneBook.add(new PhoneRecord(phone,family));
    }

    public ArrayList<String> get(String family)
    {
        ArrayList<String> result = new ArrayList<>();
        for (PhoneRecord precord:phoneBook) {
            if (precord.name==family) {
                result.add(precord.phone);
            }
        }
        return result;
    }

    private class PhoneRecord   //класс внутренний, привтаный. поскольку по заданию надо возвращать только номера телефонов
                                //кроме того не потребуется лишних get для получения, поскльку внтури класса можно обращаться даже к приватным
                                //свойства класса
    {
        private String phone;
        private String name;

        public PhoneRecord(String phone, String name) {
            this.phone = phone;
            this.name = name;
        }


    }
}
