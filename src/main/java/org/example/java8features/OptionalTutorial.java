package org.example.java8features;

import org.example.entities.Cat;

import java.util.Optional;

public class OptionalTutorial {
    public static void main(String[] args) {
        Optional<Cat> myCat = findCatbyName("candy");
        /*if(myCat.isPresent())
        System.out.println(myCat.get().getAge());
        else{
            System.out.println(0);
        }*/
      //Cat defaultCat=   myCat.orElse(new Cat("default", 7));
        //Cat defaultCat=   myCat.orElseGet(() -> new Cat("default",7));
      //System.out.println(defaultCat.getAge());

        int age=myCat.map(Cat::getAge).orElse(0);
        System.out.println(age);

    }
    private  static Optional<Cat> findCatbyName(String name){
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }
}
