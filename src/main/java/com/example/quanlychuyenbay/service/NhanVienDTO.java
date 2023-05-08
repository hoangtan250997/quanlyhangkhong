package com.example.quanlychuyenbay.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhanVienDTO {
    private Long maNV;
    private String ten ;
    private int luong;

}