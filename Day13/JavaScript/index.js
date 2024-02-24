/**
 * Map in the javascript 
 */

// const fruits = new Map([
//     ["apples", 500],
//     ["bananas", 300],
//     ["oranges", 200],
//     ["apples",600]    //this override the apples keys 
//   ]);
//   console.log(fruits)
  //we are passing the array and the array key and value pairs

  const fruits=new Map();
  fruits.set('apple',600);
  fruits.set('oranges',500);
  fruits.set('bananas',500);
  fruits.set('apple',800);   //overides the value 
  console.log(fruits);

  //we also have the one way of creating the value

  console.log(fruits.get('apple'));  //this is the way of getting the value

  console.log(fruits.size);

  fruits.delete('apple');
  console.log(fruits);

  //to check the key is present or not then we have to use has()

  console.log(fruits.has('oranges'));

  //for iterastions in the map we have two ways
  /**
   * 1)forEach()
   * 2)entries()
   */

  /**
   * forEach() :
   * foreach() is the method where it takes the function in the parameter and the frist 
   * function parameter is value and other is key.
   */
  fruits.forEach(function(value,key){
    console.log(value,key)
  })


  /**
   * entries() is other method for looping in the map
   */
  for(const x of fruits.entries()){
    console.log(x);
  }
  //output : ['oranges',500] ['bananas',500]