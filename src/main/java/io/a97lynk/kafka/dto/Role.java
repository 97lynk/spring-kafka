package io.a97lynk.kafka.dto;

import java.io.Serializable;

public class Role implements Serializable {

    private static final long serialVersionUID = -4540406792637042559L;

    private String code;

    private String name;

    public Role() {
    }

    public Role(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
