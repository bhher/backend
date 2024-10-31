$(function(){
 setTimeout(function(){
    $('.slider li .text0').addClass('on');
    $('.slider li .atext0').addClass('on');
 },1000);


var bx = $('.slider').bxSlider({
    auto:true,
    controls:false,
    pager:false,
    mode:'fade',
    pause:5000,
    onSlideBefore:function(){},
    onSlideAfter:function(){
      var k = bx.getCurrentSlide();//현재의 슬라이드 번호
      $('.slider li').find('h2').removeClass('on');
      $('.slider li').find('p').removeClass('on');
      $('.slider li .text'+k).addClass('on');
      $('.slider li .atext'+k).addClass('on');
    }
});



});