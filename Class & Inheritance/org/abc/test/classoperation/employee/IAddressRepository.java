package org.abc.test.classoperation.employee;

import org.abc.test.classoperation.interfaces.IAdminRepository;
import org.abc.test.classoperation.interfaces.IReadOnlyRepository;
import org.abc.test.classoperation.model.Address;

public interface IAddressRepository extends IAdminRepository<Address>, IReadOnlyRepository<Address> {
}
