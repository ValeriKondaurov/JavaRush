package com.javarush.task.task20.task2002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private boolean isMale;
    private Country country;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public static enum Country {
        UKRAINE("Ukraine"),
        RUSSIA("Russia"),
        OTHER("Other");

        private String name;

        private Country(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return this.name;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (isMale != user.isMale) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(user.birthDate) : user.birthDate != null) return false;
        return country == user.country;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (isMale ? 1 : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    public void save (PrintWriter printWriter) {
        printWriter.println(firstName);
        printWriter.println(lastName);
        printWriter.println( new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SS").format(birthDate));
        printWriter.println(isMale ? "yes" : "no");
        printWriter.println(country.getDisplayName());
        printWriter.flush();
    }

    public void load (BufferedReader reader) throws IOException, ParseException {
        firstName =  reader.readLine();
        lastName = reader.readLine();
        String dateString = reader.readLine();
        birthDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SS").parse(dateString);
        if (reader.readLine().equals("yes")) isMale = true;
        else isMale = false;
        String countryString = reader.readLine();
        switch (countryString) {
            case ("Russia") : {
                country = Country.RUSSIA;
                break;
            }
            case ("Ukraine") : {
                country = Country.UKRAINE;
                break;
            } default: country = Country.OTHER;
        }
    }

}
