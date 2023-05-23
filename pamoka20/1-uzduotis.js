// Užduotis 1:
// 1. Susikurkite html ir js failus. Html faile susikurkite tris pastraipas.
// 2. Susikurkite pastraipų kintamuosius js faile ir juos išveskite į konsolę.
// 3. Js faile padarykite, jog iš karto kai užkrauna puslapį:
//     3.1 pirmos pastraipos tekstą pakeičia į "Šiandien yra trečiadienis"
//     3.2 pirmos pastraipos teksto spalvą pakeičia į "blue"
//     3.3 antrai pastraipai prideda rėmelį (bet kokį, kokį pasirinksite)
//     3.4 antrai pastraipai prideda 0.5em padding'ą
//     3.5 trečiai pastraipai padarykite fono spalvą į "bisque"
//     3.6 trečiai pastraipai padarykite width  = 50%
// 4. Pabandykite išvesti pirmos pastraipos tekstą į alert langą.
// 5. Padarykite, jog trečios pastraipos tekstas yra lygus pirmų dviejų pastraipų sumai.
// P.S. Pirmai užduočiai masyvų naudoti NEREIKIA, naudokite id ir tiesiog tris atskirus kintamuosius 
window.onload = function() {
    // 2 punktas
    let p1 = document.getElementById("pastraipa1");
    let p2 = document.getElementById("pastraipa2");
    let p3 = document.getElementById("pastraipa3");
    console.log(p1);
    console.log(p2);
    console.log(p3);

    // 3.1 punktas
    p1.innerHTML = "Šiandien yra trečiadienis";
    // 3.2 punktas
    p1.style.color = "blue";
    // 3.3 punktas
    p2.style.border = "3px dashed tomato";
    // 3.4 punktas
    p2.style.padding = "0.5em";
    // 3.5 punktas
    p3.style.backgroundColor = "bisque";
    // 3.6 punktas
    p3.style.width = "50%";
    // 4 punktas
    alert(p1.innerHTML);
    // 5 punktas
    p3.innerHTML = p1.innerHTML + p2.innerHTML;
    


}

