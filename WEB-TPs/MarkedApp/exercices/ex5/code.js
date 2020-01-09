
function sumAll(){
	let index;
	let som=0;
	for(index=0;index<arguments.length;++index){
		som+=arguments[index];
	}
	return som;
}

let res = document.querySelector('h1');

let somme = sumAll(1,2,3);

res.innerHTML='la somme est : '+somme;

