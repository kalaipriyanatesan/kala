public class Isomorphic {

    public boolean isIsomorphic(String word1, String word2){
        long bitMap1 = 0;
        long bitMap2 = 0;
        long mask1 = 0;
        long mask2 = 0;
        for (int i=0;i<word1.length();i++){
            long res1,res2;
           mask1 = 1 << (int)(word1.charAt(i));
            mask2 = 1 << (int)(word2.charAt(i));
             res1 = bitMap1 ^ mask1 ;
            res2 = bitMap2 ^ mask2 ;
            if((res1>;0 && res2>;0) || (res1==0&& res2==0)){
                bitMap1|= mask1;
                bitMap2|= mask2;
                continue;
            }
            return false;
        }
        return true;
    }
}
