import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class program{
    static int[] topKFrequrnt(int[] nums,int k){
        List<Integer>[] list=new List[nums.length+1];

        Map<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int key:map.keySet()){
            int freq=map.get(key);
            if(list[freq]==null){
                list[freq]=new ArrayList<>();
            }
            list[freq].add(key);
        }

        int[] res=new int[k];
        int count=0;
        for(int i=list.length-1;i>=0 && count<k ;i--){
            if(list[i]!=null){
                for(int j: list[i]){
                    System.out.println(j);
                }
            }
        }
        return res;

        

    }
    public static void main(String[] args) {
        int[] nums={1,1,1,1,2,2,3,3,4};
        int k=2;

        topKFrequrnt(nums, k);
    }
}