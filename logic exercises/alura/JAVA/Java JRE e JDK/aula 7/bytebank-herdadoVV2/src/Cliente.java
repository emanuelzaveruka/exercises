
public class Cliente implements Autenticavel {
  
    private AutenticacaoUtil util;
  
    public Cliente(){
        AutenticacaoUtil util = new AutenticacaoUtil();
    }
    public void setSenha(int senha){
        this.util.setSenha(senha);
    }
    public boolean autentica(int senha){
        return this.autentica(senha);
    }

}
