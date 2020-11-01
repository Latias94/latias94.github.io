class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        List<List<String>> list = new ArrayList<>();
        String[] letterStr = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < digits.length(); i++) {
            int num = Character.getNumericValue(digits.charAt(i));
            String representStr = letterStr[num - 1];
            List<String> stringList = new ArrayList<>();

            if (i > 0) {
                // i位置对应的 representStr
                for (int j = 0; j < representStr.length(); j++) {
                    // i-1位置对应的List<String>
                    List<String> lastStringList = list.get(i - 1);
                    // 要插入lastStringList的单个字符串
                    String str = String.valueOf(representStr.charAt(j));
                    for (String aLastStringList : lastStringList) {
                        // 新字符加在最后
                        stringList.add(aLastStringList + str);
                    }
                }
            } else {
                for (int j = 0; j < representStr.length(); j++) {
                    stringList.add(String.valueOf(representStr.charAt(j)));
                }
                if (digits.length() == 1) {
                    return stringList;
                }
            }
            list.add(stringList);
        }
        return list.get(list.size() - 1);
    }
}