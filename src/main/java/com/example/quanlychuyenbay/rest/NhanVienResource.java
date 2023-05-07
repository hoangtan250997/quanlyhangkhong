package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.NhanVienService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NhanVienResource implements NhanVienAPI {
private final NhanVienService nhanVienService;
    @Override
    public ResponseEntity<List<NhanVien>> findAll() {
        return ResponseEntity.ok(nhanVienService.findAll());
    }

    @Override
    public ResponseEntity<NhanVien> findByMaNV(Long maNV) {
        return ResponseEntity.ok(nhanVienService.findByMaNV(maNV));
    }

    @Override
    public ResponseEntity<List<NhanVien>> findByLikeTen(String input) {
        return ResponseEntity.ok(nhanVienService.findByLikeTen(input));
    }

    @Override
    public ResponseEntity<List<NhanVien>> underLuong(int luong) {
        return ResponseEntity.ok(nhanVienService.underLuong(luong));
    }


}
