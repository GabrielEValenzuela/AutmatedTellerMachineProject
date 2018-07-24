package AtmMVC.model;

public class NacionBank implements Commisions {

    private float commision = (float) 0.30;
    private String commisionS = "30";

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