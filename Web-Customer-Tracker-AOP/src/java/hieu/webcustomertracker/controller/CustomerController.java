
package hieu.webcustomertracker.controller;

import hieu.webcustomertracker.entity.Customer;
import hieu.webcustomertracker.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @GetMapping("/list")
    public String listCustomers(Model model){
        List<Customer> theCustomers = customerService.getCustomers();
        
        model.addAttribute("customers", theCustomers);
        
        return "list-customers";
    }
    
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        Customer theCustomer = new Customer();
        
        model.addAttribute("customer", theCustomer);
        
        return "customer-form";
    }
    
    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
        customerService.saveCustomer(theCustomer);
        
        return "redirect:/customer/list";
    }
    
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId, Model model){
        Customer theCustomer = customerService.getCustomer(theId);
        
        model.addAttribute("customer", theCustomer);
        
        return "customer-form";
    }
    
    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int theId){
        customerService.deleteCustomer(theId);
        
        return "redirect:/customer/list";
    }
    
    @PostMapping("/search")
    public String searchCustomers(@RequestParam("theSearchName") String theSearchName, Model model){
        List<Customer> theCustomers = customerService.searchCustomers(theSearchName);
        
        model.addAttribute("customers", theCustomers);
        
        return "list-customers";
    }
}
