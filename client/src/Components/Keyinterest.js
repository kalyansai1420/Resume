import React from 'react'
import '../App.css'

const Keyinterest = ({ title, interest }) => {
    // console.log(interest);
    return (
        <div className='keyinterest'>
            <h3>{title}</h3>
            {interest.map((i, index) => (

                <>
                    <li>{i.keyinterest}</li>

                </>
            ))}


        </div>
    )
}

export default Keyinterest