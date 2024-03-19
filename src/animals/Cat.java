package animals;

public class Cat extends Animal {
    private static int countCats = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean isFull = false;
    private int requiredFoodAmount = 500;

    public Cat(String name) {
        super(name);
        countCats++;
    }

    public Cat(String name, int requiredFoodAmount) {
        super(name);
        this.requiredFoodAmount = requiredFoodAmount;
        countCats++;
    }

    public static int getCountCats() {
        return countCats;
    }

    public boolean isFull() {
        return isFull;
    }

    public int getRequiredFoodAmount() {
        return requiredFoodAmount;
    }

    @Override
    public void run(int distance) {
        if (distance > MAX_RUN_DISTANCE) {
            System.out.println(this.getName() + " - ленивый кот и " + distance +"м не побежит. Он может пробежать только 200м");
            distance = MAX_RUN_DISTANCE;
        }
        super.run(distance);
    }

    @Override
    public void swim(int length) {
        throw new UnsupportedOperationException("коты не умеют плавать к сожалению");
    }

    public void eat(int amount, Bowl bowl){
        int availableFoodAmount = bowl.getFoodAmount();
        System.out.println("Сейчас в миске " + availableFoodAmount + "  еды");
        if (amount > availableFoodAmount){
            System.out.println("В миске нет столько еды. Доступно " + availableFoodAmount + " еды");
            return;
        }
        if (amount <  requiredFoodAmount) {
            System.out.println(super.getName() + " хочет " + requiredFoodAmount +" еды. Ждем-с и ходим голодным пока. ");
            return;
        }
        int eatAmount = amount > requiredFoodAmount ? requiredFoodAmount : amount;
        bowl.takeEat(eatAmount);
        isFull = eatAmount >= requiredFoodAmount;
        System.out.println(this.getName() + " поел " + eatAmount + " еды. И он " + (isFull ? "сыт" : "не сыт") +
                ".\n В миске осталось " + bowl.getFoodAmount() + " еды");


//        if (bowl.getFood(foodAmount, this)){
//            System.out.println(this.getName() + " поел. Проверяем сыт ли он");
//            isFull = foodAmount >= requiredFoodAmount;
//        } else {
//            System.out.println(this.getName() + " не поел");
//        }
//        ----------------
//        int catRequiredFoodAmount = cat.getRequiredFoodAmount();
//        if (foodAmount - amount < 0){
//            System.out.println("В миске нет столько еды. Доступно " + foodAmount + " еды");
//            return false;
//        }
//        if (amount < catRequiredFoodAmount){
//            System.out.println(cat.getName() + " хочет " + catRequiredFoodAmount +" еды. Ждем-с и ходим голодным пока. ");
//            return false;
//        }
//        int eatAmount = amount < catRequiredFoodAmount ? amount : catRequiredFoodAmount;
//        foodAmount -= eatAmount;
//        System.out.println("Кот " + cat.getName() + " съел " + eatAmount + " еды. " + "Осталось " + foodAmount + " еды");
//        return true;
    }
}
