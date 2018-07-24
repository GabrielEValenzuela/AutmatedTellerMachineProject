package AtmMVC.model;

public class GaliciaBank implements Commisions {

    private float commision = (float) 0.25;
    private String commisionS = "25";

    @Override
    public float getCommision() {
        return commision;
    }

    public void setCommisionS(String commisionS) {
        this.commisionS = commisionS;
    }

    public void setCommision(float commision) {
        this.commision = commision;
    }

    @Override
    public String getCommisionS() {
        return commisionS;
    }

}