package com.autog.register.repository;

import com.autog.register.entity.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SchedulingRepository extends JpaRepository<Scheduling, Integer> {

    @Query("SELECT s FROM Scheduling s where room.building.idBuilding = ?1")
    List<Scheduling> getSchedulingByCompany(Integer idCompany);
}