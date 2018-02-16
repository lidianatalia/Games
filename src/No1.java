/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class No1 {
    private static SearchTreasure[] maps;
    
    public static void main(String[] args) {
        //Input total map
        int totalMap = new Scanner(System.in).nextInt();
        int maxArtefact = 0;
        boolean findExitDoor = false;
        int chosenMap=0;
        maps = new SearchTreasure[totalMap];
        //Draw map
        for(int i=0; i< totalMap; i++){
            maps[i] = new SearchTreasure();
            maps[i].mapsModel();
        }
        
        for(int i=0; i< totalMap; i++){
            System.out.println("Dungeon Map"+(i+1)+"#");
            maps[i].searchTreasure();
            System.out.println(maps[i].getTotalArtefact());

            if(maps[i].isArtefact()){
                if(maps[i].getTotalArtefact()>maxArtefact){
                    chosenMap = i;
                    maxArtefact = maps[i].getTotalArtefact();
                }
                findExitDoor = true;
                System.out.println("There's a way out");
            }else{
                System.out.println("There's no way out");
            }
        }

        if(findExitDoor){
            System.out.println("Dungeon which selected is dungeon number "+(chosenMap+1));
        }else{
            System.out.println("Paijo and Paiman should go home and work");
        }
    }
}
