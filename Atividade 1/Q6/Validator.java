package Q6;

public class Validator {
    private IEntityValidator entityValidator;

    public static void runValidation(IEntityValidator e){
        String v;
        if(e.isValid()){
            v = " Valid";
        }else{
            v = " Not Valid";
        }
        System.out.println(e.toString()+v);
    }
    
}
