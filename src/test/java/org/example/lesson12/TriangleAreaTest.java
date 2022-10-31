package org.example.lesson12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test area triangle area calculation")
public class TriangleAreaTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleArea.class);

    @DisplayName("Test pass validation")
    @ParameterizedTest
    @CsvSource({"1.1, 2, 3", "1.1, 3, 3", "1.1, 4, 3"})
    public void testValid(double side1, double side2, double side3) {
        TriangleArea area = new TriangleArea(side1, side2, side3);
        assertDoesNotThrow(() -> area.calculateArea(side1, side2, side3));
        logger.info(() -> String.valueOf(area.calculateArea(side1, side2, side3)));
    }

    @DisplayName("Test validation failed")
    @ParameterizedTest
    @CsvSource({"5.1, 2, 3", "4.1, 2, 9", "3.1, 2, 11"})
    public void testInValid(double side1, double side2, double side3) throws IllegalArgumentException {
        TriangleArea area = new TriangleArea(side1, side2, side3);
        assertThrows(IllegalArgumentException.class, (() -> area.calculateArea(side1, side2, side3)));
        logger.info(() -> "true");
    }
}