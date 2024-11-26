import { useState } from "react";

function MultiInputForm(){
//useState를 사용하여 입력 상태관리
const [formData, setFormData] = useState({
    name:"",
    email:""
});
//입력값이 변경될때 상태를 업데이트하는 핸들러


const handleChange = (e) =>{
    const {name, value} = e.target; 
    //입력필드의 name(name,email)과 value(타이핑내용)가져오기
    setFormData({
        ...formData,// 이전상태복사(원래데이터를 유지)
        [name] : value,
    });

}


    const handleSubmit = (e) =>{
        e.preventDefault();
        console.log("submit date", formData);//현재상태를 콘솔출력
        alert(`Name: ${formData.name}, Email: ${formData.email}`);
    }

    return (
        <div>
            <h2>멀티 인풋폼</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>name:
                        <input 
                        type="text" 
                        name="name"
                        value={formData.name}//상태값을 input의 value로 전달 
                        onChange={handleChange} //상태 업데이트 핸들ㄹ러
                        />
                    </label>
                </div>
                <div>
                    <label>email:
                        <input 
                        type="email" 
                        name="email"
                        value={formData.email}//상태값을 input의 value로 전달 
                        onChange={handleChange} //상태 업데이트 핸들ㄹ러
                        />
                    </label>
                </div>
                <button type="submit">전송하기</button>
            </form>
            <div>
                <h3>현재 인풋창에 나오는 내용</h3>
                <p>Name: {formData.name}</p>
                <p>Email: {formData.email}</p>
            </div>
        </div>
    );
}
export default MultiInputForm;