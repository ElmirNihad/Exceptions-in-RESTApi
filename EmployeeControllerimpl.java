package org.example.exceptionsrestapi.Controller;

import org.example.exceptionsrestapi.Service.EmployeeServiceimpl;
import org.example.exceptionsrestapi.dto.DtoEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerimpl implements IemployeeController{

    @Autowired
    private EmployeeServiceimpl employeeService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoEmployee getEmployeebyid(@PathVariable(name = "id") Long id) {
        return employeeService.getEmployeebyid(id);
    }
}
