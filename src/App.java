public class App {
    public static void main(String[] args) throws Exception {
        Cpifp cpifpPruebas = new Cpifp("CPIFP Alan Turing", "632582912", "Calle Frederik Terman 3");
        Estudiantes estudiante1 = new Estudiantes("Paco López", "PL001");
        Estudiantes estudiante2 = new Estudiantes("Lucía Martín", "LM002");
        Estudiantes estudiante3 = new Estudiantes("Juan Sánchez", "JS003");

        cpifpPruebas.añadirEstudiante(estudiante1);
        cpifpPruebas.añadirEstudiante(estudiante2);
        cpifpPruebas.añadirEstudiante(estudiante3);

        Departamentos departamentoInformatica = new Departamentos("Informática", cpifpPruebas);
        Departamentos departamentoIdiomas = new Departamentos("Idiomas", cpifpPruebas);

        Profesores profesor1 = new Profesores("Rafael Rodríguez", "Inglés");
        Profesores profesor2 = new Profesores("Sandra García", "Programación");
        Profesores profesor3 = new Profesores("Juan Ramírez", "Alemán");
        Profesores profesor4 = new Profesores("María Jiménez", "Bases de datos");

        departamentoIdiomas.añadirProfesor(profesor1);
        departamentoIdiomas.añadirProfesor(profesor3);
        departamentoIdiomas.setJefe(profesor1);

        departamentoInformatica.añadirProfesor(profesor2);
        departamentoInformatica.añadirProfesor(profesor4);
        departamentoInformatica.setJefe(profesor4);

        cpifpPruebas.añadirDepartamento(departamentoIdiomas);
        cpifpPruebas.añadirDepartamento(departamentoInformatica);

        System.out.println("DATOS DEL CENTRO");
        System.out.println("=====================");
        System.out.println(cpifpPruebas);
        System.out.println();
        System.out.println(cpifpPruebas.getListaDepartamentos());
        System.out.println();
        System.out.println(cpifpPruebas.getListaEstudiantes());
    }
}
