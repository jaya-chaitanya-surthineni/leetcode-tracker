// class Solution {
//     public boolean detectCapitalUse(String word) {
//         if(word.equals(word.toUpperCase()))return true;
//         if(word.equals(word.toLowerCase()))return true;
//         if((Character.isUpperCase(word.charAt(0)))&& word.substring(1).equals( word.substring(1).toLowerCase()))return true;
//         return false;
//     }
// }
class Solution {
    public boolean detectCapitalUse(String word) {
       int count=0;

       for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        int ascii=ch;

        if(ascii>=65 && ascii<=90){
            count++;
        }
       } 

       if(count==0 || count==word.length()){
        return true;
       }
       if(count==1 && word.charAt(0)>='A' && word.charAt(0)<='Z'){
        return true;
       }
       return false;
    }
}