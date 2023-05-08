package com.example.quanlychuyenbay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="chungnhan")
public class ChungNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="maNV")
    private NhanVien nhanVien;
    @ManyToOne
    @JoinColumn(name="maMB")
    private MayBay mayBay;

}
