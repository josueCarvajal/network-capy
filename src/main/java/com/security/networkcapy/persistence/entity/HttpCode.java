package com.security.networkcapy.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "HTTP_CODE")
public class HttpCode {
    @Id
    @Column(name = "http_code")
    private Integer httpCode;

    @Column(name = "http_name")
    private String httpName;

    @Column(name = "http_description")
    private String httpDescription;

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public String getHttpName() {
        return httpName;
    }

    public void setHttpName(String httpName) {
        this.httpName = httpName;
    }

    public String getHttpDescription() {
        return httpDescription;
    }

    public void setHttpDescription(String httpDescription) {
        this.httpDescription = httpDescription;
    }

}
