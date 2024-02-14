public class Main {
    public static void main(String[] args) {
        Parent[] objects = new Parent[3];
        objects[0] = createObject("Child1", "John", 25);
        objects[1] = createObject("Child2", "Alice", "Teacher");
        objects[2] = createObject("Child3", "Bob", 5000.0);

        for (Parent object : objects) {
            if (object instanceof Printable) {
                Printable printable = (Printable) object;
                printable.print();
                System.out.println();
            }
        }
    }
    public static Parent createObject(String className, String name, Object... args) {
        switch (className) {
            case "Child1":
                if (args.length < 1) {
                    throw new IllegalArgumentException("Invalid number of arguments");
                }
                int age = (int) args[0];
                return new Child1(name, age);

            case "Child2":
                if (args.length < 1) {
                    throw new IllegalArgumentException("Invalid number of arguments");
                }
                String occupation = (String) args[0];
                return new Child2(name, occupation);

            case "Child3":
                if (args.length < 1) {
                    throw new IllegalArgumentException("Invalid number of arguments");
                }
                double salary = (double) args[0];
                return new Child3(name, salary);

            default:
                throw new IllegalArgumentException("Invalid class name");
        }
    }
}