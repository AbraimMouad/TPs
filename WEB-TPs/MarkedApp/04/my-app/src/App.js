import React from 'react';
//import Carte from './Components/Carte';
import 'bootstrap/dist/css/bootstrap.css';
import './App.css';
import marked from "marked";
import Header from './Components/Header';
import Input from './Components/Input';
import Resultat from './Components/Resultat';
class App extends React.Component {

  state = {
    textval:"test test"
  }

  handleEdite=(e)=>{
    const t = e.target.value;
    const newState = {
      textval:t
    }
    this.setState(newState);
   
  }
  

  getMarkedownText(textval){
    var rawMarkup = marked(textval);
    return{__html: rawMarkup};
  }
  
  
  render(){ 
    return(
      <div className='container'>
        
        <div className='row'>
           <div className='col-sm-12'>
             <Header />
           </div>
        </div>
        <div className='row'>
            <div className='col-sm-6'>
                <Input OnhandleEdite={(e)=>this.handleEdite(e)}/>
            </div>
            <div>
              <Resultat val={this.state.textval} />
            </div>
            
            

            </div>
        </div>
       
    );
  }
}

export default App;
