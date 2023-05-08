package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.NhanVienDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, Long> {

    @Query("select cn from ChungNhan cn where cn.nhanVien.ten like %:ten")
    List<ChungNhan> findByTenNV(String ten);

    @Query("select cn.nhanVien from ChungNhan cn where cn.mayBay.maMB = ?1")
    List<NhanVien> showNhanVienbyMaMB(Long maMB);

    // No converter found capable of converting from type [java.math.BigInteger] to type [com.example.quanlychuyenbay.entity.NhanVien]
//    @Query(value = "with tempo as (select count(cn.id) as c\n" +
//            "from quanlychuyenbay.chung_nhan cn\n" +
//            "group by cn.manv)\n" +
//            "select new com.example.quanlychuyenbay.service.NhanVienDTO(nv.manv, nv.ten, nv.luong) \n" +
//            "from quanlychuyenbay.nhan_vien nv, quanlychuyenbay.chung_nhan cn2 \n" +
//            "where nv.manv = cn2.manv \n" +
//            "group by nv.manv, nv.ten, nv.luong \n" +
//            "having count(cn2.id) = (select max(t.c) from tempo t) ", nativeQuery = true)
//    List<NhanVienDTO> maxChungChi();

//    @Query(value = "with tempo as (select count(cn.id) as c\n" +
//            "from quanlychuyenbay.chung_nhan cn\n" +
//            "group by cn.manv)\n" +
//            "select nv.* \n" +
//            "from quanlychuyenbay.nhan_vien nv, quanlychuyenbay.chung_nhan cn2 \n" +
//            "where nv.manv = cn2.manv \n" +
//            "group by nv.manv, nv.ten, nv.luong \n" +
//            "having count(cn2.id) = (select max(t.c) from tempo t) ", nativeQuery = true)
//
@Query(value = "select nv.* from quanlychuyenbay.nhan_vien nv", nativeQuery = true)
            List<NhanVien> maxChungChi();
//List<NhanVienDTO> maxChungChi();
}
