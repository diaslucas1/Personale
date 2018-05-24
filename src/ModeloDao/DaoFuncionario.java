/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloConection.ConexaoBD;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansFuncionario;

/**
 *
 * @author dias
 */
public class DaoFuncionario {
    
    ConexaoBD conex = new ConexaoBD();
    BeansFuncionario mod = new BeansFuncionario(); 
    
    public void Salvar(BeansFuncionario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into funcionarios(nome_func, cpf_func, rg_func, endereco_func, telefone_func, nascimento_func, email_func, formacao_func, atuacao_func, horarioatendimento_func) values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCpf());
            pst.setString(3,mod.getRg());
            pst.setString(4,mod.getEndereco());
            pst.setString(5,mod.getTelefone());
            pst.setString(6,mod.getData_nasc());
            pst.setString(7,mod.getEmail());
            pst.setString(8,mod.getFormacao());
            pst.setString(9,mod.getAtuacao());
            pst.setString(10,mod.getTurno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public void Editar(BeansFuncionario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update funcionarios set nome_func=?, cpf_func=?, rg_func=?, endereco_func=?, telefone_func=?, nascimento_func=?, email_func=?, formacao_func=?, atuacao_func=?, horarioatendimento_func=? where cod_func=?");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCpf());
            pst.setString(3,mod.getRg());
            pst.setString(4,mod.getEndereco());
            pst.setString(5,mod.getTelefone());
            pst.setString(6,mod.getData_nasc());
            pst.setString(7,mod.getEmail());
            pst.setString(8,mod.getFormacao());
            pst.setString(9,mod.getAtuacao());
            pst.setString(10,mod.getTurno());
            pst.setInt(11,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteraçao dos dados!\nErro:"+ex.getMessage());
        }
        
        
        conex.desconecta();
    }
    
    public void Excluir(BeansFuncionario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from funcionarios where cod_func=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public BeansFuncionario buscaFuncionario(BeansFuncionario mod){
        conex.conexao();
        conex.executaSql("select * from funcionarios where nome_func like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setNome(conex.rs.getString("nome_func"));
            mod.setCpf(conex.rs.getString("cpf_func"));
            mod.setRg(conex.rs.getString("rg_func"));
            mod.setEndereco(conex.rs.getString("endereco_func"));
            mod.setTelefone(conex.rs.getString("telefone_func"));
            mod.setEmail(conex.rs.getString("email_func"));
            mod.setFormacao(conex.rs.getString("formacao_func"));
            mod.setAtuacao(conex.rs.getString("atuacao_func"));
            mod.setTurno(conex.rs.getString("horarioatendimento_func"));
            mod.setData_nasc(conex.rs.getString("nascimento_func"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionario!\nErro:"+ex.getMessage());
        }
        
        conex.desconecta();
        return mod;
    }
}
