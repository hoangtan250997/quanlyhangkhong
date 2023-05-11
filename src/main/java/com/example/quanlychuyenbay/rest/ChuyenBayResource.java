package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.ChuyenBay;
import com.example.quanlychuyenbay.exception.DemoException;
import com.example.quanlychuyenbay.repository.ChuyenBayRepository;
import com.example.quanlychuyenbay.service.ChuyenBayService;
import com.example.quanlychuyenbay.service.Dto.ChuyenBayDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class ChuyenBayResource implements ChuyenBayAPI{
    private final ChuyenBayService chuyenBayService;
    @Override
    public ResponseEntity<List<ChuyenBayDto>> findAll() {
        return ResponseEntity.ok(chuyenBayService.findAll());
    }

    @Override
    public ResponseEntity<List<ChuyenBayDto>> findByGaDiAndGaDen(String gaDi, String gaDen) {
        boolean checkGaDi=false;
        boolean checkGaDen=false;
        for (ChuyenBayDto a: chuyenBayService.findAll()
             ) {
            if (a.getGaDi().equals(gaDi)) checkGaDi= true;
        }
        for (ChuyenBayDto a: chuyenBayService.findAll()
        ) {
            if (a.getGaDen().equals(gaDen)) checkGaDen= true;
        }

        if ((checkGaDi == false) || (checkGaDen == false)) throw new DemoException().badRequest("GaNotFound","Ga Di or Ga Den not found");

        return ResponseEntity.ok(chuyenBayService.findByGaDiAndGaDen(gaDi,gaDen));
    }

    @Override
    public ResponseEntity<List<ChuyenBayDto>> ChiPhiBetween(int chiPhiMin,int chiPhiMax) {
        return ResponseEntity.ok(chuyenBayService.ChiPhiBetween(chiPhiMin,chiPhiMax));
    }

    @Override
    public ResponseEntity<List<ChuyenBayDto>> chiphiMin() {
        return ResponseEntity.ok(chuyenBayService.chiPhiMin());
    }
}
