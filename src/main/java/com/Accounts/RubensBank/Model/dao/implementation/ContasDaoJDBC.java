package com.Accounts.RubensBank.Model.dao.implementation;

import com.Accounts.RubensBank.Model.entities.Cliente;
import com.Accounts.RubensBank.db.DB;
import com.Accounts.RubensBank.db.DbException;
import com.Accounts.RubensBank.Model.dao.ContasDao;
import com.Accounts.RubensBank.Model.entities.Conta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ContasDaoJDBC implements ContasDao {

    private Connection conn;

    public ContasDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(Conta obj) {

    }

    @Override
    public void update(Conta obj) {

    }

    @Override
    public Conta findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM conta "
                            +" WHERE id = ?");

            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Conta obj = new Conta();
                obj.setId(rs.getInt("id"));
                obj.setAgencia(rs.getInt("agencia"));
                obj.setNumero(rs.getInt("numero"));
                obj.setSaldo(rs.getDouble("saldo"));

                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("cliente"));

                obj.setCliente(cliente);

                return obj;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Conta> findAll() {
        return null;
    }
}
