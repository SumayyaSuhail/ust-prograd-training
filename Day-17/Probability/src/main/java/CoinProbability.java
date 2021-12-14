public class CoinProbability {
    String[] doubleToss = {"HH", "HT", "TH", "TT"};
    String[] singleToss = {"H", "T"};

    public double singleToss(String coinFace) {
        int count = 0;
        if (coinFace == "H" || coinFace == "T") {
            for (int i = 0; i < singleToss.length; i++) {
                if (singleToss[i] == coinFace) {
                    count++;
                }
            }
            return count / singleToss.length;
        } else
            throw new IllegalArgumentException("Not a valid Output");
    }

    public double doubleToss(String coinFace) {
        int count = 0;
        if (coinFace == "HH" || coinFace == "TT" || coinFace == "HT" || coinFace == "TH" || coinFace == "H" || coinFace == "T") {

            for (int i = 0; i < doubleToss.length; i++) {
                if (doubleToss[i].contains(coinFace)) {
                    count++;
                }
            }
            return count / doubleToss.length;
        } else
            throw new IllegalArgumentException("Not a valid Toss Output");

    }
}
