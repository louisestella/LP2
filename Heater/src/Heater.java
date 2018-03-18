
public class Heater {
    int temperature;
    int min = -30;
    int max = 100;
    int increment = 5;
    
    Heater(){
        temperature = 15;
    }

    void Warmer(){
        if( temperature + increment < max ){
            temperature += increment;
        }
    }

    void Cooler(){
        if( temperature - increment > min ){
            temperature -= increment;
        }
    }

    int getTemperature(){
        return temperature;
    }

    void setIncrement( int x ){
        increment = x;
    }

}
