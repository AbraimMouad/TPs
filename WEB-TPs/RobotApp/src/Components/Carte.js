import React,{Component} from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import "./Carte.css";

class Carte extends Component {
    
    render(){
        let url = "https://robohash.org/"+this.props.numRobot;
        return(
            <div className="content m-4 p-md-2 shadow-lg p-3 mb-5 bg-white rounded">
                <img src={url} alt=""/>
                <div>
                    <h3>{this.props.nameRobot}</h3>
                </div>
            </div>
        );
    }
}

export default Carte;