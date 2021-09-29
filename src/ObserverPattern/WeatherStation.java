package ObserverPattern;



public class WeatherStation implements Observer, DisplayElement{

    private float temperature, humidity;
    private Subject weatherData;

    public WeatherStation(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current weather conditions are: " + temperature +"F " + humidity+"%.");
    }

}
