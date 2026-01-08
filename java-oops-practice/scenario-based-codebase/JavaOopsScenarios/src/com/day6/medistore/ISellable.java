package com.day6.medistore;

public interface ISellable {

    boolean sell(int quantity);
    boolean checkExpiry();
}
