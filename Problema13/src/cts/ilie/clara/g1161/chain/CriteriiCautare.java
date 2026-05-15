package cts.ilie.clara.g1161.chain;

public class CriteriiCautare implements ICautare{
    private boolean filtruPret;
    private  boolean filtruRating;
    private boolean filtruAn;
    private double pretMinim;
    private double pretMaxim;
    private double ratingMinim;
    private double anMinim;

    public void setFiltruAn(double anMinim) {
        this.filtruAn = true;
        this.anMinim=anMinim;
    }

    public void setFiltruRating(double ratingMinim) {
        this.filtruRating = true;
        this.ratingMinim=ratingMinim;
    }

    public void setFiltruPret(double pretMinim, double pretMaxim) {
        this.filtruPret=true;
       this.pretMinim=pretMinim;
       this.pretMaxim=pretMaxim;
    }

    @Override
    public boolean isFiltruPret() {
        return filtruPret;
    }

    @Override
    public boolean isFiltruRating() {
        return filtruRating;
    }

    @Override
    public boolean isFiltruAn() {
        return filtruAn;
    }

    @Override
    public double getPretMinim() {
        return pretMinim;
    }

    @Override
    public double getPretMaxim() {
        return pretMaxim;
    }

    @Override
    public double getRatingMinim() {
        return ratingMinim;
    }

    @Override
    public double getAnMinim() {
        return anMinim;
    }
}
