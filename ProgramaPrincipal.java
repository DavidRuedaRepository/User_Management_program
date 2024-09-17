package es.ifp.programacion.ejercicio.retouf4;

import java.util.HashMap;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Crear un HashMap para almacenar usuarios con identificadores
		HashMap<String, Usuario> datos = new HashMap<String, Usuario>();

		// Crear usuarios y agregarlos al HashMap utilizando el constructor de 3 parámetros
		Usuario Juan = new Usuario("Juan", "Gómez de los Santos", "11223344A");
		Usuario Maria = new Usuario("María", "López Rueda", "55667788B", "maria@gmail.com", "675452321");
		Usuario Rebeca = new Usuario("Rebeca", "Almansa Pérez", "44556677I", "usuario2@gmail.com", "675452321");
		Usuario Roberto = new Usuario("Roberto", "del Rio Sánchez", "11226677S");
		Usuario Guillermo = new Usuario("Guillermo", "Gonzalez Zapico", "99887733S", "usuario2@gmail.com", "675452321");

		datos.put(Juan.getDNI(), Juan);
		datos.put(Maria.getDNI(), Maria);
		datos.put(Rebeca.getDNI(), Rebeca);
		datos.put(Roberto.getDNI(), Roberto);
		datos.put(Guillermo.getDNI(), Guillermo);

		//Utilizo un bucle for para recorrer el hashMap, con el método keyset que devuelve un set de las claves, lo almacenamos 
		//en la variable clave. Por cada clave itera hasta que no hay más elementos en la tabla.

		for (String clave: datos.keySet()) {


			//Utilizamos la función get(clave) que almacenamos de nuestro HasMap datos, y guardamos estos datos
			//en la variable usuario de tipo Usuario
			Usuario usuario = datos.get(clave);


			//Imprimimos usando el método toString de la clase Usuario.
			System.out.println(usuario.toString()+"\n");

		}
	}

}
