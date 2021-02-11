package finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("John", "Montana", value -> {
            System.out.println("no lastName provided for " + value);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

//    function hello(firstname, lastname, callback){
//        console.log(firstName);
//        if(lastname){
//            console.log(lastname);
//        } else {
//            callback();
//        }
//    }
}
