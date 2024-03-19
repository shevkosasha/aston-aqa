package animals;

public class AnimalsApp {
    public static void main(String[] args) {

        Cat catBob = new Cat("Bob", 300);
        Cat catTom = new Cat("Tom", 400);
        Cat catFat = new Cat("Fat", 500);
        Dog dogReks = new Dog("Reks");
        Dog dogHusky = new Dog("Husky");

        Animal[] animals = {catBob, catTom, catFat, dogReks, dogHusky};
        Cat[] cats =  {catBob, catTom, catFat};

        countAnimals();
        animalsRun(animals);
        animalsSwim(animals);
        feedCats(cats);
    }

    private static void animalsRun(Animal[] animals){
        System.out.println(" ========== Животные побежали ===========");
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                ((Cat) animal).run((int) (Math.random() * 1000));
            } else if (animal instanceof Dog){
                ((Dog) animal).run((int) (Math.random() * 1000));
            } else {
                animal.run((int) (Math.random() * 1000));
            }
        }
    }

    private static void animalsSwim(Animal[] animals){
        System.out.println(" ========== Животные поплыли ===========");
        for (Animal animal : animals) {
            try {
                if (animal instanceof Cat) {
                    ((Cat) animal).swim((int) (Math.random() * 1000));
                } else if (animal instanceof Dog){
                    ((Dog) animal).swim((int) (Math.random() * 1000));
                } else {
                    animal.swim((int) (Math.random() * 1000));
                }
            } catch (UnsupportedOperationException e){
                System.out.println("это животное плавать не умеет");
            }
        }
    }

    private static  void feedCats(Cat[] cats){
        System.out.println(" ========== Пора котикам поесть ===========");
        Bowl bowl = new Bowl(600);
        for (Cat cat : cats) {
            cat.eat(400, bowl);
            System.out.println("кот " + cat.getName() + (cat.isFull() ? " хорошенько перекусил" : " поел бы еще"));
        }
    }

    private static void countAnimals(){
        System.out.println(Animal.getCountAnimals());
        System.out.println(Cat.getCountCats());
        System.out.println(Dog.getCountDogs());
    }
}

//Задание 1:
//
//        Создать классы Собака и Кот с наследованием от класса Животное.
//
//        Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//        Добавить подсчет созданных котов, собак и животных.
//        Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:
//        Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//        Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//        Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//        Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.
//        Добавить метод, с помощью которого можно было бы добавлять еду в миску.
