package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.ChungNhanService;
import com.example.quanlychuyenbay.service.NhanVienDTO;
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

    @Override
    public ResponseEntity<List<ChungNhan>> findByTenNV(String ten) {
        return ResponseEntity.ok(chungNhanService.findByTenNV(ten));
    }

    @Override
    public ResponseEntity<List<NhanVien>> showNhanVienbyMaMB(Long maMB) {
        return ResponseEntity.ok(chungNhanService.showNhanVienbyMaMB(maMB));
    }


}
