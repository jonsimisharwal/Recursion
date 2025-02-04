import java.util.*;
class CombsumI{
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combsum(0, target, ds, res, candidates);
        return res;
    }
    public static void combsum(int idx, int target, List<Integer> ds, List<List<Integer>> res, int candidates[]) {
        if (target == 0) {  
            res.add(new ArrayList<>(ds)); // Add a copy of ds to res
            return;
        }

        if (idx == candidates.length || target < 0) {  
            return;
        }

       
        ds.add(candidates[idx]);
        combsum(idx, target - candidates[idx], ds, res, candidates);  
        ds.remove(ds.size() - 1);  // Backtrack
    combsum(idx + 1, target, ds, res, candidates);
    }
  public static void main(String args[]){
   int candidates[] = {2,3,6,7};
    int  target = 7;
   List<List<Integer>> res=combinationSum(candidates,  target);
   for(List<Integer> ans:res){
    System.out.print(ans);
   }
   System.out.println();
  } 
}