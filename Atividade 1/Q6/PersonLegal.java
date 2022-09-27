package Q6;

public class PersonLegal extends Person{
    private String cnpj;

    public PersonLegal(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean isValid() {
        String[] f = this.cnpj.split("/");
        String[] i = f[0].split(".");
        String[] g = f[1].split("-");
        if(f.length != 2){
            return false;
        }else if(g.length!=2){
            return false;
        }else if(g[0]!="0001"||g[1].length()!=2){
            return false;
        }else if(i.length!=3){
            return false;
        }else{
            if(i[0].length()!=2 || i[1].length()!=3 || i[2].length()!=3){
                return false;
            }
            return true;
        }
    }

    @Override
    public String toString() {
        return "CNPJ: "+cnpj;
    }

    
}
