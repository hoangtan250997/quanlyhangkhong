package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.service.Dto.MayBayDto;
import com.example.quanlychuyenbay.service.MayBayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MayBayResource implements MayBayAPI {
private final MayBayService mayBayService;


    @Override
    public ResponseEntity<List<MayBayDto>> findAll() {

        return ResponseEntity.ok(mayBayService.findAll());
    }

    @Override
    public ResponseEntity<MayBayDto> findByLoai(String loai) {
        return ResponseEntity.ok(mayBayService.findByLoai(loai));
    }

    @Override
    public ResponseEntity<List<MayBayDto>> underTamBay(int tamBay) {
        return ResponseEntity.ok(mayBayService.underTamBay(tamBay));
    }

    @Override
    public ResponseEntity<List<MayBayDto>> likeLoai(String loai) {
        return ResponseEntity.ok(mayBayService.likeLoai(loai));
    }


}
