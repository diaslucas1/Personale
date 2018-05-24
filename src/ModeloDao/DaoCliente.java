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
    
}
