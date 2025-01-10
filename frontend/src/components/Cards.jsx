import React from 'react'
import painter from '../assets/painter.avif'
import mason from '../assets/mason.jpg'
import carpenter from '../assets/carpenter.jpg'
const Cards = () => {
  return (
    <div className='w-full py-[10rem] px-4 bg-white'>
         <div className='max-w-[1240px] mx-auto grid md:grid-cols-3 gap-8'>
        <div className='w-full shadow-xl flex flex-col p-4 my-4 rounded-lg hover:scale-105 duration-300'>
            <img  className='w-20 mx-auto mt-[-3rem] bg-white'src={painter} alt='/'/>
            <h2 className='text-2xl font-bold text-center py-8'>Painter</h2>
            <p className='text-center text-4xl font-bold'>₹1000/day</p>
            <div className='text-center font-medium'>
                <p className='py-2 border-b mx-8 mt-8'>Hire a Painter</p>
                <p className='py-2 border-b mx-8'>At your ease</p>
                <p className='py-2 border-b mx-8'>At conivenient price</p>
            </div>
            <button className='bg-black w-[200px] rounded-md font-medium  mx-auto my-6 px-6 py-3 text-[#00df9a]'>Hire Now</button>
        </div>
        <div className='w-full shadow-xl flex flex-col p-4 my-4 rounded-lg hover:scale-105 duration-300'>
            <img  className='w-20 mx-auto mt-[-3rem] bg-white'src={mason} alt='/'/>
            <h2 className='text-2xl font-bold text-center py-8'>Mason</h2>
            <p className='text-center text-4xl font-bold'>₹1200/day</p>
            <div className='text-center font-medium'>
                <p className='py-2 border-b mx-8 mt-8'>Hire a Mason</p>
                <p className='py-2 border-b mx-8'>At your ease</p>
                <p className='py-2 border-b mx-8'>At conivenient price</p>
            </div>
            <button className='bg-black w-[200px] rounded-md font-medium  mx-auto my-6 px-6 py-3 text-[#00df9a]'>Hire Now</button>
        </div>
        <div className='w-full shadow-xl flex flex-col p-4 my-4 rounded-lg hover:scale-105 duration-300'>
            <img  className='w-20 mx-auto mt-[-3rem] bg-white'src={carpenter} alt='/'/>
            <h2 className='text-2xl font-bold text-center py-8'>Carpenter</h2>
            <p className='text-center text-4xl font-bold'>₹1000/day</p>
            <div className='text-center font-medium'>
                <p className='py-2 border-b mx-8 mt-8'>Hire a Carpenter</p>
                <p className='py-2 border-b mx-8'>At your ease</p>
                <p className='py-2 border-b mx-8'>At conivenient price</p>
            </div>
            <button className='bg-black w-[200px] rounded-md font-medium  mx-auto my-6 px-6 py-3 text-[#00df9a]'>Hire Now</button>
        </div>
         </div>
    </div>
  )
}

export default Cards