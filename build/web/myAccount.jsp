<!DOCTYPE html>
<jsp:useBean id="Usuario" type="br.com.professorisidro.temspotify.model.Usuario" scope="session"/>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>.:  TemSpotify by TemAula!  :.</title>
        <meta name="description" content="Source code generated using layoutit.com">
        <meta name="author" content="LayoutIt!">

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">

    </head>
    <body>

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12" >
                    <img src="images/isidro-logo.png" class="rounded mx-auto d-block" width="150" align="center"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">

                    <h3 class="text-center">
                        Tem Spotify - Sua playlist na Web!
                    </h3>

                </div>  
            </div>
            <div class="row">
                <div class="col-md-12">

                    <h4 class="text-center">
                        Bem vindo!!! ${Usuario.nome}
                    </h4>

                </div>  
            </div>
            <div class="row" id="conteudo">
                <div class="col-md-2">
                    &nbsp; 
                </div> 
                <div class="col-md-2 botao">
                    <span class="text-center"><a  href="novamusica">Upload Musica</a></span>
                </div>
                  <div class="col-md-2 botao">
                      <span class="text-center"><a href="myplaylists">Minhas Playlists</a></span>
                  </div><!-- comment -->
                    <div class="col-md-2 botao">
                        <span class="text-center"><a href="novaplaylist">Nova Playlist</a></span>
                    </div><!-- comment -->
                   <div class="col-md-2 botao">
                       <span class="text-center"><a href="logout">Logout</a></span>
                   </div>
                <div class="col-md-2">
                    &nbsp;
                </div>


            </div>                


        </div>    


        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/scripts.js"></script>
    </body>
</html>