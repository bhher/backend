$(function(){
    
    $(window).scroll(function(){
        var sct = $(this).scrollTop();
//마우스 세로스크롤의 값(양)을 구해서 sct저장
        $('.s_Top').text(sct);
//구해진 스크롤값을 실시간으로 .s_top 반영
        if(sct >= 450 && sct <=1200){
            $('.left1').addClass('on');
        }else{
            $('.left1').removeClass('on');
        }
        //.left1 450~2000사이에 class on을 주어
        //나타나게 하고 그외에는 class on을 삭제
        //사라지게한다.

        if(sct >= 1200 && sct <=1800){
            $('.right1').addClass('on');
        }else{
            $('.right1').removeClass('on');
        }
       
        if(sct >= 2500){
            $('.s4_cover>div').addClass('active');
        }
    });

});