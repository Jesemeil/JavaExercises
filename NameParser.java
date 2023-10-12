package ArrayOperations;

public class NameParser {
    public static String parseName(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] parts = input.split("\\s+");
        StringBuilder initials = new StringBuilder();

        for (int i = 0; i < parts.length - 1; i++) {
            String part = parts[i];
            if (!part.isEmpty()) {
                char initial = part.charAt(0);
                if (Character.isLetter(initial)) {
                    initials.append(initial).append(". ");
                }
            }
        }

        if (!initials.isEmpty()) {
            initials.setLength(initials.length() - 1);
        }

        String lastName = parts[parts.length - 1];

        return initials + " " + lastName;
    }
}

