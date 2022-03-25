https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/Sliding-Window-algorithm-template-to-solve-all-the-Leetcode-substring-search-problem.
​
pattern ka freq find karlo , s ka p.length ka frreq find karlo, phir dono ko compare karlo, phir ek aquire ek relaese karke har baaar freq compare karlo, same hai to add kardo index
​
Hashmap se **ans** nahi aa raha , to freq aray bana ke karne se aa raha
​
​
sf[s.charAt(i-n)-'a']--; //released 0th
sf[s.charAt(i)-'a']++; //aquired next