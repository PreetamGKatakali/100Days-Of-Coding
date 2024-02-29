/**
 * Arrow functions in javascript 
 */

const hello=()=>{
    return "hello";
}

console.log(hello());   //if it is arrow functions we need to call by the functions

const hello1=()=>"hello world";
console.log(hello1());   //if it is arrow functions sends the default functions 

let x=1
const val=(x)=>"hello"+x;
console.log(val(x));

const val1=x=>"hello"+x;
console.log(val1(x));
