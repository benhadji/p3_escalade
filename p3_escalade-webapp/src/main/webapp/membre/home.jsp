<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 12/01/2018
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Bienvenue sur CliffHanger</title>

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




<!-- Page Content -->
<div class="container">

    <div class="row">

        <!-- Blog Entries Column -->
        <div class="col-md-8">

            <h1 class="my-4">Derniers post</h1>

            <!-- Blog Post -->
            <div class="card mb-4">
                <img class="card-img-top" src="/membre/img/hotshot.jpg" alt="Card image cap">
                <div class="card-body">
                    <h2 class="card-title">Hot Shot !!</h2>
                    <p class="card-text">
                        Decouvrez les plus belles photos prises lors de grimpes a travers le mondes
                    </p>
                    <a href="https://www.google.fr/search?q=climbing+wallpaper&safe=strict&rlz=1C1CHBD_frFR721FR721&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjdn5Lt_4nZAhWDyRQKHeE1BYAQ_AUICigB&biw=1600&bih=737"
                       class="btn btn-primary">Go ! </a>
                </div>
                <div class="card-footer text-muted">
                    Posted on February 3rd, 2018 by Ben Hadji for
                    <a href="https://www.openclassrooms.com/">OCR</a>
                </div>
            </div>

            <!-- Blog Post -->
            <div class="card mb-4">
                <img class="card-img-top" src="/membre/img/siteDetails.jpg" alt="Card image cap">
                <div class="card-body">
                    <h2 class="card-title">Liste des sites repertoriés</h2>
                    <p class="card-text">Ici, vous pouvez retrouver la liste, mise a jour, de tout les sites de la region, avec leurs secteurs, leurs voies et leur longueurs correspondantes..</p>
                    <a href="listeSite.action" class="btn btn-primary">Allez voir &rarr;</a>
                </div>
                <div class="card-footer text-muted">
                    Posted on February 2nd, 2018
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
                            <input type="text" name="nom" class="form-control" placeholder="Search for..."/>
                            <span class="input-group-btn">
                                    <button class="btn btn-secondary" type="submit">Go!</button>
                                </span>
                        </div>


                        <div class="row">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="site" name="yourSearchItem" id="idSite"/>
                                <label class="form-check-label" for="idSite">Site</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="secteur" name="yourSearchItem" id="idSecteur"/>
                                <label class="form-check-label" for="idSecteur">Secteur</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="voie" name="yourSearchItem" id="idVoie"/>
                                <label class="form-check-label" for="idVoie">Voie</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="longueur" name="yourSearchItem" id="idLongueur"/>
                                <label class="form-check-label" for="idLongueur">Longueur</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" value="topo" name="yourSearchItem" id="topoo"/>
                                <label class="form-check-label" for="topoo">Topo</label>
                            </div>
                        </div>

                    </s:form>

                </div>
            </div>

        </div>

    </div>
    <!-- /.row -->

</div>
<!-- /.container -->

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
