import React, { useState } from 'react'
import dog from '../image/3.jpg'

function FourthApp1() {
  // 객체처리변수
  const [inputs,setInputs]=useState({
	irum:'뽀로로',
	addr:'남극',
	age:20
});

// 3개의 공통함수
const changeData=(e)=>{
	console.log("name: "+e.target.name);
	console.log("value: "+e.target.value);

	// name.value값 얻기
	// e.target이 가지고 있는 객체 한번에 변경하기
	const {name,value}=e.target;

	// 변경
	setInputs({
		...inputs, // 기존의 멤버값을 유지해준다.
		[name]:value // 해당값만 나오고 나머지는 사라진다. 해결은 펼침연산자!
	})
}

return (
	<div>
		<h3 className={'alert alert-secondary'}>TwoApp입니다._state 를 객체변수로 받아서 테스트</h3>
		<h3>이름 : <input type={"text"} className={'form form-control'} name={'irum'} defaultValue={inputs.irum}
						onChange={changeData}/></h3>
		<h3>주소 : <input type={"text"} className={'form form-control'} name={'addr'} defaultValue={inputs.addr}
						onChange={changeData}/></h3>
		<h3>나이 : <input type={"text"} className={'form form-control'} name={'age'} defaultValue={inputs.age}
						onChange={changeData}/></h3>
		<hr/>
		<h2>이름: {inputs.irum}, {inputs["irum"]}</h2>
		<h2>주소: {inputs.addr}, {inputs["addr"]}</h2>
		<h2>니이: {inputs.age}, {inputs["age"]}</h2>

	</div>
);
  
  
}

export default FourthApp1
