import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person = new Person("Alex Sh", "aqa","email@mail.com","123-45-67", 12345, 68);
        person.toString();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Scot Bryant", "Engineer","sc.bryant@mail.com", "892312312", 48555, 30);
        persArray[1] = new Person("Trisha Ford", "QA","tr.ford@mail.com", "194826545", 48000, 35);
        persArray[2] = new Person("Mohammad Shields", "AQA","moh.shields@mail.com", "981654156", 49000, 33);
        persArray[3] = new Person("Charmaine Hughes", "HR","ch.hughes@mail.com", "981965455", 45000, 27);
        persArray[4] = new Person("Alyce Benton", "DevOps","al.benton@mail.com", "998225654", 47000, 32);

        for (int i = 0; i < persArray.length; i++) {
            persArray[i].toString();
        }

        Park dreamLand = new Park("DreamLand");

        dreamLand.addAttraction(dreamLand.new Attraction("Dragon Ride","0am - 8pm",12));
        dreamLand.addAttraction(dreamLand.new Attraction("Funny Train","9am - 8pm",15));
        System.out.println(Arrays.asList(dreamLand.getAttractionList()));

        Park adventureCity = new Park("AdventureCity");
        adventureCity.addAttraction(adventureCity.new Attraction("Chicken Fight","10am - 8pm",11));
        adventureCity.addAttraction(adventureCity.new Attraction("Pirate's Adventures","10am - 9pm",16));
        System.out.println(Arrays.asList(adventureCity.getAttractionList()));
    }
}