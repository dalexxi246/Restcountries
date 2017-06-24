package com.wh2.restcountries.ui.test;

import com.wh2.restcountries.model.callbacks.CountriesCallback;
import com.wh2.restcountries.model.interactors.GetCountriesListInteractor;

public class Test {


    public static void main(String... args){

        CountriesCallback callback = new PresenterCountries();
        GetCountriesListInteractor interactor = new GetCountriesListInteractor();
        interactor.getCountriesDetailed("usan", callback);

    }

}
