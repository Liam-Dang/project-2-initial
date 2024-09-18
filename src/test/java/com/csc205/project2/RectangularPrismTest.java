//generate test class for each method in RectangularPrism.java

package com.csc205.project2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangularPrismTest {

    @Test
    public void testDefaultConstructor() {
        RectangularPrism rp = new RectangularPrism();
        assertEquals(0.0, rp.getLength());
        assertEquals(0.0, rp.getWidth());
        assertEquals(0.0, rp.getHeight());
    }

    @Test
    public void testParameterizedConstructor() {
        RectangularPrism rp = new RectangularPrism(2.0, 3.0, 4.0);
        assertEquals(2.0, rp.getLength());
        assertEquals(3.0, rp.getWidth());
        assertEquals(4.0, rp.getHeight());
    }

    @Test
    public void testGettersAndSetters() {
        RectangularPrism rp = new RectangularPrism();
        rp.setLength(5.0);
        rp.setWidth(6.0);
        rp.setHeight(7.0);
        assertEquals(5.0, rp.getLength());
        assertEquals(6.0, rp.getWidth());
        assertEquals(7.0, rp.getHeight());
    }

    @Test
    public void testSurfaceArea() {
        RectangularPrism rp = new RectangularPrism(2.0, 3.0, 4.0);
        assertEquals(52.0, rp.surfaceArea());
    }

    @Test
    public void testVolume() {
        RectangularPrism rp = new RectangularPrism(2.0, 3.0, 4.0);
        assertEquals(24.0, rp.volume());
    }

    @Test
    public void testToString() {
        RectangularPrism rp = new RectangularPrism(2.0, 3.0, 4.0);
        String expected = "Rectangular Prism {length=2.0, width=3.0, height=4.0, surface area=52.0, volume=24.0}";
        assertEquals(expected, rp.toString());
    }

}