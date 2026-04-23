package demo;

import module java.base;

public class ModuleImportDemo {

    static void main() {
        var date = LocalDate.now();
        System.out.printf("Resolved Date: %s", date);
    }
}
