import java.util.Random;
class game{
    public static void main(String[] args){
	int heads=0;
	int tails=0;
	System.out.printf("Tossing a coin...\n");
	Random rnd = new Random();
	for(int i=0;i<5;i++){
	    int value=rnd.nextInt(2);
	    if(value==0){
		System.out.printf("Round %d:heads\n",i);
		heads++;
	    }
	    else{
		System.out.printf("Round %d:tails\n",i);
		tails++;
	    }
	}
	System.out.printf("Heads: %d, Tails: %d\n",heads,tails);
    }
}
	    
	
	
