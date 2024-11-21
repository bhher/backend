import { useRef } from "react";
function User({user}){
    return(
        <div>
             <b>{user.username}</b><span>({user.email})</span>
        </div>

    );

}

function UserList1({users}){
    return (
        <div>
           {users.map(user =>(
          <User user={user} key={user.id}/>
           ))}
        </div>
    );
}
export default UserList1;