import React from "react";
import Navbar from "./components/Navbar";
import { Hero } from "./components/Hero";
import { Contact } from "./components/Contact";
import Cards from "./components/Cards";
import { Route, Routes } from "react-router-dom";
import Home from "./components/Home";
import Login from "./components/Login";


function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Navbar />}></Route>
        <Route path="/Home" element={<Home/>}></Route>
        <Route path="/Login" element={<Login/>}></Route>
        
        
      </Routes>
    </div>
  );
}

export default App;
