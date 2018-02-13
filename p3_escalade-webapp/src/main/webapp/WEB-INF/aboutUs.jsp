<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hadji
  Date: 09/02/2018
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Round About - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            padding-top: 54px;
        }

        @media (min-width: 992px) {
            body {
                padding-top: 56px;
            }
        }
    </style>

</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="<s:url namespace="/" action="home"/>">CliffHanger</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
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
                    <a class="nav-link" href="<s:url namespace="/" action="aboutUs"/>">About</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Page Content -->
<div class="container">

    <!-- Introduction Row -->
    <h1 class="my-4">About Us
        <small>Qui sommes-nous ?</small>
    </h1>
    <p>Passioné d'escalade, nous sommes un epetite equipe qui avons pour but de repertorier, classer, et le plus important
        faire profiter le plus grand nombre de personnes, amateurs et professionels, de sites de grimpe qui sont, pour la plupart
        tres bien documenté.<br>
        Comme certains d'entre nous sont aussi passionés d'informatique (et oui, il n'y a pas que la grimpe dans la vie), nous avons
        voulu mettre en synergie nos competence technique, au service de l'escalade.<br>
        En esperant que ce site vous donne entiere satifaction !!
    </p>
    <!-- Team Members Row -->
    <div class="row">
        <div class="col-lg-12">
            <h2 class="my-4 text-center">La Team CliffHanger</h2>
            <hr>
        </div>
        <div class="col-lg-4 col-sm-6 text-center mb-4">
            <img class="rounded-circle img-fluid d-block mx-auto" src="/membre/img/romain.jpg" alt="">
            <h3>Romain Sessa
                <small>Mentor</small>
            </h3>
            <p>C'est notre mentor. Il est la lors de probleme, petit ou grand, qu'il regle facilement.
                Merci encore Romain ;)</p>
        </div>
        <div class="col-lg-4 col-sm-6 text-center mb-4">
            <img class="rounded-circle img-fluid d-block mx-auto" src="/membre/img/Benoit.jpg" alt="">
            <h3>Benoit Aubin
                <small>Lead Dev</small>
            </h3>
            <p>Ce mec a une grande experience dans l'informatique. Il a pu, par moment,
                prendre facilement la place de Romain.</p>
        </div>
        <div class="col-lg-4 col-sm-6 text-center mb-4">
            <img class="rounded-circle img-fluid d-block mx-auto" src="/membre/img/nicolas.jpg" alt="">
            <h3>Nicolas
                <small>Dev Rocker</small>
            </h3>
            <p>Paye pas de mine, mais tres competent. Connait bien son domaine et partage la meme practise
            que moi chez Cap</p>
        </div>
        <div class="col-lg-4 col-sm-6 text-center mb-4">
            <img class="rounded-circle img-fluid d-block mx-auto" src="/membre/img/abdessamad.jpg" alt="">
            <h3>Abdessamad Marjane
                <small>Dev Matheux</small>
            </h3>
            <p>Abdessamad a su me remettre d'aplomb alors que j'etais sur le point de tout abandonner. Merci Abdessamad !! </p>
        </div>
        <div class="col-lg-4 col-sm-6 text-center mb-4">
            <img class="rounded-circle img-fluid d-block mx-auto" src="/membre/img/ben.jpg" alt="">
            <h3>Ben Hadji
                <small>Concepteur du site</small>
            </h3>
            <p>Que ce fut long, mais avec l'aide de tout ceux cité au dessus, j'ai pu atteindre cette objectif.</p>
        </div>

    </div>

</div>
<!-- /.container -->

<!-- Footer -->
<footer class="py-5 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2018</p>
    </div>
    <!-- /.container -->
</footer>

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
