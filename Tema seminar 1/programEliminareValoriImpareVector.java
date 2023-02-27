@SuppressWarnings("SpellCheckingInspection")

// Tema: functie eliminare valori impare din vector
public class programEliminareValoriImpareVector {
    public static int[] Eliminare (int[] vector) {

        int[] temp = new int[vector.length];
        int contorTemp = 0;

        for (int valoare : vector) {
            if (valoare % 2 == 0)
            {
                temp[contorTemp] = valoare;
                contorTemp++;
            }
        }

        int[] vectorValoriImpEliminate = new int[contorTemp];
        for (int i = 0; i < contorTemp; i++)
            vectorValoriImpEliminate[i] = temp[i];

        return vectorValoriImpEliminate;
    }
    public static void main (String[] args)
    {
        String[] stringVector = args[0].split(",");
        int[] intVector = new int[stringVector.length];
        for (int i = 0; i < stringVector.length; i++)
            intVector[i] = Integer.parseInt(stringVector[i]);

        System.out.print("Valorile impare au fost eliminate. Noul vector este: \n");
        intVector = Eliminare(intVector);

        for (int i = 0; i< intVector.length; i++)
            System.out.printf("%d ", intVector[i]);
        System.out.print("\n");
    }
}