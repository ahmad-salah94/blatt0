import java.util.Arrays;

class Programm {
    public static void main(String args[]) {

        //Sort the list
        Arrays.sort(args);

        //to calculate the sum
        float sum = 0;

        //to calculate the average
        int anzahl = 0;

        //Invert the list
        String[] reverse   = new String[args.length];

        //Palindrome formation in the list
        String[] palindrom = new String[args.length*2];

        //to get all the elements of the args
        for (int i = 0; i < args.length; ++i) {

            palindrom[i] = args[i];
            palindrom[args.length*2 - 1 - i] = args[i];

            reverse[args.length - 1 - i] = args[i];


            try {
                float t = Float.parseFloat(args[i]);
                anzahl++;
                sum += t;
            } 

            catch (Exception e) {
                for (int j = 0; j < args[i].length(); ++j) {
                    anzahl++;
                    sum += args[i].charAt(j);
                }
            }
        }


        //To Print the Result
        System.out.println("Summe:       " + sum);
        System.out.println("Duchschnitt: " + sum/anzahl);
        System.out.println("Sortiert:    " + Arrays.toString(args));
        System.out.println("Rueckwaerts: " + Arrays.toString(reverse));
        System.out.println("Palindrom:   " + Arrays.toString(palindrom));
    }
}