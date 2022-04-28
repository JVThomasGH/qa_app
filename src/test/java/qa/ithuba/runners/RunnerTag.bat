ECHO OFF

ECHO "STARTING SCRIPT"
CD C:\Dev\ecom-app-serenity

mvn verify "-Dcucumber.filter.tags=@POWERBALL" serenity:aggregate