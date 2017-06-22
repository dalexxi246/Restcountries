package com.wh2.restcountries.model.rest.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Translations
{
    @SerializedName("de")
    @Expose
    private String de;

    @SerializedName("it")
    @Expose
    private String it;

    @SerializedName("pt")
    @Expose
    private String pt;

    @SerializedName("fr")
    @Expose
    private String fr;

    @SerializedName("br")
    @Expose
    private String br;

    @SerializedName("es")
    @Expose
    private String es;

    @SerializedName("ja")
    @Expose
    private String ja;

    public String getDe ()
    {
        return de;
    }

    public void setDe (String de)
    {
        this.de = de;
    }

    public String getIt ()
    {
        return it;
    }

    public void setIt (String it)
    {
        this.it = it;
    }

    public String getPt ()
    {
        return pt;
    }

    public void setPt (String pt)
    {
        this.pt = pt;
    }

    public String getFr ()
    {
        return fr;
    }

    public void setFr (String fr)
    {
        this.fr = fr;
    }

    public String getBr ()
    {
        return br;
    }

    public void setBr (String br)
    {
        this.br = br;
    }

    public String getEs ()
    {
        return es;
    }

    public void setEs (String es)
    {
        this.es = es;
    }

    public String getJa ()
    {
        return ja;
    }

    public void setJa (String ja)
    {
        this.ja = ja;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [de = "+de+", it = "+it+", pt = "+pt+", fr = "+fr+", br = "+br+", es = "+es+", ja = "+ja+"]";
    }
}
