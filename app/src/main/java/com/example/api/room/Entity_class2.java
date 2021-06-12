package com.example.api.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table2")
public class Entity_class2
{
    @PrimaryKey(autoGenerate = true)
    private int countryID;

    @ColumnInfo(name ="CountryName")
   private String name;

    @ColumnInfo(name ="Capital")
    private String capital;

    @ColumnInfo(name="Region")
    private String region;

    @ColumnInfo(name ="SubRegion")
    private String subregion;

    @ColumnInfo(name = "Population")
    private String population;

    @ColumnInfo(name ="Area")
    private String area;

    @ColumnInfo(name ="NumericCode")
    private String numericCode;

    @ColumnInfo(name = "ImgageURl")
    private String flag;

    public Entity_class2() {

    }

    public Entity_class2(String name, String capital, String region, String subregion, String population, String area, String numericCode, String flag) {
        this.name = name;
        this.capital = capital;
        this.region = region;
        this.subregion = subregion;
        this.population = population;
        this.area = area;
        this.numericCode = numericCode;
        this.flag = flag;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Entity_class2{" +
                "countryID=" + countryID +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", population='" + population + '\'' +
                ", area='" + area + '\'' +
                ", numericCode='" + numericCode + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
