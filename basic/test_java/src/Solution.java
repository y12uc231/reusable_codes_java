import java.util.*;
// Implemented Aho-Corasick search algorithm, does the job in O(n+m+z)
//class Trie {
//
//    // Alphabet size (# of symbols)
//    static final int ALPHABET_SIZE = 26;
//
//    // trie node
//    static class TrieNode
//    {
//        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
//
//        // isEndOfWord is true if the node represents
//        // end of a word
//        boolean isEndOfWord;
//
//        TrieNode(){
//            isEndOfWord = false;
//            for (int i = 0; i < ALPHABET_SIZE; i++)
//                children[i] = null;
//        }
//    };
//
//    static TrieNode root;
//
//    // If not present, inserts key into trie
//    // If the key is prefix of trie node,
//    // just marks leaf node
//    static void insert(String key)
//    {
//        int level;
//        int length = key.length();
//        int index;
//
//        TrieNode pCrawl = root;
//
//        for (level = 0; level < length; level++)
//        {
//            index = key.charAt(level) - 'a';
//            if (pCrawl.children[index] == null)
//                pCrawl.children[index] = new TrieNode();
//
//            pCrawl = pCrawl.children[index];
//        }
//
//        // mark last node as leaf
//        pCrawl.isEndOfWord = true;
//    }
//
//    // Returns true if key presents in trie, else false
//    static boolean search(String key)
//    {
//        int level;
//        int length = key.length();
//        int index;
//        TrieNode pCrawl = root;
//
//        for (level = 0; level < length; level++)
//        {
//            index = key.charAt(level) - 'a';
//
//            if (pCrawl.children[index] == null)
//                return false;
//
//            pCrawl = pCrawl.children[index];
//        }
//
//        return (pCrawl != null && pCrawl.isEndOfWord);
//    }
//}

class Solution {
    public static void main(String[] args) {
        //Trie.root = new Trie.TrieNode();
//        String str = "234";
//        System.out.println(Character.PYTHONPATH= test_model.py --level L3 --domain $1 -i /efs-storage/e2e/pck/ -o /efs-storage/e2e/results/ -n $1-au-data-l3 --test-template $BMD/unified/test_data_group/$1/L3/development/test-templates/doppler/integ/AUTO-UPCOMING-template_Integration_for-doppler.json(str.charAt(0) ));
//        List<Integer> arr = new ArrayList<>();
//        arr.add(123);
//        int[] toArray = arr.stream().mapToInt(i -> i).toArray();
       int mask  = 0x000f;
       int value = 0x2222;
        System.out.println(mask & value);

    // /* sdfsdf// // sdfdsf */
        int s = 23;

        /* sdfsdfsdf // sdfdf */
        /* sdfdsf /* sdfdf */

    }
}

