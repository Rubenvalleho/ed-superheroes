package org.example;

import java.util.List;

public class Id {
    public String id;
    public String name;
    public String slug;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public static class PowerStats {
        public Integer intelligence;
        public Integer strength;
        public Integer speed;
        public Integer durability;
        public Integer power;
        public Integer combat;

        public Integer getIntelligence() {
            return intelligence;
        }

        public void setIntelligence(Integer intelligence) {
            this.intelligence = intelligence;
        }

        public Integer getStrength() {
            return strength;
        }

        public void setStrength(Integer strength) {
            this.strength = strength;
        }

        public Integer getSpeed() {
            return speed;
        }

        public void setSpeed(Integer speed) {
            this.speed = speed;
        }

        public Integer getDurability() {
            return durability;
        }

        public void setDurability(Integer durability) {
            this.durability = durability;
        }

        public Integer getPower() {
            return power;
        }

        public void setPower(Integer power) {
            this.power = power;
        }

        public Integer getCombat() {
            return combat;
        }

        public void setCombat(Integer combat) {
            this.combat = combat;
        }
    }
    public static class Appearance {
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

    public static class Biography {
        public String fullName;
        public String alterEgos;
        public List<String> aliases;
        public String placeOfBirth;
        public String firstAppearance;
        public String publisher;
        public String alignment;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getAlterEgos() {
            return alterEgos;
        }

        public void setAlterEgos(String alterEgos) {
            this.alterEgos = alterEgos;
        }

        public List<String> getAliases() {
            return aliases;
        }

        public void setAliases(List<String> aliases) {
            this.aliases = aliases;
        }

        public String getPlaceOfBirth() {
            return placeOfBirth;
        }

        public void setPlaceOfBirth(String placeOfBirth) {
            this.placeOfBirth = placeOfBirth;
        }

        public String getFirstAppearance() {
            return firstAppearance;
        }

        public void setFirstAppearance(String firstAppearance) {
            this.firstAppearance = firstAppearance;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getAlignment() {
            return alignment;
        }

        public void setAlignment(String alignment) {
            this.alignment = alignment;
        }
    }

    public static class Work {
        public String occupation;
        public String base;

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public String getBase() {
            return base;
        }

        public void setBase(String base) {
            this.base = base;
        }
    }

    public static class Connections {
        public String groupAffiliation;
        public String relatives;

        public String getGroupAffiliation() {
            return groupAffiliation;
        }

        public void setGroupAffiliation(String groupAffiliation) {
            this.groupAffiliation = groupAffiliation;
        }

        public String getRelatives() {
            return relatives;
        }

        public void setRelatives(String relatives) {
            this.relatives = relatives;
        }
    }

    public static class Images {
        public String xs;
        public String sm;
        public String md;
        public String lg;

        public String getXs() {
            return xs;
        }

        public void setXs(String xs) {
            this.xs = xs;
        }

        public String getSm() {
            return sm;
        }

        public void setSm(String sm) {
            this.sm = sm;
        }

        public String getMd() {
            return md;
        }

        public void setMd(String md) {
            this.md = md;
        }

        public String getLg() {
            return lg;
        }

        public void setLg(String lg) {
            this.lg = lg;
        }
    }

}
