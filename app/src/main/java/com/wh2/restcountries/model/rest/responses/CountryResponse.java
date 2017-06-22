package com.wh2.restcountries.model.rest.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountryResponse
{
    @SerializedName("region")
    @Expose
    private String region;

    @SerializedName("currencies")
    @Expose
    private Currencies[] currencies;

    @SerializedName("numericCode")
    @Expose
    private String numericCode;

    @SerializedName("callingCodes")
    @Expose
    private String[] callingCodes;

    @SerializedName("alpha3Code")
    @Expose
    private String alpha3Code;

    @SerializedName("nativeName")
    @Expose
    private String nativeName;

    @SerializedName("topLevelDomain")
    @Expose
    private String[] topLevelDomain;

    @SerializedName("alpha2Code")
    @Expose
    private String alpha2Code;

    @SerializedName("capital")
    @Expose
    private String capital;

    @SerializedName("altSpellings")
    @Expose
    private String[] altSpellings;

    @SerializedName("languages")
    @Expose
    private Languages[] languages;

    @SerializedName("subregion")
    @Expose
    private String subregion;

    @SerializedName("timezones")
    @Expose
    private String[] timezones;

    @SerializedName("flag")
    @Expose
    private String flag;

    @SerializedName("area")
    @Expose
    private String area;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("regionalBlocs")
    @Expose
    private RegionalBlocs[] regionalBlocs;

    @SerializedName("translations")
    @Expose
    private Translations translations;

    @SerializedName("latlng")
    @Expose
    private String[] latlng;

    @SerializedName("demonym")
    @Expose
    private String demonym;

    @SerializedName("gini")
    @Expose
    private String gini;

    @SerializedName("borders")
    @Expose
    private String[] borders;

    @SerializedName("population")
    @Expose
    private String population;

    public String getRegion ()
    {
        return region;
    }

    public void setRegion (String region)
    {
        this.region = region;
    }

    public Currencies[] getCurrencies ()
    {
        return currencies;
    }

    public void setCurrencies (Currencies[] currencies)
    {
        this.currencies = currencies;
    }

    public String getNumericCode ()
    {
        return numericCode;
    }

    public void setNumericCode (String numericCode)
    {
        this.numericCode = numericCode;
    }

    public String[] getCallingCodes ()
    {
        return callingCodes;
    }

    public void setCallingCodes (String[] callingCodes)
    {
        this.callingCodes = callingCodes;
    }

    public String getAlpha3Code ()
    {
        return alpha3Code;
    }

    public void setAlpha3Code (String alpha3Code)
    {
        this.alpha3Code = alpha3Code;
    }

    public String getNativeName ()
    {
        return nativeName;
    }

    public void setNativeName (String nativeName)
    {
        this.nativeName = nativeName;
    }

    public String[] getTopLevelDomain ()
    {
        return topLevelDomain;
    }

    public void setTopLevelDomain (String[] topLevelDomain)
    {
        this.topLevelDomain = topLevelDomain;
    }

    public String getAlpha2Code ()
    {
        return alpha2Code;
    }

    public void setAlpha2Code (String alpha2Code)
    {
        this.alpha2Code = alpha2Code;
    }

    public String getCapital ()
    {
        return capital;
    }

    public void setCapital (String capital)
    {
        this.capital = capital;
    }

    public String[] getAltSpellings ()
    {
        return altSpellings;
    }

    public void setAltSpellings (String[] altSpellings)
    {
        this.altSpellings = altSpellings;
    }

    public Languages[] getLanguages ()
    {
        return languages;
    }

    public void setLanguages (Languages[] languages)
    {
        this.languages = languages;
    }

    public String getSubregion ()
    {
        return subregion;
    }

    public void setSubregion (String subregion)
    {
        this.subregion = subregion;
    }

    public String[] getTimezones ()
    {
        return timezones;
    }

    public void setTimezones (String[] timezones)
    {
        this.timezones = timezones;
    }

    public String getFlag ()
    {
        return flag;
    }

    public void setFlag (String flag)
    {
        this.flag = flag;
    }

    public String getArea ()
    {
        return area;
    }

    public void setArea (String area)
    {
        this.area = area;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public RegionalBlocs[] getRegionalBlocs ()
    {
        return regionalBlocs;
    }

    public void setRegionalBlocs (RegionalBlocs[] regionalBlocs)
    {
        this.regionalBlocs = regionalBlocs;
    }

    public Translations getTranslations ()
    {
        return translations;
    }

    public void setTranslations (Translations translations)
    {
        this.translations = translations;
    }

    public String[] getLatlng ()
    {
        return latlng;
    }

    public void setLatlng (String[] latlng)
    {
        this.latlng = latlng;
    }

    public String getDemonym ()
    {
        return demonym;
    }

    public void setDemonym (String demonym)
    {
        this.demonym = demonym;
    }

    public String getGini ()
    {
        return gini;
    }

    public void setGini (String gini)
    {
        this.gini = gini;
    }

    public String[] getBorders ()
    {
        return borders;
    }

    public void setBorders (String[] borders)
    {
        this.borders = borders;
    }

    public String getPopulation ()
    {
        return population;
    }

    public void setPopulation (String population)
    {
        this.population = population;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [region = "+region+", currencies = "+currencies+", numericCode = "+numericCode+", callingCodes = "+callingCodes+", alpha3Code = "+alpha3Code+", nativeName = "+nativeName+", topLevelDomain = "+topLevelDomain+", alpha2Code = "+alpha2Code+", capital = "+capital+", altSpellings = "+altSpellings+", languages = "+languages+", subregion = "+subregion+", timezones = "+timezones+", flag = "+flag+", area = "+area+", name = "+name+", regionalBlocs = "+regionalBlocs+", translations = "+translations+", latlng = "+latlng+", demonym = "+demonym+", gini = "+gini+", borders = "+borders+", population = "+population+"]";
    }
}

