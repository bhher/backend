import UserCard1 from "./UserCard1";
function UserList(){
    const users = [
        {name:"Alice", age : 30, job:"Designer", isActive: true},
        {name:"Bob", age : 22, job:"Developer", isActive: false},
        {name:"Charlie", age : 27, job:"Product Manager", isActive: true},
        {name:"Dana",  job:"Analyst", isActive: false}, // 나이 정보 없
    ]
    return (
        <div>
            <h1>사용자목록</h1>
            {users.map((user, index)=>(
            <UserCard1 key={index} name={user.name} age={user.age} job={user.job} isActive={user.isActive}/>
        ))};
        </div>
    );
}
export default UserList;
