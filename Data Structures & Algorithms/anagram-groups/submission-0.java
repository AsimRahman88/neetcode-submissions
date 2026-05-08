class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> output = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;
            int iCount = 0, jCount = 0, k = 0, l = 0, m = 0, n = 0;
            int o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0;
            int v = 0, w = 0, x = 0, y = 0, z = 0;

            for (int j = 0; j < strs[i].length(); j++) {
                char ch = strs[i].charAt(j);

                switch (ch) {
                    case 'a': a++; break;
                    case 'b': b++; break;
                    case 'c': c++; break;
                    case 'd': d++; break;
                    case 'e': e++; break;
                    case 'f': f++; break;
                    case 'g': g++; break;
                    case 'h': h++; break;
                    case 'i': iCount++; break;
                    case 'j': jCount++; break;
                    case 'k': k++; break;
                    case 'l': l++; break;
                    case 'm': m++; break;
                    case 'n': n++; break;
                    case 'o': o++; break;
                    case 'p': p++; break;
                    case 'q': q++; break;
                    case 'r': r++; break;
                    case 's': s++; break;
                    case 't': t++; break;
                    case 'u': u++; break;
                    case 'v': v++; break;
                    case 'w': w++; break;
                    case 'x': x++; break;
                    case 'y': y++; break;
                    case 'z': z++; break;
                }
            }

            String alphabetCount =
                a + "#" + b + "#" + c + "#" + d + "#" + e + "#" + f + "#" +
                g + "#" + h + "#" + iCount + "#" + jCount + "#" + k + "#" +
                l + "#" + m + "#" + n + "#" + o + "#" + p + "#" + q + "#" +
                r + "#" + s + "#" + t + "#" + u + "#" + v + "#" + w + "#" +
                x + "#" + y + "#" + z;

            if (!map.containsKey(alphabetCount)) {
                map.put(alphabetCount, new ArrayList<>());
            }

            map.get(alphabetCount).add(strs[i]);
        }

        output.addAll(map.values());

        return output;
    }
}
