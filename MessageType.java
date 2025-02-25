package org.example.exceptionsrestapi.Exceptions;

import lombok.Getter;

@Getter
public enum MessageType {

    No_Record_Exists("1001","Kayit Bulunamadi"),
    General_Exception("9999","Genel Bir Hata Olusdu");

    private String code;

    private String message;

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
