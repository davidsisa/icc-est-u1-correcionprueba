import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        int tamanio = people.length;
        for (int i = 0; i < tamanio - 1; i++){
            int indice = i;
            for (int j = i + 1; j < tamanio; j++){
                if (people[j].getAge() < people[indice].getAge()) {
                    indice = j;
                }
            } 
            Person pequeno = people[i];
            people[i] = people[indice];
            people[indice] = pequeno;
        }
       showPeople(people);
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        // TODO: Implement selection sort by height
        int tamanio = people.length;
        for (int i = 0; i < tamanio - 1; i++){
            int indice = i;
            for (int j = i + 1; j < tamanio; j++){
                if (people[j].getHeight() < people[indice].getHeight()) {
                    indice = j;
                }
            } 
            Person pequeno = people[i];
            people[i] = people[indice];
            people[indice] = pequeno;
        }
       showPeople(people);
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by age
        int tamanio = people.length;
        for(int i = 1;i < tamanio ; i++){
            Person key = people[i];
            int j = i - 1;
            while (j>= 0 && people[j].getAge() > key.getAge()){
                people[j + 1] = people[j]; 
                j= j-1;
            }
            people [j + 1 ] = key;
            showPeople(people);
        }
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by height
        int tamanio = people.length;
        for(int i = 1;i < tamanio ; i++){
            Person key = people[i];
            int j = i - 1;
            while (j>= 0 && people[j].getHeight() > key.getHeight()){
                people[j + 1] = people[j]; 
                j= j-1;
            }
            people [j + 1 ] = key;
            showPeople(people);
        }
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {

        int tamanio = people.length;
        int inicio = 0;
        int fin = inicio - 1; 
        while (inicio <= fin) { 
            int mitad = inicio + (fin - inicio)/2;
            if (people[mitad].getAge() == age) {
                return mitad;
            }
            if (people[mitad].getAge() < age) {
                inicio = mitad + 1 ;
            }else {
                fin = mitad - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        // TODO: Implement binary search by height
        int tamanio = people.length;
        int inicio = 0;
        int fin = inicio - 1; 
        while (inicio <= fin) { 
            int mitad = inicio + (fin - inicio)/2;
            if (people[mitad].getAge() == height) {
                return mitad;
            }
            if (people[mitad].getAge() < height) {
                inicio = mitad + 1 ;
            }else {
                fin = mitad - 1;
            }
        }
  
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] people) {
        for(Person print: people){
            System.out.println("" + print);
        }
    }
}