import { useState } from "react";


function InputSample() {
	const [text, setText] = useState('');

	const onChange = (e) =>{
		setText(e.target.value);
		//console.log(text);
		//키보드로 타이핑한 값을 받아 setText(설정값)
	}
	const onReset = (e) =>{
		setText('');  //초기화버튼을 누르면 Text 빈문자열을 넣는다.
	}

	return (
	  <div>
		<input onChange={onChange} />
		<button onClick={onReset}>초기화</button>
		<div>
		  <b>값:{text} </b>
		</div>
	  </div>
	);
  }
  
  export default InputSample;