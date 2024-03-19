package animals;

public class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    //    private String name;
    public static int countDogs = 0;

    public Dog(String name) {
        super(name);
        countDogs++;
    }

    public static int getCountDogs() {
        return countDogs;
    }

    @Override
    public void run(int distance) {
//        int runDistance = distance > MAX_RUN_DISTANCE ? MAX_RUN_DISTANCE :
        if (distance > MAX_RUN_DISTANCE) {
            distance = MAX_RUN_DISTANCE;
            System.out.println("Не будем мучать собаку. " + this.getName() + " пробежит 500м и потом отдохнет");
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
//        int runDistance = distance > MAX_RUN_DISTANCE ? MAX_RUN_DISTANCE :
        if (distance > MAX_SWIM_DISTANCE) {
            distance = MAX_SWIM_DISTANCE;
            System.out.println("Будет сложно, но " + this.getName() + " сможет проплыть 10м");
        }
        super.run(distance);
    }
}
