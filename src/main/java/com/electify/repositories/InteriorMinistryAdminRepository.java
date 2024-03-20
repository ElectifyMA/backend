package com.electify.repositories;

import com.electify.models.entities.InteriorMinistryAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface InteriorMinistryAdminRepository extends JpaRepository<InteriorMinistryAdmin, UUID> {

}
