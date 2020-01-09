const nbr_aleatoire = Math.random();

let nbr = document.querySelector('input');
let btn = document.querySelector('button');
let h1 = document.querySelector('h1');
let nbr_essai=0;
console.log(nbr_aleatoire);

btn.addEventListener('click',()=>{
	if(nbr.value>nbr_aleatoire){
		h1.innerHTML='le nombre est plus grand';
		nbr_essai++;

	}else {
		if(nbr.value<nbr_aleatoire){
		h1.innerHTML='le nombre est plus petit';
		nbr_essai++;
		}else{
			h1.innerHTML='le nombre est trouve , le nombre de coups est : '+nbr_essai++;
		}
	}
		
})