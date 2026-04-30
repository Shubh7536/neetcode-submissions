class Solution {
    fun maxArea(heights: IntArray): Int {
        
        var l = 0
        var r = heights.size-1

        var maxArea = 0
        
        while (l < r) {

            val currentMax = minOf(heights[l], heights[r]) * (r-l)

            if(currentMax > maxArea)
                maxArea = currentMax

            if(heights[l] < heights[r])
                l++
            else 
                r--        

        }

        return maxArea


    }
}
