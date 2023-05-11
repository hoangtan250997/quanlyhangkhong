package com.example.quanlychuyenbay.service.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MayBayDto {
    private long maMB;
    private String loai;
    private int tamBay;
}
