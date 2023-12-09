public class Main {

        public static void main(String[] args) {
            int[][] inputArray = {
                    {1, 3, 4,5,1},
                    {2, 2, 3,3},
                    {9},
                    {5,6},
                    {1,2,17,2,1,17,3}
            };

           // printArray2(inputArray);

            int[] mittelwerte = berechneMittelwerte(inputArray);

            System.out.println("\nMittelwerte der Zeilen:");
            for (int i = 0; i < mittelwerte.length; i++) {
                System.out.println("Zeile " + i + ": " + mittelwerte[i]);
            }
            System.out.println("#####################Aufgabe 2 ############################");
            //aufgabe2Test
            int startwert = 1;
            int endwert = 1;

            int[] resultArray = newArray(startwert, endwert);

            // Ausgabe des erstellten Arrays
            for (int value : resultArray) {
                System.out.print(value + " ");
            }
            System.out.println("#############Aufgabe 3Test#############################");
            int[][] twoDimensionalArray = {
                    {3, 1, 4},
                    {1, 5, 9},
                    {2, 6, 5}
            };

            int[] oneDimensionalArray = einDim(twoDimensionalArray);

            // Sortiere das eindimensionale Array mit Bubblesort
            bubblesort(oneDimensionalArray);

            // Gib das sortierte eindimensionale Array aus
            System.out.println("Sortiertes eindimensionales Array:");
            for (int value : oneDimensionalArray) {
                System.out.print(value + " ");
            }
        }

  /* private static void printArray2(int[][] array) {

        for (int i = 0; i <array.length; i++) {

            for (int j = 0; j <= array.length; j++) {
                System.out.print("["+array[i][j] +"]" + " ");
            }
            System.out.println();
        }
    }*/

    public static int[] berechneMittelwerte(int[][] array) {
        int[] resultArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int zeilenLaenge = array[i].length;
            int mittlererIndex = zeilenLaenge / 2;
            if(array[i].length==2){
                resultArray[i]=array[i][0];
            }else if(array[i].length==2){
                resultArray[i]=(array[i][0]+array[i][1])/2;
            }
            else if(zeilenLaenge % 2 == 0){
            resultArray[i] =((array[i][mittlererIndex-2]+ array[i][mittlererIndex+1])/2);
            }else {
                resultArray[i]= array[i][mittlererIndex];
            }
        }

        return resultArray;
    }
    // ###########################################Aufgabe 2:###########################

    public static int[] newArray(int start, int end) {
        if (end <= start) {
            System.out.println("Endwert muss größer als Startwert sein.");
        }
        int arrayLaenge = end - start;
        int[] resultArray = new int[arrayLaenge];
        for (int i = 0; i < arrayLaenge; i++) {
            resultArray[i] = start + i;
        }

        return resultArray;
    }
    // ##################### Aufgabe 3########################

    static int[] einDim(int[][] a) {
        int totalElements = 0;
        for (int i = 0; i < a.length; i++) {
            totalElements += a[i].length;
        }

        //mon un dimensionales array
        int[] resultArray = new int[totalElements];

        // j copie les werte du zwei dimension dans mon un dimension
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultArray[index] = a[i][j];
                index++;
            }
        }

        return resultArray;
    }
    static void bubblesort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    }
