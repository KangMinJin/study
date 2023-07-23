const btn1 = document.querySelector('#btn1');
const btn2 = document.querySelector('#btn2');
const result = document.querySelector('#result');
let num = parseInt(Math.random()*100)+1;
let tryN = 0;
btn1.addEventListener('click',()=>{
    const inpN = parseInt(document.querySelector('#inp').value);
    result.textContent = '';
    if (inpN < 1 || inpN > 100){
        result.textContent = '숫자의 범위는 1에서 100까지입니다.';
    } else if (inpN === num) {
        result.textContent = `${tryN}번째 도전 : ${num}, 정답입니다!`;
        tryN = 0;
        num = parseInt(Math.random()*100)+1;
    } else if (inpN < num) {
        tryN++;
        result.textContent = `${tryN}번째 도전 : ${inpN}보다 큰 숫자입니다.`;
    } else if (inpN > num) {
        tryN++;
        result.textContent = `${tryN}번째 도전 : ${inpN}보다 작은 숫자입니다.`;
    } else{
        result.textContent = '숫자를 입력해주세요.';
    }
});
btn2.addEventListener('click', ()=>{
    num = parseInt(Math.random()*100)+1;
    result.textContent = '';
    inp.value = '';
    tryN = 0;
});