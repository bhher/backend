import Hello from "./Hello";
import './App.css';
function App(){
  const name = "react";
  const style1 = {
    backgroundColor : 'black',
    color:'aqua',
    fontSize : 24, //기본단위 px
    padding : '1rem'//다른단위 사용 시 문자열로 선언
  }
  return(
    <div>
      {/* 주석은 화면에 보이지 않습니다. */}
      <Hello />
      <div style={style1}>{name}</div>
      <div className="gray-box"></div>
    </div>
  );
}
export default App;