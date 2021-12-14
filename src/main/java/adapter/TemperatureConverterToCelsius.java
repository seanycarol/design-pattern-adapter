package adapter;

public class TemperatureConverterToCelsius implements ITemperatureConverter{
    @Override
    public float convert(float degree) {
        return (float) ((degree - 32) / 1.8);
    }
}
