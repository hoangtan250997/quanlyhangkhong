package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.exception.DemoException;
import com.example.quanlychuyenbay.service.Dto.ChungNhanStatisticsDto;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import com.example.quanlychuyenbay.service.NhanVienService;
import com.example.quanlychuyenbay.service.mapper.NhanVienMapper;
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
        if (input.isBlank()) throw DemoException.badRequest("TenEmpty","Ten is null or empty");
        return ResponseEntity.ok(nhanVienService.findByLikeTen(input));
    }

    @Override
    public ResponseEntity<List<NhanVienDto>> findUnderLuong(int luong) {
        return ResponseEntity.ok(nhanVienService.findUnderLuong(luong));
    }

    @Override
    public ResponseEntity<List<NhanVienDto  >> getChungNhanMax() {
        return ResponseEntity.ok(nhanVienService.getChungNhanMax());
    }

    @Override
    public ResponseEntity<List<ChungNhanStatisticsDto>> countChungNhanOfNhanVienJPQL() {
        return ResponseEntity.ok(nhanVienService.countChungNhanOfNhanVienJPQL());
    }

    @Override
    public ResponseEntity<List<ChungNhanStatisticsDto>> countChungNhanOfNhanVien() {
        return ResponseEntity.ok(nhanVienService.countChungNhanOfNhanVien());
    }


}
