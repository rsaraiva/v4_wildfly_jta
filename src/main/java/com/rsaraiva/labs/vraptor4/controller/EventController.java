/**
 * @author rsaraiva
 */
package com.rsaraiva.labs.vraptor4.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import com.rsaraiva.labs.vraptor4.model.Event;
import com.rsaraiva.labs.vraptor4.service.EventService;
import java.io.Serializable;
import javax.inject.Inject;

@Controller
public class EventController implements Serializable {
    
    @Inject private EventService service;
    @Inject private Result result;
    
    @Get("/events")
    public void event() {
        result.include("events", service.findAll());
    }

    @Post
    public void add(Event event) {
        service.persist(event);
        result.redirectTo(this).event();
    }
}
