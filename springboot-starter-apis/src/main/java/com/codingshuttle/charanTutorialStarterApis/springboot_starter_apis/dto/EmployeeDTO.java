package com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;
}
