/**
 * Javascript 
 * 
 * Heap :- Objects are allocated in the heap area.
 * 
 * Stack :- This is represents the single threaded provided for the javascript code excution.
 * 
 * Browser api:- these are nothing but the xpose data from the browser in the surrounding computer env
 * these are not a part of the javascript language ,rather they are built on the top of the core javascript.
 */

/**
 * As we have learnt the javscript functions 
 * we wil understand how the stack call and the event loop works 
 */
function main(){
    console.log('A');
    setTimeout(()=>{
        console.log('B');
    },0)
    console.log('C');
}
main()
/**
 * working :-
 * 
 * here we have the two console statments between we have the setTimeout functions 
 * 
 * 1) Frist we javascript call the main function into the queue and it is loaded inside the stack 
 * 
 * 2) And the console.log('A') has been excuted in to the stack 
 * 
 * 3) And setTimeout() fun is pushed into the stack and setTimeout() is used by the Browser Api
 *    to delay the callback()
 * 
 * 4) And the console.log('C') is pushed into the stack and mean while the setTimeout() fun is running inside the browser API()
 *    and the console.log('C') is excuted and printed 
 * 
 * 5) And the received the callback() of the setTimeout and print the console.log('B').
 *    this is printed last because setTimeout() has the delay of 0s.
 */