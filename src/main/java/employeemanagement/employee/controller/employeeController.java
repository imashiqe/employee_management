package employeemanagement.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

//      create api
@PostMapping("/employees")
    public String createEmployee(){
    return "Created Employee";
}
//    read api
@GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable String id){
     return "Employee Details";
}
//    update api
@PostMapping("/employees/{id}")
    public  String updateEmployee(@PathVariable String id)
{
    return "Employee Updated";
}
//    delete api
    @PostMapping("/employees/{id}/delete")
    public  String deleteEmployee(@PathVariable String id)
    {
        return  "Delete Employee";
    }
}
