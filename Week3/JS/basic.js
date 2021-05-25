//  JavaScript is a prototype-based, multi-paradigm,
//  single-threaded, dynamic language, 
//  supporting object-oriented, imperative, 
//  and declarative (e.g. functional programming) 
//  styles.
//JS is loosely-typed//variable types are assigned at runtime

var a=10;
console.log(a);
a="chaos";
console.log(a);
/*Datatypes
    6 data types that are primitives, checked the type of operator
    -undefined
    -boolean
        - true and false
        - "truthy and falsy"
            -Truthy
                -True
                -1
                -Object
            -Falsy
                - 0
                -  -0
                - undefined
                - null
                -False
                - ""
                - NaN
    -number
    -String
    -ES6
        -BigInt
        -Symbol
    
    Not primitives
    null - typeof is object
    object - typeof is object
    function - non data structure, typeof is function
    NaN -"not a number" typeof is number
*/
var b,c,d,e,f,g,h,e;
b="10";
c=true;
d={}; //object
e=null;
g=(0/0);
h=[]; //array
i=function(){};

/*console.log(7+7+7);
console.log(7+7+'7');
console.log('7'+7+7);
console.log(7+"7"+7);
*/
var myArray=[10,20,30];
myArray[4]=13;
myArray[29]="footballbat";
myArray[35]=[2,"woot",false,(0/0)];
myArray[40]=myArray;

/*
    var vs. let vs. const

        var
            
            Before ES6, the var keyword was the primary way to declare a variable in JavaScript. Variables declared
            using var are allowed to be reassigned, and their scope can be either global or local (function) level.
            Variables declared using var are also subject to something known as 'variable hoisting', which we will
            cover later on.

        let
            Since ES6, the let keyword has been the preferred way to declare variables in JS. Variables declared using
            let are also able to be reassigned, however their scope is restricted to the block that they were declared 
            in.
        
        const
            This keyword may be obvious, but in case it isn't, its purpose is to declare a variable that cannot be
            reassigned after its initialization. Variables declared using const have a scope that is restricted to
            the scope that they were declared in.
*/
/*Scopes
Global Scope
        anything declared outside of a function
        accessible anywhere    

Function scope
        Things that are declared inside a function
        use the "var" or "let" keyword
        if we leave out the "var" keyword- creates an implicit global

Block scope
    things declared in a block of code- ex loop
    use "let" keyword 
    "var" escape this scope
    
    Shadowing
        if multiple variables have the same name,
         JS will use the one that was declared the most recently.
        Variable name clashes are bad. Difficult to debug and test.
    "let" does not escape blocks, "var" does
Hoisting- moving declarations to top of scope
*/

let funstuff=function(a,b){
    var c,d;
    let e,f;
    var g=4;
    if(a>b){
        var g=3;
        let h=10;
        const j=3;
        i;

    }
}

//Functions- 3 invocations- Function Form, Constructor Form, Method Form (look at how it uses "this").

//Example of function form
function divideByZero(kitty,kat){
    console.log('hey kitty kitty');
    return (kitty+kat);
}
//NO OVERLOADING!
function crazy(at, least,three){
    console.log(at);
    console.log(least);
    console.log(three);
    console.log(arguments[5]);
}

//Objects

//object literal
let person={
    "name":"Jimmy",
    "age":74
};