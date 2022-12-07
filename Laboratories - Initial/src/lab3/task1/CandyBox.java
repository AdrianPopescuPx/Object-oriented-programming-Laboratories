package lab3.task1;

public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox(){}
    public CandyBox(String in1, String in2) {
        this.flavor = in1;
        this.origin = in2;
    }

     public float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
