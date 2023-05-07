package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, Long> {

    @Query("select cn from ChungNhan cn where cn.nhanVien.ten like %:ten")
    List<ChungNhan> findByTenNV(String ten);
}
