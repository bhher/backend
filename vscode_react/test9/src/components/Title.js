import React from 'react';
import titleimg from '../image/1.jpg';

function Title(props) {
    return (
        <div>
            <img src={titleimg} style={{width:'150px'}}/>
            <b style={{fontSize:'20px',color:'pink'}}>
                React_Springboot Project
            </b>
        </div>
    );
}

export default Title;