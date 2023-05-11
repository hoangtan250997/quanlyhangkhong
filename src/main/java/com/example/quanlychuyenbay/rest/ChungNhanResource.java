package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.ChungNhanService;
import com.example.quanlychuyenbay.service.Dto.ChungNhanDto;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import com.example.quanlychuyenbay.service.NhanVienService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChungNhanResource implements ChungNhanAPI {
private final ChungNhanService chungNhanService;
    private final NhanVienService nhanVienService;


    @Override
    public ResponseEntity<List<ChungNhanDto>> findAll() {

        return ResponseEntity.ok(chungNhanService.findAll());
    }

    @Override
    public ResponseEntity<ChungNhanDto> findById(Long id) {

        return ResponseEntity.ok(chungNhanService.findById(id));
    }

    @Override
    public ResponseEntity<List<ChungNhanDto>> findByTenNV(String ten) {
        return ResponseEntity.ok(chungNhanService.findByTenNV(ten));
    }

    @Override
    public ResponseEntity<List<NhanVienDto>> showNhanVienbyMaMB(Long maMB) {
        return ResponseEntity.ok(nhanVienService.showNhanVienbyMaMB(maMB));
    }

}
