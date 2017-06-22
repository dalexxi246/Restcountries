package com.wh2.restcountries.model.rest.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegionalBlocs
{
    @SerializedName("otherAcronyms")
    @Expose
    private String[] otherAcronyms;

    @SerializedName("acronym")
    @Expose
    private String acronym;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("otherNames")
    @Expose
    private String[] otherNames;

    public String[] getOtherAcronyms ()
    {
        return otherAcronyms;
    }

    public void setOtherAcronyms (String[] otherAcronyms)
    {
        this.otherAcronyms = otherAcronyms;
    }

    public String getAcronym ()
    {
        return acronym;
    }

    public void setAcronym (String acronym)
    {
        this.acronym = acronym;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getOtherNames ()
    {
        return otherNames;
    }

    public void setOtherNames (String[] otherNames)
    {
        this.otherNames = otherNames;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [otherAcronyms = "+otherAcronyms+", acronym = "+acronym+", name = "+name+", otherNames = "+otherNames+"]";
    }
}
