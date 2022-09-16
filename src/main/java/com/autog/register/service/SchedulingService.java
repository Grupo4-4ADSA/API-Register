package com.autog.register.service;

import com.autog.register.entity.Scheduling;
import com.autog.register.repository.SchedulingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@Service
public class SchedulingService {
    @Autowired
    private SchedulingRepository repository;

    public ResponseEntity registerScheduling(Scheduling newScheduling) {
        repository.save(newScheduling);
        return status(201).build();
    }

    public ResponseEntity listAllScheduling(Integer idBuilding) {
        List<Scheduling> selectedList = repository.getSchedulingByCompany(idBuilding);
        return selectedList.isEmpty() ? noContent().build() : ok().body(selectedList);
    }
}
