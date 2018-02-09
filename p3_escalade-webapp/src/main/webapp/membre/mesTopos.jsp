<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 26/01/2018
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Mes topos</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
          integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ"
          crossorigin="anonymous">

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/blog-home.css" rel="stylesheet">

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="<s:url namespace="/" action="home"/>">CliffHanger</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="<s:url namespace="/membre" action="home"/>">Acceuil
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Participer
                        </button>

                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="<s:url namespace="/membre" action="addTopo"/>">Ajouter un Topo</a>
                            <a class="dropdown-item" href="<s:url namespace="/membre" action="addSite"/>">Ajouter un site d'escalade</a>
                            <a class="dropdown-item" href="<s:url namespace="/membre" action="addSecteur"/>">Ajouter un secteur </a>
                            <a class="dropdown-item" href="<s:url namespace="/membre" action="addVoie"/>">Ajouter une voie </a>
                            <a class="dropdown-item" href="<s:url namespace="/membre" action="addLongueur"/>">Ajouter une longueur </a>
                        </div>

                    </div>

                </li>
                <li class="nav-item">
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <s:property value="#session.sessionUtilisateur.prenom"/><br/>
                        </button>

                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton2">
                            <a class="dropdown-item" href="<s:url namespace="/membre" action="mesTopos"/>">Mes Topos</a>
                            <a class="dropdown-item" href="<s:url namespace="/membre" action="logout"/>">Se deconnecter</a>
                        </div>

                    </div>

                </li>
            </ul>
        </div>
    </div>
</nav>


<br><br>
<h2>Mes topos</h2>


<s:if test="%{mesTopos!=null && mesTopos.size()!=0}">
    <table class="table">
    <thead class="thead-inverse">
    <tr>
        <th>Nom</th>
        <th>Disponibilité</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
        <s:iterator value="mesTopos">
            <tr>
                <td><s:property value="nom"/></td>
                <s:if test="%{emprunt==true}">
                    <td>Topo deja preté</td>
                </s:if>
                <s:else>
                    <td>Topo disponible pour pret</td>
                </s:else>
                <s:url var="url" action="editTopoForm">
                    <s:param name="id"><s:property value="id"/></s:param>
                </s:url>
                <td><a href="${url}">Editer Topo</a></td>
            </tr>
        </s:iterator>
</s:if>
<s:else>
        <h4>Vous ne possedez aucun topo !</h4>
        <h3>Ajouter nouveau topo :
            <s:submit type="button" namespace="/membre" action="addTopo"/>Nouveau topo</h3>
</s:else>
    </tbody>
</table>


<!-- Footer -->
<footer class="py-5 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2018</p>
    </div>
    <!-- /.container -->
</footer>


<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>





</body>
</html>
