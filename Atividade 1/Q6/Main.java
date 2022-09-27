package Q6;

public class Main {
    public static void main(String[] args) {
        IEntityValidator pf1 = new PersonIndividual("111.222.333-44");
        IEntityValidator pf2 = new PersonIndividual("222.333-44");
        IEntityValidator pj1 = new PersonLegal("11.222.333/0001-44");
        IEntityValidator pj2 = new PersonLegal("222.333/0001-44");
        Validator.runValidation(pf1);
        Validator.runValidation(pf2);
        Validator.runValidation(pj1);
        Validator.runValidation(pj2);
    }
    
}
