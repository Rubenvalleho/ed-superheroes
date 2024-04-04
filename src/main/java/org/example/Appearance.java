package org.example;

import java.util.List;

public class Appearance {
    public String gender;
    public String race;
    public List<String> height;
    public List<String> weight;
    public String eyeColor;
    public String hairColor;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public List<String> getHeight() {
        return height;
    }

    public void setHeight(List<String> height) {
        this.height = height;
    }

    public List<String> getWeight() {
        return weight;
    }

    public void setWeight(List<String> weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
