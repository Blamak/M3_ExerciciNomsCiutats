let ciutat1 = "";
let ciutat2 = "";
let ciutat3 = "";
let ciutat4 = "";
let ciutat5 = "";
let ciutat6 = "";

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Introdueix sis ciutats. \nCiutat 1: ", (ciutat) => {
  ciutat1 = ciutat;
  rl.question("Ciutat 2 :", (ciutat) => {
    ciutat2 = ciutat;
    rl.question("Ciutat 3 :", (ciutat) => {
      ciutat3 = ciutat;
      rl.question("Ciutat 4 :", (ciutat) => {
        ciutat4 = ciutat;
        rl.question("Ciutat 5 :", (ciutat) => {
          ciutat5 = ciutat;
          rl.question("Ciutat 6 :", (ciutat) => {
            ciutat6 = ciutat;
            console.log(ciutat1);
            console.log(ciutat2);
            console.log(ciutat3);
            console.log(ciutat4);
            console.log(ciutat5);
            console.log(ciutat6);
            rl.close();
          });
        });
      });
    });
  });
});

