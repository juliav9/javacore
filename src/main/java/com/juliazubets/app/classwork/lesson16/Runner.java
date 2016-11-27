package com.juliazubets.app.classwork.lesson16;

import java.util.Arrays;

/**
 * Created by Julia Zubets on 11/26/2016.
 */
public class Runner {
    public static void main(String[] args) {
        Arrays.asList(Company.values()).forEach(company ->
                System.out.println("Company name: " + company.name() + " revenue:" + company.getValue()));
    }
}
