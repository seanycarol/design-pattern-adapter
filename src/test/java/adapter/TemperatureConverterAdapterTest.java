package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterAdapterTest {

    @Test
    public void testTemperatureConverterToCelsius() {
        TemperatureConverterAdapter adapter = new TemperatureConverterAdapter(new TemperatureConverterToCelsius());
        assertEquals(-17.777779f, adapter.convert(0.0f));
    }

    @Test
    public void testTemperatureConverterToFahrenheit() {
        TemperatureConverterAdapter adapter = new TemperatureConverterAdapter(new TemperatureConverterToFahrenheit());
        assertEquals(32.0f, adapter.convert(0.0f));
    }
}