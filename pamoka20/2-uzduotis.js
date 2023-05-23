// Užduotis 2
// 1. Sukurkite html ir js failus. Html faile sukurkite 1 pastraipą ir 6 mygtukus.
// 2. Js faile susikurkite pastraipai ir visiems mygtukams kintamuosius. Išveskite juos į konsolę.
// 3. Pirmam mygtukui sukurkite onclick, kad paspaudus tą mygtuką pakeistų pastraipos tekstą į "JavaScript programavimas"
// 4. Antram mygtukui sukurkite onclick, jog paspaudus tą mygtuką į alert išvestų tekstą "Svarbus pranešimas"
// 5. Trečiam mygtukui sukurkite onclick, jog paspaudus tą mygtuką leistų vartotojui įvesti tekstą per prompt ir tada pakeistų pastraipos tekstą į vartotojo įvestą tekstą.
// 6. Ketvirtam mygtukui sukurkite onclick, jog paspaudus tą mygtuką pakeistų pastraipos fono spalvą į "tomato"
// 7. Penktam mygtukui sukurkite onlick, kad paspaudus tą mygtuką, panaikintų pastraipą, t.y. jos iš pačio failo neištrintų, bet neatvaizduotų
// 8. Šeštam mygtukui sukurkite onclick, kad paspaudus tą mygtuką leistų vartotojui per prompt įvesti raidę ir patikrintų kiek tokių raidžių yra pastraipos tekste ir kiekį išvestų į alert
window.onload = function() {
    // 2 punktas
    let p = document.getElementById("pastraipa1");
    let m1 = document.getElementById("mygtukas1");
    let m2 = document.getElementById("mygtukas2");
    let m3 = document.getElementById("mygtukas3");
    let m4 = document.getElementById("mygtukas4");
    let m5 = document.getElementById("mygtukas5");
    let m6 = document.getElementById("mygtukas6");
    console.log(p);
    console.log(m1);
    console.log(m2);
    console.log(m3);
    console.log(m4);
    console.log(m5);
    console.log(m6);

    // 3 punktas
    m1.onclick = function() {
        p.innerHTML = "JavaScript programavimas";
    }

    // 4 punktas
    m2.onclick = function() {
        alert("Svarbus pranešimas");
    }

    // 5 punktas
    m3.onclick = function() {
        let naujasTekstas = prompt("Įveskite tekstą, į kurį norite pakeisti pastraipos tekstą");
        p.innerHTML = naujasTekstas;
    }

    // 6 punktas
    m4.onclick = function() {
        p.style.backgroundColor = "tomato";
    }

    // 7 punktas
    m5.onclick = function() {
        p.style.display = "none";
    }

    // 8 punktas
    m6.onclick = function() {
        let raide = prompt("Įveskite raidę, kurią norite paskaičiuoti kiek kartų kartojasi pastraipoje");
        alert(`Raidė ${raide} kartojasi pastraipoje ${kiekKartuRaidePasikartojaTekste(p.innerHTML, raide)} kartų`);
    }
}

function kiekKartuRaidePasikartojaTekste(tekstas, raide) {
    let kiekis = 0;
    for (let i = 0; i < tekstas.length; i++) {
        if (tekstas[i] == raide) {
            kiekis++;
        }
    }
    return kiekis;
}