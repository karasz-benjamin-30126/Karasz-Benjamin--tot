package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        int impar=0, par=0, impar_poz=-1, par_poz=-1;
        String[] splitInput = input.split(",");
        int i, dim= splitInput.length;
        for(i=0; i<dim; i++)
        {
            int number = Integer.parseInt(splitInput[i]);
            if(number%2==0)
            {
                if(par_poz==-1)
                {
                    par_poz=i;
                    par=number;
                }
                else {
                    if(par<number){
                        par=number;
                        par_poz=i;
                    }
                }
            }
            else
            {
                if(impar_poz==-1)
                {
                    impar_poz=i;
                    impar=number;
                }
                else {
                    if(impar>number){
                        impar=number;
                        impar_poz=i;
                    }
                }
            }
        }
        int[] rez = {par, par_poz, impar, impar_poz};
        return rez;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
