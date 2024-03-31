package employeemanagement.employee.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
//    create Employee Api
  public String createEmployee(){
      return "employee Created";
  }
//    read Employee Api
    public  String readEmployee(String id){
      return "Employee Details";
    }
//    update Employee Api
    public  String updateEmployee(String id)
    {
        return "Employee Updated";
    }
//    delete Employee Api
     public  String deleteEmployee(String id)
     {
         return  "Employee Deleted";
     }
}
