import React, {useState} from 'react';
import Alert from "@mui/material/Alert";
import ThumbUpOffAltIcon from '@mui/icons-material/ThumbUpOffAlt';
import cat4 from '../image/1.jpg';
import cat5 from '../image/2.jpg';
import cat6 from '../image/3.jpg';
import cat7 from '../image/4.jpg';
import cat8 from '../image/5.jpg';

function FiveApp(props) {

    // 이미지를 배열변수에 넣기
    const imgArr=[cat4,cat5,cat6,cat7,cat8];

    // 이미지를 배열변수에 넣기(public)
    const imgArr2=['dish1','dish2','dish3','dish4','dish5'];


    return (
        <div>
            <h3 className='alert alert-danger'>FiveApp입니다.</h3>
            <Alert severity="warning"><ThumbUpOffAltIcon/></Alert>
            <h4>src의 이미지를 배열로 넣어 반복하기</h4>
            {
                imgArr.map((imgArr)=>(<img src={imgArr} style={{width:'100px'}}/>))
            }
            <h4>public 의 이미지를 배열로 넣어 반복하기 </h4>
            {
                // 예전방식
                // imgArr2.map((photo)=>(<img src={'../image2/'+photo+'.jpg'} className={'photo'}/>))

                // 리터럴방식
                imgArr2.map((photo)=>(<img className={'photo'} src={`../image2/${photo}.jpg`}/>))

            }

        </div>
    );
}

export default FiveApp;