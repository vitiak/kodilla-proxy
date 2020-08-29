package com.kodilla.proxy.weather;

public class WeatherForecast implements DbWeatherRetriever {

    public WeatherForecast() throws InterruptedException {
//        Thread.sleep(3000);
    }

    @Override
    public String getWeather() throws InterruptedException {
        return "opis przyrody nr ";
    }

    @Override
    public void refreshData() throws InterruptedException {
        System.out.println("refresh daty ");
        Thread.sleep(5000);
    }
}
