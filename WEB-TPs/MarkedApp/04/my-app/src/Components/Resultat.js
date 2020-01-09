import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';

class Resultat extends React.Component {
    
    render(){
        return (
            
                <div>
                   {this.props.val}
                </div>
                
        );
        
    }
 }
export default Resultat;