package org.abc.test.classoperation.employee;

import org.abc.test.classoperation.model.Address;
import org.abc.test.classoperation.model.Employee;

import java.util.Arrays;
import java.util.Iterator;

public class EmployeeRepository implements IEmployeeRepository, Iterable<Employee> {

    @Override
    public boolean Insert(Employee value) {
        return true;
    }

    @Override
    public boolean InsertAll(Employee[] values) {
        return false;
    }

    @Override
    public boolean Update(Employee value) {
        return false;
    }

    @Override
    public boolean UpdateAll(Employee[] values) {
        return false;
    }

    @Override
    public Employee FindByValue(Employee filter) {
        return filter;
    }

    @Override
    public Employee[] FindAll() {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < 10; i++) {
            Employee e = new Employee();

            e.FirstName("Test" + (10-i));
            e.MiddleName("Middle" + (10-i));
            e.LastName("Last" + (10-i));

            Address address = new Address();
            address.Address1 = "Test Address" + (10-i);
            address.Address2 = "Test Address2" + (10-i);
            employees[i] = e;
        }
        return employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return Arrays.stream(this.FindAll()).iterator();
    }
}
