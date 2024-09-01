package com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.controllers;


//OPerations
// GET /employees
// POST /employees
// DELETE /employees/{id}

import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.dto.EmployeeDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployees(@PathVariable("id") Long employeeId){
        return new EmployeeDTO(employeeId, "Charan", LocalDate.of(2020, 3,8), true);
    }

    @GetMapping(path = "/employees")
    public String getData(@PathParam("sortBy") String sortBy,
                          @PathParam("limit") Integer limit){
        return "Hello " + sortBy + " " + limit;
    }

}
