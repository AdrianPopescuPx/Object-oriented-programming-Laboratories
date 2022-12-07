package lab3.task1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin);
    }
}
