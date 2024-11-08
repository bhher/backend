$(function(){
    var i = 0;//클릭한 인덱스 번호
    var k = 0;//현재 인덱스 번호 current
    var repeat; //자동슬라이드 관리 변수명

    $('.pager li').on('click',click_slide);
    //pager li의 클릭기능을 켬. click_slide함수실행
    function click_slide(){
        $('.pager li').off('click');
        //실행이 중복되지 않도록 클릭기능 끔

        i = $(this).index();
        //전역변수 i에 클릭한 li의 인덱스 번호를 저장
        if(i > k){
            $('.imgs li').eq(k).css('left','0').animate({'left':'-100%'},600);
            $('.imgs li').eq(i).css('left','100%').animate({'left':'0'},600,function(){
                $('.pager li').on('click',click_slide);
            });
            //슬라이드가 끝난후에 동작 - 콜백함수
        }else if(i < k){
            $('.imgs li').eq(k).css('left','0').animate({'left':'100%'},600);
            $('.imgs li').eq(i).css('left','-100%').animate({'left':'0'},600,function(){
                $('.pager li').on('click',click_slide);
            });
        }else{
            $('.pager li').on('click',click_slide);
        }
        $(".pager li").removeClass("on").eq(i).addClass("on");
        
        k = i; 
    }

     timer();

    function timer(){
       repeat = setInterval(function(){
            i++;
            if(i == 5){
                i = 0;
            }
            $('.imgs li').eq(i-1).css('left','0').animate({'left':'-100%'},600);
            $('.imgs li').eq(i).css('left','100%').animate({'left':'0'},600);
            $(".pager li").removeClass("on").eq(i).addClass("on");
        
            k = i; 
        },3000);
    }

    $('#img_slide').mouseenter(function(){
        clearInterval(repeat);
        //.pager li에 마우스를 올렸을 때 setInterval기능을 끔.
    });
    $('#img_slide').mouseleave(function(){
        timer();
       //.pager li에 마우스를 뗐을 때 setInterval이 지정되어있는 timer실행함수를 다시 실행시킴.
    });
    $(".next").on("click", next_slide);
    $(".prev").on("click", prev_slide);

    function next_slide(){
        $(".next").off("click"); // next버튼 기능 멈춤
        $(document).off("keydown"); //키보드 사용 멈춤
        clearInterval(repeat); //자동슬라이드 멈춤

        i++;
        if(i == 5){
            i = 0;
        }
        $(".imgs li").eq(i).css("left", "100%").animate({
            "left": 0
        }, 600);
        $(".imgs li").eq(i - 1).css("left", "0%").animate({
            "left": "-100%"
        }, 600, function () {
            $(".next").on("click", next_slide);
            $(document).on("keydown", pressKey);
            timer();
        });
        $(".pager li").removeClass("on").eq(i).addClass("on");
        k = i; 

    }

    function prev_slide(){
        $(".prev").off("click"); // next버튼 기능 멈춤
        $(document).off("keydown"); //키보드 사용 멈춤
        clearInterval(repeat); //자동슬라이드 멈춤
        i--;
      
        $(".imgs li").eq(i).css("left", "-100%").animate({
            "left": 0
        }, 600);
        $(".imgs li").eq(i + 1).css("left", "0%").animate({
            "left": "100%"
        }, 600, function () {
            $(".next").on("click", next_slide);
            $(document).on("keydown", pressKey);
            timer();
        });
        if(i == -1){
            i = 4
        }
        $(".pager li").removeClass("on").eq(i).addClass("on");
        k = i; 

    }

    $(document).on("keydown", pressKey);
    //키보드의 키를 눌렀을 때 pressKey 실행함수를 실행한다.
    function pressKey(e) {
        //pressKey함수 내용 (e라는 값에 키보드의 정보를 전부 저장함.)
        if (e.keyCode == 65 || e.keyCode == 37) {
            //A || 왼쪽 화살표 키를 눌렀을 때
            prev_slide();
        } else if (e.keyCode == 68 || e.keyCode == 39) {
            //D || 오른쪽 화살표 키를 눌렀을 때
            next_slide();
        }
    }




});