import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
//    2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
//    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//    тогда при запросе такой фамилии должны выводиться все телефоны.
    private Map<Integer, String> phoneBook;
    PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void add(int number, String surname) {
        phoneBook.put(number, surname);
    }
    public void get(String surname){
        if(phoneBook.containsValue(surname)) {
            Set<Map.Entry<Integer, String>> set = phoneBook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if(temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("По указанной фамилии в справочнике не найдено ни одного номера телефона");
        }
    }
}
