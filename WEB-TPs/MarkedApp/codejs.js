/*let note;

note=prompt("entrer votre note : ");
Number.parseInt(note);
if(note>10){
	console.log("réussit");
}else{
	console.log("redoublé");
}*/

/*let a;
let b;
let op;
a=prompt("entrer numero 1 : ");
a=Number.parseInt(a);
b=prompt("entrer numero 2 : ");
b=Number.parseInt(b);
op=prompt("entrer votre opération");


switch(op){
	case '+':
		console.log(Number.parseInt(a+b));
		break;
	case "-":
		console.log(a-b);
		break;
	default:
		console.log("erreuuuur");
}*/

/*function somme(nbr1,nbr2){
	if(Number.isInteger(nbr1) && Number.isInteger(nbr2)){
		return nbr1+nbr2


  ;
	}else{
		return NaN;
	}
}


console.log(somme("a",2));*/

/*function Vecteur(x,y) {
	this.x=x;
	this.y=y;
};

Vecteur.prototype.langueur = function(){
	return Math.sqrt(this.x**2+this.y**2);
}

Vecteur.prototype.egale=function(v){
	if(this.langueur()==v.langueur()){
		return true;
	}
	else{
		return false;
	}
}


let v1 = new Vecteur(1,1);
let v2 = new Vecteur(2,2);
console.log(v1.egale(v2));*/
/*class Vecteur {

	constructor(x,y){
		this.x=x;
		this.y=y;
	}
	langueur = function(){
			return Math.sqrt(this.x**2+this.y**2);
		}
	egale=function(v){
			if(this.langueur()==v.langueur()){
				return true;
			}
			else{
				return false;
			}
}
}
v1 = new Vecteur(1,1);
v2 = new Vecteur(2,2);
console.log(v1.egale(v2));*/

/*const elmnt = document.querySelector('.normal');
function eventclbk(e){
	console.log("clicked");
	elmnt.classList.toggle("normal");
}

elmnt.onclick=eventclbk;*/

/*var  cercle = document.querySelector('.cercle');

cercle.addEventListener('mousemove',e=>{
	console.log(e.clientX);
	console.log(e.clientY);
});*/

/*const c = document.querySelector('.circle');
console.log(c);
console.log(c.style.top);
console.log(c.style.left);

function getCord(e){
	var x=(e.clientX-25)+"px";
	var y=(e.clientY-25)+"px";
	c.style.top=y;
	c.style.left=x;
	console.log(x,y);
	return [x,y];

}
var b  = document.querySelector("body");
b.addEventListener("mousemove",getCord);*/







