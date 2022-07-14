import java.util.Random;
class game3{
    public static void main(String[] args){
	int heads=0;
	int tails=0;
	System.out.printf("Tossing a coin...\n");
	Random rnd = new Random();
	for(int i=1;i<=3;i++){
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
	if(heads>tails){
	    System.out.printf("you won\n");
	}
	else {
	    System.out.printf("you lose\n");
	}
    }
}
