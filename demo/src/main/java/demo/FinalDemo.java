package demo;

import java.lang.reflect.Field;

public class FinalDemo {

    static class Employee {
        private final String name;

        public Employee(String name) {
            this.name = name;
        }
    }

    static void main() throws Exception {
        var employee = new Employee("John Doe");
        Field f = Employee.class.getDeclaredField("name");
        f.setAccessible(true);
        System.out.println(employee.name);  // Prints 100

        f.set(employee, "Jack Doe");
        System.out.println(employee.name);  // Prints 200
    }
}
