package com.mantis.template.scheme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchemeRepository extends JpaRepository<SchemeEntity,Long> {

    @Query(value = "select * from scheme where financer_id = ?1", nativeQuery = true)
    public List<SchemeEntity> findAllSchemeByFinancer(Integer financerId);
}
