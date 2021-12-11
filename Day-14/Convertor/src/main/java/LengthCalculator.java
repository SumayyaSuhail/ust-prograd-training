public class LengthCalculator extends LengthConvertor {
    public double addUnits(double firstMeasure, String firstUnit, double secondMeasure, String secondUnit, String expectedUnit) {
        if (firstUnit.equals(expectedUnit)) {
            double convertedMeasure = unitConvertor(secondMeasure, secondUnit, firstUnit);
            return firstMeasure + convertedMeasure;
        } else {
            double convertedMeasure = unitConvertor(firstMeasure, firstUnit, secondUnit);
            return convertedMeasure + secondMeasure;
        }
    }

    public double subUnits(double firstMeasure, String firstUnit, double secondMeasure, String secondUnit, String expectedUnit) {
        if (firstUnit.equals(expectedUnit)) {
            double convertedMeasure = unitConvertor(secondMeasure, secondUnit, firstUnit);
            return firstMeasure - convertedMeasure;
        } else {
            double convertedMeasure = unitConvertor(firstMeasure, firstUnit, secondUnit);
            return convertedMeasure - secondMeasure;
        }
    }
}
