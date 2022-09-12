import React from 'react'
import '../App.css'
const Internship = (intership) => {

  const intershipdata = intership.intership
  return (
    <div className='internships'>

      <h3>
        Internship
      </h3>
      {intershipdata.map((int, index) => (
        <div className='intership'>
          <p> <span className='company'>{int.company}</span>| <span>{int.role}</span>  |  <span>{int.year}</span></p>
          <li>{int.work}</li>
        </div>
      ))}

    </div>
  )
}

export default Internship