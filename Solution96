 static int[] breakingRecords(int[] scores) {
        int Min = scores[0];
        int Max = scores[0];
        int recordOfLows = 0, recordofHighs = 0;
        int[] result = new int[2];


        for(int i= 0; i<scores.length;i++){   
             if (scores[i]>Max){
                 recordofHighs++;
                 Max = scores[i];
             }
             if(scores[i]<Min){
                 recordOfLows++;
                 Min = scores[i];
             }
        }
        result[0] = recordofHighs;
        result[1] = recordOfLows;

        return result;


    }
