/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modeloBeans.BeansCliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DaoClienteTest {
    
    public DaoClienteTest() {
    }
    
//    private BeansCliente novoCliente(int id) throws Exception {
//        BeansCliente novoCliente = new BeansCliente();
//        
////        novoCliente.setCliente_cod(id);
////        novoCliente.setNome("Lucas Dias");
////        novoCliente.setCpf("444.772.222-01");
////        novoCliente.setDataNascimento("22121991");
////        novoCliente.setEndereco("Rua Argentina 2-32");
////        novoCliente.setTelefone("43997121522");
////        novoCliente.setEmail("lucas@gmail.com");
//        
//        return novoCliente;
//    }
    
    
    @Test
    public void testNomeInvalido1(){ //menor que 5
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Nome invalido!";
        try {
            novoCliente.setNome("Joao");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testNomeInvalido2(){ //nome > 50
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Nome maior que 50 caracteres!";
        try {
            novoCliente.setNome("Joao Oliveira da Silva Rodrigues Dias Nascimento Junior");
            fail();
        } catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testNomeInvalido3(){
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Caracter nao permitido!";
        try {
            novoCliente.setNome("Joao @Oliveira");
            fail();
        } catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testNomeInvalido4(){
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Nome invalido!";
        try {
            novoCliente.setNome("");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testNomeValido(){
        BeansCliente novoCliente = new BeansCliente();
        try {
            novoCliente.setNome("Joao Oliveira");
            assertEquals("Joao Oliveira", novoCliente.getNome());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testEnderecoInvalido1(){
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Endereco invalido!";
        try {
            novoCliente.setEndereco("");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testEnderecoInvalido2(){ //menor que 5
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Endereco invalido!";
        try {
            novoCliente.setEndereco("rua");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testEnderecoInvalido3(){ //maior que 100
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Endereco maior que 100 caracteres!";
        try {
            novoCliente.setEndereco("rua antônio silveira brasil número 12313 bairro jardim solange da aparecida, referencia supermercado planalto");
            fail();
        }catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testEnderecoValido(){
        BeansCliente novoCliente = new BeansCliente();
        try {
            novoCliente.setEndereco("rua antonio silva 241, centro");
            assertEquals("rua antonio silva 241, centro", novoCliente.getEndereco());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneValido(){
        BeansCliente novoCliente = new BeansCliente();
        try {
            novoCliente.setTelefone("14981761066");
            assertEquals("14981761066", novoCliente.getTelefone());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneInvalido(){ //menor que 8
        BeansCliente novoCliente = new BeansCliente();
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
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Telefone invalido!";
        try {
            novoCliente.setTelefone("");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneInvalido3(){ //maior que 12
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Telefone invalido!";
        try {
            novoCliente.setTelefone("1592910392103");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneInvalido4(){ //contendo letras
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Telefone invalido!";
        try {
            novoCliente.setTelefone("a15992101523");
            fail();
        } catch (Exception ex) {
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testTelefoneInvalido5(){
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Telefone invalido!";
        try {
            novoCliente.setTelefone("@1532323232");
            fail();
        } catch(Exception ex) {
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testDataNascimentoValida(){
        BeansCliente novoCliente = new BeansCliente();
        try {
            novoCliente.setDataNascimento("17021991");
            assertEquals("17021991", novoCliente.getDataNascimento());
        } catch (Exception ex){
            fail(ex.getMessage());
        }
    }
    
    @Test 
    public void testDataNascimentoInvalida(){
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Data invalida!";
        try {
            novoCliente.setDataNascimento("");
            fail();
        } catch (Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test 
    public void testDataNascimentoInvalida2(){ //menor que 8
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Data invalida!";
        try {
            novoCliente.setDataNascimento("2202199");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test 
    public void testDataNascimentoInvalida3(){ //maior que 8
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Data invalida!";
        try {
            novoCliente.setDataNascimento("229219966");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testDataNascimentoInvalida4(){ //letras
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Data invalida!";
        try {
            novoCliente.setDataNascimento("as151515");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    @Test
    public void testDataNascimentoInvalida5(){ //simbolos
        BeansCliente novoCliente = new BeansCliente();
        String esperadoResult = "Data invalida!";
        try {
            novoCliente.setDataNascimento("@#151515");
            fail();
        } catch(Exception ex){
            assertEquals(esperadoResult, ex.getMessage());
        }
    }
    
    //email cpf e nome simbolo/letra
    
}
