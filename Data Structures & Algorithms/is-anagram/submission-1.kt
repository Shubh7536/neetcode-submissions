class Solution {
    fun isAnagram(s: String, t: String): Boolean {

            val map = HashMap<Char,Int>()
          if(s.length != t.length){
            return false
          }

          var total1 = 0
          var total2 = 0

          for(a in s){
            if(map.containsKey(a)){
                map[a] = (map[a]?:0) + 1 
            }else {
                map[a] = 1
            }
            
          }

          for(b in t){
            if(map.containsKey(b)){
                map[b] = (map[b]?:0)-1
                if(map[b] == 0){
                    map.remove(b)
                }
            }else {
                map[b] = 1
            }
          }

          return map.isEmpty()


    }
}
