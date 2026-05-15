# Cluttered

The github repository for the Cluttered mod!!!

This mod is fully rewritten, and no longer an MCreator mod.
I've learned to code entirely for this, so apologies for anything that's not well done.
Huge thanks to Kaupenjoe and McJty for their modding tutorials!

## Unofficial Minecraft 26.1.2 Fabric Port

This branch contains an unofficial port of Cluttered 3.0.3 for:

- Minecraft 26.1.2
- Fabric Loader 0.19.2
- Fabric API 0.148.0+26.1.2

This is not an official upstream release. It was ported from the Forge 3.0 codebase and restored with the official 3.0.3 assets/data so it can run on Minecraft 26.1.2 with Fabric.

The generated jar is named with an `unofficial` suffix to make the build easy to distinguish from official releases.

## Known Notes

- Shader packs are not specially supported by this port.
- Blocks that emit light use vanilla Minecraft lighting, which most shader packs can read normally.
- Forge-only datagen and global loot modifier source files are excluded from the Fabric build.
- If you distribute the jar, also share the source for this modified version, as required by the GPL-3.0 license.

## License

Cluttered declares GNU GPL 3.0 licensing. See [LICENSE](LICENSE).
