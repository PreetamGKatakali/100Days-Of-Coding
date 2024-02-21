/**
 * const in the array 
 */

const arr=["hello","world"];
// arr=["world"]; //error you can not do this
console.log(arr);

/**
 * Comparison Operators in the javascript
 * 
 * == equal to 
 * === equal value and equal type
 * != not equal 
 * !== not equal value or not equal type
 * > greater than 
 * <less than 
 * >= greater than equal to 
 * <= less than or equal to  
 */

/**
 * looping by using the for of 
 */
const arr1=[1,2,3,4,4,5];
for(let x of arr1){
    console.log(x);
}
console.log(arr1.length+"This is the length of the array");

/**
 * Sets in the JavaScript 
 * 
 * In the sets we cant repeate the element in the arrray
 */
const setarr=new Set(arr1);
console.log(setarr)    //this is the sortest way to remove the duplicates 

const set=new Set(["a","b","a","c"]);
console.log(set);    // this will only print the [a,b,c]
console.log(typeof set);
