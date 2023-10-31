package arrayPractice;

public class multiDimension3 {
    public static void main(String[] args) {
        String[][] cities = { {"Chicago","Rosemont","Des Plaines"} , {"St. Louis","Cuba"} , {"Kenosha"} ,{"Detroit","Ann Arbor", "Lensing"} };

        // if the length of state(cities array's individual element) is less than 3
        // find the city that has letter 'o'
        // create an email for that city, like >> 'info@..kenosha...gov'
        // print that e-mail address

        // please store cities which did not have e-mail address in to another array and print to show those cities

        for ( String[]  state: cities){

            if (state.length <3){

                for( String city: state){

                    if (city.toLowerCase().contains("o")){

                        System.out.println("info@"+city.toLowerCase().replace(".","")
                                .replace(" ","")+".gov");
                    }
                }
            }


        }
    }
}
