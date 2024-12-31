import React, { useState,useRef } from 'react';
function InputSample() {
  const [inputs, setInputs] = useState({
	id:'',
	nickname:''
  });
    const idInput = useRef();

	const { id, nickname} = inputs; //구조분해 할당 값추출
    const onChange = (e) => {
	const {value, name} = e.target; //키보드로 입력시 id인지 nickname인지 구분해서 가지고옴
	setInputs({
		...inputs, //기존의 input 객체를 복사한 뒤
		[name]:value //name키를 가진값을 value로 설정
	});	
  };
  const onReset = () => {
	setInputs({
		id:'',
		nickname:''
	});
	idInput.current.focus();
	//선택하고 싶은 돔요소인 id에서 커서가 깜빡임
  };
  return (
    <div>
      <input placeholder="아이디" onChange={onChange} value={id} name="id" ref={idInput}/>
      <input placeholder="닉네임" onChange={onChange} value={nickname} name="nickname"/>
      <button onClick={onReset}>초기화</button>
      <div>
        <b>값: </b>
        {id} ({nickname})
      </div>
    </div>
  );
}
export default InputSample;