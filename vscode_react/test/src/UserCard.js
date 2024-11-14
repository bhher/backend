
function UserCard({name, age, location}){
    return(
        <div style={{border:'1px solid #ccc', padding: '10px', width: '200px' }}>
            <h2>{name}</h2>
            <p>Age: {age}</p>
            <p>Location: {location}</p>
        </div>

    );

}
export default UserCard;