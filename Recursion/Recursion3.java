import java.util.*;

public class Recursion3 {

    // Q: Print all permutations of a string  (permutation = all possible combiantion of a letter)
    // public static void printPerm(String str, String permutation) {
    //     if(str.length() == 0) {
    //         System.out.println(permutation);
    //         return;
    //     }

    //     for(int i=0; i<str.length(); i++) {
    //         char currChar = str.charAt(i);
    //         // abc => ab
    //         String newString = str.substring(0,i) + str.substring(i+1);
    //         printPerm(newString, permutation+currChar);
    //     }
    // }

    // Q: Count total paths in a maze to move from (0,0) to (n,m)
    // public static int countPaths(int i, int j, int m, int n) {
    //     if(i == n || j == m) {
    //         return 0;
    //     }
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }
    //     // move downwards
    //     int downPaths = countPaths(i+1, j, n, m);

    //     // move right
    //     int rightPaths = countPaths(i, j+1, n, m);

    //     return downPaths + rightPaths;
    // }

    // Q: Place tiles of size 1xm in a floor of size nxm.
    // public static int placeTiles(int n, int m) {
    //     if(n == m) {
    //         return 2;
    //     }
    //     if(n < m) {
    //         return 1;
    //     }
    //     // vertically
    //     int verPlacements = placeTiles(n-m, m);

    //     // horizontally
    //     int horPlacements = placeTiles(n-1, m);

    //     return verPlacements + horPlacements;
    // }

    // Q: Find the number of ways in which you can invite n people to your party, single or in pair.
    // public static int callGuests(int n) {
    //     if(n <= 1) {
    //         return 1;
    //     }
    //     // single
    //     int ways1 = callGuests(n-1);

    //     // pair
    //     int ways2 = (n-1) * callGuests(n-2);

    //     return ways1 + ways2;
    // }

    // Q: Print all the subsets of a set of first n natural numbers.
    public static void printSubset(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+ " ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset) {
        if(n == 0) {
            printSubset(subset);
            return;
        }
         // add hoga
         subset.add(n);
         findSubset(n-1, subset);

         // add nahi hoga
         subset.remove(subset.size()-1);
         findSubset(n-1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);

    }
}