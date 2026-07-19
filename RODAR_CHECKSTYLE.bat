@echo off
setlocal
cd /d "%~dp0"

if not exist "checkstyle-10.21.1-all.jar" (
    echo ERRO: o arquivo checkstyle-10.21.1-all.jar nao foi encontrado.
    echo Ele deve ficar na raiz do projeto, ao lado de checkstyle.xml.
    pause
    exit /b 1
)

if "%~1"=="" (
    java -jar "checkstyle-10.21.1-all.jar" -c "checkstyle.xml" "src\main\java"
) else (
    java -jar "checkstyle-10.21.1-all.jar" -c "checkstyle.xml" "src\main\java\com\workshop\%~1"
)

echo.
echo Uso para um arquivo: .\RODAR_CHECKSTYLE.bat Calculadora.java
echo Sem parametro, o script analisa todos os arquivos.
pause
