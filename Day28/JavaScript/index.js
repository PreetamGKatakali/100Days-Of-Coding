/**
 * javascript async and await 
 */

async function f(){
    let promise=new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("hello world");
        },2000);
    })

    let result=await promise;
    console.log(result+"this is the result")
}
function display(){
    console.log("this is in the display functions");
}
f()
display()

/**
 * the display functions run's frist and the f() functions waits for the await keywords
 * 
 * Note : await and the async should be used both
 * 
 * await waite's still the result of the promise and the  
 */
async function display1(){
    let promise=new Promise((resolved,reject)=>{
        setTimeout(()=>{
            resolved("hello world")
        },2000);

    })
    let result= await promise;
    console.log(result)
    console.log("this will run last")
}
display1()
