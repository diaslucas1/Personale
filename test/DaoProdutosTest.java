/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modeloBeans.BeansProdutos;
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
public class DaoProdutosTest {
    
    public DaoProdutosTest() {
    }
    
    @Test
    public void testCodigoValido() {
        BeansProdutos novoProduto = new BeansProdutos();
        try {
            novoProduto.setCodigo(29);
            assertEquals(29, novoProduto.getCodigo());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

    }
    @Test
    public void testCodigoInvalido1() { //codigo menor q 0
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Código invalido!";
        try {
            novoProduto.setCodigo(-4);
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }

    }
    @Test
    public void testCodigoInvalido2() { // codigo maior q 100
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Código invalido!";
        try {
            novoProduto.setCodigo(123);
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }

    }
    @Test
    public void testCodigoInvalido3() { //cadeia com mais de 3 digitos
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Código invalido!";
        try {
            novoProduto.setCodigo(1424);
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }

    }
    @Test
    public void testDescricaoValido() { //cadeia de caracteres entre 0 e 300.
        BeansProdutos novoProduto = new BeansProdutos();
        try {
            novoProduto.setDescricao("Shampoo que promove redensificação capilar, aumenta a resistência e elasticidade dos fios.");
            assertEquals("Shampoo que promove redensificação capilar, aumenta a resistência e elasticidade dos fios.", novoProduto.getDescricao());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    @Test
    public void testDescricaoInvalido1() { //cadeia null
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Descrição inválida!";
        try {
            novoProduto.setDescricao("");
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testDescricaoInvalido2() { //cadeia < 5.
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Descrição inválida!";
        try {
            novoProduto.setDescricao("Sham");
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testDescricaoInvalido3() { //cadeia > 300
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Descrição inválida!";
        try {
            novoProduto.setDescricao("Com a tecnologia catiônica – exclusiva Keraforce – promove redensificação capilar, aumenta a resistência, força e elasticidade dos fios. Repara os danos causados por processos químicos e térmicos e, ainda, aumenta a barreira protetora dos fios.Com a tecnologia catiônica – exclusiva Keraforce – promove redensificação capilar, aumenta a resistência, força e elasticidade dos fios. Repara os danos causados por processos químicos e térmicos e, ainda, aumenta a barreira protetora dos fios.\n"
                    + "Com a tecnologia catiônica – exclusiva Keraforce – promove redensificação capilar, aumenta a resistência, força e elasticidade dos fios. Repara os danos causados por processos químicos e térmicos e, ainda, aumenta a barreira protetora dos fios.");
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testFabricanteValido() {
        BeansProdutos novoProduto = new BeansProdutos();
        try {
            novoProduto.setFabricante("clorofitum");
            assertEquals("clorofitum", novoProduto.getFabricante());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    @Test
    public void testFabricanteInvalido1() { // cadeia = null
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Fabricante Inválido!";
        try {
            novoProduto.setFabricante("");
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testFabricanteInvalido2() { // cadeia < 2
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Fabricante Inválido!";
        try {
            novoProduto.setFabricante("c");
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testFabricanteInvalido3() { // cadeia > 50
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Fabricante Inválido!";
        try {
            novoProduto.setFabricante("marca de creme para cabelo com cinco funções clorofitum");
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testCategoriaValido() {
        BeansProdutos novoProduto = new BeansProdutos();
        try {
            novoProduto.setCategoria("cabelo");
            assertEquals("cabelo", novoProduto.getCategoria());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    @Test
    public void testCategoriaInvalido1() { // categoria - null
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Categoria Inválida!";
        try {
            novoProduto.setCategoria("");
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testCategoriaInvalido2() { // categoria < 3
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Categoria Inválida!";
        try {
            novoProduto.setCategoria("ca");
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testCategoriaInvalido3() { // categoria > 50
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Categoria Inválida!";
        try {
            novoProduto.setCategoria("cabelo, pele, unhas, olhos, boca, cílios, pés, mãos, pernas");
            fail();
        } catch (Exception ex) {
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testPrecoValido() {
        BeansProdutos novoProduto = new BeansProdutos();
        try {
            novoProduto.setPreco(10);
            assertEquals(10, novoProduto.getPreco(), 0.01);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    @Test
    public void testPrecoInvalido1(){ //cadeia < 4
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Preço Inválido!";
        try{
            novoProduto.setPreco(-5);
            fail();
        }catch(Exception ex){
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testPrecoInvalido2(){ //cadeia < 8
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Preço Inválido!";
        try{
            novoProduto.setPreco(599999.99);
            fail();
        }catch(Exception ex){
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testPrecoInvalido3(){ //cadeia contendo letras
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Preço Inválido!";
        try{
            novoProduto.setPreco(599999.99);
            fail();
        }catch(Exception ex){
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testEstoqueValido() {
        BeansProdutos novoProduto = new BeansProdutos();
        try {
            novoProduto.setEstoque(55);
            assertEquals(55, novoProduto.getEstoque());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    @Test
    public void testEstoqueInvalido1(){ //valor > 200
        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Estoque Inválido!";
        try{
            novoProduto.setEstoque(2404);
            fail();
        }catch(Exception ex){
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }
    @Test
    public void testEstoqueInvalido2(){ //cadeia com mais de 1, 2 ou 3 caracteres

        BeansProdutos novoProduto = new BeansProdutos();
        String resultadoEsperado = "Estoque Inválido!";
        try{
            novoProduto.setEstoque(4560);
            fail();
        }catch(Exception ex){
            assertEquals(resultadoEsperado, ex.getMessage());
        }
    }

    
}