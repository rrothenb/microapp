package org.microappframework.sample.service;

import lombok.extern.log4j.Log4j;
import org.springframework.data.repository.query.Param;
import org.microappframework.sample.data.access.Contact;
import org.microappframework.sample.data.access.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RestController
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    @RequestMapping("/contact/create")
    void createContact(@Param("name") String name) {
        Contact contact = new Contact();
        contact.setName(name);
        contact = contactRepository.save(contact);
        log.info(contact);
    }
}
