package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Conexion.CreateConection;
import Modelo.Empleados;

public class EmpleadoDAO {
    private final CreateConection connFactory = new CreateConection();

    public List<Empleados> obtenerTodos() {
        List<Empleados> lista = new ArrayList<>();
        String sql = "SELECT * FROM EMPLEADO";

        try (Connection conn = connFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Empleados emp = new Empleados(
                        rs.getInt("ID_EMP"),
                        rs.getString("NOMBRE"),
                    rs.getString("APELLIDO"),
                    rs.getString("PUESTO"),
                    rs.getString("TELEFONO"),
                    rs.getString("DIRECCION"),
                    rs.getBoolean("ESTADO"),
                    rs.getString("FECHA"),
                    rs.getDouble("SALARIO"),
                    rs.getString("GMAIL")
                );
                lista.add(emp);
            }
          /*  ps.close();
            conn.close();*/
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public boolean guardar(Empleados emp) {
String sql = "INSERT INTO EMPLEADO (nombre, apellido, puesto, telefono, direccion, estado, fecha, salario, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = connFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, emp.getNombre());
        ps.setString(2, emp.getApellido());
        ps.setString(3, emp.getPuesto());
        ps.setString(4, emp.getTelefono());
        ps.setString(5, emp.getDireccion());
        ps.setBoolean(6, emp.isEstado());
        ps.setString(7, emp.getFecha());
        ps.setDouble(8, emp.getSalario());
        ps.setString(9, emp.getEmail());
            ps.executeUpdate();
            ps.close();
            conn.close();
            
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean actualizar(Empleados emp) {
        String sql = "UPDATE empleado SET nombre=?, apellido=?, puesto=?, telefono=?, direccion=?, estado=?, fecha=?, salario=?, email=? WHERE ID_EMP=?";

        try (Connection conn = connFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) { 
        ps.setString(1, emp.getNombre());
        ps.setString(2, emp.getApellido());
        ps.setString(3, emp.getPuesto());
        ps.setString(4, emp.getTelefono());
        ps.setString(5, emp.getDireccion());
        ps.setBoolean(6, emp.isEstado());
        ps.setString(7, emp.getFecha());
        ps.setDouble(8, emp.getSalario());
        ps.setString(9, emp.getEmail());
        ps.setInt(10, emp.getId());

            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM EMPLEADO WHERE ID_EMP=?";

        try (Connection conn = connFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}

