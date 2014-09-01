package org.microappframework.sample.service;

import org.springframework.data.repository.query.Param;
import org.microappframework.sample.data.access.Contact;
import org.microappframework.sample.data.access.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    @RequestMapping("/")
    public String thingy() {
        return "Hello!";
    }
/*
    @Transactional
    @RequestMapping("/contact/create")
    void createContact(@Param("name") String name) {
        Contact contact = new Contact();
        contact.setName(name);
        contactRepository.save(contact);
    }
    */
}
