package org.example.exceptionsrestapi.Service;

import org.example.exceptionsrestapi.dto.DtoEmployee;
import org.example.exceptionsrestapi.entity.Employee;

public interface IemployeeService {

    public DtoEmployee getEmployeebyid(Long id);
}
