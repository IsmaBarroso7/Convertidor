/**
* Creem la variable de segons per tenir el nostre temps i fem els calculs per rebre els minuts hores...
* fem returns dels resultats calculats per tal que l'usuari tingui els valors desitjats
* necessari fer caculs dels valor per tal de fer conversions d'un temps a un altre com d'hores a minuts...
 */

public class Temps {
    private double segons;

    public Temps(double segons) {
	this.segons = segons;
    }

    public void setSegons(double segons) {
	this.segons = segons;
    }

    public double getSegons() {
	return this.segons;
    }

    public void setMinuts(double minuts) {
	this.segons = segons / 60;
    }

    public double getMinuts() {
	return this.segons * 60;
    }

    public void setHores(double hores) {
	this.segons = segons / 3600;
    }

    public double getHores() {
	return this.segons * 3600;
    }

    public void setMS(double ms) {
	this.segons = segons / 1000;
    }

    public double getMS() {
	return this.segons * 1000;
    }

    public void setHMSM(double hores, double minuts, double segons, double ms) {
	this.segons = hores * 3600 + minuts * 60 + segons + ms / 1000;
    }
}