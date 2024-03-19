function randomNumber(min, max) {
    return Math.random() * (max - min) + min;
}
 
console.log("Random Number between 1 and 5: ")
 
// Function call
console.log( randomNumber(1, 5) );

//guess the  number
let x=Math.floor(Math.random()*10+1);
let guess=-1;
console.log(x)
while(true){
    let number=prompt("enter the number");
    if(number==x){
        console.log("correct")
        break;
    }
    else{
        alert("try again");
    }
}