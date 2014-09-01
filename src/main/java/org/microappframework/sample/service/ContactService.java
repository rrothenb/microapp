package org.microappframework.sample.service;

import org.microappframework.sample.data.access.Contact;
import org.microappframework.sample.data.access.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    @Transactional
    void createContact(String name) {
        Contact contact = new Contact();
        contactRepository.save(contact);
    }
}
