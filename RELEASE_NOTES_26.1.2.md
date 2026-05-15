# Cluttered 3.0.3 - Unofficial Fabric 26.1.2 Port

This is an unofficial port of Cluttered 3.0.3 for Minecraft 26.1.2, Fabric Loader 0.19.2, and Fabric API 0.148.0+26.1.2.

## Status

- Tested a successful Gradle build with `sh ./gradlew build`.
- Tested a Fabric dedicated-server smoke start with `sh ./gradlew runServer`; it loads the mod and reaches the normal EULA stop.
- Client launch and in-world Fabric testing still need a manual pass in the Minecraft launcher.

## What Changed

- Replaced the Forge Gradle setup with Fabric Loom for Minecraft 26.1.2.
- Added Fabric mod metadata and Fabric entrypoints.
- Added lightweight Fabric registration helpers for the existing Cluttered registration style.
- Ported block, item, entity, block entity, worldgen placer, creative tab, painting, and client renderer registration to Fabric/Minecraft APIs.
- Restored official Cluttered 3.0.3 blockstates, block models, item models, textures, item definitions, language entries, and painting data.
- Preserved vanilla/Fabric hooks for composting, burn times, flammable blocks, and log stripping.
- Kept shader behavior as vanilla light emission and resource-pack/model metadata.

## Compatibility

- Minecraft: 26.1.2
- Fabric Loader: 0.19.2
- Fabric API: 0.148.0+26.1.2
- Loader: Fabric only

This build is not a Forge jar.

## Shader Notes

This port does not add shader-specific integration such as OptiFine/Iris emissive metadata. Blocks that emit light rely on vanilla light emission, so shader behavior depends on the shader pack.

## Known Notes

- Forge-only datagen and global loot modifier source files are excluded from compilation in this Fabric branch.
- The previous Forge 26.1.2 work was tested more deeply in-client; this Fabric branch has compile and server-load verification here, but should still be checked manually in a Fabric client before wider release.

## Distribution Notes

This is not an official upstream release. If you share this build, label it clearly as an unofficial port and include or link to the matching source code for this branch.

The project declares GNU GPL 3.0 licensing. See `LICENSE`.
