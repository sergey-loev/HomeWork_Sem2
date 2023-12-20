import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable, Swimable{

    private int legsCount;
    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public double Run() {
        System.out.println(String.format("%s %s run", this.type, this.name));
        return 10;
    }

    @Override
    public double Swim() {
        System.out.println(String.format("%s %s swim", this.type, this.name));
        return 4;
    }
}