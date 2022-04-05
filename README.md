# Botiga d'**Informàtica**

## Mínims:

1. els *noms* i **cognoms** dels dos ***alumnes*** que hi participen en el ~~repositori~~,
1. text en format títol de diferents nivells, així com

    1. asdfasdf

    1. asdfasdf

    1. asdfasdf
1. text en format Java,
1. text en format SQL,
1. com a mínim una imatge, que serà el diagrama UML que hàgiu dissenyat.

**To Do List**

[ ] text en format Java,

[x] text en format SQL,

## Alumnes:

* **Joan Pardo**

## Diagrama UML:

![BotigaInformatica](./img/BotigaInformatica.png)

## Codi de java per crear la classe ```Adressa```.

```java
package java;

public class Adressa {
    private String carrer;
    private String poblacio;
    private String codiPostal;
    private String pais;
    
    public Adressa(String carrer, String poblacio, String codiPostal, String pais) {
        this.carrer = carrer;
        this.poblacio = poblacio;
        this.codiPostal = codiPostal;
        this.pais = pais;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Adressa\n" + 
                "   carrer     = " + this.carrer + "\n" +
                "   codiPostal = " + this.codiPostal + "\n" + 
                "   pais       = " + this.pais + "\n" + 
                "   poblacio   = " + this.poblacio + "\n";
    }
}
```


```html
<!DOCTYPE html>
  <html lang="en">
    <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Document</title>
  </head>
  <body>
    
  </body>
</html>
```
```sql

CREATE TABLE CLIENTS (
codi_client     smallint unsigned NOT NULL AUTO_INCREMENT, 
nom_client      varchar(50) NOT NULL, 
adressa_client  varchar(200) NOT NULL, 
telefon_client  varchar(9) NOT NULL, 
correu_client  varchar(30) NOT NULL, 
    PRIMARY KEY (codi_client)
);


```
