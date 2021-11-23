public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
        int i=0;
        while(i<coords.length){
            StringBuilder sb = new StringBuilder(letters);
            letters = (sb.deleteCharAt(coords[i])).toString();
            i++;
        }
        return letters;
    }
}
