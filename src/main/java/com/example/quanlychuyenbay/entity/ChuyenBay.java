package com.example.quanlychuyenbay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="chuyen_bay")
public class ChuyenBay {
    @Id
    private String maCB;
    private String gaDi;
    private String gaDen;
    private int doDai;
    private LocalTime gioDi;
    private  LocalTime gioDen;
    private int chiPhi;

}
