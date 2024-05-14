
package edu.jdc.codigo;

import edu.jdc.clases.Permiso;
import edu.jdc.daos.DaoPermiso;
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        Scanner miteclado = new Scanner(System.in);
        Permiso objPermiso =new Permiso();
        
        System.out.println("EL software para crear permisos");
        
        System.out.println("ingrese el nombre del permiso");
        objPermiso.setNombrePermiso(miteclado.nextLine());
        
        System.out.println("ingrese la funcionalidad del permiso");
        objPermiso.setFuncionalidadPermiso(miteclado.nextLine());
        
        
        DaoPermiso objDao=new DaoPermiso();
        
        boolean funciono=objDao.registrar(objPermiso);
        
        if (funciono) {
            System.out.println("el permiso está en la BD");
        }else{
            System.out.println("no Funciona");
        }
    }
}
