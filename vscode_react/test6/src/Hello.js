import React from 'react';
// 비구조화 할당(구조분해 할당)
function Hello({color,name, isSpecial}) {
  return <div style={{color}}>
	{isSpecial ? <b>*</b>: null}
	{/* isSpecial 이 true 진한색의 별표(*) 붙여주자 */}
	안녕하세요 {name} </div>
}
Hello.defaultProps = {
	name: '이름없음'
}


export default Hello;