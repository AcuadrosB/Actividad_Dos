package co.edu.uniminuto;


public class Nodo2 {   //   GRAFICVO //////*********************
      Nodo2 enlace2;
    String usuario;
    String contrasena;
    int cc;
    int id_uniminuto;
     Nodo2 siguiente2;
    Nodo2 anterior2;
    
   public Nodo2( String usuario, String contrasena,int cc, int id_uniminuto){
       
       this.usuario = usuario;
       this.contrasena=contrasena;
       this.cc=cc; 
       this.id_uniminuto = id_uniminuto;
       this.enlace2 = null;
       this.anterior2=null;
       this.siguiente2=null;
   }
}
