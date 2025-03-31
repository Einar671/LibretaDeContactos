package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
   //EL CODIGO FUNCIONA DE MANERA CORRECTA Y NO TIENE ALGUN FALLO
    // COMMIT DE ISRAEL ORELLANA A EINAR KAALHUS
    // No sea mentiroso Israel, el codigo no funciona
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona personap= new Persona();
        personap.setNombre("0101010");
        personap.setNombre("Juan");
        personap.setApellido("Miguel");
        personap.setDireccion("Cuenca");

        System.out.println("Ingrese el numero de personas:");
        int numeroDePersonas = sc.nextInt();
        System.out.println("Ingrese el numero de familiares:");
        int numeroDeFamiliares = sc.nextInt();
        sc.nextLine();


        Persona[] personas = new Persona[numeroDePersonas];
        Familiar[] familiares = new Familiar[numeroDeFamiliares];


        System.out.println("\n=== INGRESO DE PERSONAS ===");
        for (int i = 0; i < numeroDePersonas; i++) {
            System.out.println("\nPersona " + (i + 1) + ":");
            Persona persona = new Persona();

            System.out.print("Cédula: ");
            persona.setCedula(sc.nextLine());

            System.out.print("Nombre: ");
            persona.setNombre(sc.nextLine());

            System.out.print("Apellido: ");
            persona.setApellido(sc.nextLine());

            System.out.print("Dirección: ");
            persona.setDireccion(sc.nextLine());

            personas[i] = persona;
        }


        System.out.println("\n=== INGRESO DE FAMILIARES ===");
        for (int i = 0; i < numeroDeFamiliares; i++) {
            System.out.println("\nFamiliar " + (i + 1) + ":");
            Familiar familiar = new Familiar();


            System.out.print("Cédula: ");
            familiar.setCedula(sc.nextLine());

            System.out.print("Nombre: ");
            familiar.setNombre(sc.nextLine());

            System.out.print("Apellido: ");
            familiar.setApellido(sc.nextLine());

            System.out.print("Dirección: ");
            familiar.setDireccion(sc.nextLine());


            System.out.print("Parentesco: ");
            familiar.setParentesco(sc.nextLine());

            System.out.print("Tipo de sangre: ");
            familiar.setTipoDeSangre(sc.nextLine());

            System.out.print("Fecha de nacimiento (año mes dia, separados por espacios): ");
            int año = sc.nextInt();
            int mes = sc.nextInt();
            int dia = sc.nextInt();
            sc.nextLine();

            GregorianCalendar fechaNac = new GregorianCalendar(año, mes - 1, dia);
            familiar.setFechaDeNacimiento(fechaNac);

            familiares[i] = familiar;
        }


        System.out.println("\n=== LISTA DE PERSONAS ===");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("\nPersona " + (i + 1) + ":");
            System.out.println(personas[i].toString());
        }


        System.out.println("\n=== LISTA DE FAMILIARES ===");
        for (int i = 0; i < familiares.length; i++) {
            System.out.println("\nFamiliar " + (i + 1) + ":");
            System.out.println(familiares[i].toString());
        }
    }
}