let a="1";
let b="2";
let c = a+b;

let elem = document.querySelector('.para1');
let elem2 = document.querySelector('.para2');

elem.innerHTML=`le type de a est ${typeof(a)}  est sa valeur est ${a}/
				le type de b est ${typeof(b)}  est sa valeur est ${b}/
				le type de c est ${typeof(c)}  est sa valeur est ${c}`;

a=parseInt(a);
b=parseInt(b);
c=a+b;

elem2.innerHTML=`le type de a est ${typeof(a)}  est sa valeur est ${a}/
				le type de b est ${typeof(b)}  est sa valeur est ${b}/
				le type de c est ${typeof(c)}  est sa valeur est ${c}`;