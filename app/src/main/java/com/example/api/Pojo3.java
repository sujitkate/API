package com.example.api;
import java.util.ArrayList;

public class Pojo3
{
    private String name;
    ArrayList < Object > topLevelDomain = new ArrayList < Object > ();
    private String alpha2Code;
    private String alpha3Code;
    ArrayList < Object > callingCodes = new ArrayList < Object > ();
    private String capital;
    ArrayList < Object > altSpellings = new ArrayList < Object > ();
    private String region;
    private String subregion;
    private String population;
    ArrayList < Object > latlng = new ArrayList < Object > ();
    private String demonym;
    private String area;
    private String gini;
    ArrayList < Object > timezones = new ArrayList < Object > ();
    ArrayList < Object > borders = new ArrayList < Object > ();
    private String nativeName;
    private String numericCode;
    ArrayList < Object > currencies = new ArrayList < Object > ();
    ArrayList < Object > languages = new ArrayList < Object > ();
    Translations TranslationsObject;
    private String flag;
    ArrayList < Object > regionalBlocs = new ArrayList < Object > ();
    private String cioc;


    // Getter Methods

    public String getName() {
        return name;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

    public String getPopulation() {
        return population;
    }

    public String getDemonym() {
        return demonym;
    }

    public String getArea() {
        return area;
    }

    public String getGini() {
        return gini;
    }

    public String getNativeName() {
        return nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public Translations getTranslations() {
        return TranslationsObject;
    }

    public String getFlag() {
        return flag;
    }

    public String getCioc() {
        return cioc;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setGini(String gini) {
        this.gini = gini;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public void setTranslations(Translations translationsObject) {
        this.TranslationsObject = translationsObject;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    @Override
    public String toString() {
        return "Pojo3{" +
                "name='" + name + '\'' +
                ", topLevelDomain=" + topLevelDomain +
                ", alpha2Code='" + alpha2Code + '\'' +
                ", alpha3Code='" + alpha3Code + '\'' +
                ", callingCodes=" + callingCodes +
                ", capital='" + capital + '\'' +
                ", altSpellings=" + altSpellings +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", population='" + population + '\'' +
                ", latlng=" + latlng +
                ", demonym='" + demonym + '\'' +
                ", area='" + area + '\'' +
                ", gini='" + gini + '\'' +
                ", timezones=" + timezones +
                ", borders=" + borders +
                ", nativeName='" + nativeName + '\'' +
                ", numericCode='" + numericCode + '\'' +
                ", currencies=" + currencies +
                ", languages=" + languages +
                ", TranslationsObject=" + TranslationsObject +
                ", flag='" + flag + '\'' +
                ", regionalBlocs=" + regionalBlocs +
                ", cioc='" + cioc + '\'' +
                '}';
    }
}
class Translations {
    private String de;
    private String es;
    private String fr;
    private String ja;
    private String it;
    private String br;
    private String pt;
    private String nl;
    private String hr;
    private String fa;


    // Getter Methods

    public String getDe() {
        return de;
    }

    public String getEs() {
        return es;
    }

    public String getFr() {
        return fr;
    }

    public String getJa() {
        return ja;
    }

    public String getIt() {
        return it;
    }

    public String getBr() {
        return br;
    }

    public String getPt() {
        return pt;
    }

    public String getNl() {
        return nl;
    }

    public String getHr() {
        return hr;
    }

    public String getFa() {
        return fa;
    }

    // Setter Methods

    public void setDe(String de) {
        this.de = de;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    @Override
    public String toString() {
        return "Translations{" +
                "de='" + de + '\'' +
                ", es='" + es + '\'' +
                ", fr='" + fr + '\'' +
                ", ja='" + ja + '\'' +
                ", it='" + it + '\'' +
                ", br='" + br + '\'' +
                ", pt='" + pt + '\'' +
                ", nl='" + nl + '\'' +
                ", hr='" + hr + '\'' +
                ", fa='" + fa + '\'' +
                '}';
    }
}
// Getter Methods
