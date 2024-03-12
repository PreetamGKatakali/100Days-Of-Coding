/**
 * javascript difference between the callback and the promise
 */

//callback 
/**
 * callback : the functions is passed as the argument to the other functions and the functions calls
 * 
 * why we need the callback in javascript : 
 *  becuase the javascript runs the code line by line nothing but the sequentially in the top-down order
 *  but there are some cases where the code do not run sequencly 
 * 
 *  callback() make sure that the callback run's only after the task has been completed 
 *  but the callback() runs after the task has been compeleted
 */

// function display(){
//     console.log("hello world");
// }
// setTimeout(display,2000);

/**
 * here we are sending the functions name as the parameter to the setTimeout and we are calling the functions only when time after the 2sec
 */

/**
 * promise is nothing but the saying that the task is going to copleted or not 
 * 
 * the promise can take some time to excuted the code and and await for tyhe result 
 * 
 * 
 */
function mypromise(){
    return new Promise(function(resolved,rejected){
        setTimeout(()=>{
            resolved("hello world")
        },2000);
    })
}

async function display1(){
    let res=await mypromise();
    console.log(res);
    console.log("after the promise");
} 
display1()