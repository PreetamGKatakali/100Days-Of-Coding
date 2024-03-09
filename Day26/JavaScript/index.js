//JavaScript Async

/**
 * async and await is easier to write the promise 
 * 
 * async makes functions to return the promise 
 * await makes functions to waite for the promise
 * 
 * 
 */

async function display(){
    return "hello";
}
console.log(display()) //promise {"hello"}

//this is the as same as
async function display1(){
    return  Promise.resolve("hello");
}
console.log(display1())


//await is used to make the funcstion pause and then wait for the promise need to be resloved


function sendPromise(){
    let promise=new Promise(function(resloved,error){
        resloved("hello world");
    })

    return promise;
}
console.log(sendPromise())

async function sendOtherPromise(){
    let promise=new Promise(function(resloved){
        setTimeout(function(){
            resloved("hello world")
        },2000);
    })
    return await promise;
}
console.log(sendOtherPromise())