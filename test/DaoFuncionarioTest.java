/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modeloBeans.BeansFuncionario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dias
 */
public class DaoFuncionarioTest {
    
    public DaoFuncionarioTest() {
    }
    
    @Test
    public void testNomeValido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setNome("Joao Oliveira");
            assertEquals("Joao Oliveira", novoFuncionario.getNome());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testNomeInvalido1(){ //menor que 5
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Nome invalido!";
        try {
            novoFuncionario.setNome("Joao");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testNomeInvalido2(){ //nome > 50
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Nome maior que 50 caracteres!";
        try {
            novoFuncionario.setNome("Joao Oliveira da Silva Rodrigues Dias Nascimento Junior");
            fail();
        } catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testNomeInvalido3(){ //numero ou caractere especial
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Caracter nao permitido!";
        try {
            novoFuncionario.setNome("Joao @Oliveira");
            fail();
        } catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testNomeInvalido4(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Nome invalido!";
        try {
            novoFuncionario.setNome("");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testRgValido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setRg("476102144");
            assertEquals("476102144", novoFuncionario.getRg());
        } catch(Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testRgInvalido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "RG invalido!";
        try {
            novoFuncionario.setRg("");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testRgInvalido2(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "RG invalido!";
        try {
            novoFuncionario.setRg("47610214");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testRgInvalido3(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "RG invalido!";
        try {
            novoFuncionario.setRg("4761021455");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    //CPF
    
    @Test
    public void testEnderecoInvalido1(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Endereco invalido!";
        try {
            novoFuncionario.setEndereco("");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testEnderecoInvalido2(){ //menor que 5
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Endereco invalido!";
        try {
            novoFuncionario.setEndereco("rua");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testEnderecoInvalido3(){ //maior que 100
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Endereco maior que 100 caracteres!";
        try {
            novoFuncionario.setEndereco("rua antônio silveira brasil número 12313 bairro jardim solange da aparecida, referencia supermercado planalto");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testEnderecoValido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setEndereco("rua antonio silva 241, centro");
            assertEquals("rua antonio silva 241, centro", novoFuncionario.getEndereco());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneValido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setTelefone("14981761066");
            assertEquals("14981761066", novoFuncionario.getTelefone());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneInvalido(){ //menor que 8
        BeansFuncionario novoCliente = new BeansFuncionario();
        String esperadoResult = "Telefone invalido!";
        try {
            novoCliente.setTelefone("3232321");
            fail();
        } catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneInvalido2(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Telefone invalido!";
        try {
            novoFuncionario.setTelefone("");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneInvalido3(){ //maior que 12
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Telefone invalido!";
        try {
            novoFuncionario.setTelefone("1592910392103");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneInvalido4(){ //contendo letras
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Telefone invalido!";
        try {
            novoFuncionario.setTelefone("a15992101523");
            fail();
        } catch (Exception ex) {
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneInvalido5(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Telefone invalido!";
        try {
            novoFuncionario.setTelefone("@1532323232");
            fail();
        } catch(Exception ex) {
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testDataNascimentoValida(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setData_nasc("17021991");
            assertEquals("17021991", novoFuncionario.getData_nasc());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test 
    public void testDataNascimentoInvalida(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Data invalida!";
        try {
            novoFuncionario.setData_nasc("");
            fail();
        } catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test 
    public void testDataNascimentoInvalida2(){ //menor que 8
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Data invalida!";
        try {
            novoFuncionario.setData_nasc("2202199");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test 
    public void testDataNascimentoInvalida3(){ //maior que 8
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Data invalida!";
        try {
            novoFuncionario.setData_nasc("229219966");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testDataNascimentoInvalida4(){ //letras
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Data invalida!";
        try {
            novoFuncionario.setData_nasc("as151515");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testDataNascimentoInvalida5(){ //simbolos
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Data invalida!";
        try {
            novoFuncionario.setData_nasc("@#151515");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testFormacaoValido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setFormacao("ensino superior completo");
            assertEquals("ensino superior completo", novoFuncionario.getFormacao());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testFormacaoInvalido1(){ //menor que 5
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Formacao invalida!";
        try {
            novoFuncionario.setFormacao("form");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testFormacaoInvalido2(){ 
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Formacao invalida!";
        try {
            novoFuncionario.setFormacao("");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testFormacaoInvalido3(){ // maior que 50
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Formacao maior que 50 caracteres!";
        try {
            novoFuncionario.setFormacao("formada em esteticismo pela faculdade crista de santos.");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testFormacaoInvalido4(){  //contendo simbolos
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Caracter nao permitido!";
        try {
            novoFuncionario.setFormacao("@@ensino superior");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testFormacaoInvalido5(){ //apenas numeros
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Formacao apenas com numeros!";
        try {
            novoFuncionario.setFormacao("123123123123");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testAtuacaoValido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setAtuacao("cabeleireira");
            assertEquals("cabeleireira", novoFuncionario.getAtuacao());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testAtuacaoInvalido1(){ //menor que 5
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Atuacao invalida!";
        try {
            novoFuncionario.setAtuacao("cabe");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testAtuacaoInvalido2(){ 
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Atuacao invalida!";
        try {
            novoFuncionario.setAtuacao("");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testAtuacaoInvalido3(){ //maior que 50
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Atuacao maior que 50 caracteres!";
        try {
            novoFuncionario.setAtuacao("minha área de atuação é como manicure, trabalho na área há 10 anos");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testAtuacaoInvalido4(){ //contendo numeros
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Caracter nao permitido!";
        try {
            novoFuncionario.setAtuacao("manicure 10");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testAtuacaoInvalido5(){ //contendo simbolos
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Caracter nao permitido!";
        try {
            novoFuncionario.setAtuacao("#manicure");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTurnoValido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setTurno("segundas e sexta feiras das 15 as 18");
            assertEquals("segundas e sexta feiras das 15 as 18", novoFuncionario.getTurno());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testTurnoInvalido1(){ //menor que 5
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Horario de atendimento invalido!";
        try {
            novoFuncionario.setTurno("13h");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTurnoInvalido2(){ 
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Horario de atendimento invalido!";
        try {
            novoFuncionario.setTurno("");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTurnoInvalido3(){ 
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Horario de atendimento invalido!";
        try {
            novoFuncionario.setTurno("");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTurnoInvalido4(){ //maior que 50
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Horario de atendimento maior que 50 caracteres!";
        try {
            novoFuncionario.setTurno("toda quarta feira e quinta feira do horário das 15 horas da tarde até as 23 horas no horário de brasília");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTurnoInvalido5(){ 
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "Cadeia contendo apenas simbolos!";
        try {
            novoFuncionario.setTurno("!@#!@#!@#");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testCPFValido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setCpf("47041661809");
            assertEquals("47041661809", novoFuncionario.getCpf());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testCPFInvalido1(){ //menor que 11
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "CPF invalido!";
        try {
            novoFuncionario.setCpf("48080");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testCPFInvalido2(){ //maior que 11
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "CPF invalido!";
        try {
            novoFuncionario.setCpf("4808408404808808");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testCPFInvalido3(){ 
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "CPF invalido!";
        try {
            novoFuncionario.setCpf("");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testEmailValido(){
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        try {
            novoFuncionario.setEmail("lucasdias@gmail.com");
            assertEquals("lucasdias@gmail.com", novoFuncionario.getEmail());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testEmailInvalido1(){ 
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "E-mail invalido!";
        try {
            novoFuncionario.setEmail("");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testEmailInvalido2(){  //menor que 5
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "E-mail invalido!";
        try {
            novoFuncionario.setEmail("a@a");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testEmailInvalido3(){  //maior que 50
        BeansFuncionario novoFuncionario = new BeansFuncionario();
        String esperadoResult = "E-mail invalido!";
        try {
            novoFuncionario.setEmail("lucasdiasdossantospereiradomingues@lucasdiasdossantospereiradomingues.com");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
     
   
    
    
    
    
}
