package com.mtt.rnt.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "RNT_ZONA_REGION")
public class ZonaRegion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ZONA", nullable = false, insertable = false, updatable = false)
    private Zona zona;

    @Column(name = "ID_REGION", nullable = false)
    private String idRegion;

}