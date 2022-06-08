public class Quartoestu {
    private String nome;
   public void setNome(String nome){
       this.nome = nome;
   }
   public String getNome(){
       return nome;
   }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    private String email;
    public Quartoestu(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public String toString(){
        return nome + ", " + email;
    }

}
