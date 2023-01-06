package lab13.task2;

import java.util.Collection;

public interface Calculator {
    class NullParameterException extends RuntimeException {
        public NullParameterException(Double nr1, Double nr2) {

        }
    }

    class UnderflowException extends RuntimeException {
        public UnderflowException(Double nr1, Double nr2) {

        }
    }

    class OverflowException extends RuntimeException {
        public OverflowException(Double nr1, Double nr2) {
        }
    }

    Double add(Double nr1, Double nr2);

    Double divide(Double nr1, Double nr2);

    Double average(Collection<Double> numbers);
}
