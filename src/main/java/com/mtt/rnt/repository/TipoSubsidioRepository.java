package com.mtt.rnt.repository;

import com.mtt.rnt.entities.TipoSubsidio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSubsidioRepository extends JpaRepository<TipoSubsidio, Long>, JpaSpecificationExecutor<TipoSubsidio> {
}