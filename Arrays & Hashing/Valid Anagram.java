class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer>duplicate=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
        duplicate.put(s.charAt(i),duplicate.getOrDefault(s.charAt(i), 0)+1);
       }
         for(int i=0;i<t.length();i++)
       {
        duplicate.put(t.charAt(i),duplicate.getOrDefault(t.charAt(i), 0)-1);
       }
       for(int val:duplicate.values())
       {
        if(val!=0)
        return false;
       }
       return true;
    }
}