package com.tiya.models.entity;

import java.io.Serializable;
import java.time.LocalDateTime;


import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyek")
public class Proyek implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nama_proyek;

    private String client;

    private LocalDateTime tgl_mulai;

    private LocalDateTime tgl_selesai;

    private String pimpinan_proyek;

    private String keterangan;


    @ManyToOne
    @JoinColumn(name = "lokasi_id", nullable = false)
    private Lokasi lokasi;


    public Proyek() {
    }

    public Proyek(Long id, String nama_proyek, String client, LocalDateTime tgl_mulai, LocalDateTime tgl_selesai,
            String pimpinan_proyek, String keterangan) {
        this.id = id;
        this.nama_proyek = nama_proyek;
        this.client = client;
        this.tgl_mulai = tgl_mulai;
        this.tgl_selesai = tgl_selesai;
        this.pimpinan_proyek = pimpinan_proyek;
        this.keterangan = keterangan;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_proyek() {
        return nama_proyek;
    }

    public void setNama_proyek(String nama_proyek) {
        this.nama_proyek = nama_proyek;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getTgl_mulai() {
        return tgl_mulai;
    }

    public void setTgl_mulai(LocalDateTime tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public LocalDateTime getTgl_selesai() {
        return tgl_selesai;
    }

    public void setTgl_selesai(LocalDateTime tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
    }

    public String getPimpinan_proyek() {
        return pimpinan_proyek;
    }

    public void setPimpinan_proyek(String pimpinan_proyek) {
        this.pimpinan_proyek = pimpinan_proyek;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    

}



