package com.dinu.serverappfirst.repository;

import com.dinu.serverappfirst.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server,Long> {
    Server findByIpAddress(String ipAddress);
}
