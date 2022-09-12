import React from 'react'
import './Education.css'
import '../App.css'
const Education = (education) => {

  console.log(education.education)
  const educationdata = education.education
  return (
    <div className='education'>
      <h3>Education</h3>
      {educationdata.map((edu, index) =>
      (
        <div className='timeline'>
          <ul>
            <li>
              <div class="content">
                <div class="time">
                  <h5>{edu.year}</h5>
                </div>
                <p>Degree : {edu.degree}</p>
                <p>{edu.school},{edu.place}</p>
                <p>Score:{edu.score}</p>
              </div>
            </li>
          </ul>


        </div>
      ))}
    </div>
  )
}

export default Education