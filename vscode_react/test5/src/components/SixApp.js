import React, {useState} from 'react';
import Alert from "@mui/material/Alert";
import MoodIcon from '@mui/icons-material/Mood';

function SixApp(props) {

    const [names,setNames]=useState(['피카츄','파이리','꼬부기','버터풀','야도란']);
    const [irum,setIrum]=useState('');

    // 추가버튼 이벤트
    const btnInsert=()=>{
        setNames(names.concat(irum)); // 배열에 irum 데이터 추가
        setIrum(''); // 입력창 irum값 초기화
    }

    // Enter 이벤트
    const textEnter=(e)=>{
        if(e.key==='Enter'){
            btnInsert();
        }
    }

    // input창에 입력이 되도록 하는 event
    const textInput=(e)=>{
        setIrum(e.target.value);
    }

    // 더블클릭시 삭제
    const dataRemove=(index)=>{
        console.log("remove:"+index);

        // 방법 1 : slice
        // setNames([
        //     ...names.slice(0,index), // 0번부터 index 까지 ..
        //     ...names.slice(index+1,names.length)
        // ]); // index번지만 빼고 잘라서 나머지를 다시 넣음.

        // 방법 2 : filter
        setNames(names.filter((item,i)=>i!==index))
		//더블클릭한 인덱스 번호를 제외한 나머지 이름으르 배열에 반환
    }


    return (
        <div>
            <h3 className='alert alert-dark'>SixApp입니다.</h3>
            <Alert severity="success"><MoodIcon/></Alert>

            {/*input 의 경우 value 값을 주는 순간 입력 조차 불가능해진다.*/}
            <input placeholder={'이름입력'} value={irum} onChange={textInput} onKeyUp={textEnter}/>
            <button type={"button"} className={'btn btn-info'} style={{marginLeft:'10px'}} onClick={btnInsert}>추가</button>
            <br/>
            <h4>이름을 더블클릭하면 삭제됩니다.</h4>
            <ul>
                {
                    names.map((name,index)=>(<li className={'data'} onDoubleClick={()=>dataRemove(index)}>{name}</li>))
                }
            </ul>
        </div>
    );
}

export default SixApp;