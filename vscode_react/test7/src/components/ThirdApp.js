import React, { useState } from 'react'

function ThirdApp() {
//상태관리를 위한 변수값
const [message ,setMessage] = useState('기본값');
const enterEvent = (e) =>{
	if(e.key ==='Enter'){
		setMessage('');
		e.target.value='';
	}
}
  return (
	<div>
	  <h3 className='alert alert-dark'>ThirApp입니다.</h3>
	  <h3 style={{color:'red'}}>{message}</h3>
	  <input className='form-control' type='text' 
	  style={{width:'300px', fontSize:'2em'}} defaultValue={message} 
	  onChange={(e) =>{
		console.log(e.target.value);
		setMessage(e.target.value);
	  }}
	  onKeyUp={enterEvent}
	  />
	</div>
  )
}

export default ThirdApp
