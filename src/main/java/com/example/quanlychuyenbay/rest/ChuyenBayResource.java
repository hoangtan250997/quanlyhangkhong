package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.ChuyenBay;
import com.example.quanlychuyenbay.repository.ChuyenBayRepository;
import com.example.quanlychuyenbay.service.ChuyenBayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class ChuyenBayResource implements ChuyenBayAPI{
    private final ChuyenBayService chuyenBayService;
    @Override
    public ResponseEntity<List<ChuyenBay>> findAll() {
        return ResponseEntity.ok(chuyenBayService.findAll());
    }

    @Override
    public ResponseEntity<List<ChuyenBay>> findByGaDiAndGaDen(String gaDi, String gaDen) {
        return ResponseEntity.ok(chuyenBayService.findByGaDiAndGaDen(gaDi,gaDen));
    }
}
