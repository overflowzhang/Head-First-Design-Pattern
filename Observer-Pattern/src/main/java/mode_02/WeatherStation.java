package mode_02;

import mode_01.CurrentConditionsDisplay;
import mode_01.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        mode_01.WeatherData weatherData = new WeatherData();
        mode_01.CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}