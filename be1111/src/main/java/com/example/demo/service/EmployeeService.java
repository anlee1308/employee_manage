package com.example.demo.service;

//public class EmployeeService {
//}
package com.example.demo.controller;

//public class EmployeeController {
//}
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Contact;

@Repository
public interface ContactService extends JpaRepository<Contact, Long>{
    //todo
}
