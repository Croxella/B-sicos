public class Operadores {
    public static void main(String[] args) {

        // ==========================================
        // 1. OPERADORES ARITMETICOS
        // Se utilizan para realizar operaciones matematicas.
        // ==========================================

        int numero1 = 10;
        int numero2 = 3;

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicacion: " + (numero1 * numero2));
        System.out.println("Division entera: " + (numero1 / numero2));
        System.out.println("Residuo: " + (numero1 % numero2));


        // ==========================================
        // 2. OPERADORES DE ASIGNACION
        // Permiten asignar o modificar el valor de una variable.
        // ==========================================

        int puntos = 10;

        puntos += 5; // Equivale a puntos = puntos + 5
        System.out.println("Puntos despues de sumar: " + puntos);

        puntos -= 3; // Equivale a puntos = puntos - 3
        System.out.println("Puntos despues de restar: " + puntos);


        // ==========================================
        // 3. OPERADORES RELACIONALES
        // Comparan valores y devuelven true o false.
        // ==========================================

        System.out.println("¿Son iguales? " + (numero1 == numero2));
        System.out.println("¿Son diferentes? " + (numero1 != numero2));
        System.out.println("¿Es mayor? " + (numero1 > numero2));
        System.out.println("¿Es menor? " + (numero1 < numero2));
        System.out.println("¿Es mayor o igual? " + (numero1 >= numero2));
        System.out.println("¿Es menor o igual? " + (numero1 <= numero2));


        // ==========================================
        // 4. OPERADORES LOGICOS
        // Permiten combinar o negar condiciones booleanas.
        // ==========================================

        int edad = 20;
        boolean tieneIdentificacion = true;

        System.out.println("Puede ingresar: "
                + (edad >= 18 && tieneIdentificacion));

        System.out.println("Cumple alguna condicion: "
                + (edad < 18 || tieneIdentificacion));

        System.out.println("Negacion: " + (!tieneIdentificacion));


        // ==========================================
        // 5. INCREMENTO Y DECREMENTO
        // Aumentan o disminuyen una unidad.
        // ==========================================

        int contador = 5;

        contador++;
        System.out.println("Incremento: " + contador);

        contador--;
        System.out.println("Decremento: " + contador);


        // ==========================================
        // 6. OPERADOR TERNARIO
        // Elige un valor dependiendo de una condicion.
        // ==========================================

        int calificacion = 85;

        String resultado = calificacion >= 70
                ? "Aprobado"
                : "Reprobado";

        System.out.println("Resultado: " + resultado);


        // ==========================================
        // 7. CONCATENACION
        // Une cadenas de texto con otros valores mediante +.
        // ==========================================

        String nombre = "Carlos";

        System.out.println("Hola, " + nombre);
        System.out.println("Tu edad es: " + edad);
    }
}