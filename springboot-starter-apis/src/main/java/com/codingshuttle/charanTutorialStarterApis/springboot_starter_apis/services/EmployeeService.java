package com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.services;

import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.dto.EmployeeDTO;
import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.entities.EmployeeEntity;
import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;
    public EmployeeService(EmployeeRepository employeeRepository,
                           ModelMapper modelMapper){
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }
    public EmployeeDTO getEmployeeById(Long id){
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
//        return new EmployeeDTO(employeeEntity.getId(), employeeEntity.getName(), employeeEntity.getDateOfJoining(), employeeEntity.isActive());
        return modelMapper.map(employeeEntity, EmployeeDTO.class);
    }


    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO){
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDTO.class);
    }

    public boolean deleteEmployeeById(Long id){
        boolean isPresent = employeeRepository.existsById(id);
        if(!isPresent) return false;
        employeeRepository.deleteById(id);
        return true;
    }

    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository
                .findAll()
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class))
                .collect(Collectors.toList());
    }
}
