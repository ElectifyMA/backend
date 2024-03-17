package com.electify.repositories;

import com.electify.models.entities.NationalList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NationalListRepository extends JpaRepository<NationalList, UUID> {

}
