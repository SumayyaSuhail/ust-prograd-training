public class LengthConvertor {

    public double unitConvertor(double measurement, String fromUnit, String toUnit) {

        if (measurement <= 0) {
            throw new IllegalArgumentException("Measurement can't be less than or equal to zero");
        } else {
            if (toUnit == "centi") {
                return convertToCenti(measurement, fromUnit);
            } else if (toUnit == "kilo") {
                return convertToKilo(measurement, fromUnit);
            } else if (toUnit == "base") {
                return convertToBase(measurement, fromUnit);
            } else {
                throw new IllegalArgumentException("Not a valid unit");
            }
        }

    }

    public double convertToCenti(double measurement, String fromUnit) {
        if (fromUnit == "centi") {

            return measurement;

        } else if (fromUnit == "base") {
            return measurement * 100;
        } else if (fromUnit == "kilo") {
            return measurement * 100000;
        } else {
            throw new IllegalArgumentException("Not a valid unit");
        }

    }

    public double convertToBase(double measurement, String fromUnit) {

        if (fromUnit == "centi") {

            return measurement / 100;

        } else if (fromUnit == "base") {
            return measurement;
        } else if (fromUnit == "kilo") {
            return measurement * 1000;
        } else {
            throw new IllegalArgumentException("Not a valid unit");
        }

    }

    public double convertToKilo(double measurement, String fromUnit) {

        if (fromUnit == "centi") {

            return measurement / 100000;

        } else if (fromUnit == "base") {
            return measurement / 1000;
        } else if (fromUnit == "kilo") {
            return measurement;
        } else {
            throw new IllegalArgumentException("Not a valid unit");
        }
    }
}
