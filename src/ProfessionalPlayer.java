public class ProfessionalPlayer extends Player {
    private double salary;

    public ProfessionalPlayer(String name, int age, Sport sport, double salary) {
        super(name, age, sport);
        this.salary = salary;
    }

    @Override
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return super.toString() + "\nSalary: " + salary;
    }
}
