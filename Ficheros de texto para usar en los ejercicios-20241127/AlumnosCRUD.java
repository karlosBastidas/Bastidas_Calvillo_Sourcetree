public void altaAlumno(Alumno alumno) {
ArrayList<Alumno> listaAlumno = leerAlumnos();
listaAlumno.add(alumno);
escribirAlumnos(listaAlumno);
}
