public class consecutiveNumbers {
    public static void main(String[] args){

        System.out.println(consecutive("25,24,23,22"));

    }

    public static String consecutive(String series){


        String[] numberSeries = series.split(",");

        int[] numberInt = new int[numberSeries.length];
        for (int i=0; i<numberSeries.length; i++) {
            numberInt[i] = Integer.parseInt(numberSeries[i].trim());
        }

        int flag=0;

        if(numberInt[0]<numberInt[1]) {
            for (int i = 0; i < numberSeries.length - 1; i++) {

                if (numberInt[i + 1] - numberInt[i] != 1) {
                    flag = 1;
                }

            }
        }
        else {
            for (int i = 0; i < numberSeries.length - 1; i++) {

                if (numberInt[i + 1] - numberInt[i] != -1) {
                    flag = 1;
                }

            }
        }

        String rstr="";
        if(flag==0)
        { rstr=series + " are consecutive numbers\n";
        }
        else
        { rstr=series + " non consecutive numbers\n";
        }
        return rstr;
    }
}

