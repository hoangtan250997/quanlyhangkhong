package com.example.quanlychuyenbay.service.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChungNhanStatisticsDto {

    private String tenNhanVien;
    private long numberOfChungNhan;
}
