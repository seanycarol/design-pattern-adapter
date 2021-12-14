package adapter;

public class TemperatureConverterAdapter {

    private ITemperatureConverter temperatureConverter;

    public TemperatureConverterAdapter(ITemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    public float convert(float degree) {
        return this.temperatureConverter.convert(degree);
    }
}
