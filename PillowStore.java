public class PillowStore implements Containter<Pillow>{
    private Pillow[] orders;
    
    public PillowStore(Pillow[] orders) {
        this.orders = orders;
    }
    @Override
    public Iterator<Pillow> getIterator() {
        return new PillowIterator();
    }
    
    public class PillowIterator implements Iterator<Pillow> {
        private int position;
         
        public PillowIterator(){
            position = 0;
        }
     
        @Override
        public void reset() {
            position = 0;
        }
     
        @Override
        public Pillow next() { 
            return orders[position++];
        }
     
        @Override
        public Pillow currentItem() {
            return orders[position];
        }
     
        @Override
        public boolean hasNext() {
            if(position >= orders.length)
                return false;
            return true;
        }
    }
}
