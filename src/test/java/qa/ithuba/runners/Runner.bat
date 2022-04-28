ECHO OFF

ECHO "STARTING SCRIPT"
CD C:\Dev\ecom-app-serenity

CALL mvn clean verify serenity:aggregate