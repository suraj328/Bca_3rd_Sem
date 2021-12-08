class me{
   void name() {
        System.out.println("suraj");
    }
}
public  class Index extends me{
    void name() {
        System.out.println("not suraj");
        super.name();
    }
    
        
    public static void main(String[] args) {
        
        Index obj =new Index();
        obj.name();
    }
    
    
    
}
