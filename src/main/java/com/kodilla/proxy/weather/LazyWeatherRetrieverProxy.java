package com.kodilla.proxy.weather;

public class LazyWeatherRetrieverProxy implements DbWeatherRetriever {

    private DbWeatherRetriever retriever;

    @Override
    public String getWeather() throws InterruptedException {
        if (retriever == null)
            retriever = new WeatherForecast();
        return retriever.getWeather();
    }

    @Override
    public void refreshData() throws InterruptedException {
        if (retriever == null) {
            retriever = new WeatherForecast();
        }
        retriever.refreshData();
    }

}
