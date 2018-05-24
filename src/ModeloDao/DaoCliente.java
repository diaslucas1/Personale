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
import modeloBeans.BeansCliente;

/**
 *
 * @author dias
 */
public class DaoCliente {
    
    ConexaoBD conex = new ConexaoBD();
    
    public void Salvar(BeansCliente cli){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes (nome_cli,cpf_cli,endereco_cli,telefone_cli,nascimento_cli,email_cli) values(?,?,?,?,?,?)");
            pst.setString(1, cli.getNome());
            pst.setString(2, cli.getCpf());
            pst.setString(3, cli.getEndereco());
            pst.setString(4, cli.getTelefone());
            pst.setString(5, cli.getDataNascimento());
            pst.setString(6, cli.getEmail());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar paciente!\nErro:"+ex.getMessage());
        }
        
        
        conex.desconecta();
    }
    
    public void Editar(BeansCliente cli){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update clientes set nome_cli=?, cpf_cli=?, endereco_cli=?, telefone_cli=?, nascimento_cli=?, email_cli=? where cod_cli=?");
            pst.setString(1,cli.getNome());
            pst.setString(2,cli.getCpf());
            pst.setString(3,cli.getEndereco());
            pst.setString(4,cli.getTelefone());
            pst.setString(5,cli.getDataNascimento());
            pst.setString(6,cli.getEmail());
            pst.setInt(7,cli.getCliente_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteraçao dos dados!\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void Excluir(BeansCliente cli){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from clientes where cod_cli=?");
            pst.setInt(1, cli.getCliente_cod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();       
    }
    
    public BeansCliente buscaCliente(BeansCliente cli){
        conex.conexao();
        conex.executaSql("select * from clientes where nome_cli like '%"+cli.getPesquisa()+"%'");
        try {
            conex.rs.first();
            cli.setNome(conex.rs.getString("nome_cli"));
            cli.setCpf(conex.rs.getString("cpf_cli"));
            cli.setEndereco(conex.rs.getString("endereco_cli"));
            cli.setTelefone(conex.rs.getString("telefone_cli"));
            cli.setDataNascimento(conex.rs.getString("nascimento_cli"));
            cli.setEmail(conex.rs.getString("email_cli"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente!\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();
        return cli;
    }
    
}
