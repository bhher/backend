// const targetLink = document.querySelectorAll('.tab_menu a'); //탭버튼
// const tabContent=document.querySelectorAll('#tabContent>div');
// // 탭내용

// //targetLink 배열을 forEach로 순회

// targetLink.forEach(function(link){

//     link.addEventListener('click',function(e){
//         e.preventDefault(); //링크금지
//         let orgTarget = e.target.getAttribute('href');//#tabs2
       
//         let tabTarget = orgTarget.replace("#","");//tabs2
        
//         tabContent.forEach(function(content){
//             content.style.display = "none";
//         }); //컨텐츠 내용을 모두숨김
        
//         document.getElementById(tabTarget).style.display="block";
//         //id=tab2 라는 선택자를 보이게 해라

//         targetLink.forEach(function(link2){
//             link2.classList.remove('active');
//             e.target.classList.add('active');
//         });//메뉴 색상변경
       
//     }); 

// });

$(".tab_menu a").click(function(){
    //let orgTarget = e.target.getAttribute('href');
    let orgTarget = $(this).attr('href');
    $('#tabContent > div').hide(); //컨텐츠의 내용 모두 숨김
    $(orgTarget).show();
    //$("#tabs2").show();
    $(".tab_menu a").removeClass('active');
    $(this).addClass('active');

    return false;
    // e.preventDefault();
});