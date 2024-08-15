package com.tiya.models.entity;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@EntityScan
@Entity
@Table(name = "proyek_lokasi")

public class ProyekLokasi implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "proyek_id", nullable = false)
    private Proyek proyek;

    @ManyToOne
    @JoinColumn(name = "lokasi_id", nullable = false)
    private Lokasi lokasi;

    public ProyekLokasi() {
    }

    
    
    public ProyekLokasi(Proyek proyek, Lokasi lokasi) {
        this.proyek = proyek;
        this.lokasi = lokasi;
    }



    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    public Proyek getProyek() {
        return proyek;
    }



    public void setProyek(Proyek proyek) {
        this.proyek = proyek;
    }



    public Lokasi getLokasi() {
        return lokasi;
    }



    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }


    

    

    
}
