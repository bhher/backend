import React from 'react';
function About(props) {
    return (
        <div>
            <h1>About</h1>
            <iframe
                src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12661.464004775538!2d127.0332008!3d37.499285!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357ca1c32408f9b7%3A0x4e3761a4f356d1eb!2z7IyN7Jqp6rWQ7Jyh7IS87YSw!5e0!3m2!1sko!2skr!4v1702605050651!5m2!1sko!2skr"
                width="600" height="450" style={{border:'0'}} allowFullScreen="" loading="lazy"
                referrerPolicy="no-referrer-when-downgrade"></iframe>
        </div>
    );
}

export default About;