package oefeningen.oefening2;

public class Zwembad {

    private double lengte;
    private double breedte;
    private double diepte;

    public double getVolume() {
        return lengte * breedte * diepte * 1000;
    }

    public double getVolumeWater() {
        return getVolume() * 0.98;
    }

    public double getVolumeOntsmettingsmiddel() {
        return getVolume() * 0.02;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }
}
