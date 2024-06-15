package com.example.NguyenQuocCuong.service;

import com.example.NguyenQuocCuong.model.NhanVien;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NhanVienService {
    private List<NhanVien> listNhanVien = new ArrayList<>(Arrays.asList(
            new NhanVien("A01", "Nguyễn thị Hải", "NU", "Hà Nội", "TC", 600),
            new NhanVien("A02", "Trần văn Chính", "NAM", "Bình Định", "QT", 500),
            new NhanVien("A03", "Lê Trần bạch Yến", "NU", "TP HCM", "TC", 700),
            new NhanVien("A04", "Trần anh Tuấn", "NAM", "Hà Nội", "KT", 800),
            new NhanVien("B01", "Trần thanh Mai", "NU", "Hải Phòng", "TC", 800),
            new NhanVien("B02", "Trần thị thu Thủy", "NU", "TP HCM", "KT", 700),
            new NhanVien("B03", "Nguyễn Thị Nở", "NU", "Ninh Bình", "KT", 400)
    ));

    public List<NhanVien> getAll() {
        return listNhanVien;
    }
    public NhanVien get(String maNV) {
        return listNhanVien.stream()
                .filter(p -> p.getMaNV().equals(maNV))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void add(NhanVien newNhanVien) {
        listNhanVien.add(newNhanVien);
    }

    public void remove(String maNV) {
        NhanVien nhanVien = get(maNV);
        listNhanVien.remove(nhanVien);
    }

    public List<NhanVien> search(String key) {
        return listNhanVien.stream()
                .filter(p -> p.getTenNV().toLowerCase().contains(key.toLowerCase()) || p.getNoiSinh().toLowerCase().contains(key.toLowerCase()))
                .toList();
    }

    public void update(String maNV, NhanVien updatedNhanVien) {
        NhanVien nhanVien = get(maNV);
        nhanVien.setTenNV(updatedNhanVien.getTenNV());
        nhanVien.setPhai(updatedNhanVien.getPhai());
        nhanVien.setNoiSinh(updatedNhanVien.getNoiSinh());
        nhanVien.setMaPhong(updatedNhanVien.getMaPhong());
        nhanVien.setLuong(updatedNhanVien.getLuong());
    }
}
