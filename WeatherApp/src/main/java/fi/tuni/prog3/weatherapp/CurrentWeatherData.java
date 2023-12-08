package fi.tuni.prog3.weatherapp;

import java.util.List;

public class CurrentWeatherData{
    public List<Weather> weather;
    public Main main;
    public int visibility;
    public Wind wind;
    public String name;

    // Getter and Setter methods for each field

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Weather {
        public int id;
        public String main;
        public String description;
        public String icon;

        // Getter and Setter methods...
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class Main {
        public double temp;
        public double feels_like;

        // Getter and Setter methods...
        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public void setFeelsTemp(double feelsTemp){
            this.feels_like = feelsTemp;
        }

        public double getFeelsTemp(){
            return feels_like;
        }
    }

    public static class Wind {
        public double speed;
        public int deg;

        // Getter and Setter methods...
        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }
        
        public int getDeg() {
            return deg;
        }

        public void setDeg(int deg) {
            this.deg = deg;
        }

    }
    
}
