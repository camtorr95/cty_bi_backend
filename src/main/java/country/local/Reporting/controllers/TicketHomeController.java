/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.controllers;

import country.local.Reporting.services.TicketHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ctorrest
 */
@Controller
@RequestMapping(path = "/ticketHome")
public class TicketHomeController {
    
    @Autowired
    TicketHomeService service;
    
    @GetMapping("/all")
    public String getTicketHome(){
        return "/ticketHomeView";
    }
}