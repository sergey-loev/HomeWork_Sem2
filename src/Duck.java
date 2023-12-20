import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable, Flyable, Swimable{
    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double Run() {
        System.out.println(String.format("%s %s run", this.type, this.name));
        return 3;
    }

    @Override
    public double Fly() {
        System.out.println(String.format("%s %s fly", this.type, this.name));
        return 80;
    }

    @Override
    public double Swim() {
        System.out.println(String.format("%s %s swim", this.type, this.name));
        return 10;
    }
}