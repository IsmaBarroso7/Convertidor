/**
* Creem la variable temperatura amb kelvins
* Farem que cada kelvin es transformi per rebre els seus fahrenheit.
* fem els calculs necesaris per rebre els valors desitjats
* 
 */

public class Temperatura {
    private double kelvin;

    public Temperatura(double kelvin) {
	this.kelvin = kelvin;
    }

    public void setKelvin(double kelvin) {
	this.kelvin = kelvin;
    }

    public double getKelvin() {
	return this.kelvin;
    }

    public void setCelsius(double celsius) {
	this.kelvin = kelvin - 273.15;
    }

    public double getCelsius() {
	return this.kelvin + 273.15;
    }

    public void setFahrenheit(double fahrenheit) {
	this.kelvin = 9 * (kelvin - 273.15) / 5 + 32;
    }

    public double getFahrenheit() {
	return (9 / (kelvin + 273.15) * 5 - 32);
    }
}