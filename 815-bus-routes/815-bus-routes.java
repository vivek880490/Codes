class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        
        int n=routes.length;
        
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<routes[i].length;j++){
                
                int busstopno=routes[i][j];
                
                ArrayList<Integer>busno=map.getOrDefault(busstopno,new ArrayList<>());
                busno.add(i);
                map.put(busstopno,busno);
                
            }
        }
        
        Queue<Integer>q=new LinkedList<>();
        HashSet<Integer>busstopvis=new HashSet<>();
        HashSet<Integer>busvis=new HashSet<>();
        
        int level=0;
        q.add(source);
        busstopvis.add(source);
        
        while(q.size()>0){
            int size=q.size();
            while(size-->0){
                int node=q.poll();
                
                if(node==target){
                    return level;
                }
                
                ArrayList<Integer>buses=map.get(node);
                
                for(int bus:buses){
                    
                    if(busvis.contains(bus)) continue;
                    
                    int arr[]=routes[bus];
                    
                    for(int stop:arr){
                        
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