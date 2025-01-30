package com.example.FeignClientRest.client;

import com.example.FeignClientRest.model.EmployeeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employeeClient", url = "https://dummyjson.com")
public interface EmployeeClient {

    @GetMapping("/users")
    EmployeeResponse getAllEmployees();

    @GetMapping("/users/{id}")
    EmployeeResponse.Employee getEmployeeById(@PathVariable("id") Long id);
}
