/**
 * write a program to auto generatePassword() 
 */
function generatePassword(){
    let pass=""
    let str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$"
    for(let i=0;i<7;i++){
        let char=Math.floor(Math.random()*str.length+1);
        pass+=str.charAt(char);
    }
    console.log(pass);
}
generatePassword()