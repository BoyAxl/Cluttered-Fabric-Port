# Cluttered 3.0.3 - Unofficial Fabric 26.2.x Port

This is an unofficial Fabric port of Cluttered 3.0.3 for Minecraft 26.2.x.

## Compatibility

- Minecraft: 26.2.x
- Minecraft metadata range: `~26.2` (`>=26.2 <26.3`)
- Fabric Loader: 0.19.3 or newer
- Fabric API: 0.154.0 or newer
- Java: 25
- Loader: Fabric only

This build is not a Forge jar and is not an official upstream release.

## Included Artifacts

- `cluttered-3.0.3-26.2.x-0.1.0-fabric-unofficial.jar`
- `cluttered-3.0.3-26.2.x-0.1.0-fabric-unofficial-sources.jar`

## Highlights

- Updated the Fabric port baseline from Minecraft 26.1.x to Minecraft 26.2.x.
- Updated Fabric Loader to 0.19.3 and Fabric API to 0.154.0+26.2.
- Kept the existing Cluttered 3.0.3 content, assets, translations, recipes, storage blocks, record player support, multiblock beds, chair seating, light emission tweaks, and stonecutter coverage from the 26.1.x port.

## Testing Status

- `sh ./gradlew build` completed successfully against the 26.2 baseline.
- The test jar was placed in `/Users/axlboy/Documents/curseforge/minecraft/Instances/NetTestFabric/mods`.
- In-game testing should verify startup, creative inventory, names, models, textures, placement, storage blocks, beds, bouncy mushroom behavior, chairs, record players, lighting tweaks, recipes, and the diagnostic block gallery.

## Notes

- Shader packs are not specially integrated. Light-emitting blocks use vanilla Minecraft light emission, so shader behavior depends on the shader pack/resource-pack setup.
- This release should be labeled clearly as an unofficial Fabric port if shared.
- The project declares GNU GPL 3.0 licensing. Include or link to the matching source code when distributing this build.

## Credits

Cluttered was originally created by blake and YellowChuJelly. Huge thanks to the original creators and contributors for the mod, its art direction, assets, models, textures, and the work that made this unofficial port possible.

This repository is an unofficial compatibility port. All original Cluttered rights, authorship, branding, and licensing remain with their respective owners.
