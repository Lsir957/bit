package com.example.bit.bean;

public class MiniKeyValue extends MiniKeyValueKey {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}