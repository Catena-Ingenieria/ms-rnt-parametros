package com.mtt.rnt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "COMUNA")
public class Comuna {

    @Id
    @Column(name = "ID")
    private String codigo;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IDPROVINCIA")
    private Provincia provincia;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "comuna")
    private List<Localidad> localidades;

    @Transient
    public String getIdentifier() {
        return codigo;
    }

    @Transient
    public String getRegionIdentifier() {
        return provincia != null && provincia.getRegion() != null ? provincia.getRegion().getCodigo() : null;
    }

    @Transient
    public String getLabel() {
        return nombre;
    }

    @Transient
    public String getLabelLarge() {
        return nombre;
    }

}