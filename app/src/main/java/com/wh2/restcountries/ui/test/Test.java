package com.wh2.restcountries.ui.test;

import com.wh2.restcountries.model.callbacks.CountriesCallback;
import com.wh2.restcountries.model.interactors.GetCountriesListInteractor;

import rx.Scheduler;
import rx.schedulers.Schedulers;

public class Test {


    public static void main(String... args){

        CountriesCallback callback = new PresenterCountries();
        GetCountriesListInteractor interactor = new GetCountriesListInteractor();
        interactor.getCountriesByRegionalBlock("usan", callback);
        interactor.getCountryDetails("co", callback);

    }

}
