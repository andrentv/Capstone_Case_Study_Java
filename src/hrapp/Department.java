/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;


/**
 *
 * @author andre
 */

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
        return name;
    }

    private Employee[] emps = new Employee[10];
    
    private int lastAddedEmployeeIndex = -1;

    public void addEmps(Employee someEmps) {
        if (lastAddedEmployeeIndex < emps.length) {
            lastAddedEmployeeIndex++;
            emps[lastAddedEmployeeIndex]= someEmps;
                }
        }
    

    public Employee[] getEmps() {
        Employee[] actualEmps = new Employee[lastAddedEmployeeIndex+1];
        for (int i = 0; i < actualEmps.length;  i++) {
            actualEmps[i] = emps[i];
            }        
        return actualEmps;
    }

    public int getTotalEmp() {
        return lastAddedEmployeeIndex+1;
    }

    public Employee getEmpByID(int findId) {
//        Employee result = null;
//        for (Employee emp : emps) {
//            if (emp.getID() == findId) {
//                result = emp;
//                break;
//            }
//         }
//        return result;
//    }
    
    // Other option
        for (Employee emp : emps) {
            if (emp != null) {
                if (emp.getID() == findId) {
                return emp;
                }
            }
         }
        return null;
    }

    public double getTotalSalary() {
        double total = 0.0;
        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
             total += emps[i].getSalary();
            }
        return total;
    }
//        My way;
//        double total = 0.0;
//        for (Employee emp : emps) {
//            if (emp != null) {
//                total = total + emp.getSalary();
//            }
//        }
//        return total;
//    }
    

    public double getAverageSalary() {       
       if (lastAddedEmployeeIndex > -1) {
            return getTotalSalary() / (lastAddedEmployeeIndex+1);
        }
        return 0.0;
    }
    
//      My way    
//        double average = 0.0;
//        int count = 0;
//        for (Employee emp : emps) {
//            count++;
//            average += emp.getSalary();
//        }
//        average = average / count;
//        return average;
//    }
    
    
}
