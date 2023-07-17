
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

        //Comparion of Enums

        if(s==Status.Running)
            System.out.println("All good");
        else if(s==Status.Failed)
            System.out.println("Try Again");
        else if(s==Status.Pending)
            System.out.println("Please Wait...");
        else 
            System.out.println("Done!");

        //Switch Suppors Enum
        switch(s){
            case Running:
                System.out.println("All good!");
                break;
            case Failed:
                System.out.println("Try Again.");
                break;
            case Pending:
                System.out.println("Please Wait..." );
                break;
            default:
                System.out.println("Done!");
        }

    }
}