package org.microappframework.sample.data.access;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Contact {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
}
