package CodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindTheUnion {
    public ArrayList<Integer> findUnion(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i :set){
            arr3.add(i);
        }
        return arr3;
    }
    public void findIntersection(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int num:arr1){
            set.add(num);
        }
        int count = 0;
        ArrayList<Integer> intrArray = new ArrayList<>();
        for (int num : arr2){
            if (set.contains(num)){
                intrArray.add(num);
                set.remove(num);
                count++;
            }
        }
        int[] res = new int[count];
        for (int i = 0;i<count;i++){
            res[i] = intrArray.get(i);
        }
        System.out.println(intrArray);
    }
}
//optimal solution for intersection
/**int n1 = arr1.length;
    int n2 = arr2.length;
    int i = 0;
    int j = 0;
    ArrayList<Integer> intrArray  = new ArrayList<>();
        while (i<n1 && j<n2){
        if (arr1[i]<arr2[j]){
        i++;
        }
        else if (arr2[j]<arr1[i]){
        j++;
        }
        else {
        intrArray.add(arr1[i]);
        i++;
        j++;
        }
        }
 **/




//optimal solution for union
/**
 * ArrayList<Integer> intrArray = new ArrayList<>();
 *         int i = 0;
 *         int j = 0;
 *         int indx = 0;
 *         while (i<arr1.length && j<arr2.length){
 *             if (arr1[i]<arr2[j]){
 *                 if (intrArray.size() == 0 || intrArray.get(indx - 1) != arr1[i]){
 *                     intrArray.add(arr1[i]);
 *                     indx++;
 *                 }
 *                 i++;
 *             }
 *             else {
 *                 if (intrArray.size() == 0 || intrArray.get(indx - 1) != arr2[j]){
 *                     intrArray.add(arr2[j]);
 *                     indx++;
 *                 }
 *                 j++;
 *             }
 *         }
 *         while (i<arr1.length){
 *             if (intrArray.size() == 0 || intrArray.get(indx - 1) != arr1[i]){
 *                 intrArray.add(arr1[i]);
 *             }
 *             i++;
 *         }
 *         while (j<arr2.length){
 *             if (intrArray.size() == 0 || intrArray.get(indx - 1) != arr2[j]){
 *                 intrArray.add(arr2[j]);
 *             }
 *             j++;
 *         }
 *         System.out.println("Intersection: "+intrArray);
 */