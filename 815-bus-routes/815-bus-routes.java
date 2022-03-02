class Solution {
    public int numBusesToDestination(int[][] routes, int s, int t) {
        
    //create hasmap ki wo bus kis kis bus stop je jata hai
        int n = routes.length;
        HashMap<Integer,ArrayList>map=new HashMap<>();
        
        for(int i=0;i<routes.length;i++){
            for(int j=0;j<routes[i].length;j++){
                
                int busstopno = routes[i][j];
                
                ArrayList<Integer>busno = map.getOrDefault(busstopno,new ArrayList<>());
                
                busno.add(i);
                
                map.put(busstopno , busno);
                
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> busstopvis = new HashSet<>();
        HashSet<Integer> busvis = new HashSet<>();
        
        q.add(s);
        busstopvis.add(s);
        int level=0;
        
        while(q.size()>0){
            int size = q.size();
            
            while(size-->0){
                
                int rem = q.poll();
                // we got our destination
                if(rem == t) return level;
                
                ArrayList<Integer>buses = map.get(rem);
                
                
                for(int bus : buses){
                    
                    if(busvis.contains(bus)) continue;
                    
                    int arr[] = routes[bus];
                    
                    for(int stop : arr){
                        
                        if(busstopvis.contains(stop)) continue;
                        
                        q.add(stop);
                        busstopvis.add(stop);
                    }
                    busvis.add(bus);
                }
            }
            
            level++;
            
            }
        
        return -1;
    }
}