const ciutat1 = "Barcelona";
const ciutat2 = "Madrid";
const ciutat3 = "Valencia";
const ciutat4 = "Malaga";
const ciutat5 = "Cadis";
const ciutat6 = "Santander";

const arrayCiutats = [];
const arrayCiutatsModificades = [];

arrayCiutats.push(ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6);

arrayCiutats.forEach(ciutat => {
    ciutat = ciutat.replace(/a/g, '4');
    arrayCiutatsModificades.push(ciutat);
});

console.log(arrayCiutatsModificades.sort());