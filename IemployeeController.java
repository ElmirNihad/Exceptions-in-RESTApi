package org.example.exceptionsrestapi.Controller;

import org.example.exceptionsrestapi.dto.DtoEmployee;

public interface IemployeeController {
    public DtoEmployee getEmployeebyid(Long id);
}
