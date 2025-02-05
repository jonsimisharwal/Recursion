import java.util.*;
class Subsets {
    public  static List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> list = new ArrayList<>();
     Arrays.sort(nums);
     backtrack(list, new ArrayList<>(), nums, 0);
     return list;
 }
 
 public static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
     list.add(new ArrayList<>(tempList));
     for(int i = start; i < nums.length; i++){
         tempList.add(nums[i]);
         backtrack(list, tempList, nums, i + 1);
         tempList.remove(tempList.size() - 1);
     }
 }
 public static void main(String args[]){
    int nums[]={7,8,4};
    List<List<Integer>> ans=subsets(nums);
    for(List<Integer> it :ans){
        System.out.print(it);

    }
    System.out.println();
 }
 }