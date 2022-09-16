package com.autog.register.controller;

import com.autog.register.entity.Scheduling;
import com.autog.register.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/Scheduling")
public class SchedulingController {
    @Autowired
    private SchedulingService service;

    @PostMapping
    public ResponseEntity registerScheduling(@RequestBody @Valid Scheduling newScheduling) {
        return service.registerScheduling(newScheduling);
    }

    @GetMapping("/all/{idBuilding}")
    public ResponseEntity getAllScheduling(@PathVariable Integer idBuilding) {
        return service.listAllScheduling(idBuilding);
    }
}
