package lab5.task3;

public class Operation implements Minus, Plus, Mult, Div{

    private float numberToProcess = 0;
    public Operation(Float number) {
        numberToProcess = number;
    }

    public float getNumber() {
        return numberToProcess;
    }


    public void div(float numar) {
        if(numar == 0) {
            System.out.println("Cannot make division by 0");
        }
        else {
            this.numberToProcess = this.numberToProcess /  numar;
        }
    }


    public void minus(float numar) {
        this.numberToProcess -= numar;
    }


    public void mult(float numar) {
        this.numberToProcess *= numar;
    }


    public void plus(float numar) {
        this.numberToProcess += numar;
    }

}
