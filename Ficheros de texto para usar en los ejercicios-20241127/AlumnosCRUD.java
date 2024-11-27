public void altaAlumno(Alumno alumno) {
ArrayList<Alumno> listaAlumno = leerAlumnos();
listaAlumno.add(alumno);
escribirAlumnos(listaAlumno);
}

public void bajaAlumno(String dni) {
ArrayList<Alumno> listaAlumno = leerAlumnos();
for (int i = 0; i < listaAlumno.size(); i++) {
if (listaAlumno.get(i).getDni().equalsIgnoreCase(dni)) {
listaAlumno.remove(i);
}
}
escribirAlumnos(listaAlumno);
}