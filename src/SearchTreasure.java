import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class SearchTreasure {

    private String[] map;
    private int col, row;
    private boolean isArtefact;
    int totalA; //jumlah artefak
    private int x0, y0;
    private boolean[][] flags;

    public boolean isArtefact() {
        return isArtefact;
    }
    
    public int getTotalArtefact() {
        return totalA;
    }
    public void mapsModel() {
        Scanner s = new Scanner (System.in);
        row = s.nextInt();
        col = s.nextInt();
        map = new String[row];
        flags = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            map[i] = s.next();
            for (int j = 0; j < col; j++) {
                if (map[i].charAt(j) == 'S') {
                    x0 = i;
                    y0 = j;
                }
            }
        }
    }

    public void searchTreasure() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                flags[i][j] = false;
            }
        }
        totalA = 0;
        isArtefact = false;
        find(x0, y0);
    }

    private void find(int x, int y) {
        if ((x >= 0 && x < row) && (y >= 0 && y < col)) {
            if (!flags[x][y]) {
//                System.out.println("x : " + x + " & y: " + y + " CHAR : " + peta[x].charAt(y));
                flags[x][y] = true;
                if (map[x].charAt(y) != '#') {
                    if(map[x].charAt(y) == 'A') {
                        totalA++;
                    }
                    if(map[x].charAt(y) == 'X') {
                        isArtefact = true;
                    }
                    find(x,y-1);
                    find(x,y+1);
                    find(x-1,y);
                    find(x+1,y);
                }
            }
        }
    }
}
