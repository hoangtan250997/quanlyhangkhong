package com.example.quanlychuyenbay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="nhanvien")

public class NhanVien {
    @Id
    private Long maNV;
    private String ten ;
    private int luong;

}
