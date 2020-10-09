public class Developer extends Employee {
    public Developer(String name, String department) {
        super(name, "Development");
    }

    public Developer(String s) {
        super(s);
    }

    public String work() {
        return "writing code";
    }
}
