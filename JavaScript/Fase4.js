const ciutat1 = "Barcelona";
const ciutat2 = "Madrid";
const ciutat3 = "Valencia";
const ciutat4 = "Malaga";
const ciutat5 = "Cadis";
const ciutat6 = "Santander";

const arrayCiutats = [];
arrayCiutats.push(ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6);

const arrayCiutat1 = [];
const arrayCiutat2 = [];
const arrayCiutat3 = [];
const arrayCiutat4 = [];
const arrayCiutat5 = [];
const arrayCiutat6 = [];

const array2dimensions = [
  arrayCiutat1,
  arrayCiutat2,
  arrayCiutat3,
  arrayCiutat4,
  arrayCiutat5,
  arrayCiutat6,
];

for (let i = 0; i < arrayCiutats.length; i++) {
  const nomCiutat = arrayCiutats[i];
  
  // Omplir els arrays de cada ciutat, lletra per lletra.
  [...nomCiutat].forEach((lletra) => {
    array2dimensions[i].push(lletra);
  });
}

array2dimensions.forEach(arrayCiutat => {
  arrayCiutat.reverse();
  console.log(arrayCiutat);
});
