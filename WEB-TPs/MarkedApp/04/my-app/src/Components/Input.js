import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';

class Input extends React.Component {
    
    render(){
        return (
            
                <div>
                   <textarea rows={16} className='form-control' onChange={(e)=>this.props.OnhandleEdite(e)}> </textarea>
                </div>
                
        );
        
    }
}

export default Input;