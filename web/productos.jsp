<%-- 

    Author     : Anthony Nuñez
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import = "java.util.logging.Logger" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Productos</title>
        
<style>
        body {
            font-family: Arial, sans-serif;
        }

        h1 {
            text-align: center;
            margin: 20px 0;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #f8f8f8; /* Color de fondo claro */
        }

        th, td {
            padding: 10px;
            text-align: center;
            border-bottom: 1px solid #ddd;
           
        }

        th {
            background-color: #007BFF; /* Color azul */
            color: #ffff; /* Texto en color blanco */
        }

        tr:nth-child(even) {
            background-color: #f0f8ff;
        }

        tr:hover {
            background-color: #f0fff0;
        }

        .barato {
            color: green;
            font-weight: bold;
        }

        .caro {
            color: red;
            font-weight: bold;
        }
    </style>
        
    
    
    </head>
    

    
    <%
  String[] cod={"INV01","INV02","INV03","INV04","INV05","INV06","INV07","INV08","INV09","INV10","INV11","INV12","INV13","INV14","INV15","INV16","INV17","INV18"};
  String[] mar={"Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas","Adidas"};
  String[] ent={"Entegra Gratis","Recojo en tienda","Recojo en tienda","Recojo en tienda","Entegra Gratis","Recojo en tienda","Entegra Gratis","Recojo en tienda","Recojo en tienda","Recojo en tienda","Recojo en tienda","Recojo en tienda","Recojo en tienda","Entegra Gratis","Recojo en tienda","Recojo en tienda","Entegra Gratis","Recojo en tienda"};
  String[] pro={"Camiseta","Zapatillas","Zapatillas","Zapatillas","Buzo","Zapatillas","Sandalias","Zapatillas","Polo","Buzo","Zapatillas","Zapatillas","Zapatillas","Buzo","Zapatillas","Zapatillas","Zapatillas","Casaca"};
  String[] nom={"CAMISETA OFICIAL DE LOCAL DE LA SELECCIÓN PERUANA 2023","ZAPATILLAS OZELIA","ZAPATILLAS RUN 60S 3.0 LIFESTYLE RUNNING","ZAPATILLAS DURAMO SL 2.0","BUZO ESSENTIALS 3 TIRAS","ZAPATILLAS NMD_R1","SANDALIAS ADILETTE LITE","ZAPATILLAS RUN 60S 3.0 LIFESTYLE RUNNING","POLO ESTAMPADO CAMO INFILL","BUZO TEAMSPORT","ZAPATILLAS NMD_R1","ZAPATILLAS NEBZED CLOUDFOAM","ZAPATILLAS NMD_V3","BUZO 3 TIRAS TRICOT BASIC","ZAPATILLAS NIZZA","ZAPATILLAS MULTIX","ZAPATILLAS DURAMO SL","CASACA DEPORTIVA COPA MUNDIAL DE LA FIFA 2022™ PERÚ"};
  String[] talla={"M","40","42","39","L","41","40","42","S","XS","38","40.5","43","M","42","41","41","XL"};
  int[]    pre={150,250,150,250,180,200,250,210,220,290,310,290,350,315,180,230,195,275};
  int[]    cant={2,3,1,1,2,4,1,4,3,4,2,4,1,1,3,2,2,4};
  int tot=0;
  double ti=0;
  double mt=0;
  String mensaje="";
  int s=0;
%>
    <body>
          <% Logger logger = Logger.getLogger(this.getClass().getName());%>
          
              <div class="table-container">
        
        <h1>FORMATO DE COMPRA AL POR MAYOR</h1>
        <h2>EMPRESA: TERCERIZA S.A.C.</h2>
        <h5>URB. JARDIN LIMA - LIMA - SANTIAGO DE SURCO</h5>
        <h5>R.U.C.: 20145874778514</h5>
        <h5>Boleta de Venta Electrónica</h5>
        <h5>Serie: BFFM    /  Correlativo: 000003295878</h5>
          
      <table border="2.5">
 <tr>
 <td><b>Imagen</b></td>
        <td><b>SKU</b></td>
        <td><b>Marca</b></td>
        <td><b>Producto</b></td>
        <td><b>Detalle</b></td>
        <td><b>Talla</b></td>
        <td><b>Tipo de entrega</b></td>
        <td><b>Precio</b></td>
        <td><b>Unidades</b></td>
        <td><b>Total Bruto</b></td>
        <td><b>IGV</b></td>
        <td><b>Total a pagar</b></td>
        <td><b>Descuento</b></td>
      
        
        
 </tr>     
 <%   for (int i=0;i<cod.length;i++){  %> 
 <tr>
     <td><img src="img/<%=cod[i]%>.png" height="80" width="80" ></td>
     <td><%=cod[i]%></td> 
     <td><%=mar[i]%></td> 
     <td><%=pro[i]%></td> 
     <td><%=nom[i]%></td> 
     <td><%=talla[i]%></td> 
     <td><%=ent[i]%></td> 
     <td><%=pre[i]%></td> 
     <td><%=cant[i]%></td> 
     <%tot=(cant[i]*pre[i]);%>
     <td><%=tot%></td>
     <%ti=(tot*0.19);%>
     <td><%=ti%></td>
     <% mt=(tot+ti);
   s+=mt;
     %>
     <td><%=mt%></td>

     <% if (mt<180){
     mensaje="-20%";
     }else{
     mensaje="-10%";
       }       %>
     <td><%=mensaje%></td>

 
     <% String message = "SKU: " + cod[i] + " - Nombre: " + nom[i] + " - Precio Total: " + mt; %>
     
     <% logger.info( message ); %>




 </tr>     
 <% } %>
      </table>





    </body>
</html>
