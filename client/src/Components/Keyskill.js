import React from 'react'

const Keyskill = ({ title, keyskill }) => {
    return (
        <div className='keyinterest'>
            <h3>{title}</h3>
            {keyskill.map((i, index) => (

                <>
                    <li>{i.keyskill}</li>
                </>
            ))}



        </div>
    )
}

export default Keyskill