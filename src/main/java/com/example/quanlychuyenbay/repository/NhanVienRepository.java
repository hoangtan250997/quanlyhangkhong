package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {

    //Method Name
    NhanVienDto findByMaNV(Long manv);

    //Named Native Query
    @Query("select new com.example.quanlychuyenbay.service.Dto.NhanVienDto(nv.maNV, nv.ten, nv.luong) from NhanVien nv where nv.ten like %:input")
    List<NhanVienDto> findByLikeTen(@Param("input") String input);

    //    @Query(value = "select new com.example.quanlychuyenbay.service.Dto.NhanVienDto(nv.maNV, nv.ten, nv.luong) from NhanVien nv where nv.luong < ?1")
    @Query(value = "select nv.* from quanlychuyenbay.nhan_vien nv where nv.luong < ?1", nativeQuery = true)
    List<NhanVien> findUnderLuong(@Param("luong") int luong);

    @Query(value = "with tempo as (select count(cn.id) as c\n" +
            "from quanlychuyenbay.chung_nhan cn\n" +
            "group by cn.manv)\n" +
            "select nv.manv, nv.ten, nv.luong \n" +
            "from quanlychuyenbay.nhan_vien nv, quanlychuyenbay.chung_nhan cn2 \n" +
            "where nv.manv = cn2.manv \n" +
            "group by nv.manv, nv.ten, nv.luong \n" +
            "having count(cn2.id) = (select max(t.c) from tempo t) ", nativeQuery = true)
    List<NhanVien> getChungNhanMax();


}
