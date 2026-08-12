import java.util.HashSet;

public class Recursion2 {
    // Q: Tower of Hanoi
    // 1: Only one disk transferred in step 1
    // 2: Smaller disk are always kept on top of larger disks
    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //     if(n == 1) {
    //         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }
    // public static void main(String[] args) {
    //     int n = 3;
    //     towerOfHanoi(n, "S", "H", "D");
    // }

    // time complexity = O(n) n = string.length();
    // Q: Reverse the string of "abcd";
    // public static void revStr(String str, int index) {
    //     if(index == 0) {
    //         System.out.print(str.charAt(index));
    //         return;
    //     }
    //     System.out.print(str.charAt(index));
    //     revStr(str, index-1);
    // }

    // public static void main(String[] args) {
    //     String str = "abcd";

    //     revStr(str, str.length()-1);

    // }

    // Q: Find the 1st and last occurance of an element in string "abaacdefaah";
    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurance(String str, int index, char element) {
    //     if(index == str.length()) {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(index);
    //     if(currChar == element) {
    //         if(first == -1) {
    //             first = index;
    //         }else {
    //             last = index;
    //         }
    //     }

    //     findOccurance(str, index+1, element);
    // }

    // public static void main(String[] args) {
    //     String str = "abaacdaefaah";
    //     findOccurance(str, 0, 'a');
    // }

    // Q: Check if an array is sorted (Strictly increasing order)
    // time complexity = arr.length = O(n)
    // public static boolean isSorted(int arr[], int index) {
    //     if(index == arr.length-1) {
    //         return true;
    //     }
        
    //     if(arr[index] >= arr[index+1]) {
    //         // array is unsorted
    //         return false;
    //     }
    //         return isSorted(arr, index+1); 
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,3,5};
    //     boolean ans = isSorted(arr,  0);
    //     System.out.println(ans);
    // }

    // Q: Move all string 'x' to the end of the string
    // public static void moveAllX(String str, int index, int count, String newString) {
    //     if(index == str.length()){
    //         for(int i=0; i<count; i++) {
    //             newString += 'x';
    //         }
    //         System.out.print(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(index);
    //     // moveString(str, index, count);
    //     if(currChar == 'x') {
    //         count++;
    //         moveAllX(str, index+1, count, newString); // newString = newString + currChar;
    //     }else {
    //         newString += currChar;
    //         moveAllX(str, index+1, count, newString);
    //     }

    // }

        // Q: Remove duplicates from the string
        // public static boolean[] map = new boolean[26];

        // public static void removeDuplicates(String str, int idx, String newString) {
        //     if(idx == str.length()) {
        //         System.out.println(newString);
        //         return;
        //     }
        //     char currChar = str.charAt(idx);
        //     if(map[currChar - 'a']) {
        //         removeDuplicates(str, idx+1, newString);
        //     }else {
        //         newString += currChar;
        //         map[currChar - 'a'] = true;
        //         removeDuplicates(str, idx+1, newString);
        //     }
        // }

        // Q: Print all the subsequences of a string. [IMPORTANT]
        // public static void subsequences(String str, int idx, String newString) {
        //     if(idx == str.length()) {
        //         System.out.println(newString);
        //         return;
        //     }
        //     char currChar = str.charAt(idx);

        //     //to be
        //     subsequences(str, idx+1, newString+currChar);

        //     // or not to be
        //     subsequences(str, idx+1, newString);
        // }

        // public static void main(String[] args) {
        //     String str = "abc";

        //     subsequences(str, 0, "");
        // }

        // Q: Print all the unique subsequences of a string. [IMPORTANT]
        // public static void uniqueSubsequences(String str, int idx, String newString,
        // public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        //     if(idx == str.length()) {
        //         if(set.contains(newString)) {
        //             return;
        //         }else {
        //             System.out.println(newString);
        //             set.add(newString);
        //             return;
        //         }
        //     }

        //     char currChar = str.charAt(idx);

        //     // to be
        //     subsequences(str, idx+1, newString+currChar, set);

        //     // or not to be
        //     subsequences(str, idx+1, newString, set);
        // }
        // public static void main(String[] args) {
        //     String str = "aaa";
        //     HashSet<String> set = new HashSet<>();
        //     subsequences(str,0,"",set);
        // }

        // Q: Print keypad combinations
        public static String[] keypad = {".", "abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        public static void printComb(String str, int idx, String combination) {
            if(idx == str.length()) {
                System.out.println(combination);
                return;
            }
            char currChar = str.charAt(idx);
            String mapping = keypad[currChar - '0'];

            for(int i=0; i<mapping.length(); i++) {
                printComb(str, idx+1, combination+mapping.charAt(i));
            }
        }

        public static void main(String[] args) {
            String str = "4";
            printComb(str,0,"");
        }


}