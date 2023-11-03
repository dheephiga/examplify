package dev.group.studentserver.model;

import jakarta.persistence.*;

@Entity
public class Subject {

    @Id
    private String subCode;
    private String subName;

    public Subject(String subCode, String subName) {
        this.subCode = subCode;
        this.subName = subName;
    }

    public Subject() {

    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subCode='" + subCode + '\'' +
                ", subName='" + subName + '\'' +
                '}';
    }
}
