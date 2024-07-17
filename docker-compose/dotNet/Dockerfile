# Utiliser l'image officielle .NET comme image de base pour l'exécution
FROM mcr.microsoft.com/dotnet/aspnet:7.0 AS base
WORKDIR /app
EXPOSE 80

# Utiliser l'image officielle .NET SDK pour la construction
FROM mcr.microsoft.com/dotnet/sdk:7.0 AS build
WORKDIR /src
COPY ./src/ .
RUN dotnet restore "MyDemoApp.csproj"
RUN dotnet build "MyDemoApp.csproj" -c Release -o /app/build

# Publier l'application
FROM build AS publish
RUN dotnet publish "MyDemoApp.csproj" -c Release -o /app/publish

# Utiliser l'image de base pour exécuter l'application publiée
FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "MyDemoApp.dll"]
