import React, { useEffect, useState } from 'react'
import List from './List'
import base_url from '../baseUrl';
import axios from 'axios';
import Keyskill from './Keyskill';
import Techskill from './Techskill';
import Keyinterest from './Keyinterest';

const Skill = () => {


    useEffect(() => {
        getInterest();
        getTechskill();
        getKeyskill();

    }, [])
    const [techskill, setTechskill] = useState([]);
    const [keyskill, setKeyskill] = useState([]);
    const [interest, setInterest] = useState([]);

    //KeyInterest
    const getInterest = () => {
        axios.get(`${base_url}/keyinterest`,
            {
                headers: { "Access-Control-Allow-Origin": "*", 'Content-Type': 'application/json', }
            }).then(
                (response) => {
                    //console.log(response.data)
                    setInterest(response.data)
                }
                , (error) => { console.log(error) }
            );
    };

    //Keyskill
    const getKeyskill = () => {
        axios.get(`${base_url}/keyskill`,
            {
                headers: { "Access-Control-Allow-Origin": "*", 'Content-Type': 'application/json', }
            }).then(
                (response) => {
                    //console.log(response.data)
                    setKeyskill(response.data)
                }
                , (error) => { console.log(error) }
            );
    };

    //Techskill
    const getTechskill = () => {
        axios.get(`${base_url}/techskill`,
            {
                headers: { "Access-Control-Allow-Origin": "*", 'Content-Type': 'application/json', }
            }).then(
                (response) => {
                    //console.log(response.data)
                    setTechskill(response.data)
                }
                , (error) => { console.log(error) }
            );
    };

    return (
        <div className='skill'>
            <Keyskill title="Key Skill" keyskill={keyskill} />
            <Techskill title="Tech Skill" techskill={techskill} />
            <Keyinterest title="Interests" interest={interest} />
        </div>
    )
}

export default Skill