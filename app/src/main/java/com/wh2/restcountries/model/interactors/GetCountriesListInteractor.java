package com.wh2.restcountries.model.interactors;

import com.wh2.restcountries.model.callbacks.CountriesCallback;
import com.wh2.restcountries.model.rest.RestCountriesAPI;
import com.wh2.restcountries.model.rest.RestCountriesClient;
import com.wh2.restcountries.model.rest.responses.CountryListItemResponse;
import com.wh2.restcountries.model.rest.responses.CountryResponse;

import java.util.List;

import rx.Observable;
import rx.Subscriber;

public class GetCountriesListInteractor {

    private RestCountriesAPI api;

    public GetCountriesListInteractor() {
        this.api = RestCountriesClient.getRestCountriesAPI();
    }

    public void getCountriesByRegionalBlock(String regionalBlock, CountriesCallback callback) {
        api.getCountriesByRegionalBloc(regionalBlock)
                .subscribe(new Subscriber<List<CountryListItemResponse>>() {
                    @Override
                    public void onCompleted() {
                        callback.onComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e.getLocalizedMessage());
                    }

                    @Override
                    public void onNext(List<CountryListItemResponse> countryListItemResponses) {
                        callback.onCountriesFound(countryListItemResponses);
                    }
                });
    }

    public void getCountriesDetailed(String regionalBlock, CountriesCallback countriesCallback) {
        api.getCountriesByRegionalBloc(regionalBlock)
                .flatMap(Observable::from)
                .flatMap(countryListItemResponse -> api.getCountryDetails(countryListItemResponse.getAlpha2Code()))
                .subscribe(
                        countryResponse -> System.out.println(countryResponse.getAlpha3Code() + " -> " + countryResponse.getName()),
                        countriesCallback::onError,
                        countriesCallback::onComplete);
    }

    public void getCountryDetails(String countryCode, CountriesCallback callback) {
        api.getCountryDetails(countryCode)
                .subscribe(new Subscriber<CountryResponse>() {
                    @Override
                    public void onCompleted() {
                        callback.onComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e.getLocalizedMessage());
                    }

                    @Override
                    public void onNext(CountryResponse countryResponse) {
                        callback.onResponseCountryDetails(countryResponse);
                    }
                });
    }
}
