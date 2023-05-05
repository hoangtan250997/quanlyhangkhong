package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.service.ChungNhanService;
import com.example.quanlychuyenbay.service.MayBayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChungNhanResource implements ChungNhanAPI {
private final ChungNhanService chungNhanService;


    @Override
    public ResponseEntity<List<ChungNhan>> findAll() {
        return ResponseEntity.ok(chungNhanService.findAll());
    }

    @Override
    public ResponseEntity<ChungNhan> findById(Long id) {
        return ResponseEntity.ok(chungNhanService.findById(id));
    }

}
