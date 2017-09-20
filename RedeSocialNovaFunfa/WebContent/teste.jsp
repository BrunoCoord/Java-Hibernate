<%@page import="entidades.Feed"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="entidades.Evento"%>
<%@page import="entidades.Grupo"%>
<%@page import="entidades.Notificacao"%>
<%@page import="java.util.Calendar"%>
<%@page import="entidades.Usuario"%>
<%@page import="java.util.HashSet" %>
<%@page import="java.util.Set" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

Usuario usuario = new Usuario();
usuario.setNome("Cordeiro");
usuario.setEmail("cordeiro@hotmail.com");
usuario.getId();



Feed feed = new Feed();
feed.setDataPostagem(Calendar.getInstance().getTime());
feed.setNumeroCompartilhamentos(15);

Notificacao notificacao = new Notificacao();
notificacao.setDataEnvio(Calendar.getInstance().getTime());
notificacao.setDestinatario("CordeiroDeDeus");
notificacao.setRemetente("Heuller");
notificacao.setUsuario(usuario);
notificacao.getUsuario();

Evento evento = new Evento();
evento.setData(Calendar.getInstance().getTime());
evento.setLocal("uow");


Grupo grupo = new Grupo();
grupo.setDataCriacao(Calendar.getInstance().getTime());
grupo.setNome("Os batutinhas");
grupo.getUsuarios();
grupo.getId();



Set<Grupo> grupos = new HashSet<>();
grupos.add(grupo);

usuario.setGrupos(grupos);
grupo.getUsuarios();
usuario.getGrupos();





EntityManagerFactory emf = Persistence.createEntityManagerFactory("Usuarios");
EntityManager em = emf.createEntityManager();

em.getTransaction().begin();
em.persist(usuario);
em.persist(grupo);
em.persist(feed);
em.persist(evento);
em.persist(notificacao);
em.getTransaction().commit();
em.close();
%>


ID Usuario: <%=usuario.getId() %> <br>
ID Grupo: <%=grupo.getId() %>
Grupo: <%=grupo.getNome() %>
Usuario: <%=notificacao.getUsuario().getNome()%>
Destinatario: <%=notificacao.getDestinatario() %>



</body>
</html>