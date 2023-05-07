package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    List<ChuyenBay> findByGaDiAndGaDen(String gaDi, String gaDen);

    List<ChuyenBay> ChiPhiBetween( int chiPhiMin, int chiPhiMax);
    @Query(value = "select * from quanlychuyenbay.chuyen_bay cb\n" +
            "where cb.chi_phi = (select min(cb2.chi_phi)  from quanlychuyenbay.chuyen_bay cb2)", nativeQuery = true)
    List<ChuyenBay> chiphiMin();
}
