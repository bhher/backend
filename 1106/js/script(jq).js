$('.sub').hide();
$('.sub').eq(0).show();

$('.m_menu>li>a').click(function(){
    var kkk= $(this).next('.sub').css('display');
    //alert(kkk);
    if(kkk =="none"){
        $('.sub').slideUp();
        $(this).next('.sub').slideDown();
    }else{
        $('.sub').slideUp();
    }
});
