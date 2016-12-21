package com.juliazubets.app.classwork.lesson17;

/**
 * Created by Julia Zubets on 11/30/2016.
 */
class BoxPrinter<T> {

    private T val;

// T stands for "Type" – this is placeholder

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";

    }

    public T getValue() {
        return val;
    }

}