public class average {

    public static void main(String[] args) {
       	
	double sum;
	sum = 0;
	double average;

	for (int c = 0; c < 1000; c++) {
	int rollOne;
        int rollTwo;
        int rollThree;
        double tally;
        int tWorth;
        tWorth = 0;
        tally = 0;
        int i = 1;
        boolean roundOne = true;
        boolean roundThree = true;

       

        while (roundOne) {
            rollOne = (int)(Math.random()*6 + 1);
            rollTwo = (int)(Math.random()*6 + 1);
            rollThree = (int)(Math.random()*6 + 1);

            

            if (rollOne == rollTwo && rollTwo == rollThree) {
                roundOne = false;
                tWorth = rollOne;
            } else if (i%3 != 0) {
                tally = tally + rollOne + rollTwo + rollThree;
            } else {
                tally = tally - rollOne - rollTwo - rollThree;
            }
            i++;
        }
        
        

        for (int n = 0; n < tWorth; n++) {
            rollOne = (int)(Math.random()*6 + 1);
            rollTwo = (int)(Math.random()*6 + 1);
            rollThree = (int)(Math.random()*6 + 1);
            tally = tally + (rollOne * rollTwo * rollThree);
        }

        

        i = 1;

        while (roundThree) {
            

            
            rollOne = (int)(Math.random()*6 + 1);
            rollTwo = (int)(Math.random()*6 + 1);
            rollThree = (int)(Math.random()*6 + 1);
            
                
            if (rollOne == rollTwo && rollTwo == rollThree) {
                if (rollOne == tWorth) {
                    tally = tally * 3;
                    
                    roundThree = false;
               	} else {
                    tally = rollOne;
                    
                    roundThree = false;
                }
                } else {
                    tally = tally + (Math.pow(3, i - 1));
                    

                
                i++;

        }

       
	
	sum = sum + tally;
    }
	System.out.println(tally);

}
average = sum/1000;

	System.out.println("Average of 1000 games: " + average); 
}
}