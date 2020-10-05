package com.company.HashCodeAndEquals;

import java.util.Objects;

public class Employee {
    int id;
    public Employee(int id){
        this.id = id;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
