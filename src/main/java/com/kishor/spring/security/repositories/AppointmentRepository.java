package com.kishor.spring.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishor.spring.security.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
