/**
 * We will learn about the loops in the javascript 
 */

const arr=[1,2,3,4,5,6,7];

// original one for loop
// for(let i=0;i<arr.length;i++){
//     console.log(arr[i]);
// }

/**
 * we have something called as for in 
 * which loop throught the proprites of the object 
 */
for(let x in arr){     //this is loop throught the index of the array 
    console.log(x)
}

const obj={"fristname":"smith","lastname":"alex"};
for(var x in obj){      //this is loop throught the key of the objects 
    console.log(x)
}

const arr1=["hello","world"];
for(var x in arr1){    //this is loop throught the index value 
    console.log(x);
}

/**
 * we have somehthing like the for of 
 * which we loop throught the values
 */

const array=[1,"hello",2,7.7];
for(let x of array){    //loop through the value in the array 
    console.log(x);
}

const obj1={"fristname":"smith","lastname":"alex"};
for(let x of obj1){     //error object are not iterable 
    console.log(x);
}


/**
 * we have normal for loop which work for the array
 * 
 * And we have the for in loop 
 * which loop throught the property of the given array or object 
 * returns the index value or if object then returns the keys 
 * 
 * And we have the for of loop 
 * which loop throught the values of the given array 
 * returns the value in the array won't work for the objects 
 */


