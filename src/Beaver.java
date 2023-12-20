import java.time.LocalDate;
import java.util.List;

public class Beaver extends Animal implements Goable, Swimable{
    public Beaver(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
            super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double Run() {
        System.out.println(String.format("%s %s run", this.type, this.name));
        return 5;
    }

    @Override
    public double Swim() {
        System.out.println(String.format("%s %s swim", this.type, this.name));
        return 10;
    }
}
