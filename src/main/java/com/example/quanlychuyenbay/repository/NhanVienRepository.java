package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {
NhanVien findByMaNV(Long manv);

@Query("select nv from NhanVien nv where nv.ten like %:input")
List<NhanVien> findByTen(@Param("input") String input);
}
