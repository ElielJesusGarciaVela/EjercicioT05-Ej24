public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa pinta una pirámide hecha a base de números");
        int alturaIntroducida = 0;
        boolean correcto = false;
        while (!correcto) {
            try {
                alturaIntroducida = Integer
                        .parseInt(System.console().readLine("Introduzca la altura de la pirámide: "));
                correcto = true;
            } catch (NumberFormatException ex) {
                System.out.println("Introduzca un número por favor");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado");
            }
        }
        int planta = 1;
        int espaciosPorDelante = alturaIntroducida - 1;
        int i = 0;
        while (planta <= alturaIntroducida) {
            for (i = 1; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }
            for (i = 1; i < planta; i++) {
                System.out.print(i);
            }
            for (i = planta; i > 0; i--){
                System.out.print(i);
            }
            System.out.println();
            planta++;
            espaciosPorDelante--;
        }
    }
}
