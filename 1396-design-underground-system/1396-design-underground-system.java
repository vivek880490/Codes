class UndergroundSystem {
class pair{
    String station;
    int time;
    pair(String station, int time){
        this.station = station;
        this.time = time;
    }
}
    
     HashMap<Integer, pair> map;
     HashMap<String,Double> dif;
     HashMap<String, Integer> count;
    
    
    public UndergroundSystem() {
       map = new HashMap<>();
       dif = new HashMap<>(); 
    count = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map.put(id,new pair(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        pair entry = map.get(id);
        double diff = t - entry.time;
        
        String str = entry.station +"_"+stationName;
        
        dif.put(str, dif.getOrDefault(str,0.0)+diff);
        count.put(str, count.getOrDefault(str,0)+1);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        
        String key = startStation+"_"+endStation;
        
        if(dif.containsKey(key)){
            return (dif.get(key)/count.get(key));
        }
        return 0.0;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */