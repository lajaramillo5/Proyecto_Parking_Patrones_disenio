/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.List;

/**
 *
 * @author Smart
 */
public interface OperationEmpresa {
    public List<Empresas> getAllCuentas();

    public int Insertar(Empresas cuenInsercion);
}
