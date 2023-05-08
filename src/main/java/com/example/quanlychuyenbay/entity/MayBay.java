package com.example.quanlychuyenbay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="maybay")
@NamedQuery(name = "MayBay.findByLoai",
query = "select mb from MayBay mb where mb.loai = ?1")
public class MayBay {
    @Id
    private long maMB;
    private String loai;
    private int tamBay;

}
