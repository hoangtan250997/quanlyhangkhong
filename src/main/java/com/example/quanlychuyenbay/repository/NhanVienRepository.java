package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {
}
