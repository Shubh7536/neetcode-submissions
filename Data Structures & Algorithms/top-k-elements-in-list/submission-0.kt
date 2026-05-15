class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val freqMap = HashMap<Int,Int>()

        for(i in nums){
            freqMap[i] = freqMap.getOrDefault(i,0)+1
        }

        val minHeap = PriorityQueue<Pair<Int,Int>>( compareBy { it.second })

        for((num, freq) in freqMap){
            minHeap.add(Pair(num,freq))

            if(minHeap.size > k){
                minHeap.poll()
            }
        }

        val result = IntArray(k)

        for(i in 0..result.size-1){
            result[i] = minHeap.poll().first
        }

        return result

    }
}
