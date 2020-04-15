package com.mongoFile.demo.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class FileUpload {
    @Id
    private String id;

    String zipFileName;
    String fileName;
    String country;
    String countryCode;

    public String
    getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZipFileName() {
        return zipFileName;
    }

    public void setZipFileName(String zipFileName) {
        this.zipFileName = zipFileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FileUpload)) return false;
        FileUpload that = (FileUpload) o;
        return getId().equals(that.getId()) &&
                getZipFileName().equals(that.getZipFileName()) &&
                getFileName().equals(that.getFileName()) &&
                getCountry().equals(that.getCountry()) &&
                getCountryCode().equals(that.getCountryCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getZipFileName(), getFileName(), getCountry(), getCountryCode());
    }
}
