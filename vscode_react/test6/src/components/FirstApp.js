import React from 'react'
import cat1 from '../image/1.jpg';
import cat2 from '../image/2.jpg';
export default function FirstApp() {
	const styleImg1={
		width:'200px',
		border:'5px solid gray',
		marginLeft:'30px',
		marginTop:'20px'
	}
	
  return (
	<div>
	  <h2 className='line2'>FirstApp components!!</h2>
	  <div style={{fontSize:'30px',marginLeft:'100px',backgroundColor:'salmon'}}>
		안녕 ~~ 오늘은 즐거운 월요일입니다.
	  </div>
	  {/* src 이미지 import */}
	  <img src={cat1}  style={styleImg1}/>
	  <img src={cat2}  style={{width:'200px',border:'3px dotted pink',marginLeft:'30px',marginTop:'20px'}}/>
	{/* public image는 직접호출 가능 */}
	<hr/>
	<h3>public image</h3>
	<img src="../image2/dish1.jpg" style={{width:"250px", marginLeft:'200px'}}/>
	
	</div>


  )
}
