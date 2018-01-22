/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import static Business.Organization.Organization.Type.Customer;
import Ecosystem.Customer;
import java.util.ArrayList;

/**
 *
 * @author varsha
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public Customer createCustomer(String name) {
        Customer c=new Customer();
        c.setName(name);
         employeeList.add(c);
         return c;
    }
}