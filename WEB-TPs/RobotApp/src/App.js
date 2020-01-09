import React,{Component} from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import Carte from './Components/Carte';
//import Header from './Components/Header';
import './App.css';

//Déclaration d'un table d'objets
const personnes = [
    {
        id:1,
        num:12121,
        name:"simo"
    },
    {
        id:2,
        num:32232,
        name:"amine"
    },
    {
        id:3,
        num:53434,
        name:"rachid"
    },
    {
        id:4,
        num:12189,
        name:"yassine"
    },
]

    function searchingFor(term){
        return function(x){
            return x.name.toLowerCase().includes(term.toLowerCase()) || !term;
        }
    }


class App extends Component {
    constructor(props){
        super(props);

        this.state = {
            personnes:personnes,
            term:''
        }

        this.searchHandler = this.searchHandler.bind(this); 

    }

    searchHandler(e){
        let t = e.target.value;
        const newState = {
            term : t
        }
        this.setState(newState);
    }
    
    render(){
        const {personnes,term} = this.state;
        return (
            <div className="container border ">
                <form className="text-center p-4 p-md-2">
                <div className="form-group text-center">
                    <h2>Search for a User</h2>
                    <input type="text" className="form-control" onChange={this.searchHandler} 
                    value={term}/>
                </div>
                </form>
                    {
                    personnes.filter(searchingFor(term)).map(pers=>
                            <div className="content border" key={pers.id}>
                            <Carte numRobot={pers.num} nameRobot={pers.name}/>
                            </div>
                        )
                    }
            </div>
        );
    }
}

export default App;