class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        HashSet<Character>hs= new HashSet<>();
        for(char c:letters)hs.add(c);
        for(char c=target;c<='z';c++){
            if(hs.contains(c) && c!=target){
                return c;
            }
        }
        return letters[0];
    }
}