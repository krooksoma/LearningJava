package ObserverPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature, humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(Float temperature, Float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions are:" + temperature + "F " + humidity + "%");
    }


    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
