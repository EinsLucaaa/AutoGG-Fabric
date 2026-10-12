# AutoGG

Automatic "GG" messages after rounds — Fabric mod for Minecraft (Java, Gradle).

## Features
- Detects chat messages on configured servers
- Filter and format triggers
- Client-side processing, ModMenu and Cloth Config support

## Download
- Prebuilt releases: visit `https://github.com/EinsLucaaa/AutoGG-Fabric/releases` and download the latest `auto-gg-<version>.jar`.
- Build from source (Windows):
    1. Clone the repo: `git clone https://github.com/EinsLucaaa/AutoGG-Fabric.git`
    2. Enter project: `cd AutoGG-Fabric`
    3. Build: run `gradlew.bat build`
    4. Output jar: `build/libs/auto-gg-<version>.jar`

## Installation
The same AutoGG JAR supports Minecraft 26.1.x, 26.2.x, and 26.3.x. Requires Java 25 or newer and Fabric Loader 0.19.5 or newer.

1. Ensure Fabric Loader and Fabric API are installed for your Minecraft instance. Use the Fabric API release for your Minecraft version.
2. Install [Cloth Config API
   ](https://modrinth.com/mod/cloth-config) and [Mod Menu](https://modrinth.com/mod/modmenu) (required). Choose the Cloth Config and Mod Menu releases for your Minecraft version.
3. Place the downloaded or built jar into the Minecraft `mods` folder.

## Configuration
- Use the in-game Cloth Config UI if available, or edit the mod's config file in the Minecraft config folder.
- Configure monitored servers, filters and output formats via the mod settings.

## Development / Build
- Build (Windows): `gradlew.bat build`
- Built artifact: `build/libs/auto-gg-<version>.jar`
- The default build targets Minecraft 26.1, the oldest supported version, and produces the shared release JAR.
- Check another supported version: `./gradlew clean build -Pminecraft_version=26.2` or `./gradlew clean build -Pminecraft_version=26.3` (Windows: use `gradlew.bat`).
- CI checks compilation against all three Minecraft versions and uploads the shared JAR built against 26.1.
- Run with your usual Fabric development/run configuration in the IDE.

## Contributing
- Pull requests welcome. Use feature branches and include clear commit messages.
- Follow existing code style and include tests where applicable.

## License
- `CC0-1.0` 

## Contact
- GitHub: `https://github.com/EinsLucaaa/AutoGG-Fabric`