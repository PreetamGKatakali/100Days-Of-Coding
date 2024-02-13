//how to create the variables in the javascript 
var x=5;
let str="hello world";
const MAX=5;
console.log(x) 
console.log(str)
console.log(MAX)

let a;
console.log(a) 
/**
 * we will get undefined because we have declare the variable a 
 * but we have not inisizled variable a so we are getting the output as undefined 
 * undefined means --> declared but not inisilzed 
 */

/** 
 * Note : in some time we can also get NaN 
 * That means Not A Number  
 */

console.log("Now we will be looking into the javascript variables")
/**
 * we can create the variables in three format 
 * 1) var 
 * 2) let 
 * 3) const 
 * 
 * var is used for the older version of the browser
 * Note : let and const are use from 2015
 * 
 * const should be used in the constent variables or the value won't change repeatly 
 * Note : const are used in the objects and the Arrays .
 * 
 * 
 * let only when you can't use const  
 * 
 */
console.log(5+2+'3'); //output : 73 because the javascript frist add the two number 
                    // and concat to the 3 
console.log('3'+5+2); //output : 352 because the javscript frist concat with the 5 and with the 2


/**
 * Now let's move on to the let
 * introduced from 2015
 * IMP : let is block scope 
 *       must be declared before use 
 *       can not be redecalred 
 */

{
    let p=5;   //p is declared in the block scope 
}
// console.log(p);  //gives error saying that p is not defined 



// console.log(q); // cannot access q before initialization 
// let q=8;

// let r=9;
// let r="hello";
// console.log(r);

/**
 * var 
 * IMP : var is not a bock scope 
 *      can be used before the inisiliztion but the output will be undefined 
 *      can be redeclared
 *          
 */

{
    var t=8;
    var t="hello" 
}
console.log(t); //output : 8 


console.log(b);
var b=7;

/**
 * const 
 * introduced from 2015
 * IMP :   const is the block scope 
 *      can not be redecalred 
 *      can not be ressgined    
 *      must be decalred before the use
 */
const z=12;
// z=11;         //assigment to constant variables 
console.log(z);

