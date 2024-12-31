import React from 'react';
import mainimg1 from '../image/2.jpg';
import mainimg2 from '../image/3.jpg';
import mainimg3 from '../image/4.jpg';
import mainimg4 from '../image/5.jpg';

function Main(props) {
    return (
        <div>
            <img src={mainimg1} style={{width:'500px'}}/>
            <img src={mainimg2} style={{width:'500px'}}/>
            <img src={mainimg3} style={{width:'500px'}}/>
            <img src={mainimg4} style={{width:'500px'}}/>
        </div>
    );
}

export default Main;
