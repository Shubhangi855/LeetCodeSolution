class Solution {
    public String removeDuplicates(String s) {
   StringBuilder sb = new StringBuilder();
        if (s == null || s.isEmpty()) {
            return sb.toString();
        }
        for (char ch : s.toCharArray()) {
            if (sb.isEmpty() || sb.charAt(sb.length() - 1) != ch) {
                sb.append(ch);
            }
            else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}