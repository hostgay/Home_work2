class Child3 extends Parent implements Printable {
    private double salary;

    public Child3(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}