/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.regex.Pattern;

public class BeansCliente {
         
    private int cliente_cod;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private String email;
    private String pesquisa;
    
    public int getCliente_cod() {
        return cliente_cod;
    }

    public void setCliente_cod(int cliente_cod) {
        this.cliente_cod = cliente_cod;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     * @throws java.lang.Exception
     */
    public void setNome(String nome) throws Exception {
        if(nome.isEmpty() || nome.length() < 5) {
            throw new Exception("Nome invalido!");
        } 
        if (nome.length() > 5 && nome.length() < 50) {
            this.nome = nome;
        } 
        if (nome.length() > 50){
            throw new Exception("Nome maior que 50 caracteres!");
        } 
        if (Pattern.matches(".*\\d.*", nome) == true || Pattern.matches(".*[^\\w\\s].*", nome)){
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
    public void setCpf(String cpf) throws Exception {
        if(Pattern.matches("\\d{11}", cpf)){
            this.cpf = cpf;
        } else {
            throw new Exception("CPF invalido!");
        }
        this.cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     * @throws java.lang.Exception
     */
    public void setDataNascimento(String dataNascimento) throws Exception {
        if(Pattern.matches("\\d{8}", dataNascimento)){
            this.dataNascimento = dataNascimento;
        } else {
            throw new Exception("Data invalida!");
        }
        this.dataNascimento = dataNascimento;
    }
  

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
    
   
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws Exception {
        if(endereco.isEmpty() || endereco.length() < 5) {
            throw new Exception("Endereco invalido!");
        }
        if (endereco.length() > 5 && endereco.length() < 100) {
            this.endereco = endereco;
        }
        if (endereco.length() > 100){
            throw new Exception("Endereco maior que 100 caracteres!");
        }
        
        this.endereco = endereco;
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
    public void setEmail(String email) throws Exception {
        if(Pattern.matches("\\w{2,}@\\w{2,}.\\w{3,}", email) && email.length() <= 50){
            this.email = email;
        } else {
            throw new Exception("E-mail invalido!");
        }
        this.email = email;
    }
    
    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    
    
}
