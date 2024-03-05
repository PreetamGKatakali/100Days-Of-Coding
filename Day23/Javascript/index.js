/**
 * callback funcstions()
 */

/**
 * in the javascript 
 * 1) callback() says that "i will call bacl later"
 * 2) a callback is a functions passed as an argument to another functions 
 * 3) this is technique allows a functions to call another functions 
 * 4) a callback functions can run after the another functions has finished 
 */

function myfunc(a,b){
    let sum=a+b;
    display(sum)
}
function display(sum){
    console.log(sum)
}
myfunc(5,5)

//we will write the callback functions to the remove the negative number

const MyNumbers=[4,1,-20,-7,5,9,-6];

const pos= removeNegative(MyNumbers,(x)=> x >= 0);

function removeNegative(MyNumbers,callback){
    const myArray=[];
    for(const x of MyNumbers){
        if(callback(x)){
            myArray.push(x);
        }
    }
    return myArray;
}
console.log(pos)





