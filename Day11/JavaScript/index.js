/**
 * Today we will learn why we use the typeof and the instanceof in the javascript 
 * 
 * typeof is used to check the type of the variables
 * 
 * and the instanceof is used to check the prototype property of the constructor appers in the 
 * anywhere in the prototype chain in the objects
 */

let x=1;
console.log(typeof x) //number

console.log(typeof x=='number'); //true

console.log(typeof null); //objects 

/**
 * becuase in the javascript before we have the type tag for the null pointer as 0 and 
 * for object we also have 0 as the type tag 
 * 
 * so when we try to print the typeof null we will get the object as string 
 * 
 * return type of the typeof is string
 */

function demo(){
    console.log("hello");
}
let y=new demo();
console.log(y instanceof demo); //true

/**
 * this will check weather the y variables is the instance of the demo() object or not 
 * 
 * if you check the typeof the demo() then we will get the object as the return string
 */