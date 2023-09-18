package com.example.Restarentproject1;

import lombok.AllArgsConstructor;
import lombok.Data;



public class Res {

    private Integer resId;
    private String resName;
    private String resAddress;
    private Long resNumber;
    private String resSpeciality;
    private Integer resTotalStaffs;
    private Integer resRatting;


    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResAddress() {
        return resAddress;
    }

    public void setResAddress(String resAddress) {
        this.resAddress = resAddress;
    }

    public Long getResNumber() {
        return resNumber;
    }

    public void setResNumber(Long resNumber) {
        this.resNumber = resNumber;
    }

    public String getResSpeciality() {
        return resSpeciality;
    }

    public void setResSpeciality(String resSpeciality) {
        this.resSpeciality = resSpeciality;
    }

    public Integer getResTotalStaffs() {
        return resTotalStaffs;
    }

    public void setResTotalStaffs(Integer resTotalStaffs) {
        this.resTotalStaffs = resTotalStaffs;
    }

    public Integer getResRatting() {
        return resRatting;
    }

    public void setResRatting(Integer resRatting) {
        this.resRatting = resRatting;
    }


    public Res(Integer resId, String resName, String resAddress, Long resNumber, String resSpeciality, Integer resTotalStaffs, Integer resRatting) {
        this.resId = resId;
        this.resName = resName;
        this.resAddress = resAddress;
        this.resNumber = resNumber;
        this.resSpeciality = resSpeciality;
        this.resTotalStaffs = resTotalStaffs;
        this.resRatting = resRatting;
    }
}
