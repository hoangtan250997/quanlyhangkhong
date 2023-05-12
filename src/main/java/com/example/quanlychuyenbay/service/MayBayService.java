package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.exception.DemoException;
import com.example.quanlychuyenbay.repository.MayBayRepository;
import com.example.quanlychuyenbay.service.Dto.MayBayDto;
import com.example.quanlychuyenbay.service.mapper.MayBayMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.security.auth.DestroyFailedException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MayBayService {
    private final MayBayRepository mayBayRepository;

    public List<MayBayDto> findAll() {

        return MayBayMapper.INSTANCE.toDtos(mayBayRepository.findAll());
    }

    public MayBayDto findByLoai(String loai) {
        if (mayBayRepository.findByLoai(loai) == null) throw DemoException.MaybayNotFound();
        return MayBayMapper.INSTANCE.toDto(mayBayRepository.findByLoai(loai));
    }

    public List<MayBayDto> underTamBay(int tamBay) {
        if (tamBay < 0) throw DemoException.badRequest("WrongFormat", "Tam Bay cannot negative");
        return mayBayRepository.underTamBay(tamBay);
    }

    public List<MayBayDto> likeLoai(String loai) {
        if (mayBayRepository.likeLoai(loai).size() == 0) throw DemoException.MaybayNotFound();
        return MayBayMapper.INSTANCE.toDtos(mayBayRepository.likeLoai(loai));
    }
}
