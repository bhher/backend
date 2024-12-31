import React from 'react';
import Alert from '@mui/material/Alert';
import Stack from '@mui/material/Stack';
import AppleIcon from '@mui/icons-material/Apple';
function FourApp(props) {

    // 배열변수 선언
    const names=['뮤츠','피카츄','꼬렛','피죤','뮤','탕구리'];

    // 반복문을 변수에 저장 후 출력해도 된다.
    const nameList=names.map((name)=>(<li>{name}</li>));

    // 색상을 5개 배열로 주시고... 결과물을 div로 출력하세요.(box 로 className 주고 할것).. 가로로 5개 쭈루룩 나오도록 해 주 세 요
    const colors=['red','yellow','blue','green','orange'];

    const colorClass={
        width:'50px',
        height:'50px',
        borderRadius:'30px',
        border:'1px solid gray',
        marginLeft:'10px',
        marginTop:'10px'

    }

    const colorList=colors.map((color)=>(<div style={{backgroundColor:'{color}'}}></div>));


    return (
        <div>
            <h3 className='alert alert-secondary'>FourApp입니다.</h3>
            <Stack sx={{ width: '100%' }} spacing={2}>
                <Alert severity="error">배열연습</Alert>
                <div>
                    <h3>map 연습</h3>
                    <ul>
                        {
                            // 반복문을 직접 리턴에 주기
                        names.map((name,index)=>(<b style={{marginLeft:'10px'}}>{index}:{name}</b>))
                    }
                    </ul>
                    <ol>
                        {nameList}
                    </ol>
                </div>

            </Stack>

            <hr/>
            <Alert severity="info"><AppleIcon/> 과제_배열색상 가로로 출력하기</Alert>

                {
                    // colors.map((color)=>(<div className={'d-inline-flex'} style={{...colorClass,backgroundColor:color}}></div>))
                    colors.map((color)=>(<div className={'colorBox'} style={{backgroundColor:color}}></div>))
                }


        </div>
    );
}
export default FourApp;
