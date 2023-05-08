package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {

    //Method Name
    NhanVien findByMaNV(Long manv);

    //Named Native Query
    @Query("select nv from NhanVien nv where nv.ten like %:input")
    List<NhanVien> findByLikeTen(@Param("input") String input);

    @Query(value = "select * from quanlychuyenbay.nhan_vien where luong < ?1", nativeQuery = true)
    List<NhanVien> underLuong(@Param("luong") int luong);

    @Query(value = "select nv.* from quanlychuyenbay.nhan_vien nv", nativeQuery = true)
    List<NhanVien> maxChungChi();


}
