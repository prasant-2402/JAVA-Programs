package org.abc.test.classoperation;

import org.abc.test.classoperation.employee.EmployeeRepository;
import org.abc.test.classoperation.model.Employee;

import java.util.Arrays;

public class EmployeeBL {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        Employee[] employees = repository.FindAll();
        Arrays.sort(employees);
        for (Employee e : employees) {
            System.out.println(e.FirstName());
        }
    }
}
