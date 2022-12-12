import React, { createContext } from 'react';
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Login from "./Login";
import Admin from "./Admin";
import User from "./User";


export const AuthContext = createContext();

function App() {
 

  return (
    <Router>
      <Routes>
        <Route exact path='/Admin' element={<Admin/>}/>
        <Route exact path='/' element={<Login/>}/>
        <Route exact path='/User' element={<User/>}/>
      </Routes>
    </Router>
  );
}

export default App;