import java.util.Scanner;



class Calendario {

	public static void main(String args[]){  

    Scanner teclado = new Scanner(System.in);     

   int ano;
   int calendario;
   
   System.out.println("\n|-----------------------------------      Calendario      ---------------------------------------|\n");
  
   System.out.println("Digite um ano.\n");
  
   ano = teclado.nextInt();
	
   System.out.printf("\nMENU:\n\n");
   System.out.printf("Digite 1 - Judeu\n");
   System.out.printf("Digite 2 - Islamico\n\n");
   
    calendario = teclado.nextInt();
   
   
   switch (calendario){
	   
	   case 1:
         System.out.printf("\nNo calendario judeu e: %d \n\n", ano + 3760);		  
		break;
		
	   case 2:
	    System.out.printf("\nNo calendario islamico e: %d \n\n", ano - 579);
		break;
	
		default:
	System.out.printf("\nERRO, DIGITE 1 OU 2.\n\n");
		break;
   
   }	
	
  System.exit(0);

	}
	   }	