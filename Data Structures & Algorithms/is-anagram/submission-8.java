class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        StringBuilder s2 = new StringBuilder(s);
        StringBuilder t2 = new StringBuilder(t);
        for (int i=0; i<s2.length(); i++) {
            for (int j=0; j<t2.length(); j++){
                if(s2.charAt(i) == t2.charAt(j) ) {
                    s2.deleteCharAt(i);
                    t2.deleteCharAt(j);
                    i--;
                    break;
                }

            }
        }
        if (s2.length() == 0 && t2.length() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
