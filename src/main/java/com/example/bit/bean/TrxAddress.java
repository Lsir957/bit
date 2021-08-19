package com.example.bit.bean;

public class TrxAddress {
    private Long id;

    private Long uid;

    private String privateKey;

    private String publicKey;

    private String address;

    private String addressHex;

    private String token;

    private Integer status;

    private Integer blockTimestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey == null ? null : privateKey.trim();
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey == null ? null : publicKey.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddressHex() {
        return addressHex;
    }

    public void setAddressHex(String addressHex) {
        this.addressHex = addressHex == null ? null : addressHex.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBlockTimestamp() {
        return blockTimestamp;
    }

    public void setBlockTimestamp(Integer blockTimestamp) {
        this.blockTimestamp = blockTimestamp;
    }
}