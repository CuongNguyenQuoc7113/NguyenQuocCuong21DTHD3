package com.example.NguyenQuocCuong.model;

public class PhongBan {
    private String maPhong;
    private String tenPhong;

    public PhongBan() {
    }

    public PhongBan(String maPhong, String tenPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }
}
