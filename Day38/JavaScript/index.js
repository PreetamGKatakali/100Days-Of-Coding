let k = { Name: 'gfg', Country: 'India' };
let k0 = new Set()
let k1 = [1, 2, 3];
let k2 = "hello";
let k3 = null;
let k4 = undefined;
 
console.log(typeof k);
console.log(typeof k0);
console.log(typeof k1);
console.log(typeof k2);
console.log(typeof k3);
console.log(typeof k4);

//making the dynamic values 
const dynamicKey1 = 'age';
const dynamicValue1 = 25;
 
const dynamicKey2 = 'city';
const dynamicValue2 = 'Noida';
 
const dynamicObject = {
    name: 'Aman',
    [dynamicKey1]: dynamicValue1,
    [dynamicKey2]: dynamicValue2,
};
 
console.log(dynamicObject);