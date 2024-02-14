/**
 * Javascript has 8 type of the DataType : 
 * 1) String
 * 2) NUmber
 * 3) Bigint 
 * 4) Boolean 
 * 5) Undefined 
 * 6) Null 
 * 7) Symbol 
 * 8) Object 
 */

console.log("we are also have the Object dataType ")
/**
 * An Object 
 * An Array 
 * A date 
 */

console.log("Now we will dive into the funcstion")

/**
 * JavaScript Function Syntax 
 */

function display(){                 //function declarstions 
    console.log("hello function") 
}
display()  //function call

/**
 * Arrow funcstion
 * 
 * This was introduced from ES6
 * 
 */
let myFunct=(a,b)=>a*b;
let res=myFunct(2,2);
console.log(res)


const hello=()=>"hello JavaScript";
console.log(hello());
/**
 * In the above example we have written the arrow function 
 * that by default return's the value in the arrow funcstion 
 * 
 * it shorter's the code and easy to understand 
 * 
 * 
 * Note : the arrow function works only for one return statment's 
 *         In the arrow function we can remove the parenthese if and only if we have one parameter 
 * 
 */
console.log("----Anonymous function----------");

/**
 * Anonymuse function are those where we have no function names defined in the function declartion
 * 
 * But the question come here how can be access without the name 
 * answer : The anonymouse function can be access by the variales name where the anonymouse function is stored 
 * 
 */
const helloworld=function(){
    console.log("Hi i am anonymouse function");
}
helloworld()
/**
 * Here we can c that we have defined only the funcstion name and stored in the variables 
 */

/**
 * The use of the anonymouse function 
 * 1) we can use this function for specific event handlers 
 * 2) anonymouse function are not hoisted that means we can nt use the function before 
 * it is declared 
 */
