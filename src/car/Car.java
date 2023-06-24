package car;

public class Car {
    private String privateModel;

    protected String protectedModel;

    String pcgDefaultModel;

    public String publicModel;

    private void privateCarMethod() {

    }
    public void publicCarMethod() {

    }
    protected void protectedCarMethod() {

    }
    void pcgDefaulCarMethod() {

    }

    public String getPrivateModel() {
        return privateModel;
    }

    public void setPrivateModel(String privateModel) {
        privateCarMethod();
        this.privateModel = privateModel;
    }
}
