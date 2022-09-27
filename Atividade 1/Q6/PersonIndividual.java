package Q6;

public class PersonIndividual extends Person{
    private String cpf;

    public PersonIndividual(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean isValid() {
        String[] f = this.cpf.split("-");
        String[] i = f[0].split(".");
        if(f.length != 2){
            return false;
        }else if(f[1].length()!=2){
            return false;
        }else if(i.length!=3){
            return false;
        }else{
            for (String v : i) {
                if(v.length()!=3){
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public String toString() {
        return "CPF: "+cpf;
    }
    
}
