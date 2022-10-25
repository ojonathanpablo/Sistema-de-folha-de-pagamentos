public abstract class Funcionarios {
 protected String nome;
 protected String CPF; 
 protected String endereco;
 protected String telefone; 
 protected String setor;

 public Funcionarios(){
    
 }

 public Funcionarios(String nome,String CPF,String endereco,String telefone,String setor){
    this.nome = nome;
    this.CPF = CPF;
    this.endereco = endereco;
    this.telefone = telefone;
    this.setor = setor;
 }
 
//------------(Get é Set)---------------------
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }
//-------------(Get é Set)--------------------
    public String getCPF(){
        return CPF;
    }
    public void setCPF(){
        this.CPF = CPF;
    }
//-------------(Get é Set)---------------------
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(){
        this.endereco = endereco;
    }
//--------------(Get é Set)-------------------
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
//--------------(Get é Set)--------------------
    public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
//---------------(Metodos)---------------------
    
    public abstract void mostraDados();
    public abstract Double pocentagem(Integer pocentagem);
    public abstract Double salario();

}
