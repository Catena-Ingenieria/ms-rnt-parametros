package com.mtt.rnt.services;

import com.mtt.rnt.dto.ZonaRegionDTO;
import com.mtt.rnt.entities.ZonaRegion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ZonaRegionService {

    Page<ZonaRegionDTO> getAllZonaRegion(Pageable pageable);

}