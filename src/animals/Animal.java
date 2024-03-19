package animals;

public abstract class Animal {

    private static int Id = 1;
    private static int countAnimals = 0;

    private String name;

    public Animal(String name) {
        setId();
        this.name = name;
        countAnimals++;
    }

    public static int getId() {
        return Id;
    }

    public static void setId() {
        Id = countAnimals + 1;
    }

    public String getName() {
        return name;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public void run(int length) {
        System.out.println(this.name + " пробежал " + length + "м");
    }

    public void swim(int length) {
        System.out.println(this.name + " проплыл " + length + "м");
    }
}
