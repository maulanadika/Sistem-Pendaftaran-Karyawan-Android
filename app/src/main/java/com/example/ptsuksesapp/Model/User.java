package com.example.ptsuksesapp.Model;

public class User {

    private int id, nohp, nik;
    private String nama, username, jeniskelamin, email, date, pendidikan, password;

    public User(int id,int nik, int nohp, String nama, String username,String jeniskelamin,String email,String date, String pendidikan,String password) {
        this.id = id;
        this.nik = nik;
        this.nama = nama;
        this.username = username;
        this.jeniskelamin = jeniskelamin;
        this.email = email;
        this.date = date;
        this.nohp = nohp;
        this.pendidikan = pendidikan;
        this.password = password;
    }

    public User(String id, String nama, String nohp, String pendidikan) {
    }


    public int getId() {
        return id;
    }

    public int getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public int getNohp() {
        return nohp;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public String getPassword() {
        return password;
    }
}
