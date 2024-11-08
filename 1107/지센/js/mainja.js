document.addEventListener('DOMContentLoaded', function () {

    var windowWidth = window.innerWidth; //화면넓이구하기

    window.addEventListener('resize',function(){
        var w = window.innerWidth;
        console.log(w);
        if(w < 850){

        }else{
            if(mobileNav.classList.contains('active')){
                mobileNav.classList.remove('active');
                transparency.classList.remove('active');
                // Handle container class if needed
                subMenus.forEach(function (subMenu) {
                    subMenu.style.display = 'none';
                });
            }
        }
    });



    var navULs = document.querySelectorAll('.nav ul');
    var mobileTab = document.querySelector('.mobile_tab');
    var transparency = document.querySelector('.transparency');
    var mobileNav = document.querySelector('.mobile_nav');
    var closeBtn = document.querySelector('.close');
    var subMenus = document.querySelectorAll('.mobile_nav .sub');

    navULs.forEach(function(navUL){
        navUL.addEventListener('mouseenter',function(){
            navUL.classList.add('over');
        });
        navUL.addEventListener('mouseleave', function () {
            navUL.classList.remove('over');
        });

    });

    mobileTab.addEventListener('click', function (e) {
        e.preventDefault();//return false와 유사
        mobileNav.classList.add('active');
        transparency.classList.add('active')      
    });


    transparency.addEventListener('click', closeMobileNav);
    closeBtn.addEventListener('click', closeMobileNav);

    function closeMobileNav(){
     
        mobileNav.classList.remove('active');
        transparency.classList.remove('active')    
        subMenus.forEach(function(subMenu){
            subMenu.computedStyleMap.display = 'none';
        });
        
    }
    var mobileNavLinks = document.querySelectorAll('.mobile_nav > ul > li > a');
    mobileNavLinks.forEach(function(link){
        link.addEventListener('click',function(e){
            e.preventDefault();
            var nextSubMenu = this.nextElementSibling;

            if(nextSubMenu.style.display=='none'|| nextSubMenu.style.display === ''){
                subMenus.forEach(function (subMenu) {
                    subMenu.style.display = 'none';
                });
                nextSubMenu.style.display = 'block';
            }else{
                nextSubMenu.style.display = 'none';
            }

        });

    });

});