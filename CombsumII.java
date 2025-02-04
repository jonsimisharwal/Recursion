import java.util.*;
class CombsumII{
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        combsum2(0, target, ds, res, candidates);
        return res;
    }
    public static void combsum2(int idx, int target, List<Integer> ds, List<List<Integer>> res, int[] candidates) {
        if (target == 0) {
            res.add(new ArrayList<>(ds)); // Add a copy of ds
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) continue; // Skip duplicates

            if (candidates[i] > target) break; // Optimization: Stop if number is greater than target

            ds.add(candidates[i]);
            combsum2(i + 1, target - candidates[i], ds, res, candidates);
            ds.remove(ds.size() - 1); // Backtrack
        }
    }
    public static void main(String args[]){
        int candidates[] = {10,1,2,7,6,1,5};
        int  target = 8;
       List<List<Integer>> res=combinationSum2(candidates,  target);
       for(List<Integer> ans:res){
        System.out.print(ans);
       }
       System.out.println();
    }

}