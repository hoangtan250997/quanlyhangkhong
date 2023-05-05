package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    List<ChuyenBay> findByGaDiAndGaDen(String gaDi, String gaDen);
}
