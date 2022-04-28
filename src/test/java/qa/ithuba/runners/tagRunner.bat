echo "STARTING SCRIPT"
CD C:\Projects\ecom-app-serenity
CALL mvn verify "-Dcucumber.filter.tags=@SportStake_Rugby" serenity:aggregate