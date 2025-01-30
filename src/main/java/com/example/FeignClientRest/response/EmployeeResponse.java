package com.example.FeignClientRest.response;

import com.example.FeignClientRest.model.Employee;

import java.util.List;

public class EmployeeResponse {

    private List<Employee> users;

    public List<Employee> getUsers() {
        return users;
    }

    public void setUsers(List<Employee> users) {
        this.users = users;
    }
}
