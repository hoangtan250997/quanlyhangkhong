package com.example.quanlychuyenbay.repository;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, Long> {
}
