
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        CarrosGenerator generator = new CarrosGenerator();
        PersonasGenerator personaGenerator = new PersonasGenerator();
        MetodosOrdenamientoBusqueda ordenarybuscarPersonas = new MetodosOrdenamientoBusqueda();
        MetodosOrdenamientoBusquedaGrupoB ordenarybuscarCarros = new MetodosOrdenamientoBusquedaGrupoB ();
        Person[] personas = personaGenerator.generarPersonas();
        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();
        
        System.out.println("Listado de carros generadas:");
        for (Carro persona : carros) {
            System.out.println(persona);
        }
        System.out.println("Listado de personas generadas:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
        

    }
}
