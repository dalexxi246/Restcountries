package com.wh2.restcountries.model.callbacks;

/**
 * Created by wilmer on 18/06/17.
 */

public interface ICallback<T> {

    void onNext(T object);

    void onComplete();

    void onError(Throwable error);

    // TODO: 18/06/17 Crear metodo Throwable
    @Deprecated
    void onError(String message);

}
