import { useState } from 'react';
import React from "react";
import {AiOutlineClose,AiOutlineMenu} from 'react-icons/ai';
import { Link, useNavigate } from "react-router-dom";
import { Hero } from './Hero';
import Cards from './Cards';
import { Contact } from './Contact';
const Navbar = () => {
    const [nav,setnav]= useState(true)

    const handlenav = () =>{
        setnav(!nav)
    }
    const Navigate = useNavigate()

    return(
        <div>
        <div className=" flex justify-between items-center h-24 max-w-[1240px]  text-white flex-col"> 
            <h1 className="w-full text-3xl font-bold text-[#00df9a] px-4 py-6">HIRE</h1>
            <ul className="hidden md:flex absolute top-6 right-6 cursor-pointer ">
                
                <li className="p-4">Login</li>
                <li className="p-4">Signup</li>
                <li className="p-4">Jobs</li>
                <li className="p-4">Contact</li>
            </ul>
            <div onClick={handlenav} className='block md:hidden'>
                {!nav ? <AiOutlineClose size={20}/>:<AiOutlineMenu size={20}/>}
                
            </div>
            <div className={!nav ? 'fixed left-0 top-0 w-[60%] h-full border-r border-r-gray-900 bg-[#000300] ease-in-out duration-500' : 'fixed left-[-100%]'}>
            <h1 className="w-full text-3xl font-bold text-[#00df9a] m-4">HIRE</h1>

                <ul className="uppercase p-4 ">
                <li className="p-4 border-b border-gray-600"onClick={()=>Navigate("/Home")}>Home</li>
                <li className="p-4 border-b border-gray-600">Login</li>
                <li className="p-4 border-b border-gray-600">Signup</li>
                <li className="p-4 border-b border-gray-600">Jobs</li>
                <li className="p-4 ">Contact</li>
                </ul>
            </div>
        
        </div>
        <Hero/>
        <Cards/>
        <Contact/>
        </div>
        
    )
}
export default Navbar