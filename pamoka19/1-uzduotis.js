// 1. Studentas užduotis
//     1.1 Sukurkite `studentas` objektą pagrindinėje funkcijoje. `studentas` turėtų turėti šiuos kintamuosius: `id`, `vardasPavarde`, `klase`, `metinisVidurkis`. Priskirkite tam objekto kintamiesiems reikšmes. (klasė pvz. gali būti 8d, 6c, 11a ir pnš.)
//     1.2 Išveskite tą objektą į konsolę
//     1.3 Padarykite funkciją, kuri išveda tą objektą suformatuotai į alert
//     1.4 Sukurkite papildomą funkciją, kuri patikrina ar studento `metinisVidurkis` yra didesnis už `x`. `x` funkcija gauna per parametrus - tai vidurkis, su kuriuo lyginti studento vidurkį.
//     1.5 (sudėtingesnė) Sukurkite papildomą funkciją, kuri patikrina ar studentas yra `x` klasėje. Tai jei studentas yra `6d` klasėje, o `x = 6`, tai funkcija turėtų grąžinti `true`. Jeigu studentas yra `6d` klasėje, o `x = 5`, turėtų grąžinti `false`
//     1.6 (sudėtingesnė) Sukurkite funkciją, kuri grąžina studento TIK PAVARDĘ. Darykime prielaidą, kad `vardasPavarde` kintamajame visada tekstinė reikšmė bus parašyta `Vardas Pavardė`, t.y. tarp vardo ir pavardės bus tarpas.
window.onload = function() {
    // 1.1 punktas
    let studentas = {id: 1, vardasPavarde: "Jonas Jonaitis", klase: "8c", metinisVidurkis: 7.68};

    // 1.2 punktas
    console.log(studentas);

    // 1.3 punkto funkcijos panaudojimas
    studentasToAlert(studentas);

    // 1.4 punkto funkcijos panaudojimas
    let suKokiuVidurkiuLyginti = +prompt("Įveskite metinį vidurkį su kuriuo norite palyginti studento vidurkį.");
    alert("Studento vidurkis yra didesnis už lyginamą: " + arDidesnisMetinisVidurkis(studentas, suKokiuVidurkiuLyginti));

    // 1.5 punkto funkcijos panaudojimas
    let tikrinamaKlase = +prompt("Įveskite klasę, patikrinti ar studentas mokosi toje klasėje");
    alert("Studentas mokinasi toje klasėje: " + arMokinasiKlasejeX(studentas, tikrinamaKlase));

    // 1.6 punkto funkcijos panaudojimas
    alert("Studento tik pavardė: " + grazintiPavarde(studentas));

}

/**
 * 1.3 punkto funkcija
 * Funkcija suformuoja objektą, jog jo kiekvieną iš properties (kintamųjų) išvestų į naują eilutę tame pačiame alerte.
 * @param {*} studentas studentas, kurį išvesti į alert
 */
function studentasToAlert(studentas) {
    alert(`Studento ID: ${studentas.id}\nStudento vardas ir pavardė: ${studentas.vardasPavarde}\nStudento klasė: ${studentas.klase}\nStudento metinis vidurkis: ${studentas.metinisVidurkis}`);
}

/**
 * 1.4 punkto funkcija
 * Funkcija grąžina studento metinio vidurkio palyginimą su x.
 * Šią užduotį galima daryti ir su if, if'e tikrinant ar vidurkis didesnis už x - jei taip grąžinti true, jeigu ne, tai else grąžinti false
 * Tačiau, kada tiesiog reikia palyginti skaičius, tai galima ir iš karto palyginimo rezultatą grąžinti, 
 * nes palyginimas taip pat grąžina true/false priklausomai nuo lyginamų skaičių
 * @param {*} studentas studentas, kurio vidurkį lyginsime
 * @param {*} x metinis vidurkis su kuriuo lyginame studento vidurkį
 * @returns true, jeigu studento vidurkis didesnis, false jeigu ne
 */
function arDidesnisMetinisVidurkis(studentas, x) {
    return studentas.metinisVidurkis > x;
}

/**
 * 1.5 punkto funkcija
 * Funkcija patikrina ar studentas mokinasi tam tikroje klasėje.
 * Studento klasės kintamajame yra saugojama ir klasės raidė, o tikrinama klasė bus tik skaičius.
 * Todėl pirma iš studento klasės kintamojo reikia ištraukti tik skaičius, o tada lyginant tą skaičių tekstą dar konvertuoti į skaičius.
 * @param {*} studentas studentas
 * @param {*} x tikrinama klasė. tik tai skaičius be raidės
 * @returns true, jeigu studentas mokinasi toje klasėje, false jeigu ne.
 */
function arMokinasiKlasejeX(studentas, x) {
    let i = 0;
    let klasesTikSkaiciai = "";
    while ("0123456789".includes(studentas.klase[i])) {
        klasesTikSkaiciai += studentas.klase[i];
        i++;
    }
    return +klasesTikSkaiciai == x;
}

/**
 * 1.6 punkto funkcija
 * Funkcija grąžina studento tik pavardę.
 * Kadangi darome prielaidą, kad vardas pavardė susideda visada iš formato 'vardas pavardė', t.y. vienas vardo žodis, po jo tarpas ir tada pavardė
 * Tai funkcijoje susikuriame kintamąjį arJauBuvotarpas, kuriam priskiriam false - tai bus kintamasis, kuris nurodys kada jau prasideda pavardė.
 * Kai randame tarpą, tam kintamajui priskiriame false
 * Su ciklu einame per visą vardą ir pavardę ir iš pradžių tikrinam arJauBuvoTarpas, jeigu taip - reiškias galima dėti raides po vieną į pavardės kintamąjį
 * Taip pat po to tikriname ar dabartinis simbolis yra tarpas, jeigu taip - jau galime tam kintamajui priskirti true ir toliau mūsų kitas if jau kiekvieną ciklo etapą žinos, kad galima pridėti raidę prie pavardės.
 * @param {*} studentas studentas, kurio pavardę grąžina
 * @returns pavardę
 */
function grazintiPavarde(studentas) {
    let arJauBuvoTarpas = false;
    let pavarde = "";
    for (let i = 0; i < studentas.vardasPavarde.length; i++) {
        if (arJauBuvoTarpas) {
            pavarde += studentas.vardasPavarde[i];
        }
        if (studentas.vardasPavarde[i] == " ") {
            arJauBuvoTarpas = true;
        }
    }
    return pavarde;
}