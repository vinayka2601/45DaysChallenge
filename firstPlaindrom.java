public class firstPlaindrom {
    public String firstPalindrome(String[] words) {
        
        int n = words.length;
    for (int i = 0; i < n; i++) {
        String originalWord = words[i];
        String reversedWord = "";

        for (int j = originalWord.length() - 1; j >= 0; j--) {
            reversedWord += originalWord.charAt(j);
        }

        if (originalWord.equals(reversedWord)) {
            return originalWord;
        }
    }
    return "";
}
}
