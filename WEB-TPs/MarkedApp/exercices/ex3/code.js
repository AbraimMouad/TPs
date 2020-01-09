var elem = document.getElementsByTagName('input');
var btn = document.querySelector('button');
var msg = document.querySelector('h2');

btn.addEventListener('click',()=>{
	if(elem[0].value==''){
		msg.innerHTML='erreur';
	
	}else{
		msg.innerHTML='les données sont envoyé';
		
	}

});