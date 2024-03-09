/**
 * JavaScript Promises
 * 
 * javascript promises is nothing but the "i prmise the result" 
 * 
 * A promise that containes the both 
 * 1) producing the code
 * 2) consuming the code 
 * 
 * producing the code is nothing but the code that takes some time 
 * 
 * consuming the code is nothing but the code that must wait or the result 
 * 
 * 
 * The javaScript promise can be the 
 * 1)pending 
 * 2)fulfilled
 * 3)rejected
 * 
 * 
 */
let myPromise=new Promise(function(Resolved,error){
    let x=0;
    if(x==0){
        Resolved("ok");
    }
    else{
        error("throw the error")
    }
})

myPromise.then((result) => {
    console.log("you got the resolved one")    
}).catch((err) => {
    consol.log("you got the error")
}); 


//using the promise in the setimeOut()
let mypromise1=new Promise(function(resolved,error){

        setTimeout(()=>{
            console.log("hello promise")
        },3000)
  
})
mypromise1.then(()=>{
   
})

