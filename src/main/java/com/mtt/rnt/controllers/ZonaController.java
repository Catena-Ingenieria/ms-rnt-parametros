package com.mtt.rnt.controllers;

import com.mtt.rnt.entities.Zona;
import com.mtt.rnt.services.ZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/zona", produces = MediaType.APPLICATION_JSON_VALUE)
public class ZonaController {

    @Autowired
    ZonaService zonaService;

    @GetMapping("/regiones-ids")
    public ResponseEntity<List<String>> getRegionesIdsFromZonas(@RequestBody List<Zona> zonas) {
        List<String> regionesIds = zonaService.getRegionesIdsFromZonas(zonas);
        return ResponseEntity.ok(regionesIds);
    }

}
