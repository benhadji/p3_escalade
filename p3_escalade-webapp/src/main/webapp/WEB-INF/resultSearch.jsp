<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 14/01/2018
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Rechercher un spot pour grimper !!</title>


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
                    <a class="nav-link" href="<s:url namespace="/" action="home"/>">Acceuil
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                    <a class="nav-link" href="#">About</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">

    <div class="row">

        <div class="col-md-8">

            <h1 class="my-4">Recherche</h1>

            <!-- Blog Post -->
            <div class="card mb-4">
                <div class="card-body">
                    <s:if test='%{result != "" && result!=null}'>

                        <p>${ result }</p>
                        <s:if test="%{sites!=null && sites.size()!=0}">
                            <table class="table">
                                <thead class="thead-inverse">
                                <tr>
                                    <th style="width:20%;">Nom</th>
                                    <th style="width:40%;">Localisation</th>
                                    <th style="width:30%;">Nombre de secteurs</th>
                                </tr>
                                </thead>
                                <tbody>
                                <s:iterator value="sites">
                                    <tr>
                                        <s:url var="siteUrl" action="site">
                                            <s:param name="site_id"><s:property value="site_id"/></s:param>
                                        </s:url>
                                        <td><a href="${siteUrl}"><s:property value="nom"/></a></td>
                                        <td><s:property value="localisation"/></td>
                                        <td><s:property value="secteurs.size()"/></td>
                                    </tr>
                                </s:iterator>
                                </tbody>
                            </table>
                        </s:if>


                        <s:if test="%{secteurs!=null && secteurs.size()!=0}">
                            <table class="table">
                                <thead class="thead-inverse">
                                <tr>
                                    <th>Nom du Secteur</th>
                                    <th>Nom du Site correspondant</th>
                                    <th>Nombre de voies</th>
                                </tr>
                                </thead>
                                <tbody>
                                <s:iterator value="secteurs">
                                    <tr>
                                        <td><s:property value="nom"/></td>
                                        <td><s:property value="site.nom"/></td>
                                        <td><s:property value="voies.size()"/></td>
                                    </tr>
                                </s:iterator>
                                </tbody>
                            </table>
                        </s:if>

                        <s:if test="%{voies!=null && voies.size()!=0}">
                            <table class="table">
                                <thead class="thead-inverse">
                                <tr>
                                    <th>Nom de la Voie</th>
                                    <th>Nom du secteur correpondant</th>
                                    <th>Voie equipé</th>
                                    <th>Nombre de longueur</th>
                                </tr>
                                </thead>
                                <tbody>
                                <s:iterator value="voies">
                                    <tr>
                                        <td><s:property value="nom"/></td>
                                        <td><s:property value="secteur.nom"/></td>
                                        <td><s:property value="etat"/></td>
                                        <td><s:property value="longueurs.size()"/></td>
                                    </tr>
                                </s:iterator>
                                </tbody>
                            </table>
                        </s:if>

                        <s:if test="%{longueurs!=null && longueurs.size()!=0}">
                            <table class="table">
                                <thead class="thead-inverse">
                                <tr>
                                    <th>Nom de la longueur</th>
                                    <th>Nom de la voie correpondante</th>
                                    <th>Cotation</th>
                                </tr>
                                </thead>
                                <tbody>
                                <s:iterator value="longueurs">
                                    <tr>
                                        <td><s:property value="nom"/></td>
                                        <td><s:property value="voie.nom"/></td>
                                        <td><s:property value="cotation"/></td>
                                    </tr>
                                </s:iterator>
                                </tbody>
                            </table>
                        </s:if>

                        <s:if test="%{topos!=null && topos.size()!=0}">
                            <table class="table">
                                <thead class="thead-inverse">
                                <tr>
                                    <th>Nom du topo</th>
                                    <th>Nom du site correpondant</th>
                                    <th>Createur du topo</th>
                                    <th>Disponibilité</th>
                                    <th>Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                <s:iterator value="topos">
                                    <tr>
                                        <td><s:property value="nom"/></td>
                                        <td><s:property value="site.nom"/></td>
                                        <td><s:property value="utilisateur.prenom"/> <s:property
                                                value="utilisateur.nom"/></td>
                                        <s:if test="%{emprunt==true}">
                                            <td>Topo indisponible</td>
                                        </s:if>
                                        <s:else>
                                            <td>Topo disponible pour pret</td>
                                            <s:url var="topoUrl" action="borrowTopo" namespace="/membre">
                                                <s:param name="idTopo"><s:property value="id"/></s:param>
                                            </s:url>
                                            <td><a href="${topoUrl}">Reserver topo</a></td>
                                        </s:else>
                                    </tr>
                                </s:iterator>
                                </tbody>
                            </table>
                        </s:if>

                    </s:if>

                </div>
            </div>

        </div>

        <!-- Sidebar Widgets Column -->
        <div class="col-md-4">

            <!-- Search Widget -->
            <div class="card my-4">

                <h5 class="card-header">Search</h5>
                <div class="card-body">

                    <s:form action="search" namespace="/">

                        <div class="input-group">
                            <s:textfield name="nom" class="form-control" placeholder="Je recherche ..."/>
                            <span class="input-group-btn">
                                    <s:submit cssClass="btn btn-secondary" type="button"
                                              value="Rechercher" name="submit"/>
                                </span>
                        </div>


                        <div class="row">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="site" name="yourSearchItem"
                                       id="idSite"/>
                                <label class="form-check-label" for="idSite">Site</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="secteur" name="yourSearchItem"
                                       id="idSecteur"/>
                                <label class="form-check-label" for="idSecteur">Secteur</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="voie" name="yourSearchItem"
                                       id="idVoie"/>
                                <label class="form-check-label" for="idVoie">Voie</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="longueur" name="yourSearchItem"
                                       id="idLongueur"/>
                                <label class="form-check-label" for="idLongueur">Longueur</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="topo" name="yourSearchItem"
                                       id="topoo"/>
                                <label class="form-check-label" for="topoo">Topo</label>
                            </div>
                        </div>

                    </s:form>

                </div>


            </div>


        </div>


    </div>


</div>


<!-- Footer -->
<footer class="py-5 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2018</p>
    </div>
    <!-- /.container -->
</footer>


<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js"
        integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
        integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"
        integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn"
        crossorigin="anonymous"></script>


</body>
</html>
