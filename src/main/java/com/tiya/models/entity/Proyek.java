package com.tiya.models.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyek")
public class Proyek implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String client;

    private String keterangan;

    private String nama_proyek;

    private String pimpinan_proyek;

    private LocalDate tgl_mulai;

    private LocalDate tgl_selesai;

    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn(name = "lokasi_id", nullable = false)
    private Lokasi lokasi;

    // Getter and Setter methods for each field

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getNama_proyek() {
        return nama_proyek;
    }

    public void setNama_proyek(String nama_proyek) {
        this.nama_proyek = nama_proyek;
    }

    public String getPimpinan_proyek() {
        return pimpinan_proyek;
    }

    public void setPimpinan_proyek(String pimpinan_proyek) {
        this.pimpinan_proyek = pimpinan_proyek;
    }

    public LocalDate getTgl_mulai() {
        return tgl_mulai;
    }

    public void setTgl_mulai(LocalDate tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public LocalDate getTgl_selesai() {
        return tgl_selesai;
    }

    public void setTgl_selesai(LocalDate tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }
}
