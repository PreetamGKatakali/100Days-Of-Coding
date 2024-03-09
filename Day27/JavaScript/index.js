//understanding about the async and await functions in details

/**
 * we are using the async and await functions becuase we need to reduce the then and ctah from the promise 
 * 
 * Exampe for the async and await
 * 
 * using the await keyword inside the functions make sure tht the functison is the async functions 
 * 
 * 
 */
async function display(){
    try{
        let promise=await new Promise(function(resloved,error){
            let x=true;
            if(x!=true){
                setTimeout(()=>{
                    resloved("hello world");
                },2000);
            }
            else{
                error("error is there!")
            }
            
        })
        console.log(promise)
        
    }
    catch{
        console.log("this is the error")
    }
}

display()   

//If the x==ture then the output is the wait for the 2sec and send the resolved message
//if the x!=true then the output throe the catch error
