package com.juliazubets.app.homework.lesson14;

/**
 * Created by Julia Zubets on 11/24/2016.
 */
public class WhiteCollar extends Human {
    private String company;

    public WhiteCollar(int age, String name, String company){
        super(age, name);
        this.company = company;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany (String company){
        boolean isValid = true;
        for (int i = 0; i < company.length(); i++) {

            if ((company.charAt(i) < 'A' || company.charAt(i) > 'z') && company.charAt(i) != '-'
                    && company.charAt(i) != ' ' && company.charAt(i) != ',') {
                isValid = false;
            }
        }
        if (isValid == true)
                this.company = company;
        else
            System.out.println("Company name is invalid");

    }
}
