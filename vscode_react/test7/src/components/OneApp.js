import React, {useState} from 'react';

function OneApp(props) {

    const [number,setNumber]=useState(0);
    const numIncre=()=>{
        if (number===10){
            alert("그만 올려 ㅠㅠ");
            return;
        }
        setNumber(number+1);
    }
    const numDecre=()=>{
        if (number===0){
            alert("그만 내려 ㅠㅠ");
            return;
        }
        setNumber(number-1);
    }



    return (
        <div>
            <h3 className='alert alert-info'>OneApp입니다.</h3>
            <div className={'number'}>
                {number}
            </div>
            <button type="button" className='btn btn-info'
                    onClick={numIncre}>증가</button>
            <button type={"button"} className={'btn btn-danger'}
                    onClick={numDecre} style={{marginLeft:'10px'}}>감소</button>

        </div>
    );
}

export default OneApp;
