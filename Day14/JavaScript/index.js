/**
 * In javascript we have 5 different data types 
 * 
 * 1)string
 * 2)number
 * 3)boolean 
 * 4)object
 * 5)functions 
 * 
 * 
 * There are 6 types of objects 
 * 1) object 
 * 2)Date
 * 3)Array 
 * 4)String
 * 5)Number
 * 6)Boolean
 * 
 */

/**
 * There are two types that cannot have the value
 * 1)null
 * 2)undefined
 */


/**
 * we have the type converstion in the javascript 
 * 
 * String to number or number to string 
 * Date to number or number to dates 
 * boolean to number or number to boolean 
 */
//converting the string to number 
console.log(Number("12"));
console.log(Number(""));
console.log(Number("smith"));  //NaN not a number


/**
 * we also have the other methods like 
 * Number() 
 * parseFloat()
 * parseInt()
 */

//coverting to the number to string
let x=12;
console.log(typeof String(12));
console.log(String(100+100));
console.log(x.toString());     //tostring is other method which covert the given variables to the string 

/**
 * we also have three more method to covert the number to string 
 * toExponential()
 * toFixed()
 * toPrecision()
 */

//dates to number 
let d=new Date()
console.log(Number(new Date()));
console.log(d);
console.log(d.getTime());   //other method to covert the date to number

//dates to string 
console.log(String(new Date()));
console.log(d.toString());  //other methof to covert the date to number
