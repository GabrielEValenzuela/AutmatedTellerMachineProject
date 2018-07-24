package AtmMVC.model;

public class ATM {

    private int id;
    private float selfBalance;
    private boolean enable;
    private int MAXTRANSFER = 10000;

    public int getMAXTRANSFER() {
        return MAXTRANSFER;
    }

    public void setMAXTRANSFER(int MAXTRANSFER) {
        this.MAXTRANSFER = MAXTRANSFER;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSelfBalance() {
        return selfBalance;
    }

    public void setSelfBalance(float selfBalance) {
        this.selfBalance = selfBalance;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

}