import React from 'react'
import '../App.css';




const Header = (profile) => {

    // const profiledata = props
    const profiledata = profile.profile;

    return (
        <div className='header'>
            {profiledata.map((pro, index) =>
            (
                <>
                    <div key={index} className="header_left">
                        <h2>{pro.name}</h2>
                    </div>
                    <div className="header_right">
                        <a href="mailto:saikalyan.maram@gmail.com">
                            Email : { pro.email}
                        </a>
                        <a href="tel:+917337356899">
                            Ph    : { pro.mobile}
                        </a>
                        <a href="#">
                            Url : { pro.url}
                        </a>
                    </div>
                </>
            )
            )}





           

        </div>
    )
}

export default Header