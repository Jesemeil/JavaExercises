package ArrayOperations;

public class FirstOrderIsogram {
    public boolean isFirstOrderIsogram(String text) {
        if (text == null) {
            return false;
        }


        boolean[] letterPresent = new boolean[26];


        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                if (letterPresent[index]) {
                    return false;
                }
                letterPresent[index] = true;
            }
        }


        for (boolean isPresent : letterPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
