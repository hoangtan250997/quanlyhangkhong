package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.Dto.ChungNhanDto;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, Long> {

    @Query("select new com.example.quanlychuyenbay.service.Dto.ChungNhanDto(cn.id, cn.nhanVien.maNV, cn.mayBay.maMB) from ChungNhan cn where cn.nhanVien.ten like %:ten")
    List<ChungNhanDto> findByTenNV(String ten);

    @Query("select new com.example.quanlychuyenbay.service.Dto.NhanVienDto(cn.nhanVien.maNV, cn.nhanVien.ten, cn.nhanVien.luong) from ChungNhan cn where cn.mayBay.maMB = ?1")
    List<NhanVienDto> showNhanVienbyMaMB(Long maMB);
}