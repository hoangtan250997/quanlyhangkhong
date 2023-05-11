package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.service.Dto.ChungNhanDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, Long> {

    @Query("select new com.example.quanlychuyenbay.service.Dto.ChungNhanDto(cn.id, cn.nhanVien.maNV, cn.mayBay.maMB) from ChungNhan cn where cn.nhanVien.ten like %:ten")
    List<ChungNhanDto> findByTenNV(String ten);

}