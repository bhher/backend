import InputSample from "./InputSample";
import React, { useState } from 'react';
import MultiInputForm from "./MultiInputForm";
function App(){
    const [likeCount, setLikeCount] = useState(0); // React 상태 관리
    return(
        <div>
           {/* <InputSample/>  */}
            {/* <div>
                <h1>좋아요 수: {likeCount}</h1>
                <button onClick={() => setLikeCount(likeCount + 1)}>좋아요</button>
            </div> */}
            <MultiInputForm/>
        </div>
    );
}

export default App;