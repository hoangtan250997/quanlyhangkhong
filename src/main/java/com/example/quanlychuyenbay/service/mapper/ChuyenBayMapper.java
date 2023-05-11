package com.example.quanlychuyenbay.service.mapper;

import com.example.quanlychuyenbay.entity.ChuyenBay;
import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.service.Dto.ChuyenBayDto;
import com.example.quanlychuyenbay.service.Dto.MayBayDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChuyenBayMapper {
        ChuyenBayMapper INSTANCE = Mappers.getMapper(ChuyenBayMapper.class);
        ChuyenBayDto toDto(ChuyenBay chuyenBay);
        List<ChuyenBayDto> toDtos(List<ChuyenBay> chuyenBays);

}
