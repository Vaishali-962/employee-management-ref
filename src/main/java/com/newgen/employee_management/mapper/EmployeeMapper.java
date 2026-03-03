package com.newgen.employee_management.mapper;

import com.newgen.employee_management.dto.request.EmployeeRequestDto;
import com.newgen.employee_management.dto.response.EmployeeDto;
import com.newgen.employee_management.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {

    @Mapping(target = "empId", source = "id")
    @Mapping(target = "dob", source = "dateOfBirth")
    @Mapping(target = "jd", source = "joiningDate")
    EmployeeDto toDto(Employee employee);



    Employee toEntity(EmployeeRequestDto employeeDto);

}
