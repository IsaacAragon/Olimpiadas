class Main {
    public static void main(String[] args) {
         String texto = "joshua";
         System.out.println(countVowels(texto));
    }
     public static int countVowels(String text) {
        int sum = 0;
        for(int i = 0; i < text.length(); i++) {
        char c = Character.toLowerCase(text.charAt(i));
        
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            sum = sum + 1;
        }
            
        }
        return sum;
    }
}