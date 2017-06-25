package com.wh2.restcountries.model.interactors;

import com.wh2.restcountries.model.callbacks.CountriesCallback;
import com.wh2.restcountries.model.rest.RestCountriesAPI;
import com.wh2.restcountries.model.rest.RestCountriesClient;

import io.reactivex.Observable;

public class GetCountriesListInteractor {

    private RestCountriesAPI api;

    public GetCountriesListInteractor() {
        this.api = RestCountriesClient.getRestCountriesAPI();
    }

    public void getCountriesByRegionalBlock(String regionalBlock, CountriesCallback callback) {
        api.getCountriesByRegionalBloc(regionalBlock)
                .subscribe(
                        callback::onCountriesFound,
                        error -> callback.onError(error.getLocalizedMessage()),
                        callback::onComplete);
    }

    public void getCountriesDetailed(String regionalBlock, CountriesCallback countriesCallback) {
        api.getCountriesByRegionalBloc(regionalBlock)
                .doOnError(throwable -> System.out.println(throwable.getLocalizedMessage()))
                .flatMap(Observable::fromIterable)
                .flatMap(countryListItemResponse -> api.getCountryDetails(countryListItemResponse.getAlpha2Code()))
                .subscribe(
                        countryResponse -> System.out.println(countryResponse.getAlpha3Code() + " -> " + countryResponse.getNativeName()),
                        countriesCallback::onError,
                        countriesCallback::onComplete);
    }

    public void getCountryDetails(String countryCode, CountriesCallback callback) {
        api.getCountryDetails(countryCode)
                .subscribe(
                        callback::onResponseCountryDetails,
                        callback::onError,
                        callback::onComplete);
    }
}
