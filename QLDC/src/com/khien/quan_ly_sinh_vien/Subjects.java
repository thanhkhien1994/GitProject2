package com.khien.quan_ly_sinh_vien;

public class Subjects extends Document {
    private int subjectsID;
    private int soTietLyThuyet;
    private int soTietThucHanh;
    private int soTinChi;
    private String subjectsName;
    private String documentTest;

   public Subjects(){

   }

    public Subjects(String documentName, String author, String yearOut, int money, int subjectsID, int soTietLyThuyet, int soTietThucHanh, int soTinChi, String subjectsName, String documentTest) {
        super(documentName, author, yearOut, money);
        this.subjectsID = subjectsID;
        this.soTietLyThuyet = soTietLyThuyet;
        this.soTietThucHanh = soTietThucHanh;
        this.soTinChi = soTinChi;
        this.subjectsName = subjectsName;
        this.documentTest = documentTest;
    }

    public int getSubjectsID() {
        return subjectsID;
    }

    public void setSubjectsID(int subjectsID) {
        this.subjectsID = subjectsID;
    }

    public int getSoTietLyThuyet() {
        return soTietLyThuyet;
    }

    public void setSoTietLyThuyet(int soTietLyThuyet) {
        this.soTietLyThuyet = soTietLyThuyet;
    }

    public int getSoTietThucHanh() {
        return soTietThucHanh;
    }

    public void setSoTietThucHanh(int soTietThucHanh) {
        this.soTietThucHanh = soTietThucHanh;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getSubjectsName() {
        return subjectsName;
    }

    public void setSubjectsName(String subjectsName) {
        this.subjectsName = subjectsName;
    }

    public String getDocumentTest() {
        return documentTest;
    }

    public void setDocumentTest(String documentTest) {
        this.documentTest = documentTest;
    }
}
