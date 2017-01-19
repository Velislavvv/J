package pkg2.domashno;

public class Domashno {

    public static void main(String[] args) {
        int[][] sirene = {{1, 2, 3}, {4, 5, 6}};
        for (int i=0;i<sirene.length;i++){
            for(int j=0;j<sirene[i].length;j++)
                System.out.print(sirene[i][j]);
            System.out.println();
        }
    }
}
