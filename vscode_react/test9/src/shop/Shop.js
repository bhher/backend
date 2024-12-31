import React from 'react';
import {useNavigate} from "react-router-dom";

function Shop(props) {

    const navi=useNavigate(); // 이동할 수 있는 메서드

    return (
        <div style={{marginLeft:'100px'}}>
            <button type={"button"} className={'btn btn-info'} style={{width:'120px'}} onClick={()=>{
                navi("/shop/form");
            }}>상품등록</button>
            <h1>Shop 목록 출력..</h1>
        </div>
    );
}

export default Shop;