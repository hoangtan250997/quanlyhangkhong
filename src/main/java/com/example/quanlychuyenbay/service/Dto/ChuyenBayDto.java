package com.example.quanlychuyenbay.service.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenBayDto {
    private String maCB;
    private String gaDi;
    private String gaDen;
    private int doDai;
    private LocalTime gioDi;
    private  LocalTime gioDen;
    private int chiPhi;

}
