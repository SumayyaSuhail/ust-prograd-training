import java.math.BigInteger;

class Spiral
{




    public static BigInteger sum(BigInteger size)
    {
        // ODD : ((N * N) / 2) + N
        // EVEN: ((N * N) / 2) + N - 1

        // Total grid size
        BigInteger result = size.multiply(size);

        // Divide by 2
        result = result.divide(BigInteger.TWO);

        // Add the original size
        result = result.add(size);

        // Add 1 if even
        if(result.mod(BigInteger.TWO) == BigInteger.ZERO)
            result = result.subtract(BigInteger.ONE);

        return result;
    }
}