package com.wh2.restcountries.model.rest;

import com.wh2.restcountries.model.rest.responses.CountryListItemResponse;
import com.wh2.restcountries.model.rest.responses.CountryResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface RestCountriesAPI {

    @GET("alpha/{id}")
    Observable<CountryResponse> getCountryDetails(@Path("id") String idCountry);

    @GET("regionalbloc/{block}?fields=name;flag;alpha2Code")
    Observable<List<CountryListItemResponse>> getCountriesByRegionalBloc(@Path("block") String regionalBlock);

}
