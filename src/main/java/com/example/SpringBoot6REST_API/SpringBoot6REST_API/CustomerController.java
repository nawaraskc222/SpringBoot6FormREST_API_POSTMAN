package com.example.SpringBoot6REST_API.SpringBoot6REST_API;

import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerController {


    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/form")
    public String showForm() {
        return "customer-form.jsp";
    }

    @PostMapping("/add")
    public String addCustomer(@RequestParam String cname,
    		@RequestParam String cmail,
    		@RequestParam int cid) {
        Customer customer = new Customer();
        customer.setCname(cname);
        customer.setCid(cid);
        customer.setCmail(cmail);
        System.out.println("Received form submission: name=" + cname + ", id=" + cid+"email="+cmail);

        customerRepository.save(customer);
        return "customer-form.jsp";
    }

    @GetMapping("/search")
    public String searchCustomerForm() {
        return "search-form.jsp";
    }

    @GetMapping("/get")
    public String getCustomerById(@RequestParam int cid, Model model) {
        Customer customer = customerRepository.findById(cid).orElse(null);
        model.addAttribute("customer", customer);
        return "display-customer.jsp";
    }
    
    
    
    //
    @GetMapping("/get-all")
    @ResponseBody
    public List<Customer> getCustomer() {
    	//this will print of json format
    	return customerRepository.findAll();
    }
    
    
    @GetMapping("/get-all/{cid}")
    @ResponseBody
    public Optional<Customer> getCustomer2(@PathVariable( "cid")int cid) {
    	
    	//this will print of json format
    	return customerRepository.findById(cid);
    }
    ////////////////////////////////////////till here by me
    @GetMapping("/customers")
    @ResponseBody
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{id}")
    @ResponseBody
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
        return customerRepository.findById(id)
                .map(customer -> new ResponseEntity<>(customer, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/createCustomer")
    @ResponseBody
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }


    @PutMapping("/updateCustomer/{id}")
    @ResponseBody
    public ResponseEntity<Customer> updateCustomer(@PathVariable int id, @RequestBody Customer updatedCustomer) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customer.setCname(updatedCustomer.getCname());
                    customer.setCmail(updatedCustomer.getCmail());
                    Customer savedCustomer = customerRepository.save(customer);
                    return new ResponseEntity<>(savedCustomer, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deleteCustomer/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteCustomer(@PathVariable int id) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customerRepository.delete(customer);
                    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
