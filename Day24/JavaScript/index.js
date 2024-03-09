/**
 * javascript Asynchronous
 * 
 * functions running with other functions in the paraller are called asunchronous functions 
 * 
 * A good example for the asynchronous functions in the javascript is the setTimeout() functions 
 */
//Asynchronous in the javascript 
setTimeout(display,1000);
function display(){
    console.log("hello world");
}

/**
 * in the above exaple the functions are used as the argument so we have to pass only the functions name
 * NOte : we should not pass the functionsName()
 */

//inorder to send the functionsName() 
setTimeout(function(){display();},1000);

setInterval(()=>{
    display();
},1000)

