class Solution {
    fun moveZeroes(nums: IntArray) {
        var l = 0
        var r = 0

        while(r <= nums.size-1){
            if(nums[r] == 0){
                r++
            }else {
                var temp = nums[l]
                nums[l] = nums[r]
                nums[r] = temp
                l++
                r++
            }
        }
    }
}
