class MedianFinder {

    PriorityQueue<Integer> max;
    
    PriorityQueue<Integer> min; 
    
    public MedianFinder() {
            max  = new PriorityQueue<>(Collections.reverseOrder());
        
            min = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        
        if(max.size() == 0 || max.peek() >= num){
            max.add(num);
        }
        else{
            min.add(num);
        }
        
        if(max.size() > min.size() + 1){
            min.add(max.poll());
        }
        else if(max.size() < min.size()){
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        if(max.size() == min.size()){
            return max.peek()/2.0 + min.peek()/2.0;
        }
            return (double)max.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */