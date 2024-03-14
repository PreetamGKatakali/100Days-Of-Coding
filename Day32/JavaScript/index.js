/**
 * class in the javascript
 * 
 * while creating the class don't forget to add the constructor()
 */
class Car {
    constructor(name, year) {
      this.name = name;
      this.year = year;
    }
  }
/**
 * the above example creates the object of the cars
 * 
 * javscript class is not object it is the templates of the objects 
 * 
 * when we have a class we can create the object of the class 
 * 
 * const mycar1=new car("ford",2014);
 * 
 * method are created with the same syntax 
 * 
 * 
 */
class Car {
    constructor(name, year) {
      this.name = name;
      this.year = year;
    }
    age(x) {
      return x - this.year;
    }
  }