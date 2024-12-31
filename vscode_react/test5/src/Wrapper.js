function Wrapper({children}) {
const style5 = {
	border:'2px solid black',
	padding :  '16px',
}
	return(
		<div style={style5}>
			{children}
		</div>
	);
}
export default Wrapper;