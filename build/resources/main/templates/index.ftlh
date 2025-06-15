<!DOCTYPE html>
<html lang="en">
<head>
    <title>Weather forecast app demo</title>


    <!-- Icons -->
    <link rel="shortcut icon" href="${rc.contextPath}/favicon.ico">
    <!-- END Icons -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<#--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css" integrity="sha384-3fdgwJw17Bi87e1QQ4fsLn4rUFqWw//KU0g8TvV6quvahISRewev6/EocKNuJmEw" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="jumbotron text-center">
    <h1>Weather Forecast Demo</h1>
</div>

<div class="container">
    <div class="row">
        <div class="col-sm-6">
            <h3>Location</h3>
            <p>Region: <b>${weather.location.region}</b></p>
            <p>Name: <b>${weather.location.name}</b></p>
        </div>
        <div class="col-sm-6">
            <h3>Current weather</h3>
            <p>Time: <b>${weather.current.lastUpdated}</b></p>
            <p>Temperature: <b>${weather.current.tempC} Celsius</b></p>
            <p></p>
        </div>
    </div>
</div>
<a href="https://www.weatherapi.com/" title="Free Weather API"><img src='//cdn.weatherapi.com/v4/images/weatherapi_logo.png' alt="Weather data by WeatherAPI.com" border="0"></a
</body>
</html>
