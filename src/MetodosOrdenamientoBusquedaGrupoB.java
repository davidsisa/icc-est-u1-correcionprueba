import models.Carro;
import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Asendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] people) {
        // TODO: Implement selection sort by age
        int tamanio = people.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - i - 1; j++) {
                if(people[j].getYear() > people[j + 1].getYear()){
                    Carro axu= people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = axu;
                }
            }
        }
        
    }

    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] people) {
        // TODO: Implement selection sort by height
        int tamanio = people.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - i - 1; j++) {
                if(people[j].getYear() < people[j + 1].getYear()){
                    Carro axu= people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = axu;
                }
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] people, int height) {
        int tamanio = people.length;
        int inicio = 0;
        int fin = inicio - 1; 
        while (inicio <= fin) { 
            int mitad = inicio + (fin - inicio)/2;
            if (people[mitad].getYear() == height) {
                return mitad;
            }
            if (people[mitad].getYear() < height) {
                inicio = mitad + 1 ;
            }else {
                fin = mitad - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Carro[] people) {
        // TODO: Implement showPeople
        for(Carro print: people){
            System.out.println("" + print);
        }
    }
}