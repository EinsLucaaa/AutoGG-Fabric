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
1. Ensure Fabric Loader and Fabric API are installed for your Minecraft instance.
2. Install [Cloth Config API
   ](https://modrinth.com/mod/cloth-config) and [Mod Menu](https://modrinth.com/mod/modmenu) (required)
3. Place the downloaded or built jar into the Minecraft `mods` folder.

## Configuration
- Use the in-game Cloth Config UI if available, or edit the mod's config file in the Minecraft config folder.
- Configure monitored servers, filters and output formats via the mod settings.

## Development / Build
- Build (Windows): `gradlew.bat build`
- Built artifact: `build/libs/auto-gg-<version>.jar`
- Run with your usual Fabric development/run configuration in the IDE.

## Contributing
- Pull requests welcome. Use feature branches and include clear commit messages.
- Follow existing code style and include tests where applicable.

## License
- `CC0-1.0` 

## Contact
- GitHub: `https://github.com/EinsLucaaa/AutoGG-Fabric`