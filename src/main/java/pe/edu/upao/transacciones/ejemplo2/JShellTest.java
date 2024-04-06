package pe.edu.upao.transacciones.ejemplo2;

import jdk.jshell.JShell;

public class JShellTest {
    public static void main(String[] args) {
        JShell shell = JShell.create();

        shell.eval("int x = 5;");
        shell.eval("int y = 10;");
        shell.eval("int suma = x + y;");

        shell.eval("System.out.println(suma);");

    }
}
