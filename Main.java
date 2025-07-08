// Daniel Pulido-Alaniz
// 7/8/2025

class Main{
    public static void main(String[] args){
        System.out.println(countHi("xhiiixhxixhi"));

    }

    // Problem one

    public static int count8(int n){
        // base case: there can't be more 8s
        if (n < 8){
            return 0; 
        }

        int rightmostNum = n % 10; 
        n /= 10; 

        if (rightmostNum == 8 && n % 10 == 8){
            return 2 + count8(n); // 8 on left means current one counts as 2
        } else if (rightmostNum == 8){
            return 1 + count8(n); // sinlge 8 counts as one
        } else {
            return count8(n); // current digit wasn't 8
        }
    }

    // Problem 2

    public static int countHi(String str){
        // base case: string smaller than 2 char
        if (str.length() < 2){
            return 0; 
        }

        if(str.substring(0, 2).equals("hi")){
            return 1 + countHi(str.substring(1)); // has 'hi'
        } else {
            return countHi(str.substring(1)); // doesn't have 'hi'
        }
    }


}