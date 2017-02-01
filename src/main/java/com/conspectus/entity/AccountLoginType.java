package com.conspectus.entity;

/**
 * Created by luan vu on 1/30/2017.
 * Loại đăng nhập
 */
public enum AccountLoginType {
    EMAIL(0),
    GOOGLE(1),
    FACEBOOK(2);
    private int num;

    AccountLoginType(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
