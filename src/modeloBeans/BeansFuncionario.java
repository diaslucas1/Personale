/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.regex.Pattern;


public class BeansFuncionario {
    
    private int codigo;
    private String nome;
    private String cpf;
    private String rg;
//    private Endereco endereco;
    private String endereco;
    private String telefone;
    private String turno;
    private String email;
    private String formacao;
    private String atuacao;
    private String data_nasc;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) throws Exception {
        if(nome.isEmpty() || nome.length() < 5) {
            throw new Exception("Nome invalido!");
        } else if (nome.length() > 5 && nome.length() < 50) {
            this.nome = nome;
        } else if (nome.length() > 50){
            throw new Exception("Nome maior que 50 caracteres!");
        } else if (Pattern.matches(".*\\d.*", nome) == true || Pattern.matches(".*[^\\w\\s].*", nome)){
            throw new Exception("Caracter nao permitido!");
        }
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) throws Exception {
        if(Pattern.matches("\\d{9}", rg)){
            this.rg = rg;
        } else {
            throw new Exception("RG invalido!");
        }
        this.rg = rg;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws Exception {
        if(endereco.isEmpty() || endereco.length() < 5) {
            throw new Exception("Endereco invalido!");
        } else if (endereco.length() > 5 && endereco.length() < 100) {
            this.endereco = endereco;
        } else if (endereco.length() > 100){
            throw new Exception("Endereco maior que 100 caracteres!");
        }
        
        this.endereco = endereco;
    }

    /**
     * @return the endereco
     */
//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    /**
//     * @param endereco the endereco to set
//     */
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
   
    public void setTelefone(String telefone) throws Exception {
        if(Pattern.matches("\\d{8,12}", telefone)){
            this.telefone = telefone;
        } else {
            throw new Exception("Telefone invalido!");
        }
        this.telefone = telefone;
    }
  

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the formacao
     */
    public String getFormacao() {
        return formacao;
    }

    /**
     * @param formacao the formacao to set
     */
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    /**
     * @return the atuacao
     */
    public String getAtuacao() {
        return atuacao;
    }

    /**
     * @param atuacao the atuacao to set
     */
    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
    
    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) throws Exception {
        if(Pattern.matches("\\d{8}", data_nasc)){
            this.data_nasc = data_nasc;
        } else {
            throw new Exception("Data invalida!");
        }
        this.data_nasc = data_nasc;
    }
    
}
    
   

    
    

