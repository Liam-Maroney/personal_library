package Solutions.top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) ->
            a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] n = {3,0,1,0};
        System.out.println(topKFrequent(n, 1)[0]);
    }
}
