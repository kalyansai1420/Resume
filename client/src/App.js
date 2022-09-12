import './App.css';
import React, { useEffect, useState } from 'react'
import Header from './Components/Header';
import base_url from './baseUrl';
import axios from 'axios';
import Skill from './Components/Skill';
import Education from './Components/Education';
import Internship from './Components/Internship';
import Projects from './Components/Projects';


function App() {

  useEffect(() => {

    getProfile();
    getProject();
    getEducation();
    getIntership();

  }, [])

  const [profile, setProfile] = useState([]);
  const [project, setProject] = useState([]);
  const [intership, setIntership] = useState([]);
  const [education, setEducation] = useState([]);
  
  // Profile
  const getProfile = () => {
    axios.get(`${base_url}/`,
      {
        headers: { "Access-Control-Allow-Origin": "*", 'Content-Type': 'application/json', }
      }).then(
        (response) => {
          //console.log(response.data)
          setProfile(response.data)
        }
        , (error) => { console.log(error) }
      );
  };

  //Project
  const getProject = () => {
    axios.get(`${base_url}/project`,
      {
        headers: { "Access-Control-Allow-Origin": "*", 'Content-Type': 'application/json', }
      }).then(
        (response) => {
          //console.log(response.data)
          setProject(response.data)
        }
        , (error) => { console.log(error) }
      );
  };

  //Intership
  const getIntership = () => {
    axios.get(`${base_url}/intership`,
      {
        headers: { "Access-Control-Allow-Origin": "*", 'Content-Type': 'application/json', }
      }).then(
        (response) => {
          //console.log(response.data)
          setIntership(response.data)
        }
        , (error) => { console.log(error) }
      );
  };

  //Education
  const getEducation = () => {
    axios.get(`${base_url}/education`,
      {
        headers: { "Access-Control-Allow-Origin": "*", 'Content-Type': 'application/json', }
      }).then(
        (response) => {
          //console.log(response.data)
          setEducation(response.data)
        }
        , (error) => { console.log(error) }
      );
  };

  



  return (
    <div className="app">
      <Header profile={profile} />
      <Skill />
      <Education education={education} />
      <Internship intership={intership} />
      <Projects project={project} />
    </div>
  );
}

export default App;
