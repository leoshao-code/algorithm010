
//题目：有效的字母异位词
//使用哈希表

public boolean inAnagram(String s, Stringt){
    if(s.length() != t.length()){
        return false;
    }
    int[] counter = new int[26];
    for(int i = 0; i< s.length();i++){
        counter[s.charAt(i)-'a']++;
        counter[t.charAt(i)-'a']--;
    }

    for (int count:counter){
        if(count != 0){
          return false;
        }
    }

    return true;
}

