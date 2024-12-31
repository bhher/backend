import React from 'react'
import cat6 from '../image/6.png'

export default function SecondApp() {
const catStyle={width:'200px',marginLeft:'30px'}
let helloEle = <h2 className='alert alert-info'>Hello~~</h2>

	return (
	<div>
	  <h2 className='alert alert-danger'>SecondApp 입니다.</h2>
		<img src='../image2/dish2.jpg' style={catStyle}/>
		<img src={cat6} style={catStyle}/>
		{helloEle}
		{helloEle}
		{helloEle}
		{helloEle}
		{helloEle}
	</div>
  )
}
