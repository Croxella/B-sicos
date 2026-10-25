class TipoDeVariables {
public static void main (String[] args) {
   //Estas variables se declaran al inicio del programa y comunmente se usan para el resto del mismo, siempre y cuando sean declaradas antes de ser usadas, de no ser el caso, no se compilaran.  
  //Hay variables int,float,double,char,boolean,String y aqui hay ejemplos de cada uno.

  // int = numeros enteros, los valores int son numeros enteros, se usan en situaciones donde se necesita almacenar un valor numerico sin decimales, como por ejemplo para almacenar la edad de una persona.
    int numero = 10;
  // float = numeros decimales, los valores float son menos precisos que los valores double, se usan en situaciones donde se necesita almacenar un valor decimal con menor precision, como por ejemplo para almacenar el resultado de una operacion matematica.
    float decimal = 10.5f;
  // double = numeros decimales con mayor precision, los valores double son mas precisos que los valores float, se usan en situaciones donde se necesita almacenar un valor decimal con mayor precision, como por ejemplo para almacenar el resultado de una operacion matematica.
    double decimalGrande = 10.5;
  // char = caracteres, los caracteres se escriben entre comillas simples y se usan en situaciones donde se necesita almacenar un solo caracter - un ejemplo de uso de char es para almacenar la letra inicial de un nombre o apellido.
    char letra = 'A';
  // boolean = valores logicos, los valores booleanos solo pueden ser verdadero o falso, se usan en situaciones donde se necesita almacenar un valor que solo puede ser verdadero o falso, como por ejemplo para almacenar si un usuario esta logueado o no.
    boolean verdadero = true;
  // String = cadenas de caracteres, las cadenas de caracteres se escriben entre comillas dobles y se usan en situaciones donde se necesita almacenar una secuencia de caracteres, como por ejemplo para almacenar un nombre o una direccion de correo electronico.
    String texto = "Hola Mundo"; 

    //no todas las variables se pueden usar en todas las situaciones, por ejemplo, no se puede usar un valor booleano en una operacion matematica, ni se puede usar un valor int en una operacion de concatenacion de cadenas de caracteres. 

 
// Cuando queremos mostrar el valor de una variable junto con un texto,
// utilizamos la concatenación de cadenas mediante el operador +.
// Este operador permite unir el texto escrito entre comillas dobles
// con el valor almacenado en una variable.
//
// Para hacerlo, escribimos el nombre de la variable fuera de las comillas,
// sin necesidad de indicar nuevamente su tipo de dato.
// Java obtiene el valor de la variable y lo incorpora al texto mostrado.
System.out.println("Valor entero: " + numero);
System.out.println("Valor float: " + decimal);
System.out.println("Valor double: " + decimalGrande);
System.out.println("Variable char: " + letra);
System.out.println("Valor booleano: " + verdadero);
System.out.println("Texto (String): " + texto);

}
}