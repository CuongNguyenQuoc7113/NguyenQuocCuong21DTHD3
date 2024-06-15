package com.example.NguyenQuocCuong.model;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private String phai;
    private String noiSinh;
    private String maPhong;
    private int luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String phai, String noiSinh, String maPhong, int luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.phai = phai;
        this.noiSinh = noiSinh;
        this.maPhong = maPhong;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
}
