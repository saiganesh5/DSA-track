// Creating class to implement different data types inside a single list
class Data {
    String value;
    int timestamp;
    public Data(String value,int timestamp){
        this.value=value; this.timestamp=timestamp;
    }
}
class TimeMap {
   Map<String,List<Data>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<Data>()).add(new Data(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        String res="";
       List<Data> list = map.getOrDefault(key,null);
       if(list==null){
        return "";
       }
       int l=0,r=list.size()-1;
       
       while(l<=r){
        int mid=l+(r-l)/2;
        if(list.get(mid).timestamp<=timestamp){
            res=list.get(mid).value;
            l=mid+1;
        }
        else{
            r=mid-1;
        }
       }
       return res;

    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
