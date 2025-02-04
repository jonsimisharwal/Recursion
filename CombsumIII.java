import java.util.*;
class CombsumIII{
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combsum3(1, n, ds, res, k);
        return res;
    }

    public static void combsum3(int idx, int n, List<Integer> ds, List<List<Integer>> res, int k) {
        if (n == 0 && ds.size() == k) {  
            res.add(new ArrayList<>(ds));
            return;
        }

        if (idx > 9 || ds.size() >= k || n < 0) { 
            return;
        }

        
        ds.add(idx);
        combsum3(idx + 1, n - idx, ds, res, k);
        ds.remove(ds.size() - 1); 

        combsum3(idx + 1, n, ds, res, k);
    }
    public static void main(String args[]){
       int  k = 3;
       int  n = 9;
       List<List<Integer>> res=combinationSum3(n,k);
       for(List<Integer> ans:res){
        System.out.print(ans);
       }
       System.out.println();
    }
}