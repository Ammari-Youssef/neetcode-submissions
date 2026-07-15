class Solution {
    public boolean isPalindrome(String s) {
    String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    StringBuilder sb = new StringBuilder(cleaned);
    StringBuilder reverse = new StringBuilder(cleaned).reverse();

    System.out.println(sb.toString());

    return sb.toString().equals(reverse.toString());
}

}
