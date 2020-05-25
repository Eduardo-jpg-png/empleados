package principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=0, x=0, edad, numempl, mod, r=0;
        String nombre, apellido;
        Empleado empl[] = new Empleado[5];
        do{
            numempl=0;
            op=0;
            System.out.println("Hola, escoge la opcion que desees hacer");
            System.out.println("1-Agregar empleado");
            System.out.println("2-Modificar empleado");
            System.out.println("3-Ver informacion de empleado");
            System.out.print("Opcion: ");
            op=sc.nextInt();
            switch(op){
                case 1:
                    for(x=0;x<empl.length;x++){
                        sc.nextLine();
                        System.out.println("Nombre del empleado" + " "+ (x+1));
                        nombre=sc.nextLine();
                        System.out.println("Apellido del empleado"  + " " + (x+1));
                        apellido=sc.nextLine();
                        System.out.println("Edad del empleado"  + " " +(x+1));
                        edad=sc.nextInt();
                        empl [x] = new Empleado (nombre, apellido, edad);
                    }
                break;
                case 2:
                    System.out.println("Modificar datos de empleado");
                    System.out.println("Ingresa el numero de empleado que deseas modificar");
                    mod=sc.nextInt();
                    System.out.println("Escogiste el empleado\n Los datos del empleado son: " + "Nombre: "+ " " + empl[mod].getNombre()+ " " + "Apellido: " + empl[mod].getApellido()+ " " + "Edad: " + empl[mod].getEdad());
                    sc.nextLine();
                    System.out.println("Introduce el nuevo nombre del empleado" + (mod));
                    nombre=sc.nextLine();
                    empl[mod].setNombre(nombre);
                    System.out.println("Ingresa el nuevo apellido del empleado" + (mod));
                    apellido=sc.nextLine();
                    empl[mod].setApellido(apellido);
                    System.out.println("Ingresa la nueva edad del empleado" + (mod));
                    edad=sc.nextInt();
                    System.out.println("Datos ingresados correctamente");
                    empl[mod].setEdad(edad);
                break;
                case 3:
                    System.out.println("Mostrar datos de empleado");
                    System.out.println("Pon el numero del empleado para ver su informacion");
                    numempl=sc.nextInt();
                    System.out.println("Escogiste el empleado \n Los datos del empleado son: " + "Nombre: "+ " "+ empl[numempl].getNombre()+ " " + "Apellido: " + empl[numempl].getApellido()+ " " + "Edad: " + empl[numempl].getEdad());
            }
            System.out.println("Desea seguir en el programa para modificar o ver datos de un empleado ");
            System.out.println("1-SI");
            System.out.println("2-NO");
            r=sc.nextInt();
        }while (r != 2);
    }

}
