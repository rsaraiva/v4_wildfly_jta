/**
 * @author rsaraiva
 */
package com.rsaraiva.labs.vraptor4.controller;

import com.rsaraiva.labs.vraptor4.service.EventService;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import java.io.Serializable;
import java.time.LocalDate;
import javax.inject.Inject;

@Controller
public class EventController implements Serializable {
    
    @Inject private EventService service;
    @Inject private Result result;
    
    @Get("/events")
    public void event() {
        result.include("events", service.findAll());
    }

    @Get("/events/add/{description}/{date}")
    public void add(String description, LocalDate date) {
        service.persist(description, date);
        result.redirectTo(this).event();
    }
}
