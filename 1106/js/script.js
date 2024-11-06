var sub = document.querySelectorAll('.sub');
function slideUp(){
    // sub.forEach(function(item){
    //     item.style.height="0px";
    // });
    for(var i = 0; i < sub.length;i++){
        sub[i].style.height="0px";
    }
}
var menuLia = document.querySelectorAll('.m_menu>li>a');

// menuLia.forEach(function(item){
//     item.addEventListener('click',function(){
// var subHeight =   getComputedStyle(this.nextElementSibling).height;
//     //getComputedStyle는 DOM요소의 현재스타일을 가져오기 위한 메서드
//      //이 매서드를 사용하면 특정 요소에 적용된 모든 스타일 속성과
//         //그 값에 대한 정보를 얻을 수 있습니다.
//     // alert(subHeight);
//     if(subHeight === '0px'){
//         slideUp();  //현재 열려있는 sub를 모두 닫고
//         this.nextElementSibling.style.height = '108px';
//     } else{
//         this.nextElementSibling.style.height = '0px';
//     }   
//     });
// });

for(var i = 0; i < menuLia.length ; i++ ){
    menuLia[i].addEventListener('click',function(){
        var subHeight =   getComputedStyle(this.nextElementSibling).height;

    if(subHeight === '0px'){
        slideUp();  //현재 열려있는 sub를 모두 닫고
        this.nextElementSibling.style.height = '108px';
    } else{
        this.nextElementSibling.style.height = '0px';
    }   
    });
   
}
