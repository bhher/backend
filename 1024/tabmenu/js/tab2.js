const targetLink = document.querySelectorAll('.tab_menu a');
const tabContent=document.querySelectorAll('#tabContent>div');

for(let i=0; i<targetLink.length;i++){
    targetLink[i].addEventListener('click',function(e){
        e.preventDefault(); //return false와 유사
        const orgTarget = e.target.getAttribute('href');
        //클릭한 것(e.target)
        //getAttribute 은 href, src 의 내용(value)을 읽어옴
        //#tabs1, #tabs2, #tabs3
        // alert(orgTarget);
        const tabTarget=orgTarget.replace("#","");
        //#tabs1 에서 #을 null값으로 바꾼다.-> tab1, tab2
        //console.log(tabTarget)
        for(let j=0; j<tabContent.length; j++){
            tabContent[j].style.display="none"
        }//tabContent를 모두 안보이게
        document.getElementById(tabTarget).style.display='block';
        //document.getElementById(tabs2).style.display='block';

        for(let k=0; k<targetLink.length; k++){
            targetLink[k].classList.remove('active');
            e.target.classList.add('active');//클릭한 놈에 active를 
            //넣는다. -tab_menu a -> active클래를 주어 색상변경 
        }
    }); 


}