import React, { useState } from 'react';
import cat1 from '../image/1.jpg';
import cat2 from '../image/2.jpg';
import cat3 from '../image/3.jpg';
import cat4 from '../image/4.jpg';
import cat5 from '../image/5.jpg';

function ThreeApp() {
    const [phone, setPhone] = useState({ hp1: '02', hp2: '0000', hp3: '0000' });
    const [photoIndex, setPhotoIndex] = useState(1);
    const images = [cat1, cat2, cat3, cat4, cat5];

    const handlePhoneChange = (e, key) => {
        setPhone({ ...phone, [key]: e.target.value });
    };

    const handlePhotoChange = (e) => {
        setPhotoIndex(Number(e.target.value));
    };

    return (
        <div>
            <h3 className="alert alert-warning">ThreeApp입니다.</h3>
            <div className="d-inline-flex">
                <select
                    style={{ width: '100px' }}
                    className="form-control"
                    onChange={(e) => handlePhoneChange(e, 'hp1')}
                    value={phone.hp1}
                >
                    <option>010</option>
                    <option>02</option>
                    <option>031</option>
                    <option>042</option>
                    <option>051</option>
                    <option>061</option>
                </select>
                &nbsp;&nbsp;<b>-</b>&nbsp;&nbsp;
                <input
                    type="text"
                    maxLength={4}
                    className="form-control"
                    style={{ width: '120px' }}
                    placeholder="0000"
                    onChange={(e) => handlePhoneChange(e, 'hp2')}
                    value={phone.hp2}
                />
                &nbsp;&nbsp;<b>-</b>&nbsp;&nbsp;
                <input
                    type="text"
                    maxLength={4}
                    className="form-control"
                    style={{ width: '120px' }}
                    placeholder="0000"
                    onChange={(e) => handlePhoneChange(e, 'hp3')}
                    value={phone.hp3}
                />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <b>이미지 선택 :</b>&nbsp;&nbsp;
                <select
                    className="form-control"
                    style={{ width: '100px' }}
                    onChange={handlePhotoChange}
                    value={photoIndex}
                >
                    <option value="1">이미지1</option>
                    <option value="2">이미지2</option>
                    <option value="3">이미지3</option>
                    <option value="4">이미지4</option>
                    <option value="5">이미지5</option>
                </select>
            </div>
            <br />
            <br />
            <hr />
            <h1>
                {phone.hp1}-{phone.hp2}-{phone.hp3}
            </h1>
            <img
                src={images[photoIndex - 1]}
                alt={`선택된 이미지 ${photoIndex}`}
                style={{ maxWidth: '100%' }}
            />
        </div>
    );
}

export default ThreeApp;