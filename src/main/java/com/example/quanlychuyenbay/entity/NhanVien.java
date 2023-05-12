package com.example.quanlychuyenbay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="nhan_vien")

@SqlResultSetMapping(
        name = "ChungNhanStatistics",
        classes = {
                @ConstructorResult(
                        targetClass = com.example.quanlychuyenbay.service.Dto.ChungNhanStatisticsDto.class,
                        columns = {
                                @ColumnResult(name = "tenNhanVien", type = String.class),
                                @ColumnResult(name = "numberOfChungNhan", type = Long.class)})})
@NamedNativeQuery(
        name = NhanVien.COUNT_CHUNGNHAN_OF_NHANVIEN,
        query = "SELECT nv.ten as tenNhanVien, count(cn.id) as numberOfChungNhan " +
                "FROM  quanlychuyenbay.nhan_vien nv, quanlychuyenbay.chung_nhan cn " +
                "where nv.maNV = cn.maNV "+
                "GROUP BY nv.ten " +
                "ORDER BY count(cn.id) desc",
        resultSetMapping = "ChungNhanStatistics")
public class NhanVien {
    public static final String COUNT_CHUNGNHAN_OF_NHANVIEN = "NhanVien.countChungNhanOfNhanVien";

    @Id
    private Long maNV;
    private String ten ;
    private int luong;

}
