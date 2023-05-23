// 2. Trikampis užduotis
//     2.1 Sukurkite `trikampis` objektą pagrindinėje funkcijoje. `trikampis` turėtų turėti šiuos kintamuosius: `a`, `b`, `c`, `plotas`, `perimetras`. Priskirkite tam objekto kintamiesiems reikšmes. `a`, `b` ir `c` galite priskirti patys sugalvoję. `plotas` ir `perimetras` kintamiesiems reikšmes turėtumėte apskaičiuoti pagal `a`, `b` ir `c`
//     2.2 Išveskite tą objektą į konsolę
//     2.3 Padarykite funkciją, kuri išveda tą objektą suformatuotai į alert
//     2.4 Padarykite papildomą funkciją, kuri gauna `trikampis` kintamąjį ir palygina ar jo `plotas` reikšmė yra didesnis už `perimetras` reikšmę. Jeigu didesnė, grąžina `true`, jeigu ne, grąžina `false`
//     2.5 Sukurkite antrą `trikampis` objektą.
//     2.6 Sukurkite papildomą funkciją, kuri gauna du trikampio objektus ir palygina jų plotus. Jeigu pirmo trikampio plotas yra didesnis, grąžina `-1`, jeigu jie lygūs, grąžina `0`, jeigu antro didesnis, grąžina `1`
window.onload = function() {
    // 2.1 punktas
    let pirmasTrikampis = sukurtiTrikampi(5, 8, 4);      // vietoj 0 galima dar rašyti NaN - taip būtų tiksliau nurodoma, kad plotas nėra 0, o tiesiog jo dar nėra. pvz: let trikampis = {a: 5, b: 8, c: 5, plotas: NaN, perimetras: NaN};
    pirmasTrikampis.perimetras = apskaiciuotiTrikampioPerimetra(pirmasTrikampis);
    pirmasTrikampis.plotas = apskaiciuotiTrikampioPlota(pirmasTrikampis);

    // 2.2 punktas
    console.log(pirmasTrikampis);

    // 2.3 punkto funkcijos panaudojimas
    trikampisToAlert(pirmasTrikampis);

    // 2.4 punkto funkcijos panaudojimas
    alert("Ar pirmo trikampio plotas yra didesnis už perimetrą: " + arPlotasDidesnisUzPerimetra(pirmasTrikampis));

    // 2.5 punktas
    let antrasTrikampis = sukurtiTrikampi(8, 8, 8);

    // 2.6 punkto funkcijos panaudojimas
    alert("Kuris trikampis didesnis. Jei -1, tai pirmas, jei 0 vienodi, jei 1 tai antras: " + palygintiTrikampiuPlotus(pirmasTrikampis, antrasTrikampis));
}

/**
 * 2.1 punkto funkcija, kuri sukuria trikampio objektą ir jį grąžina
 * Užduotyje tai daryti per funkciją nereikalavo. Tačiau, trikampį darant pirma reikės priskirti jam a, b ir c reikšmes, tada apskaičiuoti perimetrą, tada plotą.
 * Tai yra trys operacijos/veiksmai, juos galima sugrupuoti į funkciją. Taip pat, reikės iš viso užduotyje sukurti du trikampius, tai šią funkciją galėsime pernaudoti bent du kartus.
 */
function sukurtiTrikampi(pirmaKrastine, antraKrastine, treciaKrastine) {
    let trikampis = {a: pirmaKrastine, b: antraKrastine, c: treciaKrastine, plotas: 0, perimetras: 0};       // vietoj 0 galima dar rašyti NaN - taip būtų tiksliau nurodoma, kad plotas nėra 0, o tiesiog jo dar nėra. pvz: let trikampis = {a: pirmaKrastine, b: antraKrastine, c: treciaKrastine, plotas: NaN, perimetras: NaN};
    trikampis.perimetras = apskaiciuotiTrikampioPerimetra(trikampis);
    trikampis.plotas = apskaiciuotiTrikampioPlota(trikampis);
    return trikampis;
}

