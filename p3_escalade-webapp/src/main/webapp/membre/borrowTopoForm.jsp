<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 30/01/2018
  Time: 01:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Formulaire de pret de Topo</title>

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

    <style type="text/css">
        .welcome {
            background-color:#DDFFDD;
            border:1px solid #009900;
            width:500px;
        }
        .welcome li{
            list-style: none;
        }
    </style>
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




<div class="container">
    <h1 class="text-center">Topo : <s:property value="topo.nom"/></h1>
    <hr>
    <s:form action="borrowTopo" method="post">
        <div>
            <s:hidden name="idTopo"><s:property value="#id"/></s:hidden>
            <label for="startdate">Date de début d'emprunt</label>
            <div>
                <input type="date" name="startdate" id="startdate" required/>
                <div class="help-block with-errors"></div>
            </div>
        </div>
        <div>
            <s:fielderror fieldName="startdate" cssClass="errorMessage"/>
        </div>
        <div>
            <label for="enddate">Date de fin d'emprunt</label>
            <div>
                <input type="date" name="enddate" id="enddate" required/>
                <div class="help-block with-errors"></div>
            </div>
        </div>
        <div>
            <s:fielderror fieldName="enddate" cssClass="errorMessage"/>
        </div>
        <div>
            <s:submit value="Valider"/>
        </div>
    </s:form>

    <s:if test="hasActionMessages()">
    <div class="welcome">
        <s:actionmessage/>
    </div>
    </s:if>

</div>

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
