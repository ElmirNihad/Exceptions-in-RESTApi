package org.example.exceptionsrestapi.Service;

import org.example.exceptionsrestapi.Exceptions.Baseexceptions;
import org.example.exceptionsrestapi.Exceptions.ErrorMessage;
import org.example.exceptionsrestapi.Exceptions.MessageType;
import org.example.exceptionsrestapi.dto.DtoDepartment;
import org.example.exceptionsrestapi.dto.DtoEmployee;
import org.example.exceptionsrestapi.entity.Department;
import org.example.exceptionsrestapi.entity.Employee;
import org.example.exceptionsrestapi.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceimpl implements IemployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee getEmployeebyid(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            Employee employee = optional.get();
            Department department = employee.getDepartment();

            BeanUtils.copyProperties(employee, dtoEmployee);
            BeanUtils.copyProperties(department, dtoDepartment);
            dtoEmployee.setDepartment(dtoDepartment);

            return dtoEmployee;
        }
        throw new Baseexceptions(new ErrorMessage(MessageType.No_Record_Exists,id.toString()));
    }
}
