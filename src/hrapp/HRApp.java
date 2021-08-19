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
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("HR App Starts!");
        
        Department dep1 = new Department("Department Education");
        
        
        Employee emp1 = new Employee(105, "Tob", 1000);  
        Employee[] emps = dep1.getEmps();
                             
        dep1.addEmps(emp1);
        dep1.addEmps(new Employee(106, "Debs", 1100)); 
        dep1.addEmps(new Employee(103, "Tod", 1300.20)); 
        dep1.addEmps(new Employee(101, "Ann", 1234.56)); 
        dep1.addEmps(new Employee(102, "Bob", 1200.34)); 
        dep1.addEmps(new Employee(107, "Ray", 1122.33)); 
        dep1.addEmps(new Employee(100, "Lay", 1122.10)); 
        dep1.addEmps(new Employee(108, "Day", 1122.15)); 
        dep1.addEmps(new Employee(109, "May", 1122.20)); 
        dep1.addEmps(new Employee(110, "Fay", 1200.30)); 

        for (Employee emp : dep1.getEmps()) {
            System.out.println(emp);
        }
        
        
        System.out.println("Total Salary: " + dep1.getTotalSalary());
        System.out.println("Total of Employees: " + dep1.getTotalEmp());
        System.out.println("Average Salary: " + dep1.getAverageSalary());
        System.out.println("I found! This is "+ dep1.getEmpByID(100)+"!");
        
         //my code
//        int findID = 100;
//        for (Employee list : dep1.getEmps()) {
//            if (list.getID() == findID) {
//             System.out.println("I found! This is "+ list.getName()+"'s ID!");
//             break;
//            }
//            try {
//               
//            } catch (NullPointerException e) {
//                
//            }      
        }
    }

