
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
         
        System.out.println("LISTA DE PERSONAS ORDENADAS POR INSERCION - AÑO ");
        ordenarybuscarPersonas.sortByAgeWithInsertion(personas);
        System.out.println("LISTA DE PERSONAS ORDENADAS POR SELECCION  - AÑO");
        ordenarybuscarPersonas.sortByAgeWithSelection(personas);
        System.out.println("LISTA DE PERSONAS ORDENADAS POR INSERCION - ALTURA");
        ordenarybuscarPersonas.sortByHeightWithInsertion(personas);
    

        // BUSCAR FUNCIONAL  POR ARTURA CON SELECCION
        System.out.println("LISTA DE PERSONAS ORDENADAS POR SELECCION  - ALTURA");
        ordenarybuscarPersonas.sortByHeightWithSelection(personas);
        System.out.println("BUSCAR POR  - ALTURA");
        int buscarPersonaAltura = ordenarybuscarPersonas.searchBinaryByHeight(personas, 169);
        if (buscarPersonaAltura == -1 ){
            System.out.println("NO ENCONTRADO");
        }else {
            System.out.println("ENCONTRADO");
        }
        //BUSCAR FUNCIONAL POR AÑO POR INSERCION
        System.out.println("LISTA DE PERSONAS ORDENADAS POR INSERCION - AÑO ");
        ordenarybuscarPersonas.sortByAgeWithInsertion(personas);
        int buscarPersonaAño = ordenarybuscarPersonas.searchBinaryByAge(personas, 25);
        if (buscarPersonaAño == -1 ){
            System.out.println("NO ENCONTRADO");
        }else {
            System.out.println("ENCONTRADO");
        }




        //METODOS ORDENAMIENTO CARROS
        System.out.println("LISTA DE PERSONAS ORDENADAS POR BURBUJA  ASCENDENTE ");
        ordenarybuscarCarros.sortBYearWithBubbleAvnAsendente(carros);
        // BUSCAR FUNCIONAL 
        System.out.println("LISTA DE PERSONAS ORDENADAS POR  BURBUJA DESCENDENTE ");
        ordenarybuscarCarros.sortBYearWithBubbleAvnDesendente(carros);
        System.out.println("BUSCAR POR  - AÑO CARRO");
        int buscarCarro = ordenarybuscarCarros.searchBinaryByYear(carros,2018);
        System.out.println(buscarCarro);
        if(buscarCarro == -1){
            System.out.println("NO Encontrado");
        } else {
            System.out.println("Encontrado");
        }

        
        

    }
}
