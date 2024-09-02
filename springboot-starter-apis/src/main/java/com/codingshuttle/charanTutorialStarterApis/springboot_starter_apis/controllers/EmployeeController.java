package com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.controllers;


//OPerations
// GET /employees
// POST /employees
// DELETE /employees/{id}

import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.dto.EmployeeDTO;
import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long employeeId){
        return employeeService.getEmployeeById(employeeId);
//        return new EmployeeDTO(employeeId, "Charan", LocalDate.of(2020, 3,8), true);
    }

    @GetMapping(path = "/data")
    public String getData(@PathParam("sortBy") String sortBy,
                          @PathParam("limit") Integer limit){
        return "Hello " + sortBy + " " + limit;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployeeById(@PathVariable("id") Long empId){
        return employeeService.deleteEmployeeById(empId);
    }


}
