import React from 'react'
import '../App.css'
const Projects = (project) => {

  console.log(project)
  const projectdata = project.project
  return (
    <div className='projects'>
      <h3>Projects</h3>
      {projectdata.map((pro, index) => (
        <div className='project'>
          <p> <span className='company'>{pro.title}</span>  | {pro.technology }</p>
          <li>{ pro.projectInfo}</li>
        </div>
      ))}
    </div>
  )
}

export default Projects