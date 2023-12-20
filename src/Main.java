import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Beaver norbert  = new Beaver("Norbert", LocalDate.of(2016,3,8), new ArrayList<>(), "Chumka", "Петр Петров");
        Cat barsik      = new Cat("Barsik", LocalDate.of(2015,6,6), new ArrayList<>(), "Chumka", "Иванов Иван", 4);
        Dog bobik       = new Dog("Bobik", LocalDate.of(2010,5,4), new ArrayList<>(), "Chumka", "Петр Петров", 4);
        Duck donald      = new Duck("Donald", LocalDate.of(2014,8,21), new ArrayList<>(), "Chumka", "Вася Васильев");
        Eagle сhil= new Eagle("Chil", LocalDate.of(2017,9,30), new ArrayList<>(), "Chumka", "Иван Петров");
        Fish dorothy = new Fish("Dorothy", LocalDate.of(2022,10,1), new ArrayList<>(), "Chumka", "Петр Иванов");

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(norbert);
        listOfAnimals.add(barsik);
        listOfAnimals.add(bobik);
        listOfAnimals.add(donald);
        listOfAnimals.add(сhil);
        listOfAnimals.add(dorothy);

        for (Animal animal: listOfAnimals) {
            System.out.println(animal);
            animal.ToGo();
            animal.Swim();
            animal.Fly();
            System.out.println("_______________________");
        }

    }
}