/**
 * JavaScript Hoisting 
 * 
 * The variables can be declared after it has been used 
 * in other words variables can be used before it has been used 
 * 
 *  
 */
x=5;    
console.log(x);
var x;    //declared here

// y=6;
// console.log(y);  //Cannot access 'y' before initialization
// let y;

/**
 * Note : the let and const are hoisted to the top of the block ,but not initialized
 * 
 * Javascript intializations are not hoisted 
 */
var x1=5;
var y1=5;
console.log(x1+y1);

var x2=5;
console.log(x2+y2); //NaN not a number
var y2=5;
/**
 * we get the NaN becuase the declarsion of the y is hoisted on the top but not initializations 
 * Note : the initialzation are not hoisted 
 * 
 * y has initializated before the use
 * 
 * so this can act as the javascript bug so there is the good rule declaring all the variables 
 * on the top of the scope. 
 */

