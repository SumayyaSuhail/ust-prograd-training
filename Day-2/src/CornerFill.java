import java.util.*;
import java.util.stream.*;

public class CornerFill {

    public static int[] cornerFill(int[][] square) {
        if (square == null) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < square.length; i++) {
            if (i % 2 == 0) {
                result.addAll(getSlice(square, i));
            } else {
                result.addAll(getBackSlice(square, i));
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static List<Integer> getSlice(int[][] square, int row) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        while (index < square.length - row) {
            result.add(square[row][index++]);
        }
        while(++row < square.length) {
            result.add(square[row][index - 1]);
        }
        return result;
    }

    public static List<Integer> getBackSlice(int[][] square, int col) {
        List<Integer> result = new ArrayList<>();
        int index = square.length;
        while(--index >= col) {
            result.add(square[index][square.length - col - 1]);
        }
        col = square.length - col - 1;
        while (--col >= 0) {
            result.add(square[index + 1][col]);
        }
        return result;
    }
}
