// Javascript is a prototype-based, multi-paradigm,
// single-threaded, dynamic language, supporting 
// object-oriented, imperative, and declarative 
// (e.g. functional prgramming) styles.
// JS is loosley-typed (variable types assigned at runtime)

var a = 10;
console.log(a);
a = "chaos";
console.log(a);

/*
6 Datatypes are primitives, checked the type of operator
    - undefined
    - boolean
        - true and false
        - "truthy" and "falsy"
            - Truthy
                - true
                - 1
                - Object
            -Falsy
                - 0
                - -0
                - undefined
                - null
                - false
                - ""
                - NaN 
    - number 
    - String
    - ES6
Not Primitives
    - null
    - object
    - function
    - NaN 
*/

var b, c, d, e, f, g, h, e;
b = "10";
c = true;
d = {} // object
e = null;
g = (0/0);
h = []; // array
i = function(){};

var a={},
    b={key:'b'},
    c={key:'c'};

a[b]=123;
a[c]=456;

console.log(a[b]);