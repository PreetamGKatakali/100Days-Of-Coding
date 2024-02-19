const eat=["apple","apple1"]

console.log(eat[0]); //apple

eat[2]="orange"

console.log(eat); //["apple","apple","orange"]

//accessing the elements from the index 

eat[1]="grapes";

console.log(eat);

console.log(eat.toString());  //this coverts the array into the string

function demo(){
    return "hello";
}

const arr=["hello","world",12];
// arr[1]=demo();   //it assgine the value that is returning 

console.log(arr);

//array properties and methods 

console.log(arr.length);
console.log(arr.sort());  //it wont sort if the array has the funcstion

// we also have the push method that push the element in the array

arr.push("bye")

console.log(arr);

//adding the elementsat the higher value may lead to the array holes in the array 
arr[7]="index";
console.log(arr); //[ 12, 'hello', 'world', 'bye', <3 empty items>, 'index' ]

//javascript does not support the assoctive array 
//which means the named array arr["fristname"]="jhon"


//we have 
/**
 * typeOf which return object for the array 
 * 
 * isArray() return true or false if it is array 
 * 
 * instanceof check it is the instanceof the array
 */