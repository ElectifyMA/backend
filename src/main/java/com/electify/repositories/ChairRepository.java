package com.electify.repositories;

import com.electify.models.entities.Chair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChairRepository extends JpaRepository<Chair, UUID> {

}
