import React from 'react'

const List = ({ title,data }) => {

  console.log(data)
  return (

    <div className='list'>
      <h1>{title}</h1>
      {
        data.map((skill, index) => {
          <p>{skill.techskill }</p>
        })
      }
      
    </div>
  )
}

export default List