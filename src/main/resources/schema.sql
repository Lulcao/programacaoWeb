create table if not exists Aluno(
    id serial not null;
    nome varchar (255);
    matricula varchar (255);
    constraint pkAluno primary key (id)
);

create table if not exists Curso(
    cursoId serial not null;
    nome varchar (255);
    descricao varchar (255);
    constraint pkCurso primary key (cursoId)
);

create table if not exists Curso_Aluno (
    id_aluno serial not null,
    id_curso serial not null,
    constraint curso_aluno_id_aluno_fk foreign key (id_aluno) references Aluno(id),
    constraint curso_aluno_id_curso_fk foreign key (id_curso) references Curso(cursoId)
);