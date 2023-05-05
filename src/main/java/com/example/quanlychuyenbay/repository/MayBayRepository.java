package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.MayBayService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Long> {
MayBay findByLoai(String loai);
}
