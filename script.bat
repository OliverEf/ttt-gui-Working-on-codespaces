@echo off
:: Ensure Scoop's bin is in the PATH
set "SCOOP_HOME=%USERPROFILE%\scoop"
set "PATH=%SCOOP_HOME%\shims;%PATH%"

:: Verify Java and Maven are installed via Scoop
where java >nul 2>&1
if errorlevel 1 (
    echo Java is not installed. Please install it using Scoop:
    echo     scoop install zulu19-jdk
    exit /b
)

where mvn >nul 2>&1
if errorlevel 1 (
    echo Maven is not installed. Please install it using Scoop:
    echo     scoop install maven
    exit /b
)

:: Set JAVA_HOME to ZuluFX JDK installed by Scoop
for /f "tokens=*" %%I in ('scoop prefix zulu19-jdk') do set "JAVA_HOME=%%I"
set "PATH=%JAVA_HOME%\bin;%PATH%"

:: Set MAVEN_HOME to Maven installed by Scoop
for /f "tokens=*" %%I in ('scoop prefix maven') do set "MAVEN_HOME=%%I"
set "PATH=%MAVEN_HOME%\bin;%PATH%"

:: Confirm environment variables
echo JAVA_HOME is set to: %JAVA_HOME%
echo MAVEN_HOME is set to: %MAVEN_HOME%
echo PATH includes: %JAVA_HOME%\bin and %MAVEN_HOME%\bin

:: Optional: Launch VSCode
:: start "" "C:\Path\To\VSCode\Code.exe"