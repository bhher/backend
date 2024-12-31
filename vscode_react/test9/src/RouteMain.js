import React from 'react';
import {About, Info, Main, Menu, Title} from "./components";
import {Route, Routes} from "react-router-dom";
import Shop from "./shop/Shop";

// 인덱스를 만들어줘야 이렇게 보기좋게 가독성 좋게 표현된다. 
// 굳이 안써도 되지만 가독성을 위해 index.js를 만들어준다.
function RouteMain() {
  return (
	<div>
	{/* 실제 우리의 경로를 지정해주는 곳.
		모든 페이지에서 공통으로 포함되는 컴포넌트나 이미지 */}
	<div className={'title'}><Title/></div>
	<div className={'info'}><Info/></div>
	<div className={'menu'}><Menu/></div>
	<div className={'main'}>
		<Routes>
			<Route path={'/'} element={<Main/>}/>

			{/* Shop */}
		
			
			{/* 디테일 페이지로 갈때 num을 파라메터값으로 넘기겠다. */}


			
			  
			{/* 그 이외 매핑이면... */}
			<Route path={'*'} element={
				<div>
					<h1>잘못된 주소 입니다. </h1>
				</div>
				}/>
		</Routes>
	</div>
</div>
  )
}

export default RouteMain
