class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

         val map = HashMap<String, MutableList<String>>()
         
         for (s in strs){

            val count = IntArray(26)
            
            for(i in s){
                count[i - 'a']++
            }

            val key = buildString {
                for (num in count){
                    append("#")
                    append(num)
                }
            }

            map.getOrPut(key){mutableListOf()}.add(s)

         }

         return map.values.toList()

    }
}
