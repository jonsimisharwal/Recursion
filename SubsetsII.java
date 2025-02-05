import java.util.*;
class SubsetsII{
    
    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        Subsets(0,nums,ds,res);
        return res;
    }
    public static void  Subsets(int idx,int nums[],List<Integer> ds,List<List<Integer>> res){
        res.add(new ArrayList<>(ds));
        for (int i = idx; i < nums.length; i++) {
            if (i != idx && nums[i] == nums[i - 1]) continue;
            ds.add(nums[i]);
            Subsets(i + 1, nums, ds, res);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String args[]){
      int nums[]={2,4,5,6,7,8};
      List<List<Integer>> ans=subsetsWithDup(nums);
      for(List<Integer> it:ans){
        System.out.print(it);
      }
      System.out.println();
    }
}