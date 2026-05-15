# Cluttered (Unofficial Fabric Port)

![Cluttered logo](docs/cluttered_logo.png)

The GitHub repository for the Cluttered mod.

Cluttered is a furniture and decoration mod originally created by YellowChuJelly. This repository is currently carrying an unofficial Fabric port of Cluttered 3.0.3 for Minecraft 26.1.2.

## Unofficial Fabric Port

This branch targets:

- Minecraft 26.1.2
- Fabric Loader 0.19.2
- Fabric API 0.148.0+26.1.2
- Java 25

The generated jar uses an `unofficial` suffix so it is easy to distinguish from official releases:

```text
build/libs/cluttered-3.0.3-26.1.2-fabric-unofficial.jar
```

This is not an official upstream release, and it is not a Forge jar.

## Included Port Work

- Ported Cluttered 3.0.3 from the Forge codebase to Fabric.
- Restored the official 3.0.3 models, blockstates, textures, item definitions, language entries, paintings, recipes, loot tables, and tags.
- Added Fabric registration for blocks, items, creative tabs, entities, block entities, render layers, composting, flammables, burn times, stripping, painting variants, and client renderers.
- Fixed multiple Fabric gameplay issues found during in-game testing, including storage block entities, record players, multiblock beds, and chair seating orientation.
- Added recipe-book unlock notifications so new recipes appear when the player obtains relevant ingredients.
- Added survival recipe fixes for Fabric tag and item name changes.
- Added in-game light emission to decorative objects that should visibly glow, including lamps, pearls, glow-themed objects, and deep chalcedony star variants.
- Restored the old `glow_flower`/flower lamp content from an older Cluttered build.
- Added small single-flavor jam jars while keeping the original larger jam jar blocks.
- Added glass-like block sounds for jam jars.
- Added stonecutter recipe coverage for decorative material families.

## Spanish Support

This port includes Spanish item and block names, with `es_cl` as the main reviewed translation.

Additional Spanish locale files are currently copied from the Chilean Spanish translation as placeholders:

- `es_ar`
- `es_ec`
- `es_es`
- `es_mx`
- `es_uy`
- `es_ve`

Translation follow-up notes are tracked in:

- `docs/traducciones_todo.md`

## Recipe Documentation

The in-game recipe book should show recipes once they are unlocked normally. For manual testing, this repo also includes Spanish recipe references:

- `docs/recetas_es_CL.md`
- `docs/cortapiedras_es_CL.md`

During local testing, a diagnostic gallery datapack can be generated under `build/datapacks` to place Cluttered blocks for broad render and placement checks.

## Building

Build the mod with:

```sh
sh ./gradlew build
```

The jar will be created in:

```text
build/libs/
```

## Testing Notes

This branch has been built successfully and tested in a Fabric client on Minecraft 26.1.2. The diagnostic gallery command has placed the registered Cluttered blocks without a crash in the current test pass.

Shader packs are not specially integrated. Blocks that emit light use vanilla Minecraft light emission, which most shader packs can read normally, but emissive visuals still depend on the shader/resource-pack setup.

## Distribution Notes

If you share this build, label it clearly as an unofficial Fabric port for Minecraft 26.1.2 and include or link to the matching source code for this branch.

The project declares GNU GPL 3.0 licensing. See [LICENSE](LICENSE).

## Credits

Cluttered was originally created by YellowChuJelly. Huge thanks to the original creator and contributors for the mod, its art direction, assets, models, textures, and the work that made this unofficial port possible.

This repository is an unofficial compatibility port. All original Cluttered rights, authorship, branding, and licensing remain with their respective owners.

Logo/banner image from the official [Cluttered Modrinth page](https://modrinth.com/mod/cluttered).

The original README credited Kaupenjoe and McJty for modding tutorials used while learning and building Cluttered.
