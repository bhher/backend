
function UserCard(props){
    const cardStyle={
        backgroundColor : props.isActive ? 'lightgreen' : 'lightgray',
        padding: '10px',
        margin: '10px',
        borderRadius: '5px'
    }

    return(
        <div style={cardStyle}>
            <h2>이름 : {props.name}</h2>
            <p>나이 : {props.age}</p>
            <p>직업 : {props.job}</p>
            <p>상태 : {props.isActive ? "활성":"비활성"}</p>
        </div>
    );
}
//기본값 설정
UserCard.defaultProps = {
    name:"이름없음" ,
    age: "나이 정보 없음",
    job:"직업 정보 없음"
};


export default UserCard;