import React from 'react'

const Techskill = ({ title, techskill }) => {
    //console.log(techskill);
    return (
        <div className='keyinterest'>
            <h3>{title}</h3>
            {techskill.map((i, index) => (

                <>
                    <li>{i.techskill}</li>
                </>
            ))}



        </div>
    )
}

export default Techskill