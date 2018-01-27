package conectaBD;
import java.sql.*;

public class Conecta_Pruebas {

	public static void main(String[] args) {
		
		try {
			
			//1. CREAR CONEXIÓN
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			
			//2. CREAR OBJETO STATEMENT
			
			Statement miStatement= miConexion.createStatement();
			
			//3. EJECUTAR INSTRUCCIÓN SQL
			
			ResultSet miResultset = miStatement.executeQuery("select * from productos");
			
			//4. RECORRER RESULTSET
			
			while(miResultset.next()) {
				//parametro nombre de la columna literalmente
				System.out.println(miResultset.getString("NOMBREARTICULO")+" "+miResultset.getString("CODIGOARTICULO")+" "+ miResultset.getString("PRECIO"));
				
			}
			
			
		} catch (Exception e) {
			
			System.out.println("No conecta");
			e.printStackTrace();
			
		}


	}

}
