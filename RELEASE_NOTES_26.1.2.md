# Cluttered 3.0.3 - Unofficial Forge 26.1.2 Port

This is an unofficial port of Cluttered 3.0.3 for Minecraft 26.1.2 and Forge 64.0.8.

## Status

- Tested launching the game with Forge 64.0.8.
- Tested creating a world.
- Tested creative inventory visibility for the mod items.
- Tested placing mod blocks in-world after restoring assets and fixing model/resource issues.
- Tested a successful Gradle build with `sh ./gradlew build`.

## What Changed

- Updated the Gradle/Forge project for Minecraft 26.1.2.
- Ported registration, event bus, block, item, worldgen, creative tab, painting, and render-related code to the current Forge/Minecraft APIs.
- Restored official Cluttered 3.0.3 blockstates, block models, item models, textures, item definitions, language entries, and painting data.
- Fixed loading crashes from event bus registration and multiblock state properties.
- Fixed resource reload crashes from texture mipmap and model UV issues.
- Fixed missing model, missing texture reference, missing particle, and item display-name issues.
- Restored the eye block animation behavior for the 26.1.2 port.

## Compatibility

- Minecraft: 26.1.2
- Forge: 64.0.8 or newer within the Forge 64 loader range
- Loader: Forge only

This build is not a Fabric port.

## Shader Notes

This port does not add shader-specific integration such as OptiFine/Iris emissive metadata. Blocks that emit light rely on vanilla light emission, so shader behavior depends on the shader pack.

## Distribution Notes

This is not an official upstream release. If you share this build, label it clearly as an unofficial port and include or link to the matching source code for this branch.

The project declares GNU GPL 3.0 licensing. See `LICENSE`.
