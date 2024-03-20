package com.electify.repositories;

import com.electify.models.entities.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SuperAdminRepository extends JpaRepository<SuperAdmin, UUID> {

}
