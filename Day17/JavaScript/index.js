/**
 * we have the this keyword in the javascript 
 * 
 * this : this keyword refer to the different object depending on how it is used
 * 
 * in the object method this refer to the object 
 * alone this refer to the global object 
 * in a functions this refer to the global object 
 * in the strict mode this refer to the undefined
 * in the event this refer to the element received the event
 * call() aply() bind() this refer to the any object 
 */

//this in the method 
const person = {
    firstName: "John",
    lastName : "Doe",
    id       : 5566,
    fullName : function() {
      return this.firstName + " " + this.lastName;  //this refer to the object of the method 
    }
  };

let x=this 
console.log(x);  //{} [object window]

//when we use the this keyword in the strict mode return the undefined

//this in the function default
function myfunc(){
    return this;
}
console.log(myfunc);// [Function: myfunc]

//method binding the this 
const person1 = {
    firstName  : "John",
    lastName   : "Doe",
    id         : 5566,
    myFunction : function() {
      return this;
    }
  };

  //output : [object object]

  const per={
    fullname:function(){
        return this.firstName+""+this.lastname;
    }
  }
  const per1={
    firstName:"jhon",
    lastname:"smith"
  }
  per.fullname.call(per1)
  console.log(per.fullname.call(per1));   //returnt the (jhon smith)

  //this is how the call() method works

  /**
   * we have the bind method in the javascript
   * 
   * where we use the bind to borrow a method from other object
   */
  const member={
    fristname:"smith",
    lastname:"alex",
    fullname:function(){
        return this.fristname+"-"+this.lastname;
    }
  }

  const member1={
    fristname:"jhon",
    lastname:"smith"
  }

  console.log(member.fullname.bind(member1)); // [Function: bound fullName]

  