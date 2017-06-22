package com.wh2.restcountries.ui.test;

import com.wh2.restcountries.model.callbacks.CountriesCallback;
import com.wh2.restcountries.model.rest.responses.CountryListItemResponse;
import com.wh2.restcountries.model.rest.responses.CountryResponse;

import java.util.List;

/**
 * Created by wilmer on 6/20/17.
 */

public class PresenterCountries implements CountriesCallback {

    // PublishSubject<String> publishSubject = PublishSubject.create();

    @Override
    public void onNext(CountryResponse object) {
        System.out.println(object.toString());
    }

    @Override
    public void onComplete() {
        System.out.println("PresenterCountries Procccess Completed");
    }

    @Override
    public void onError(Throwable error) {
        System.out.println(error.getMessage());
    }

    @Override
    public void onError(String message) {
        System.out.println(message);
    }

    @Override
    public void onResponseCountryDetails(CountryResponse country) {
        System.out.println(country.toString());
    }

    @Override
    public void onCountriesFound(List<CountryListItemResponse> countries) {
        for (CountryListItemResponse item : countries){
            System.out.println(item.toString());
        }
    }
}
