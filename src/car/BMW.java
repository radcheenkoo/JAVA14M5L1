package car;

public class BMW extends Car{
    private boolean isM;

    public boolean isM() {
        return isM;
    }

    public void setM(boolean m) {
        isM = m;
    }

    public void doSmth() {
        //privateModel = "";
        pcgDefaultModel = "";
        protectedModel = "";
        publicModel = "";

        //privateCarMethod();
        pcgDefaulCarMethod();
        protectedCarMethod();
        publicCarMethod();
    }
}
