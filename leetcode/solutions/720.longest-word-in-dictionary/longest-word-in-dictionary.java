class Solution {
    public String longestWord(String[] words) {
        Tries tries = new Tries();
        for (String word : words) {
            tries.insert(word);
        }
        return tries.findLongestWord();
    }
    
    class Tries {
        private TrieNode root;

        public Tries() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
            node.isWord = true;
            node.word = word;
        }

        public String findLongestWord() {
            String result = null;
            Queue<TrieNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TrieNode node = queue.poll();
                    // 后往前遍历 同长度下字符索引越小越优先
                    for (int j = 25; j >= 0; j--) {
                        if (node.children[j] != null && node.children[j].isWord) {
                            result = node.children[j].word;
                            queue.add(node.children[j]);
                        }
                    }
                }
            }
            return result;
        }
    }

    class TrieNode {
        TrieNode[] children;
        boolean isWord;
        String word;

        public TrieNode() {
            children = new TrieNode[26];
        }
    }
}