class RandomizedSet {
    
    HashMap<Integer,Integer>map ;
    List<Integer> al;
    Random r;
    public RandomizedSet() {
        map = new HashMap<>();
        al = new ArrayList<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        if(map.containsKey(val) == false){
            map.put(val,al.size());
            al.add(val);
        }
        return true;
    }
    
    public boolean remove(int val) {
        
        if(map.containsKey(val) == false){
            return false;
            }
        
        int remidx = map.get(val);
        map.remove(val);
        if(remidx == al.size()-1){
            al.remove(al.size()-1);
            return true;
        }

            // swap this with last elemet
            al.set(remidx, al.get(al.size()-1));
            al.remove(al.size()-1);
            
            map.put(al.get(remidx), remidx);
        
        return true;
        
    }
    
    public int getRandom() {
        int random = r.nextInt(al.size());
        return al.get(random);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */