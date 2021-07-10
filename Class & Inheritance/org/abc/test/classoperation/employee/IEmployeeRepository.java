package org.abc.test.classoperation.employee;

import org.abc.test.classoperation.interfaces.IAdminRepository;
import org.abc.test.classoperation.interfaces.IReadOnlyRepository;
import org.abc.test.classoperation.model.Employee;

public interface IEmployeeRepository extends IAdminRepository<Employee>, IReadOnlyRepository<Employee> {
}
