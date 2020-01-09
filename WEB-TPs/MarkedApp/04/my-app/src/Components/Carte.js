import React from 'react';

class Carte extends React.Component {
    
    render(){
        let url="https://robohash.org/"+this.props.Nbr;
        return (
            <div className="App">
                <img src={url} alt=""/>
                <p>{this.props.nom}</p>
                <p>{this.props.filiere}</p>
            </div>
        );
        
    }
}

export default Carte;