/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

//import java.util.Arrays;
//import java.util.stream.IntStream;
/**
 *
 * @author andre
 */
//public class Department implements Collection<Department> {
public class Department {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    private Employee[] emps;

    public void addEmps(Employee[] someEmps) {
        int MAX_EMP = 10;
        if (someEmps.length <= MAX_EMP) {
            this.emps = someEmps;
        }
    }

    public Employee[] getEmps() {
        for (Employee emp : emps) {
            if (emp != null) {
            }
        }
        return emps;
    }

    public int getTotalEmp() {
        int totemp = emps.length;
        return totemp;
    }

//    public Employee[] getEmpByID() {
//        int findID = 1000;
//        boolean found = false;
//        for (Employee emp : emps) {
//            if (emp.getID() == findID) {
//                found = true;
//                break;
//            }
//            try {
//                found = true;
//
//            } catch (NullPointerException e) {
//            }
//        }
//        return emps;
//    }

    public double getTotalSalary() {
        double total = 0.0;
        for (Employee emp : emps) {
            if (emp != null) {
                total = total + emp.getSalary();
            }
        }
        return total;
    }

    public double getAverageSalary() {
        double average = 0.0;
        int count = 0;
        for (Employee emp : emps) {
            count++;
            average += emp.getSalary();
        }
        average = average / count;
        return average;
    }
    
    
}
