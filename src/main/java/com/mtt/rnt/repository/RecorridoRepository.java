package com.mtt.rnt.repository;

import com.mtt.rnt.entities.Recorrido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RecorridoRepository extends JpaRepository<Recorrido, Long>, JpaSpecificationExecutor<Recorrido> {
}