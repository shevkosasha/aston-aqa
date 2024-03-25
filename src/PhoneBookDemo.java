public class PhoneBookDemo {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add(123, "VanDamm");
        phonebook.add(234, "VanDamm");
        phonebook.add(651, "Bond");
        phonebook.add(658, "Napoleon");
        phonebook.add(987, "Szwartz");
        phonebook.add(454, "Szwartz");

        phonebook.get("VanDamm");
        phonebook.get("Bond");
        phonebook.get("Napoleon");
        phonebook.get("Szwartz");
    }
}
