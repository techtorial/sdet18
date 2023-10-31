package loopsPractice;

public class doWhilePractice4 {
    public static void main(String[] args) {
        // count numbers of letters from given string value
        String str = "%67*ab4T!8";
        // >> "there are ..3.. letters in the given string: + ...str.."

        //  % 6 7 * a b 4 T ! 8
        int index = 0, countOfLetters = 0;
        do {
            if ((str.charAt(index) >= 'A' && str.charAt(index) <= 'Z')
                    || (str.charAt(index) >= 'a' && str.charAt(index) <= 'z')) {
                countOfLetters++;
            }
            index++;
        } while (index < str.length());
        System.out.println("There are "+countOfLetters+" letters in the given string");

        str = "%67*ab4T!8";
        // find out count of digits in the string
        int i = 0, digitCounter =0;
        do{
            if(str.charAt(i) >='0' && str.charAt(i)<='9'){

                digitCounter++;
            }

            i++;
        }while(i< str.length());
        System.out.println("there are "+digitCounter + " digits in the string");
        str = "%67*ab4T!8";
        // find out count of other symbols in the string
        int indexNumber =0, symbolCounter = 0;
        do{

            // finding letters
            if ((str.charAt(indexNumber) >= 'A' && str.charAt(indexNumber) <= 'Z')
                    || (str.charAt(indexNumber) >= 'a' && str.charAt(indexNumber) <= 'z')) {
                //countOfLetters++;
            }else  if(str.charAt(indexNumber) >='0' && str.charAt(indexNumber)<='9'){

               // digitCounter++;
            }else{
                symbolCounter++;
            }

            indexNumber++;

        }while( indexNumber< str.length());
        System.out.println("There are "+symbolCounter +" symbols in the given string");













    }
}
