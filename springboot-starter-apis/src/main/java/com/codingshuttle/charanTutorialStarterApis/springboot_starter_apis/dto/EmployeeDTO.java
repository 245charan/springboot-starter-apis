package com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JavaType;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private boolean isActive;
}
