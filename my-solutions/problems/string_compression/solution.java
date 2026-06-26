class Solution {
    public int compress(char[] chars) {
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            int count = 1;

            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            chars[idx++] = chars[i];

            if (count > 1) {
                String str = String.valueOf(count);

                for (int j = 0; j < str.length(); j++) {
                    chars[idx++] = str.charAt(j);
                }
            }
        }

        return idx;
    }
}



