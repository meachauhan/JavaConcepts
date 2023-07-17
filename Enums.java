
enum Status{
    Running,Failed,Pending,Success;
}
public class  Enums{
    public static void main(String[] args) {
        int i=5;
        Status s=Status.Running;
        // Status s=Status.NoStatus; Will give Error
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] sa=Status.values(); //Returns array of enums values
        for(Status ss:sa){
            System.out.println(ss);
        }

    }
}