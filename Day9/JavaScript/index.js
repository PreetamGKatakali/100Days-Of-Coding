let x=[1,5,7,8,9,6,4];
console.log(x.sort());   //sort array

console.log(x.reverse())  //sort array in the reverse mananer

/**
 * we also have the toSorted() which is same as the sort() 
 * 
 * Note : the difference is toSorted() it will create the new array 
 *         while sort() will not create the new array 
 * 
 * Make sure you have the latest javascript beuase this is added in the 2023
 */
// let  y=x.toSorted();
// console.log(y);

/**
 * we also have the toReversed() which is same as the reverse()
 * 
 * Note : the difference is toReversed() will return the new array
 *         reverse() will not return the new array
 * 
 * This is also added from the 2023.

*/
// let z=s.toReversed()
// console.log(z);
console.log(x.forEach(demo)); //callback functions need to be passed

function demo(value,index,array){
    console.log(value,index,array);
}

/**
 * Now will we c how to use the map in the array
 * 
 * Note : this method will not change the original value in the array
 *        This method will create a new array
 */
let arr=[1,2,3,4,5];
const arr1=arr.map(arraysort)

function arraysort(value,index,array){
    return value*2;
}
console.log(arr1);

const arr2=arr.flatMap((x)=>x*2)  //this is the alternative for the map() this also create a new array
console.log(arr2);

const arr4=arr.filter((x)=>x>1); //this is the filter method which return the value based on the provided condistion
console.log(arr4);
//this is also one method can implement the filter method on the array
const arr5=arr.filter(test);
function test(value,index,array){
    return value>1;
}
console.log(arr5);
