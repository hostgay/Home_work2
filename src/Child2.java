class Child2 extends Parent implements Printable {
    private String occupation;

    public Child2(String name, String occupation) {
        super(name);
        this.occupation = occupation;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Occupation: " + occupation);
    }
}
