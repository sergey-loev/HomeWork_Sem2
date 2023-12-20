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

        Nurse nurse1 = new Nurse("Ivavova Ekaterina","Junior nurse", LocalDate.of(2015,6,6), 4);
        Nurse nurse2 = new Nurse("Ivavova Anastasia","Nurse", LocalDate.of(2013,6,6), 8);
        Nurse nurse3 = new Nurse("Petrova Svetlana","Junior nurse", LocalDate.of(2017,6,6), 2);
        Nurse nurse4 = new Nurse("Petrova Aleksandra","Nurse", LocalDate.of(2011,6,6), 10);
        Doctor doctor1 = new Doctor("Ignatov Ignat", "Doctor",LocalDate.of(2011,6,6),10, nurse1);
        Doctor doctor2 = new Doctor("Ignatov Igor", "Doctor",LocalDate.of(2005,6,6),15, nurse2);
        Doctor doctor3 = new Doctor("Petrov Maksim", "Doctor",LocalDate.of(2010,6,6),11, nurse3);
        Doctor doctor4 = new Doctor("Staryi Vadim", "Doctor",LocalDate.of(2015,6,6),7, nurse4);

        List<Staff> listOfPersonal= new ArrayList<>();
        listOfPersonal.add(nurse1);
        listOfPersonal.add(nurse2);
        listOfPersonal.add(nurse3);
        listOfPersonal.add(nurse4);
        listOfPersonal.add(doctor1);
        listOfPersonal.add(doctor2);
        listOfPersonal.add(doctor3);
        listOfPersonal.add(doctor4);

        VeterinaryClinic clinic123 = new VeterinaryClinic();

        clinic123.addPersonals(listOfPersonal);
        clinic123.addPatients(listOfAnimals);

        clinic123.StartWorking();

        System.out.println(clinic123.getPatients());
        System.out.println("------------------------");
        System.out.println(clinic123.getSwimables());
        System.out.println("------------------------");
        System.out.println(clinic123.getFlyables());
        System.out.println("------------------------");
        System.out.println(clinic123.getGoables());

        clinic123.EndWorking();

    }
}