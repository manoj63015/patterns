import java.util.*;
class Halfpy {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
             System.out.println("half pyramid");
        for (int i=1;i<=n;i++){
          
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          System.out.println();
      }

      System.out.println("reversed half pyramid");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                   System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("inverted half pyramid");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println(" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("full pyramid");   
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
              System.out.print("*");
            }
            for(int j=2;j<=i;j++){
              System.out.print("*");
            }
            
            System.out.println();
            }
            System.out.println();
        System.out.println();
        System.out.println("diamond shape");
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
              System.out.print("*");
            }
            for(int j=2;j<=i;j++){
              System.out.print("*");
            }
            
            System.out.println();
            }
         for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
              System.out.print("*");
            }
            for(int j=2;j<=i;j++){
              System.out.print("*");
            }
            
            System.out.println();
            }

        }


    }

