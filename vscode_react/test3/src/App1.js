import "./App.css";
import { useState } from "react";
import Title from "./Title";
function App(){
 // let TITLE = "Hello korea!"
  // function ClikHAndler(){
  //    console.log("클릭했다.");
  // }
  const [title, setTitle] = useState("Hello Korea!");
  const [text, setText] = useState("");
  //첫번째 인자는 값을 저장, 두번째 인자는 이변수 값의 변화를 감지
  const ClikHAndler = ()=>{
   setTitle(prev => prev + " plus string");
   //prev는 현재 상태값
   // 이전의 상태를 기반으로 변경 될때 사용
 }
 const changeHanlder = (e) =>{
  //console.log(e.target.value);
  setText(e.target.value);
 }
const onReset = () =>{
  setText('');
}

  return (
    <div className="wrapper">
      <Title title={title} text={text} />
      <div>
        <input type="text" value={text} onChange={changeHanlder} />
        <button onClick={onReset}>초기화</button>
      </div>
    
      <button onClick={ClikHAndler}>change Title</button>
    
      {/* <div>
        <b>값:{text}</b>
      </div> */}
    </div>
  );
}
export default App;