package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
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
    public ResponseEntity<List<NhanVienDto>> getAll() {
        return ResponseEntity.ok().body(nhanVienService.getAllNhanVien());
    }

    @Override
    public ResponseEntity<NhanVienDto> findByMaNV(Long maNV) {
        return ResponseEntity.ok(nhanVienService.findByMaNV(maNV));
    }

    @Override
    public ResponseEntity<List<NhanVienDto>> findByLikeTen(String input) {
        return ResponseEntity.ok(nhanVienService.findByLikeTen(input));
    }

    @Override
    public ResponseEntity<List<NhanVienDto>> findUnderLuong(int luong) {
        return ResponseEntity.ok(nhanVienService.findUnderLuong(luong));
    }

    @Override
    public ResponseEntity<List<NhanVienDto>> getChungNhanMax() {
        return ResponseEntity.ok(nhanVienService.getChungNhanMax());
    }


}