/**
 * ŠITA FUNKCIJA YRA NEBŪTINA, TAI TIK PAVYZDYS, KAD GALIMA NAUDOTI IR PARAMETRUOSE a, b ir c
 * Javascripta supranta, jog prieš dvitaškį a yra objekto kintamasis, o po dvitaškio a jau yra funkcijos parametro a reikšmė
 * Padariau du variantus, kadangi šitas gali iš pradžių labai keistai atrodyti, vos ne prie to pačio tą patį priskiriam, bet iš tikrųjų, nors ir pavadinimai tokie patys, bet ten du skirtingi dalykai
 * @param {*} a pirmos kraštinės ilgis
 * @param {*} b antros kraštinės ilgis
 * @param {*} c trečios kraštinės ilgis
 */
function sukurtiTrikampi2(a, b, c) {
    let trikampis = {a: a, b: b, c: c, plotas: 0, perimetras: 0};
    trikampis.perimetras = apskaiciuotiTrikampioPerimetra(trikampis);
    trikampis.plotas = apskaiciuotiTrikampioPlota(trikampis);
    return trikampis;
}

/**
 * 2.1 punktui reikalinga funkcija - perimetro skaičiavimas. Taip pat šitą funkciją naudosime ir ploto skaičiavimo funkcijoje
 * Funkcija apskaičiuoja trikampio perimetrą
 * @param {*} trikampis trikampis kurio perimetrą skaičiuos
 * @returns perimetrą
 */
function apskaiciuotiTrikampioPerimetra(trikampis) {
    return trikampis.a + trikampis.b + trikampis.c;
}

/**
 * 2.1 punktui reikalinga funkcija - trikampio ploto skaičiavimas.
 * Funkcija apskaičiuoja trikampio plotą pagal Herono formulę
 * @param {*} trikampis trikampis, kurio plotą skaičiuos 
 * @returns plotas
 */
function apskaiciuotiTrikampioPlota(trikampis) {
    let p = apskaiciuotiTrikampioPerimetra(trikampis) / 2;      // pusperimetris reikalingas Herono formulei
    return Math.sqrt(p * (p - trikampis.a) * (p - trikampis.b) * (p - trikampis.c));
}

/**
 * 2.3 punkto funkcija
 * Funkcija suformatuotai išveda trikampį į alert, jog kiekvienas atskiras property (kintamasis) būtų naujoje eilutėje, bet tame pačiame alert lange
 * @param {*} trikampis trikampis, kurio info išvesime į alert
 */
function trikampisToAlert(trikampis) {
    alert(`Trikampio pirmos kraštinės ilgis: ${trikampis.a}\nTrikampio antros kraštinės ilgis: ${trikampis.b}\nTrikampio trečios kraštinės ilgis: ${trikampis.c}\nTrikampio perimetras: ${trikampis.perimetras}\nTrikampio plotas: ${trikampis.plotas}`);
}

/**
 * 2.4 punkto funkcija
 * Funkcija palygina trikampio plotą su perimetru.
 * @param {*} trikampis trikampis, kurio plotą lyginsime su perimetru
 * @returns true, jeigu plotas didesnis už perimetrą, false, jeigu ne.
 */
function arPlotasDidesnisUzPerimetra(trikampis) {
    return trikampis.plotas > trikampis.perimetras;
}

/**
 * 2.6 punkto funkcija
 * Funkcija palygina dviejų trikampių plotą
 * @param {*} t1 pirmas trikampis
 * @param {*} t2 antras trikampis
 * @returns -1, jeigu pirmo trikampio plotas didesnis. 0, jeigu plotai vienodi. 1, jeigu antro plotas didesnis.
 */
function palygintiTrikampiuPlotus(t1, t2) {
    if (t1.plotas > t2.plotas) {
        return -1
    } else if (t1.plotas == t2.plotas) {
        return 0;
    } else {
        return 1;
    }
}