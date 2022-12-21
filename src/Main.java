public class Main {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3},{4,5,6},{7,8,9}};
        int newcolomn = matris.length;
        int newrow = matris[0].length;
        int[][] transpoz = new int[newrow][newcolomn];
        for (int i = 0;i<matris.length;i++){
            for(int j = 0;j<matris[i].length;j++){
                transpoz[j][i]=matris[i][j];
            }
        }

        for (int[] col : matris){
            for (int row : col){
                System.out.print(row + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for (int[] col : transpoz){
            for (int row : col){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}