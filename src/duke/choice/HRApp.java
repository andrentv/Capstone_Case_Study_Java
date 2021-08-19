/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;


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

        System.out.println("Department: " + dep1);
        
        
//        Employee emp1 = new Employee();
        Employee emp1 = new Employee(105, "Tob", 1000);
        Employee[] emps = {emp1,
            new Employee(106, "Debs", 1100),
            new Employee(103, "Tod", 1300.20),
            new Employee(104, "John", 2000),
//            new Employee(101, "Ann", 1234.56),
//            new Employee(102, "Bob", 1200.34),
//            new Employee(107, "Ray", 1122.33),
//            new Employee(100, "Lay", 1122.10),
            new Employee(108, "Day", 1122.15),
            new Employee(109, "May", 1122.20),
            new Employee(110, "Fay", 1200.30)};

        dep1.addEmps(emps);
        for (Employee emp : dep1.getEmps()) {
            System.out.println(emp);
        }
        
        
        System.out.println("Total Salary: " + dep1.getTotalSalary());
        
        int findID = 100;
        for (Employee list : dep1.getEmps()) {
            if (list.getID() == findID) {
             System.out.println("I found! This is "+ list.getName()+"'s ID!");
             break;
            }
            try {
               
            } catch (NullPointerException e) {
                
            }      
        }
        
        System.out.println("Total of Employees: " + dep1.getTotalEmp());
        System.out.println("Average Salary: " + dep1.getAverageSalary());
           }
}
