package Temperature;

import java.util.Scanner;

public class Main_1 {

	private static int[][] tabTemperature=initTabTemperature();
	private static Scanner sc=new Scanner(System.in);
	private static int somme=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 
		
	afficheTableau(tabTemperature);
	
	corrigeValeur();
	
	visualiseValeur();
	
	FaireMoyenne();
	
	
	}//**********************************************************************************fin du main
	
	  static int[][] initTabTemperature()
	{
		int[][] matrice ={{1, 5, 10, 7},{2, 7, 6, 6},{3, 6, 1, 10},{4, 10, 20, 15}, {5, 6, 12, 7}, {6, 3, 1, 3}, {7, 7, 16, 14}, {8, 7, 8, 8}, {9, 6, 1, 1}, {10, 5, 4, 10}};
		
		
		
		return matrice;
	
	}
	
	//**********************************************************************************
	 static void afficheTableau (int[][] matrice)
	{
		
		System.out.println("jour"+"\t"+"2013"+"\t"+ "2014"+"\t"+"2015");
		
		for (int j = 0; j <10; j++) {
			
			for (int i = 0; i <4; i++) {
				
				System.out.print(matrice[j][i] + "\t ");
				
			}
			
			System.out.println();
		}
		
		
	}
	//**********************************************************************************
	
	 static void corrigeValeur()
	{
  
		int positionL=0;
		int positionC=0;
		int temperature=0;
		int choix=0;
		boolean stop=true;
		
		while(stop==true)
		{
			System.out.println("Correction de valeurs :"+"\r\n");
			System.out.println("Tapez 1 pour changer des valeurs ou 0 pour arreter");
			choix=sc.nextInt();
			
			if (choix==1)
			{
		System.out.println("Quelle est la ligne de la valeur a  changer ?");
		positionL =sc.nextInt()-1;
		
		System.out.println("Quelle est la colone de la valeur a  changer ?");
		positionC= sc.nextInt()-1;
		
		if ((positionL>10)||(positionL<1)||(positionC>=4)||(positionC<1))	{
			System.out.println("cette position n'existe pas");
		}
		else
		{
		
		System.out.println("Quelle est la valeur a  mettre ?");
		temperature=sc.nextInt();
		
		tabTemperature[positionL][positionC]=temperature;
		
		afficheTableau(tabTemperature);
		}
		
			}
			
			if (choix==0)
			{
				stop=false;
			}
		}
		
		}
	 
	//**********************************************************************************
	 
		static void visualiseValeur()
		{
			int jour=0;
			int choix=0;
			boolean stop = true;
			
			while(stop==true)
			{
				System.out.println("Recherche de valeur : "+"\r\n");
			
			System.out.println("Tapez 1 pour continuer à consulter le tableau ou 0 pour arrêter");
			choix=sc.nextInt();
			
			if (choix==1)
			{	
			
			System.out.println("Pour quel jour souhaitez vous visualiser les donnees");
			
			jour=sc.nextInt();
			
				if ((jour>10)||(jour<1))
				{
					System.out.println("Ces valeurs n'existent pas");
				}
				else
				{

					for (int j = jour-1; j <jour; j++) 
					{
				
						for (int i = 0; i <4; i++) 
						{
					
							System.out.print(tabTemperature[j][i] + "\t ");
					
						}
				
						System.out.println();
					}
			
				}
			}
			else
				{
				stop=false;
				}
			
			}
					}
		//**********************************************************************************
		
		static  double moyenne()
		{
			double moyenne=0;
			moyenne=somme/10;
		return moyenne;
			
		}
		//**********************************************************************************
		static void FaireMoyenne()
		{
			
			boolean stop = true;
			int choix=0;
		
			while (stop==true)
			{
				System.out.println("Moyennes :"+"\r\n");
			System.out.println("Si vous souhaitez la moyenne des temperature pour toute les annees, tapez1");
			System.out.println("Si vous souhaitez la moyenne des temperature pour une annee, tapez 2");
			System.out.println("Si vous souhaitez arreter la consultation, tapez 3");
			
			choix=sc.nextInt();
			
			
			if(choix==1)
			{
				for (int i =1; i<=3; i++)//le nombre d'années
				{	
				
					somme=0;
					
					for (int j = 0; j <10; j++) //le nombre de jour
					{//ligne
				
								somme=somme+tabTemperature[j][i];
					
					}
			
					System.out.println( moyenne());
					
				}
				
			}
			
			else if (choix==2)
			{
				
				int annee=0;
				System.out.println("Quelle est l'année dont vous souhaitez la moyenne des temperature ?");
				annee=sc.nextInt();
				
				if(annee==2013)
				{
					somme=0;
					for (int j = 0; j <10; j++) 
					{//ligne
					
						for (int i = 1; i <2; i++) 
						{//colone
						
							somme=somme+tabTemperature[j][i];
						
						}
					
					}
				
					System.out.println( moyenne());
					
				}
				
				else if (annee==2014)
				{
					somme=0;
					for (int j = 0; j <10; j++) 
					{//ligne
						
						for (int i = 2; i <3; i++) 
							{//colone
							
							somme=somme+tabTemperature[j][i];
							
							}
						
					}
					
					System.out.println( moyenne());
				
				}
				else if(annee==2015)
				{
					somme=0;
					for (int j = 0; j <10; j++) 
					{//ligne
						
						for (int i = 3; i <4; i++) 
						{//colone
							
							somme=somme+tabTemperature[j][i];
							
						}
					}
				
					
					System.out.println( moyenne());
				}
				
				else
				{
					System.out.println("Cette valeur n'existe pas");
				}
				
			}
			
			if(choix==3)
			{
			stop=false;
			}
			
			
			}

		}		
}			
			
			
		
		
		

	
		
	


