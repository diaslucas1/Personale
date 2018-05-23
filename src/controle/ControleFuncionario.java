/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Funcionario;

/**
 *
 * @author dias
 */
public class ControleFuncionario {
    
    ConexaoBD conex = new ConexaoBD();
    Funcionario mod = new Funcionario(); 
    
    public void Salvar(Funcionario mod){
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
}
