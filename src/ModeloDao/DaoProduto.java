/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansProdutos;

/**
 *
 * @author dias
 */
public class DaoProduto {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void Salvar(BeansProdutos pro){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareCall("insert into produtos (descricao_pro,fabricante_pro,categoria_pro,preco_pro,estoque_pro) values(?,?,?,?,?)");
            pst.setString(1, pro.getDescricao());
            pst.setString(2, pro.getFabricante());
            pst.setString(3, pro.getCategoria());
            pst.setDouble(4, pro.getPreco());
            pst.setInt(5, pro.getEstoque());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produto\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void Editar(BeansProdutos pro){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update produtos set descricao_pro=?, fabricante_pro=?,categoria_pro=?,preco_pro=?, estoque_pro=? where cod_pro=?");
            pst.setString(1, pro.getDescricao());
            pst.setString(2, pro.getFabricante());
            pst.setString(3, pro.getCategoria());
            pst.setDouble(4, pro.getPreco());
            pst.setInt(5, pro.getEstoque());
            pst.setInt(6, pro.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteraçao dos dados!\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void Excluir(BeansProdutos pro){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from produtos where cod_pro=?");
            pst.setInt(1, pro.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public BeansProdutos buscaProduto(BeansProdutos pro){
        conex.conexao();
        conex.executaSql("select * from produtos where fabricante_pro like '%"+pro.getPesquisa()+"%'");
        try {
            conex.rs.first();
            pro.setDescricao(conex.rs.getString("descricao_pro"));
            pro.setFabricante(conex.rs.getString("fabricante_pro"));
            pro.setCategoria(conex.rs.getString("categoria_pro"));
            pro.setPreco(conex.rs.getDouble("preco_pro"));
            pro.setEstoque(conex.rs.getInt("estoque_pro"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente!\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();
        return pro;
    }
}
