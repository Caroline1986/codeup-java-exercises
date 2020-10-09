public class Accountant extends Employee{
    public Accountant(String name, String department) {
        super(name, department);
    }

    public Accountant() {
        super();
    }

    public Accountant(String s) {
        super(s);
    }

    public String work() {
        return "crunching numbers";
    }
    Employee bob = new Accountant();
}
