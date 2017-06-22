package com.wh2.restcountries.model.callbacks;

import com.wh2.restcountries.model.rest.responses.CountryListItemResponse;
import com.wh2.restcountries.model.rest.responses.CountryResponse;

import java.util.List;

/**
 * Created by wilmer on 18/06/17.
 */

public interface CountriesCallback extends ICallback<CountryResponse> {

    void onResponseCountryDetails(CountryResponse country);

    void onCountriesFound(List<CountryListItemResponse> countries);

}
