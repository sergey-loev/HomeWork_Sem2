import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Goable, Flyable{
    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double Run() {
        System.out.println(String.format("%s %s run", this.type, this.name));
        return 4;
    }

    @Override
    public double Fly() {
        System.out.println(String.format("%s %s fly", this.type, this.name));
        return 200;
    }
}