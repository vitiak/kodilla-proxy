package com.kodilla.proxy.weather;

public interface DbWeatherRetriever {
    String getWeather() throws InterruptedException;
    void refreshData() throws InterruptedException;
}
