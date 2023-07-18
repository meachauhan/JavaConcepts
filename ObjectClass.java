class Laptops{

     int price;
     String model;

     public String toString() {
        ;return model +" : "+price ;
     }
     //not recomended

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptops other = (Laptops) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

    //  public boolean equals(Laptops other){
    //     if(this.model.equals(other.model) && this.price == other.price)
    //         return true;
    //     else 
    //         return false;
    //  }

    
}

public class ObjectClass{
    public static void main(String[] args) {
        
        Laptops obj=new Laptops();

        obj.model="Avita";
        obj.price=32000;

        Laptops obj1=new Laptops();

        obj1.model="Avita";
        obj1.price=32000;


        System.out.println(obj); //Gives to String Implmentation Result
        System.out.println(obj.toString()); 
        // Both  will give classname@HexString(hashcode())

        boolean result=obj1.equals(obj);
        System.out.println(result);
    
    }
}