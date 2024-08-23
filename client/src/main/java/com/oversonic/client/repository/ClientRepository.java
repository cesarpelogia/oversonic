package com.oversonic.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oversonic.client.domain.ClientDTO;

@Repository
public interface ClientRepository extends JpaRepository <ClientDTO, Integer> {
}
