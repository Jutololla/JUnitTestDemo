package calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
    private Object ArithmeticException;

    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 + number2;
    }

    public Long sus(Long number1, Long number2) {
        logger.info("Sustracting {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long mult(Long number1, Long number2) {
        logger.info("Multiplicating {} * {}", number1, number2);
        return number1 * number2;
    }

    public Long divi(Long number1, Long number2) throws Exception {
        try {
            Long a = number1 / number2;
            logger.info("Dividing {} / {}", number1, number2);
            return a;
        } catch (Exception e) {
            throw new Exception((String) ArithmeticException);
        }
    }


}
