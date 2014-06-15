/**
 * @author rsaraiva
 */
package com.rsaraiva.labs.vraptor4.model;

import com.rsaraiva.labs.vraptor4.jpa.LocalDatePersistenceConverter;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Convert(converter = LocalDatePersistenceConverter.class)
    private LocalDate date;

    public Event() {
    }

    public Event(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }
    
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
