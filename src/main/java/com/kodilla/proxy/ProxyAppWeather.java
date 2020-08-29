package com.kodilla.proxy;

import com.kodilla.proxy.db.DbDataRetriever;
import com.kodilla.proxy.db.LazyDataRetrieverProxy;
import com.kodilla.proxy.weather.DbWeatherRetriever;
import com.kodilla.proxy.weather.LazyWeatherRetrieverProxy;

import java.util.Random;

public class ProxyAppWeather {

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 5; n++) {
            DbWeatherRetriever dbWeatherRetriever = new LazyWeatherRetrieverProxy();
            System.out.println(dbWeatherRetriever.getWeather() + n);
            double number = new Random().nextFloat();
            System.out.println("random number: " + number);
            if (number < 0.2) {
                dbWeatherRetriever.refreshData();
            }
            System.out.println("Execution #" + n + " just finished");
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }

}
