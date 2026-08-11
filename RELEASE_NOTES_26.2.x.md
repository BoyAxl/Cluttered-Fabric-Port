# 🪧 Cluttered 3.0.3 - Fabric 26.2.x Unofficial Port

This is an unofficial Fabric port of Cluttered 3.0.3 for Minecraft 26.2.x.

## 📦 Compatibility

- Minecraft: 26.2.x
- Minecraft metadata range: `~26.2` (`>=26.2 <26.3`)
- Fabric Loader: 0.19.3 or newer
- Fabric API: 0.154.0 or newer
- Java: 25
- Loader: Fabric only

This build is not a Forge jar and is not an official upstream release.

## 🧱 Included Artifacts

- `cluttered-3.0.3-26.2.x-0.1.1-fabric-unofficial.jar`
- `cluttered-3.0.3-26.2.x-0.1.1-fabric-unofficial-sources.jar`

## 🪧 Fixes

- Fixed all Cluttered standing, wall, hanging, and wall-hanging signs being invisible in Minecraft 26.2.x.
- Fixed missing-texture backgrounds in the sign and hanging-sign text editors.
- Cluttered hanging signs now open the vanilla hanging-sign editor and use its line spacing, text width, and interaction sound.

## 🧩 Technical Details

- Migrated Cluttered sign blockstates, models, and textures to Minecraft 26.2's block-model rendering format.
- Preserved vanilla sign editor behavior and texture lookup for non-Cluttered wood types.
- Kept the editor hooks chainable so other mods can continue extending the same vanilla methods.

## 🧪 Testing Status

- `sh ./gradlew clean build` completed successfully against the 26.2 baseline.
- The release jar was placed in `/Users/axlboy/Documents/curseforge/minecraft/Instances/NetTestFabric/mods`.
- In-game testing confirmed that Cluttered signs render and their text editors display correctly.

## 📝 Notes

- Shader packs are not specially integrated. Light-emitting blocks use vanilla Minecraft light emission, so shader behavior depends on the shader pack/resource-pack setup.
- This release should be labeled clearly as an unofficial Fabric port if shared.
- The project declares GNU GPL 3.0 licensing. Include or link to the matching source code when distributing this build.

## 🙏 Credits

Cluttered was originally created by blake and YellowChuJelly. Huge thanks to the original creators and contributors for the mod, its art direction, assets, models, textures, and the work that made this unofficial port possible.

This repository is an unofficial compatibility port. All original Cluttered rights, authorship, branding, and licensing remain with their respective owners.
