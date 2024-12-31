import React from 'react';
import {NavLink} from "react-router-dom";

function Menu(props) {
    return (
        <ul className={'menu'}>
            {/*경로는 RouteMain 하고 맞춰줘야 합니다.*/}
            <li><NavLink to={'/'}>Home</NavLink></li>
            <li><NavLink to={'/login'}>Login</NavLink></li>
            <li><NavLink to={'/member/form'}>Member</NavLink></li>
            <li><NavLink to={'/shop/list'}>Shop</NavLink></li>
            <li><NavLink to={'/board/list'}>Board</NavLink></li>
            <li><NavLink to={'/about'}>About</NavLink></li>
        </ul>
    );
}

export default Menu;