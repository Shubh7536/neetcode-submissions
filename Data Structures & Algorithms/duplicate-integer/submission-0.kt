class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashmap = HashMap<Int,Int>()

        for(i in nums){
            if(hashmap.containsKey(i)){
                hashmap[i] = (hashmap[i]?:0) + 1
            }else {
                hashmap[i] = 1
            }
        }


        for(i in nums){
            if((hashmap[i]?:0) > 1){
                return true
            }
        }

        return false
    }
}
