/**
 * we have the javascript parse()
 */
/**
 * javascript parse is used to covert into the object
 */

let example='{"name":"John", "age":30, "city":"New York"}';
const obj=JSON.parse(example); //here we can directly pass the string here only
console.log(obj)
/**
 * we can also parse the array if the array is given in the from of the string we can convert into the array
 */
let example1='["Ford", "BMW", "Audi", "Fiat"]';
const arrobj=JSON.parse(example1);
console.log(example1)


/**
 * javascript stringify()
 * 
 * stringfiy() is used to covert the arry or object back to string
 */

const myobj={name:"hello",lastname:"world"};
var myobjstring=JSON.stringify(myobj);
console.log(myobjstring);


/** this is same for the array too  */
// function callback(){
//     setTimeout(()=>{
//         console.log("this is from the callback");
//     },2000)
// }
// async function f(fn){
//     console.log("this is the frist function line");
//     await fn();
//     console.log("this is the secound function line");
// }
// f(callback);

/**
 * promise
 */
function mypromise(){
    let promise= new Promise(function (resolved,reject){
        setTimeout(()=>{
            resolved("hello world from the promise")
        },2000)
    })
    return promise;
}
async function f1(){
    console.log("this is called frist");
    let result=await mypromise();
    console.log(result);
    console.log("this is  called after the promise");
}
f1();