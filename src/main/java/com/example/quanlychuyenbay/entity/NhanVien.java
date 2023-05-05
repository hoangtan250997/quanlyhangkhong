package com.example.quanlychuyenbay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="nhan_vien")
@NamedQuery(name="NhanVien.findByMaNV",
query = "select n from NhanVien n where n.maNV=?1")
public class NhanVien {
    @Id
    private Long maNV;
    private String ten ;
    private int luong;

}
