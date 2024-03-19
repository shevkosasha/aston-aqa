package animals;

public class Bowl {
    private int foodAmount;
    private boolean isEmpty = false;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    private void checkForEmpty(){
        isEmpty = foodAmount == 0;
    }

    public void addEat(int amount){
        foodAmount += amount;
        checkForEmpty();
    }

    public  void takeEat(int amount){
//        if (foodAmount - amount < 0){
//            System.out.println("В миске нет столько еды. Доступно " + foodAmount + " еды");
//            return false;
//        }
        foodAmount -= amount;
        checkForEmpty();
    }

//    public void getFood(int amount, animals.Cat cat){
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
//        checkForEmpty();
//        System.out.println("Кот " + cat.getName() + " съел " + eatAmount + " еды. " + "Осталось " + foodAmount + " еды");
//        return true;
//    }
}
