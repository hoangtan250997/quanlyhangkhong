package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.MayBay;
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
    public ResponseEntity<List<MayBay>> findAll() {
        return ResponseEntity.ok(mayBayService.findAll());
    }


}