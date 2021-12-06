

public class App {
	
	
	public static void main(String[] args) throws InterruptedException{
		int choice;

        choice = 0;
        System.out.print(" _____                       _                   _    ______                               _            " + "\n"
        + "/  __ \\                     | |                 | |   |  _  \\                             | |          "+ "\n"
        + "| /  \\/ ___  _ __ ___  _ __ | |_ ___ _ __    ___| |_  | | | |___  ___ ___  _ __ ___  _ __ | |_ ___ _ __"+ "\n"
        + "| |    / _ \\| '_ ` _ \\| '_ \\| __/ _ \\ '__|  / _ \\ __| | | | / _ \\/ __/ _ \\| '_ ` _ \\| '_ \\| __/ _ \\ '__|"+ "\n"
        + "| \\__/\\ (_) | | | | | | |_) | ||  __/ |    |  __/ |_  | |/ /  __/ (_| (_) | | | | | | |_) | ||  __/ |   "+ "\n"
        + " \\____/\\___/|_| |_| |_| .__/ \\__\\___|_|     \\___|\\__| |___/ \\___|\\___\\___/|_| |_| |_| .__/ \\__\\___|_| "+ "\n"
        + "                      | |                                                           | |                 "+ "\n"
        + "                      |_|                                                           |_|                  " + "\n\n");
        java.util.Scanner entree =   new java.util.Scanner(System.in);

		System.out.print("souhaitez vous Recommencer?\n"
                         + "[1] Compter || [2] Decompter || [3] Quitter \n");
                         choice = entree.nextInt();
                     if(choice == 1){
                       Compter();
                       }
                       if(choice == 2){
                        Decompter();
                        }
                        if(choice == 3){
                            System.exit(0);
                            }
		
	
		}


        static void Compter() throws InterruptedException{

            int NombreACompter;
            int start =0;
            int recommencer = 1;
            while(recommencer == 1){
    
                System.out.print(" _____                       _                   _    ______                               _            " + "\n"
                + "/  __ \\                     | |                 | |   |  _  \\                             | |          "+ "\n"
                + "| /  \\/ ___  _ __ ___  _ __ | |_ ___ _ __    ___| |_  | | | |___  ___ ___  _ __ ___  _ __ | |_ ___ _ __"+ "\n"
                + "| |    / _ \\| '_ ` _ \\| '_ \\| __/ _ \\ '__|  / _ \\ __| | | | / _ \\/ __/ _ \\| '_ ` _ \\| '_ \\| __/ _ \\ '__|"+ "\n"
                + "| \\__/\\ (_) | | | | | | |_) | ||  __/ |    |  __/ |_  | |/ /  __/ (_| (_) | | | | | | |_) | ||  __/ |   "+ "\n"
                + " \\____/\\___/|_| |_| |_| .__/ \\__\\___|_|     \\___|\\__| |___/ \\___|\\___\\___/|_| |_| |_| .__/ \\__\\___|_| "+ "\n"
                + "                      | |                                                           | |                 "+ "\n"
                + "                      |_|                                                           |_|                  " + "\n\n");
    
                java.util.Scanner entree = new java.util.Scanner(System.in);
    
                System.out.print("Jusqu'a quelle nombre voulez vous compter \n");
                NombreACompter = entree.nextInt();
    
                if(NombreACompter != 0){
                    System.out.print("Nous allons commencer a compter : " + NombreACompter + "\n");
                    System.out.print("Commecont\n");
                    while(start != NombreACompter){
                        System.out.print(start++ + "\n");
                        Thread.sleep(999);
                    }
                }
                System.out.print(start+"\n");
                System.out.print("souhaitez vous Recommencer?\n"
                + "[1] oui || [0] quitter || [3] Decompter \n");
                recommencer = entree.nextInt();
                start = 0;
                if(recommencer == 3){
                    Decompter();
                }
            }
            
        }
     
        
		static void Decompter() throws InterruptedException{
            int NombreACompter;
		
		    int recommencer = 1;
            while(recommencer == 1) {

			
			
                System.out.print(" _____                       _                   _    ______                               _            " + "\n"
                        + "/  __ \\                     | |                 | |   |  _  \\                             | |          "+ "\n"
                        + "| /  \\/ ___  _ __ ___  _ __ | |_ ___ _ __    ___| |_  | | | |___  ___ ___  _ __ ___  _ __ | |_ ___ _ __"+ "\n"
                        + "| |    / _ \\| '_ ` _ \\| '_ \\| __/ _ \\ '__|  / _ \\ __| | | | / _ \\/ __/ _ \\| '_ ` _ \\| '_ \\| __/ _ \\ '__|"+ "\n"
                        + "| \\__/\\ (_) | | | | | | |_) | ||  __/ |    |  __/ |_  | |/ /  __/ (_| (_) | | | | | | |_) | ||  __/ |   "+ "\n"
                        + " \\____/\\___/|_| |_| |_| .__/ \\__\\___|_|     \\___|\\__| |___/ \\___|\\___\\___/|_| |_| |_| .__/ \\__\\___|_| "+ "\n"
                        + "                      | |                                                           | |                 "+ "\n"
                        + "                      |_|                                                           |_|                  " + "\n\n");
                java.util.Scanner entree =   new java.util.Scanner(System.in);
    
                System.out.print("quelle nombre voulez vous Decompter : \n" );
    
                NombreACompter = entree.nextInt();
            
                if(NombreACompter != 0) {
                System.out.print("Nous allons compter jusqu'a : " + NombreACompter+"\n" );
                System.out.print("Commencont\n");
                 while (NombreACompter != 0){
                        System.out.print(NombreACompter-- + "\n");
                        Thread.sleep(999);
                    }
                 }
                 System.out.print(NombreACompter+"\n");
                 System.out.print("souhaitez vous Recommencer?\n"
                         + "[1] oui || [0] quitter || [3] compter \n");
                 recommencer = entree.nextInt();
                 if(recommencer == 3){
                    Compter();
                 }
                
                
                 }
        }
	
}


	

