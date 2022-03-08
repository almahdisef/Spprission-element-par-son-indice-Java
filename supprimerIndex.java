import java.util.Scanner;

public class supprimerIndex {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("entrer taille du tableau : ");
        int n=sc.nextInt();
        int tab[]=new int[n];
        // sasire elements
        for (int i = 0; i < tab.length; i++) {
            tab[i]=(int) (Math.random()*100);
        }
        // affichage tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.println("inice "+i+" "+tab[i]+" ");
        }
        System.out.print("\n ");

        //faire supprimer unevaleur par son indice
        // creation nouveau tableau intermidire 
        int tabTemp []=new int[n-1];
        System.out.print("qul est L indice de valeur supprimer : ");
        int index=sc.nextInt();
        for (int i = 0; i < tabTemp.length; i++) {
            if(i<index){
                tabTemp[i]=tab[i];
            }else{
                tabTemp[i]=tab[i+1];
            }
        }
        //
        tab=tabTemp;
        // affichage tableau apres supprission
        // tableau d origine
        for (int i = 0; i < tab.length; i++) {
            System.out.println("inice "+i+" "+tab[i]+" ");
        }
    }

    
}