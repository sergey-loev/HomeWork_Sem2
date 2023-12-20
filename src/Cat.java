import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable{

    private int legsCount;
    public Cat(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public double Run() {
        System.out.println(String.format("%s %s run", this.type, this.name));
        return 13;
    }
}