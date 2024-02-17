/**
 * In the javascript we have the indexOf() method in the string
 */
let x="hello world";;
console.log(x.indexOf('world')); //this will return 6 becuase we are sending the world 
//but it show only index of the w letter 

console.log(x.lastIndexOf('world')); //this also return 6 

/**
 * This both the method are the same and they also return -1 when the given letter or word 
 * is not present 
 * 
 * The indexOf() will return the frist occurence of the value 
 * The LastindexOf() will return the last occurence of the value 
 * Example : 
 */

let a="hello world how are you!";
console.log(a.indexOf('w')); // output : 6
console.log(a.lastIndexOf('w')); // output : 20

/**
 * we also have the search() in the javascript 
 */
console.log(a.search('w')); //output : 6

/**
 * Note : search() and the indexof() are not same search() method can have regular expression
 */

/**
 * we also have match() in the javscript 
 */
let b="hello wOrld";
console.log(b.match("o")); //[ 'o', index: 4, input: 'hello world', groups: undefined ]
console.log(b.match(/o/)); // same output
console.log(b.match(/o/g)); // return array which containes of ['o'] becuase we have O and o
console.log(b.match(/o/gi)); // return and matches also case-insensitive


/**
 * We also have the includes method in the javascript 
 */
let p="hello world how are you";
console.log(p.includes('w')); // check weather we have w letter in the given string
console.log(p.includes('w',14)); //it checks weather it is present in the 14 positions of the given string