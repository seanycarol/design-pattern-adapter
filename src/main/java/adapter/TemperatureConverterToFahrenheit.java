package adapter;

public class TemperatureConverterToFahrenheit implements ITemperatureConverter {
    @Override
    public float convert(float degree) {
        return (float) (degree * 1.8 + 32);
    }
}
