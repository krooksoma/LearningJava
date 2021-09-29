package ObserverPattern;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}

/*        WeatherData weather = new WeatherData();

        CurrentConditionsDisplay current = new CurrentConditionsDisplay(weather);
        ForecastDisplay forecast = new ForecastDisplay(weather);

        weather.setMeasurements(90, 23, 33);
        weather.setMeasurements(79, 33, 12);*/
