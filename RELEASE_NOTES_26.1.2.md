# Cluttered 3.0.3 - Unofficial Fabric 26.1.2 Port

This is an unofficial Fabric port of Cluttered 3.0.3 for Minecraft 26.1.2.

## Compatibility

- Minecraft: 26.1.2
- Fabric Loader: 0.19.2
- Fabric API: 0.148.0+26.1.2
- Java: 25
- Loader: Fabric only

This build is not a Forge jar and is not an official upstream release.

## Included Artifacts

- `cluttered-3.0.3-26.1.2-0.1.3-fabric-unofficial.jar`
- `cluttered-3.0.3-26.1.2-0.1.3-fabric-unofficial-sources.jar`

## Highlights

- Ported the Cluttered 3.0.3 Forge codebase to Fabric.
- Restored the official 3.0.3 assets and data: models, blockstates, textures, item definitions, language entries, paintings, recipes, loot tables, and tags.
- Added Fabric registration for blocks, items, creative tabs, entities, block entities, render layers, paintings, composting, flammables, burn times, and log stripping.
- Fixed Fabric gameplay issues discovered during in-game testing, including storage block entities, record players, multiblock beds, and chair seating orientation.
- Added Spanish translations, with `es_cl` as the reviewed base and additional Spanish locale files copied from it as placeholders.
- Added recipe-book unlock notifications and survival recipe fixes for Fabric/Minecraft 26.1.2 data changes.
- Added Spanish recipe reference documents under `docs/`.
- Restored the old glow flower/flower lamp content from an older Cluttered build.
- Added small single-flavor jam jars while keeping the original large jam jar blocks.
- Added glass-like block sounds for jam jars.
- Added light emission to decorative objects that should visibly glow, including lamps, pearls, glow-themed objects, and deep chalcedony star variants.
- Added stonecutter recipe coverage for decorative material families.

## Testing Status

- `sh ./gradlew build` has completed successfully.
- The mod has been launched in a Fabric client on Minecraft 26.1.2.
- A new world was created successfully.
- Creative inventory, names, models, textures, placement, storage blocks, beds, chairs, record players, lighting tweaks, recipes, and the diagnostic block gallery were tested during the porting pass.

## Notes

- Shader packs are not specially integrated. Light-emitting blocks use vanilla Minecraft light emission, so shader behavior depends on the shader pack/resource-pack setup.
- This release should be labeled clearly as an unofficial Fabric port if shared.
- The project declares GNU GPL 3.0 licensing. Include or link to the matching source code when distributing this build.

## Credits

Cluttered was originally created by blake and YellowChuJelly. Huge thanks to the original creators and contributors for the mod, its art direction, assets, models, textures, and the work that made this unofficial port possible.

This repository is an unofficial compatibility port. All original Cluttered rights, authorship, branding, and licensing remain with their respective owners.
