class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            String word = strs.get(i);
            encoded.append(word.length()).append("#").append(word);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j + 1, j + 1 + length);
            output.add(word);

            i = j + 1 + length;
        }

        return output;
    }
}
