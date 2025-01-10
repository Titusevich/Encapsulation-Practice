package app;

public class Main {

    public static int count;

    public static void main(String[] args) {

        AppView view = new AppView();

        Employee employee = new Employee("Nikita", "Andreevich",
                "Titaevskyi", "Expeditor", "tita@gmail.com",
                "(+380) 123321789", 25);

        count++;
        String empFullName = "\n" + count + ") Employee: " + employee.getLastName() +
                " " + employee.getFirstName() + " " + employee.getMiddleName();
        String empPosition = "\n   Employee position: " + employee.getPosition();
        String empEmail = "\n   Employee email: " + employee.getEmail();
        String empPhone = "\n   Employee telephone: " + employee.getPhone();
        String empAge = "\n   Employee age: " + employee.getAge() + "\n";

        view.getOutput(empFullName + empPosition + empEmail +
                empPhone + empAge);

        count++;
        System.out.print(count + ") ");
        Car audi = new Car();
        audi.start();
    }
}
