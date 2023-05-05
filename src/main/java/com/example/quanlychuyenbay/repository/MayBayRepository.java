package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.MayBayService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Long> {
    //Name Query
    MayBay findByLoai(String loai);

    //@Query
    @Query("select mb from MayBay mb where mb.tamBay < ?1")
    List<MayBay> underTamBay(int tamBay);

    //Native query
    @Query(value = "SELECT * FROM quanlychuyenbay.may_bay mb WHERE mb.loai LIKE %?1%", nativeQuery = true)
    List<MayBay> likeLoai(String loai);
}
