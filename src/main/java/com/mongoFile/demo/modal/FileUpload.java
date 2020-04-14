package com.mongoFile.demo.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class FileUpload {
    @Id
    private Long id;

    String ZipFileName;
    String FileName;
    String Country;
    String CountryCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipFileName() {
        return ZipFileName;
    }

    public void setZipFileName(String zipFileName) {
        ZipFileName = zipFileName;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
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
