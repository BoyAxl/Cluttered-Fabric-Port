# Recetas de Cluttered 3.0.3 para Minecraft 26.1.2 (es_CL)

Documento de apoyo generado desde `src/generated/resources/data/cluttered/recipe`.

Nota: el mod no trae una traducción oficial `es_cl.json`; los nombres en español de este documento son traducciones prácticas desde `en_us.json` y desde los IDs. El ID técnico aparece siempre entre paréntesis para que puedas buscar el objeto exacto en JEI/REI o en el libro de recetas.

Total de recetas: `923`. Con forma: `631`. Sin forma: `81`. Horno: `1`. Cortapiedras: `210`.

## Cómo leer el documento

- `[A][B][ ]` representa una fila de la mesa de crafteo; `[ ]` es un espacio vacío.
- `#minecraft:...`, `#cluttered:...` o `#forge:...` indica una etiqueta: puedes usar cualquier ítem que pertenezca a esa etiqueta.
- Las recetas de tipo `Cortapiedras` se hacen en el cortapiedras (`minecraft:stonecutter`), no en la mesa de crafteo.
- Algunas variantes decorativas no tienen receta directa porque se obtienen usando el `Taladro manual` (`cluttered:hand_drill`) sobre otro bloque del mod.
- El listado completo de recetas de cortapiedras está en `docs/cortapiedras_es_CL.md`.

## Obtención de maderas y brotes

Los troncos nuevos del mod, como `cluttered:willow_log`, no se fabrican en la mesa de crafteo. La ruta survival prevista es comprar el brote al vendedor ambulante, plantarlo, hacerlo crecer y cortar el árbol.

- `cluttered:willow_sapling`: lo vende el vendedor ambulante por esmeraldas.
- `cluttered:willow_log`: se obtiene cortando un sauce crecido desde `cluttered:willow_sapling`.
- `cluttered:flowering_willow_log`: puede aparecer como variante en el árbol de sauce.
- También existen trades del vendedor ambulante para `poplar_sapling`, `crabapple_sapling`, `sycamore_sapling` y `fluorescent_maple_sapling`.

## Bloques de construcción

### Bloque de oro cincelado (`cluttered:chiseled_gold_block`) x1

- Tipo: Cortapiedras

Ingrediente:
- Bloque de oro (`minecraft:gold_block`)

### Bloque de oro desde bloque de oro cincelado (`minecraft:gold_block`) x1

- Tipo: Cortapiedras

Ingrediente:
- Bloque de oro cincelado (`cluttered:chiseled_gold_block`)

### Baldosas amarillas (`cluttered:tiles_yellow`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t]
[t][t]
```

Ingredientes:
- `t` = Amarillo concreto (`minecraft:yellow_concrete`)

### Baldosas aura (`cluttered:aura_tiles`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][b][t]
[t][t][t]
```

Ingredientes:
- `b` = Polvo de blaze (`minecraft:blaze_powder`)
- `t` = Terracota (`minecraft:terracotta`)

### Baldosas X invertidas azules (`cluttered:x_tile_blue_inverse`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][d][t]
[t][t][t]
```

Ingredientes:
- `d` = Tinte azul (`minecraft:blue_dye`)
- `t` = Baldosas X invertidas de terracota (`cluttered:x_tile_terracotta_inverse`)

### Baldosas X azules (`cluttered:x_tile_blue`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][d][t]
[t][t][t]
```

Ingredientes:
- `d` = Tinte azul (`minecraft:blue_dye`)
- `t` = Baldosas X de terracota (`cluttered:x_tile_terracotta`)

### Baldosas bifurcadas (`cluttered:bifurcating_tiles`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][b][t]
[t][t][t]
```

Ingredientes:
- `b` = Wheat seeds (`minecraft:wheat_seeds`)
- `t` = Terracota (`minecraft:terracotta`)

### Bloque de wicker (`cluttered:wicker_block`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][y][s]
[s][y][s]
[s][y][s]
```

Ingredientes:
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `y` = Hilo (`minecraft:string`)

### Calcedonia (`cluttered:raw_chalcedony`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[q][a][q]
[a][q][a]
[q][a][q]
```

Ingredientes:
- `a` = Fragmento de amatista (`minecraft:amethyst_shard`)
- `q` = Cuarzo del Nether (`minecraft:quartz`)

### Calcedonia ladrillos (`cluttered:chalcedony_bricks`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
```

Ingredientes:
- `p` = Pulido calcedonia (`cluttered:chalcedony_polished`)

### Calcedonia profunda (`cluttered:deep_raw_chalcedony`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[q][a][q]
[a][l][a]
[q][a][q]
```

Ingredientes:
- `a` = Fragmento de amatista (`minecraft:amethyst_shard`)
- `l` = Lapislázuli (`minecraft:lapis_lazuli`)
- `q` = Cuarzo del Nether (`minecraft:quartz`)

### Calcedonia profunda ladrillos (`cluttered:deep_chalcedony_bricks`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
```

Ingredientes:
- `p` = Pulido calcedonia profunda (`cluttered:deep_chalcedony_polished`)

### Calcedonia profunda star (`cluttered:deep_chalcedony_sun_block`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[b][g][b]
[b][b][b]
```

Ingredientes:
- `b` = Pulido calcedonia profunda (`cluttered:deep_chalcedony_polished`)
- `g` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)

### Calcedonia star (`cluttered:chalcedony_sun_block`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[b][g][b]
[b][b][b]
```

Ingredientes:
- `b` = Pulido calcedonia (`cluttered:chalcedony_polished`)
- `g` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)

### Deep chalcedonyslab (`cluttered:deep_chalcedony_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r][r]
```

Ingredientes:
- `r` = Calcedonia profunda (`cluttered:deep_raw_chalcedony`)

### Escaleras de arce fluorescente (`cluttered:fluorescent_maple_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Escaleras de calcedonia (`cluttered:chalcedony_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][ ][ ]
[r][r][ ]
[r][r][r]
```

Ingredientes:
- `r` = Calcedonia (`cluttered:raw_chalcedony`)

### Escaleras de calcedonia ladrillo (`cluttered:chalcedony_brick_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][ ][ ]
[b][b][ ]
[b][b][b]
```

Ingredientes:
- `b` = Calcedonia ladrillos (`cluttered:chalcedony_bricks`)

### Escaleras de calcedonia profunda (`cluttered:deep_chalcedony_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][ ][ ]
[r][r][ ]
[r][r][r]
```

Ingredientes:
- `r` = Calcedonia profunda (`cluttered:deep_raw_chalcedony`)

### Escaleras de calcedonia profunda ladrillo (`cluttered:deep_chalcedony_brick_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][ ][ ]
[b][b][ ]
[b][b][b]
```

Ingredientes:
- `b` = Calcedonia profunda ladrillos (`cluttered:deep_chalcedony_bricks`)

### Escaleras de gingerbread ladrillo (`cluttered:gingerbread_brick_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][ ][ ]
[s][s][ ]
[s][s][s]
```

Ingredientes:
- `s` = Gingerbread ladrillos (`cluttered:gingerbread_bricks`)

### Escaleras de hongo azul (`cluttered:blue_mushroom_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Escaleras de hongo rojo (`cluttered:red_mushroom_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Escaleras de manzano silvestre (`cluttered:crabapple_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Escaleras de manzano silvestre florido (`cluttered:flowering_crabapple_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)

### Escaleras de mármol (`cluttered:marble_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][ ][ ]
[r][r][ ]
[r][r][r]
```

Ingredientes:
- `r` = Mármol (`cluttered:raw_marble`)

### Escaleras de mármol ladrillo (`cluttered:marble_brick_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][ ][ ]
[b][b][ ]
[b][b][b]
```

Ingredientes:
- `b` = Mármol ladrillos (`cluttered:marble_bricks`)

### Escaleras de sauce (`cluttered:willow_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Escaleras de sauce florido (`cluttered:flowering_willow_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)

### Escaleras de sicomoro (`cluttered:sycamore_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)

### Escaleras de álamo (`cluttered:poplar_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de álamo (`cluttered:poplar_planks`)

### Escaleras de álamo florido (`cluttered:flowering_poplar_stairs`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][ ]
[p][p][ ]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)

### Esperanca tile (`cluttered:esperanca_tile`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t]
[t][b]
```

Ingredientes:
- `b` = Tinte celeste (`minecraft:light_blue_dye`)
- `t` = Blanco terracota (`minecraft:white_terracotta`)

### Estantería de alchemist's sauce (`cluttered:willow_bookshelf_bottles`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][f][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `f` = Vidrio bottle (`minecraft:glass_bottle`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Estantería de arce fluorescente (`cluttered:fluorescent_maple_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Estantería de cobwebbed sauce (`cluttered:willow_bookshelf_cobweb`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][f][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `f` = Hilo (`minecraft:string`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Estantería de gato calicó sauce (`cluttered:willow_bookshelf_calico_cat`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][f][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `f` = Tinte blanco (`minecraft:white_dye`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Estantería de gato negro sauce (`cluttered:willow_bookshelf_black_cat`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][f][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `f` = Tinte negro (`minecraft:black_dye`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Estantería de herbalist's sauce (`cluttered:willow_bookshelf_vase`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][f][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `f` = Maceta (`minecraft:flower_pot`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Estantería de hongo azul (`cluttered:blue_mushroom_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Estantería de hongo rojo (`cluttered:red_mushroom_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Estantería de jack o'lantern (`cluttered:pumpkin_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Pumpkin (`minecraft:pumpkin`)

### Estantería de manzano silvestre (`cluttered:crabapple_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Estantería de manzano silvestre florido (`cluttered:flowering_crabapple_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)

### Estantería de sicomoro (`cluttered:sycamore_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)

### Estantería de álamo (`cluttered:poplar_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Tablones de álamo (`cluttered:poplar_planks`)

### Estantería de álamo florido (`cluttered:flowering_poplar_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)

### Gingerbread ladrillos (`cluttered:gingerbread_bricks`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][s][b]
[s][b][s]
[b][s][b]
```

Ingredientes:
- `b` = Ladrillo (`minecraft:brick`)
- `s` = Sugar (`minecraft:sugar`)

### Gris inverse x-tiles (`cluttered:x_tile_gray_inverse`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][d][t]
[t][t][t]
```

Ingredientes:
- `d` = Tinte gris (`minecraft:gray_dye`)
- `t` = Baldosas X invertidas de terracota (`cluttered:x_tile_terracotta_inverse`)

### Gris x-tiles (`cluttered:x_tile_gray`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][d][t]
[t][t][t]
```

Ingredientes:
- `d` = Tinte gris (`minecraft:gray_dye`)
- `t` = Baldosas X de terracota (`cluttered:x_tile_terracotta`)

### Hannish tile (`cluttered:hannish_tile`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t]
[t][b]
```

Ingredientes:
- `b` = Tinte amarillo (`minecraft:yellow_dye`)
- `t` = Morado terracota (`minecraft:purple_terracotta`)

### Hongo azul hyphae (`cluttered:blue_mushroom_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Hongo azul stem (`cluttered:blue_mushroom_log`)

### Hongo rojo hyphae (`cluttered:red_mushroom_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Hongo rojo stem (`cluttered:red_mushroom_log`)

### Iridescent tiles (`cluttered:tiles_iridescent`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][p][t]
[t][t][t]
```

Ingredientes:
- `p` = Prismarine fragmento (`minecraft:prismarine_shard`)
- `t` = Terracota (`minecraft:terracotta`)

### Kitchen tiles (`cluttered:tiles_kitchen`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[s][f][a]
[t][t][t]
```

Ingredientes:
- `a` = Manzana (`minecraft:apple`)
- `f` = etiqueta Pequeño flores (`#minecraft:small_flowers`)
- `s` = etiqueta Saplings (`#minecraft:saplings`)
- `t` = Terracota (`minecraft:terracotta`)

### Letrero colgante de arce fluorescente (`cluttered:fluorescent_maple_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Tronco de arce fluorescente sin corteza (`cluttered:stripped_fluorescent_maple_log`)

### Letrero colgante de hongo azul (`cluttered:blue_mushroom_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Hongo azul stem (`cluttered:blue_mushroom_log`)

### Letrero colgante de hongo rojo (`cluttered:red_mushroom_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Hongo rojo stem (`cluttered:red_mushroom_log`)

### Letrero colgante de manzano silvestre (`cluttered:crabapple_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Tronco de manzano silvestre sin corteza (`cluttered:stripped_crabapple_log`)

### Letrero colgante de manzano silvestre florido (`cluttered:flowering_crabapple_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Tronco de manzano silvestre florido sin corteza (`cluttered:stripped_flowering_crabapple_log`)

### Letrero colgante de sauce (`cluttered:willow_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Tronco de sauce sin corteza (`cluttered:stripped_willow_log`)

### Letrero colgante de sauce florido (`cluttered:flowering_willow_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Tronco de sauce florido sin corteza (`cluttered:stripped_flowering_willow_log`)

### Letrero colgante de sicomoro (`cluttered:sycamore_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Tronco de sicomoro sin corteza (`cluttered:stripped_sycamore_log`)

### Letrero colgante de álamo (`cluttered:poplar_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Tronco de álamo sin corteza (`cluttered:stripped_poplar_log`)

### Letrero colgante de álamo florido (`cluttered:flowering_poplar_hanging_sign`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][ ][c]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `c` = Cadena de hierro (`minecraft:iron_chain`)
- `p` = Tronco de álamo florido sin corteza (`cluttered:stripped_flowering_poplar_log`)

### Letrero de arce fluorescente (`cluttered:fluorescent_maple_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Letrero de hongo azul (`cluttered:blue_mushroom_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Letrero de hongo rojo (`cluttered:red_mushroom_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Letrero de manzano silvestre (`cluttered:crabapple_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Letrero de manzano silvestre florido (`cluttered:flowering_crabapple_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Letrero de sauce (`cluttered:willow_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de sauce (`cluttered:willow_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Letrero de sauce florido (`cluttered:flowering_willow_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Letrero de sicomoro (`cluttered:sycamore_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Letrero de álamo (`cluttered:poplar_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de álamo (`cluttered:poplar_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Letrero de álamo florido (`cluttered:flowering_poplar_sign`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
[ ][s][ ]
```

Ingredientes:
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Lily hills tile (`cluttered:lily_hills_tile`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t]
[t][b]
```

Ingredientes:
- `b` = Tinte marrón (`minecraft:brown_dye`)
- `t` = Blanco terracota (`minecraft:white_terracotta`)

### Losa de arce fluorescente (`cluttered:fluorescent_maple_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Losa de calcedonia (`cluttered:chalcedony_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r][r]
```

Ingredientes:
- `r` = Calcedonia (`cluttered:raw_chalcedony`)

### Losa de calcedonia ladrillo (`cluttered:chalcedony_brick_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
```

Ingredientes:
- `b` = Calcedonia ladrillos (`cluttered:chalcedony_bricks`)

### Losa de calcedonia profunda ladrillo (`cluttered:deep_chalcedony_brick_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
```

Ingredientes:
- `b` = Calcedonia profunda ladrillos (`cluttered:deep_chalcedony_bricks`)

### Losa de gingerbread ladrillo (`cluttered:gingerbread_brick_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
```

Ingredientes:
- `s` = Gingerbread ladrillos (`cluttered:gingerbread_bricks`)

### Losa de hongo azul (`cluttered:blue_mushroom_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Losa de hongo rojo (`cluttered:red_mushroom_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Losa de manzano silvestre (`cluttered:crabapple_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Losa de manzano silvestre florido (`cluttered:flowering_crabapple_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)

### Losa de mármol (`cluttered:marble_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r][r]
```

Ingredientes:
- `r` = Mármol (`cluttered:raw_marble`)

### Losa de mármol ladrillo (`cluttered:marble_brick_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
```

Ingredientes:
- `b` = Mármol ladrillos (`cluttered:marble_bricks`)

### Losa de sauce (`cluttered:willow_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Losa de sauce florido (`cluttered:flowering_willow_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)

### Losa de sicomoro (`cluttered:sycamore_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)

### Losa de álamo (`cluttered:poplar_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de álamo (`cluttered:poplar_planks`)

### Losa de álamo florido (`cluttered:flowering_poplar_slab`) x6

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)

### Madera de arce fluorescente (`cluttered:fluorescent_maple_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Tronco de arce fluorescente (`cluttered:fluorescent_maple_log`)

### Madera de manzano silvestre (`cluttered:crabapple_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Tronco de manzano silvestre (`cluttered:crabapple_log`)

### Madera de manzano silvestre florido (`cluttered:flowering_crabapple_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Tronco de manzano silvestre florido (`cluttered:flowering_crabapple_log`)

### Madera de sauce (`cluttered:willow_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Tronco de sauce (`cluttered:willow_log`)

### Madera de sauce florido (`cluttered:flowering_willow_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Tronco de sauce florido (`cluttered:flowering_willow_log`)

### Madera de sicomoro (`cluttered:sycamore_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Tronco de sicomoro (`cluttered:sycamore_log`)

### Madera de álamo (`cluttered:poplar_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Tronco de álamo (`cluttered:poplar_log`)

### Madera de álamo florido (`cluttered:flowering_poplar_wood`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][l]
[l][l]
```

Ingredientes:
- `l` = Tronco de álamo florido (`cluttered:flowering_poplar_log`)

### Manzano silvestre flor carpet (`cluttered:flower_carpet_crabapple`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Hojas de manzano silvestre florido (`cluttered:flowering_crabapple_leaves`)

### Morado tiles (`cluttered:tiles_purple`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t]
[t][t]
```

Ingredientes:
- `t` = Morado concreto (`minecraft:purple_concrete`)

### Mármol (`cluttered:raw_marble`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[q][a][q]
[a][q][a]
[q][a][q]
```

Ingredientes:
- `a` = Calcita (`minecraft:calcite`)
- `q` = Cuarzo del Nether (`minecraft:quartz`)

### Mármol ladrillos (`cluttered:marble_bricks`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
```

Ingredientes:
- `p` = Pulido mármol (`cluttered:marble_polished`)

### Mármol star (`cluttered:marble_sun_block`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[b][g][b]
[b][b][b]
```

Ingredientes:
- `b` = Pulido mármol (`cluttered:marble_polished`)
- `g` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)

### Negro amaryllis tile (`cluttered:black_amaryllis_tiles`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][b][t]
[t][t][t]
```

Ingredientes:
- `b` = etiqueta Coals (`#minecraft:coals`)
- `t` = Terracota (`minecraft:terracotta`)

### Panel de ventana de alabastro (`cluttered:alabaster_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[w][w][w]
```

Ingredientes:
- `w` = Ventana de alabastro (`cluttered:alabaster_window_divided`)

### Panel de ventana de arce fluorescente (`cluttered:fluorescent_maple_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de arce fluorescente (`cluttered:fluorescent_maple_window`)

### Panel de ventana de calcedonia (`cluttered:chalcedony_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[b][b][b]
```

Ingredientes:
- `b` = Ventana de calcedonia (`cluttered:chalcedony_window`)

### Panel de ventana de calcedonia profunda (`cluttered:deep_chalcedony_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[b][b][b]
```

Ingredientes:
- `b` = Ventana de calcedonia profunda (`cluttered:deep_chalcedony_window`)

### Panel de ventana de gato negro (`cluttered:black_cat_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[b][b][b]
```

Ingredientes:
- `b` = Ventana de gato negro (`cluttered:black_cat_window`)

### Panel de ventana de hongo azul (`cluttered:blue_mushroom_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de hongo azul (`cluttered:blue_mushroom_window`)

### Panel de ventana de hongo rojo (`cluttered:red_mushroom_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de hongo rojo (`cluttered:red_mushroom_window`)

### Panel de ventana de madera (`cluttered:wooden_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[w][w][w]
```

Ingredientes:
- `w` = Ventana de madera (`cluttered:wooden_window_divided`)

### Panel de ventana de manzano silvestre (`cluttered:crabapple_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de manzano silvestre (`cluttered:crabapple_window`)

### Panel de ventana de manzano silvestre florido (`cluttered:flowering_crabapple_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de manzano silvestre florido (`cluttered:flowering_crabapple_window`)

### Panel de ventana de sauce (`cluttered:willow_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de sauce (`cluttered:willow_window`)

### Panel de ventana de sauce florido (`cluttered:flowering_willow_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de sauce florido (`cluttered:flowering_willow_window`)

### Panel de ventana de sicomoro (`cluttered:sycamore_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de sicomoro (`cluttered:sycamore_window`)

### Panel de ventana de álamo (`cluttered:poplar_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de álamo (`cluttered:poplar_window`)

### Panel de ventana de álamo florido (`cluttered:flowering_poplar_window_pane`) x16

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][g][g]
```

Ingredientes:
- `g` = Ventana de álamo florido (`cluttered:flowering_poplar_window`)

### Papel mural de anchor motif (`cluttered:diamond_wallpaper_anchor`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][f][s]
[w][w][w]
```

Ingredientes:
- `f` = etiqueta Fishes (`#minecraft:fishes`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de azul rose (`cluttered:blue_rose_striped_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][b][p]
[p][r][p]
[w][w][w]
```

Ingredientes:
- `b` = Tinte azul (`minecraft:blue_dye`)
- `p` = Papel (`minecraft:paper`)
- `r` = Rose bush (`minecraft:rose_bush`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de blackberry motif (`cluttered:diamond_wallpaper_blackberry`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][b][s]
[w][w][w]
```

Ingredientes:
- `b` = Tinte negro (`minecraft:black_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de blueberry motif (`cluttered:diamond_wallpaper_blueberry`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][b][s]
[w][w][w]
```

Ingredientes:
- `b` = Tinte azul (`minecraft:blue_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de bouquet motif (`cluttered:diamond_wallpaper_bouquet`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][f][s]
[w][w][w]
```

Ingredientes:
- `f` = etiqueta Flores (`#minecraft:flowers`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de checkered fruit (`cluttered:checkered_fruit_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[a][p][m]
[p][b][p]
[w][w][w]
```

Ingredientes:
- `a` = Manzana (`minecraft:apple`)
- `b` = Sweet berries (`minecraft:sweet_berries`)
- `m` = Melon slice (`minecraft:melon_slice`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de checkered rosado (`cluttered:checkered_pink_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][p][d]
[d][p][d]
[w][w][w]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de checkered verde (`cluttered:checkered_green_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][p][d]
[d][p][d]
[w][w][w]
```

Ingredientes:
- `d` = Tinte verde (`minecraft:green_dye`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de chic (`cluttered:chic_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[v][d][v]
[w][w][w]
```

Ingredientes:
- `d` = Diente de león (`minecraft:dandelion`)
- `p` = Papel (`minecraft:paper`)
- `v` = Enredaderas (`minecraft:vine`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de confectionary (`cluttered:confectionary_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[d][b][k]
[w][w][w]
```

Ingredientes:
- `b` = Tinte celeste (`minecraft:light_blue_dye`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `k` = Tinte blanco (`minecraft:white_dye`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de fish (`cluttered:fish_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][f][p]
[p][f][p]
[w][w][w]
```

Ingredientes:
- `f` = En bruto cod (`minecraft:cod`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de floral berry (`cluttered:floral_berry_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[f][p][b]
[w][w][w]
```

Ingredientes:
- `b` = Sweet berries (`minecraft:sweet_berries`)
- `f` = etiqueta Pequeño flores (`#minecraft:small_flowers`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de floral border (`cluttered:floral_border_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[f][t][f]
[w][w][w]
```

Ingredientes:
- `f` = etiqueta Pequeño flores (`#minecraft:small_flowers`)
- `p` = Papel (`minecraft:paper`)
- `t` = etiqueta Flores altas (`#minecraft:tall_flowers`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de ghost (`cluttered:ghost_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[w][w][w]
```

Ingredientes:
- `b` = Hueso (`minecraft:bone`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de halloween (`cluttered:halloween_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][j][p]
[w][w][w]
```

Ingredientes:
- `j` = Carved pumpkin (`minecraft:carved_pumpkin`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de hongo rojo motif (`cluttered:diamond_wallpaper_red_mushroom`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][m][s]
[w][w][w]
```

Ingredientes:
- `m` = Hongo rojo (`minecraft:red_mushroom`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de hueso motif (`cluttered:diamond_wallpaper_bones`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][b][s]
[w][w][w]
```

Ingredientes:
- `b` = Hueso (`minecraft:bone`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de limón motif (`cluttered:diamond_wallpaper_lemon`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][y][s]
[w][w][w]
```

Ingredientes:
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)
- `y` = Tinte amarillo (`minecraft:yellow_dye`)

### Papel mural de manzana (`cluttered:apple_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[a][p][a]
[w][w][w]
```

Ingredientes:
- `a` = Manzana (`minecraft:apple`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de manzana motif (`cluttered:diamond_wallpaper_apple`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][a][s]
[w][w][w]
```

Ingredientes:
- `a` = Manzana (`minecraft:apple`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de marigold (`cluttered:marigold_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][d][p]
[w][w][w]
```

Ingredientes:
- `d` = Diente de león (`minecraft:dandelion`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de marrón hongo motif (`cluttered:diamond_wallpaper_brown_mushroom`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][m][s]
[w][w][w]
```

Ingredientes:
- `m` = Marrón hongo (`minecraft:brown_mushroom`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de mint (`cluttered:mint_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[l][b][k]
[w][w][w]
```

Ingredientes:
- `b` = Tinte marrón (`minecraft:brown_dye`)
- `k` = Tinte blanco (`minecraft:white_dye`)
- `l` = Tinte lima (`minecraft:lime_dye`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de morado grape motif (`cluttered:diamond_wallpaper_purple_grapes`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][m][s]
[w][w][w]
```

Ingredientes:
- `m` = Tinte morado (`minecraft:purple_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de naranjo motif (`cluttered:diamond_wallpaper_orange`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][o][s]
[w][w][w]
```

Ingredientes:
- `o` = Tinte naranjo (`minecraft:orange_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de oscuro starry (`cluttered:dark_starry_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[g][i][g]
[w][w][w]
```

Ingredientes:
- `g` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- `i` = Tinte negro (`minecraft:black_dye`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de pear motif (`cluttered:diamond_wallpaper_pear`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][g][s]
[w][w][w]
```

Ingredientes:
- `g` = Tinte verde (`minecraft:green_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de plum motif (`cluttered:diamond_wallpaper_plum`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][m][s]
[w][w][w]
```

Ingredientes:
- `m` = Tinte magenta (`minecraft:magenta_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de retro arcoíris (`cluttered:retro_rainbow_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[r][b][y]
[w][w][w]
```

Ingredientes:
- `b` = Tinte azul (`minecraft:blue_dye`)
- `p` = Papel (`minecraft:paper`)
- `r` = Tinte rojo (`minecraft:red_dye`)
- `w` = etiqueta Tablones (`#minecraft:planks`)
- `y` = Tinte amarillo (`minecraft:yellow_dye`)

### Papel mural de rialto oro (`cluttered:rialto_gold_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[g][p][g]
[w][w][w]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de rosado stripe (`cluttered:pink_striped_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][p][m]
[d][p][m]
[w][w][w]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `m` = Tinte magenta (`minecraft:magenta_dye`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de starry (`cluttered:starry_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[g][p][g]
[w][w][w]
```

Ingredientes:
- `g` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de strawberry motif (`cluttered:diamond_wallpaper_strawberry`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][r][s]
[w][w][w]
```

Ingredientes:
- `p` = Papel (`minecraft:paper`)
- `r` = Tinte rojo (`minecraft:red_dye`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de striped floral (`cluttered:striped_floral_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][t][f]
[p][p][p]
[w][w][w]
```

Ingredientes:
- `f` = etiqueta Pequeño flores (`#minecraft:small_flowers`)
- `p` = Papel (`minecraft:paper`)
- `t` = etiqueta Flores altas (`#minecraft:tall_flowers`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de tartan amarillo (`cluttered:tartan_yellow_wallpaper`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][p][d]
[d][p][d]
[w][w][w]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de tropical fish (`cluttered:fish_wallpaper_tropical`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][f][p]
[p][f][p]
[w][w][w]
```

Ingredientes:
- `f` = Tropical fish (`minecraft:tropical_fish`)
- `p` = Papel (`minecraft:paper`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Papel mural de verde grape motif (`cluttered:diamond_wallpaper_green_grapes`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[s][g][s]
[w][w][w]
```

Ingredientes:
- `g` = Tinte lima (`minecraft:lime_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Pequeño iridescent tiles (`cluttered:tiles_iridescent_small`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t]
[t][t]
```

Ingredientes:
- `t` = Iridescent tiles (`cluttered:tiles_iridescent`)

### Pilar de colosseo (`cluttered:colosseo_pillar`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r]
[y][y]
[g][g]
```

Ingredientes:
- `g` = Verde terracota (`minecraft:green_terracotta`)
- `r` = Rojo terracota (`minecraft:red_terracotta`)
- `y` = Amarillo terracota (`minecraft:yellow_terracotta`)

### Placa de presión de arce fluorescente (`cluttered:fluorescent_maple_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Placa de presión de hongo azul (`cluttered:blue_mushroom_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Placa de presión de hongo rojo (`cluttered:red_mushroom_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Placa de presión de manzano silvestre (`cluttered:crabapple_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Placa de presión de manzano silvestre florido (`cluttered:flowering_crabapple_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)

### Placa de presión de sauce (`cluttered:willow_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Placa de presión de sauce florido (`cluttered:flowering_willow_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)

### Placa de presión de sicomoro (`cluttered:sycamore_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)

### Placa de presión de álamo (`cluttered:poplar_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de álamo (`cluttered:poplar_planks`)

### Placa de presión de álamo florido (`cluttered:flowering_poplar_pressure_plate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)

### Puerta de valla de arce fluorescente (`cluttered:fluorescent_maple_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de valla de hongo azul (`cluttered:blue_mushroom_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de valla de hongo rojo (`cluttered:red_mushroom_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de valla de manzano silvestre (`cluttered:crabapple_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de valla de manzano silvestre florido (`cluttered:flowering_crabapple_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de valla de sauce (`cluttered:willow_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de sauce (`cluttered:willow_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de valla de sauce florido (`cluttered:flowering_willow_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de valla de sicomoro (`cluttered:sycamore_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de valla decorativa de madera (`cluttered:wooden_picket_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][g][t]
```

Ingredientes:
- `g` = etiqueta Fence gates (`#minecraft:fence_gates`)
- `t` = etiqueta Madera fences (`#minecraft:wooden_fences`)

### Puerta de valla de álamo (`cluttered:poplar_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de álamo (`cluttered:poplar_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de valla de álamo florido (`cluttered:flowering_poplar_fence_gate`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][p][s]
```

Ingredientes:
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta biombo de alabastro (`cluttered:alabaster_screen_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s]
[p][s]
[p][p]
```

Ingredientes:
- `p` = Calcita (`minecraft:calcite`)
- `s` = Hilo (`minecraft:string`)

### Puerta biombo de madera (`cluttered:wooden_screen_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s]
[p][s]
[p][p]
```

Ingredientes:
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = Hilo (`minecraft:string`)

### Puerta de arce fluorescente (`cluttered:fluorescent_maple_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Puerta de art nouveau (`cluttered:art_nouveau_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s]
[s][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de roble (`minecraft:oak_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de dynasty (`cluttered:dynasty_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][c]
[w][c]
[w][w]
```

Ingredientes:
- `c` = Lingote de cobre (`minecraft:copper_ingot`)
- `w` = Tablones de warped (`minecraft:warped_planks`)

### Puerta de hongo azul (`cluttered:blue_mushroom_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Puerta de hongo rojo (`cluttered:red_mushroom_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Puerta de manzano silvestre (`cluttered:crabapple_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Puerta de manzano silvestre florido (`cluttered:flowering_crabapple_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)

### Puerta de oscuro art nouveau (`cluttered:art_nouveau_door_dark`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s]
[s][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de abeto (`minecraft:spruce_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Puerta de sauce (`cluttered:willow_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Puerta de sauce florido log (`cluttered:flowering_willow_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)

### Puerta de sauce garden (`cluttered:willow_garden_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][b]
[p][b]
[p][b]
```

Ingredientes:
- `b` = Hierro bars (`minecraft:iron_bars`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Puerta de sauce log (`cluttered:willow_log_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][b]
[p][p]
[p][b]
```

Ingredientes:
- `b` = etiqueta Tronco de sauce (`#minecraft:willow_log`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Puerta de sicomoro (`cluttered:sycamore_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)

### Puerta de álamo (`cluttered:poplar_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de álamo (`cluttered:poplar_planks`)

### Puerta de álamo florido (`cluttered:flowering_poplar_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)

### Puerta francesa de alabastro (`cluttered:alabaster_french_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g]
[p][g]
[p][g]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Calcita (`minecraft:calcite`)

### Puerta francesa de madera (`cluttered:wooden_french_door`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g]
[p][g]
[p][g]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Pulido calcedonia (`cluttered:chalcedony_polished`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r]
[r][r]
```

Ingredientes:
- `r` = Calcedonia (`cluttered:raw_chalcedony`)

### Pulido calcedonia profunda (`cluttered:deep_chalcedony_polished`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r]
[r][r]
```

Ingredientes:
- `r` = Calcedonia profunda (`cluttered:deep_raw_chalcedony`)

### Pulido mármol (`cluttered:marble_polished`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r]
[r][r]
```

Ingredientes:
- `r` = Mármol (`cluttered:raw_marble`)

### Revestimiento de arce fluorescente (`cluttered:fluorescent_maple_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de arce fluorescente (`cluttered:fluorescent_maple_slab`)
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Revestimiento de autumn aubergine (`cluttered:halloween_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][j][s]
[w][w][w]
```

Ingredientes:
- `j` = Carved pumpkin (`minecraft:carved_pumpkin`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Revestimiento de chocolate chip (`cluttered:brown_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][d][s]
[w][w][w]
```

Ingredientes:
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Revestimiento de cotton candy (`cluttered:blue_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[w][w][w]
```

Ingredientes:
- `b` = Tinte celeste (`minecraft:light_blue_dye`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Revestimiento de hongo azul (`cluttered:blue_mushroom_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de hongo azul (`cluttered:blue_mushroom_slab`)
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Revestimiento de hongo rojo (`cluttered:red_mushroom_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de hongo rojo (`cluttered:red_mushroom_slab`)
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Revestimiento de macabre mauve (`cluttered:ghost_wallpaper_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[w][w][w]
```

Ingredientes:
- `b` = Hueso (`minecraft:bone`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `w` = etiqueta Tablones (`#minecraft:planks`)

### Revestimiento de manzano silvestre (`cluttered:crabapple_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de manzano silvestre (`cluttered:crabapple_slab`)
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Revestimiento de manzano silvestre florido (`cluttered:flowering_crabapple_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de manzano silvestre florido (`cluttered:flowering_crabapple_slab`)
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)

### Revestimiento de sauce (`cluttered:willow_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de sauce (`cluttered:willow_slab`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Revestimiento de sauce florido (`cluttered:flowering_willow_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de sauce florido (`cluttered:flowering_willow_slab`)
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)

### Revestimiento de sicomoro (`cluttered:sycamore_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de sicomoro (`cluttered:sycamore_slab`)
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)

### Revestimiento de álamo (`cluttered:poplar_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de álamo (`cluttered:poplar_slab`)
- `p` = Tablones de álamo (`cluttered:poplar_planks`)

### Revestimiento de álamo florido (`cluttered:flowering_poplar_wainscoting`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[p][p][p]
```

Ingredientes:
- `b` = Losa de álamo florido (`cluttered:flowering_poplar_slab`)
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)

### Rosado tiles (`cluttered:tiles_pink`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t]
[t][t]
```

Ingredientes:
- `t` = Rosado concreto (`minecraft:pink_concrete`)

### Rosette tile (`cluttered:rosette_tiles`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][b][t]
[t][t][t]
```

Ingredientes:
- `b` = Rose bush (`minecraft:rose_bush`)
- `t` = Terracota (`minecraft:terracotta`)

### Sauce flor carpet (`cluttered:flower_carpet_willow`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Hojas de sauce florido (`cluttered:flowering_willow_leaves`)

### Seismic tile (`cluttered:seismic_tiles`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[t][b][t]
[t][t][t]
```

Ingredientes:
- `b` = Gunpowder (`minecraft:gunpowder`)
- `t` = Terracota (`minecraft:terracotta`)

### Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de arce fluorescente (`#minecraft:fluorescent_maple_log`)

### Tablones de hongo azul (`cluttered:blue_mushroom_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de hongo azul (`#minecraft:blue_mushroom_log`)

### Tablones de hongo rojo (`cluttered:red_mushroom_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de hongo rojo (`#minecraft:red_mushroom_log`)

### Tablones de manzano silvestre (`cluttered:crabapple_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de manzano silvestre (`#minecraft:crabapple_log`)

### Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de manzano silvestre florido (`#minecraft:flowering_crabapple_log`)

### Tablones de sauce (`cluttered:willow_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de sauce (`#minecraft:willow_log`)

### Tablones de sauce florido (`cluttered:flowering_willow_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de sauce florido (`#minecraft:flowering_willow_log`)

### Tablones de sicomoro (`cluttered:sycamore_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de sicomoro (`#minecraft:sycamore_log`)

### Tablones de álamo (`cluttered:poplar_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de álamo (`#minecraft:poplar_log`)

### Tablones de álamo florido (`cluttered:flowering_poplar_planks`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Tronco de álamo florido (`#minecraft:flowering_poplar_log`)

### Baldosas X invertidas de terracota (`cluttered:x_tile_terracotta_inverse`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][q][t]
[q][t][q]
[t][q][t]
```

Ingredientes:
- `q` = Terracota (`minecraft:terracotta`)
- `t` = Block of cuarzo (`minecraft:quartz_block`)

### Baldosas X de terracota (`cluttered:x_tile_terracotta`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][q][t]
[q][t][q]
[t][q][t]
```

Ingredientes:
- `q` = Block of cuarzo (`minecraft:quartz_block`)
- `t` = Terracota (`minecraft:terracotta`)

### Trampilla de arce fluorescente (`cluttered:fluorescent_maple_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Trampilla de hongo azul (`cluttered:blue_mushroom_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Trampilla de hongo rojo (`cluttered:red_mushroom_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Trampilla de manzano silvestre (`cluttered:crabapple_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Trampilla de manzano silvestre florido (`cluttered:flowering_crabapple_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)

### Trampilla de sauce (`cluttered:willow_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Trampilla de sauce florido (`cluttered:flowering_willow_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)

### Trampilla de sicomoro (`cluttered:sycamore_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)

### Trampilla de álamo (`cluttered:poplar_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de álamo (`cluttered:poplar_planks`)

### Trampilla de álamo florido (`cluttered:flowering_poplar_trapdoor`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)

### Valla de arce fluorescente (`cluttered:fluorescent_maple_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla de hongo azul (`cluttered:blue_mushroom_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla de hongo rojo (`cluttered:red_mushroom_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla de manzano silvestre (`cluttered:crabapple_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla de manzano silvestre florido (`cluttered:flowering_crabapple_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla de sauce (`cluttered:willow_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de sauce (`cluttered:willow_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla de sauce florido (`cluttered:flowering_willow_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla de sicomoro (`cluttered:sycamore_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla de álamo (`cluttered:poplar_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de álamo (`cluttered:poplar_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla de álamo florido (`cluttered:flowering_poplar_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][s][p]
[p][s][p]
```

Ingredientes:
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Valla decorativa de wood (`cluttered:wooden_picket_fence`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
```

Ingredientes:
- `t` = etiqueta Madera fences (`#minecraft:wooden_fences`)

### Ventana de arce fluorescente (`cluttered:fluorescent_maple_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Ventana de gato negro (`cluttered:black_cat_window`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][ ][b]
[g][b][g]
[b][b][b]
```

Ingredientes:
- `b` = Negro concreto (`minecraft:black_concrete`)
- `g` = Vidrio (`minecraft:glass`)

### Ventana de hongo azul (`cluttered:blue_mushroom_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Ventana de hongo rojo (`cluttered:red_mushroom_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Ventana de madera (`cluttered:wooden_window_divided`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[g][s][g]
[s][s][s]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Ventana de manzano silvestre (`cluttered:crabapple_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Ventana de manzano silvestre florido (`cluttered:flowering_crabapple_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)

### Ventana de sauce (`cluttered:willow_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)

### Ventana de sauce florido (`cluttered:flowering_willow_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de sauce florido (`cluttered:flowering_willow_planks`)

### Ventana de sicomoro (`cluttered:sycamore_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)

### Ventana de álamo (`cluttered:poplar_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de álamo (`cluttered:poplar_planks`)

### Ventana de álamo florido (`cluttered:flowering_poplar_window`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[g][g][g]
[p][p][p]
```

Ingredientes:
- `g` = Vidrio (`minecraft:glass`)
- `p` = Tablones de álamo florido (`cluttered:flowering_poplar_planks`)

### Verdant tile (`cluttered:verdant_tile`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[q][q][q]
[q][g][q]
[q][q][q]
```

Ingredientes:
- `g` = Tinte verde (`minecraft:green_dye`)
- `q` = Cuarzo del Nether (`minecraft:quartz`)

### Verde tiles (`cluttered:tiles_green`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t]
[t][t]
```

Ingredientes:
- `t` = Verde concreto (`minecraft:green_concrete`)

### Wood victorian bracket (`cluttered:wooden_victorian_bracket`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[ ][t][s]
[ ][ ][s]
```

Ingredientes:
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `t` = etiqueta Escaleras de madera (`#minecraft:wooden_stairs`)

### Álamo flor carpet (`cluttered:flower_carpet_poplar`) x8

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Hojas de álamo florido (`cluttered:flowering_poplar_leaves`)

## Decoración, muebles y varios

### Ace flag (`cluttered:animated_flag_asexual`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[n][i][n]
[b][w][p]
[b][w][p]
```

Ingredientes:
- `b` = Negro wool (`minecraft:black_wool`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `n` = Hierro nugget (`minecraft:iron_nugget`)
- `p` = Morado wool (`minecraft:purple_wool`)
- `w` = Blanco wool (`minecraft:white_wool`)

### Amarillo bicycle (`cluttered:bicycle_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][ ][ ]
[i][d][i]
[g][ ][g]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `g` = Grindstone (`minecraft:grindstone`)
- `i` = Hierro bars (`minecraft:iron_bars`)

### Amarillo bicycle with flores (`cluttered:bicycle_with_flowers_yellow`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Amarillo bicycle (`cluttered:bicycle_yellow`)
- etiqueta Flores (`#minecraft:flowers`)

### Amarillo flor shelf vela (`cluttered:flower_shelf_candle_yellow`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d]
[w]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `w` = Panal (`minecraft:honeycomb`)

### Amarillo retro fridge (`cluttered:retro_fridge_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][i]
[i][f][i]
[i][b][i]
```

Ingredientes:
- `b` = Block of hierro (`minecraft:iron_block`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `f` = Packed ice (`minecraft:packed_ice`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Amarillo retro toaster (`cluttered:retro_toaster_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][l]
[i][m][i]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `m` = Bloque de magma (`minecraft:magma_block`)

### Amarillo spool of hilo (`cluttered:spool_of_thread_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][y][s]
[s][p][s]
```

Ingredientes:
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = Hilo (`minecraft:string`)
- `y` = Tinte amarillo (`minecraft:yellow_dye`)

### Amarillo tarrey town planter (`cluttered:tarrey_town_planter_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][d][w]
[w][b][w]
[w][b][w]
```

Ingredientes:
- `b` = Bloque de hueso (`minecraft:bone_block`)
- `d` = Tierra (`minecraft:dirt`)
- `w` = Tablones de álamo (`cluttered:poplar_planks`)

### Antiguo bookstand (`cluttered:antique_book_stand`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][l][ ]
[ ][s][ ]
[s][ ][s]
```

Ingredientes:
- `l` = Lectern (`minecraft:lectern`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Antiguo codex (`cluttered:ancient_codex`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][l][ ]
[ ][s][ ]
[p][p][p]
```

Ingredientes:
- `l` = Lectern (`minecraft:lectern`)
- `p` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Antiguo library libros (`cluttered:antique_library_books`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b]
```

Ingredientes:
- `b` = Row of libros (`cluttered:row_of_small_books`)

### Antiguo map (`cluttered:antique_map`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][k][ ]
[k][m][k]
[ ][k][ ]
```

Ingredientes:
- `k` = Dried kelp (`minecraft:dried_kelp`)
- `m` = Empty map (`minecraft:map`)

### Antiguo sewing machine (`cluttered:sewing_machine_antique`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][i][i]
[i][ ][t]
[i][i][p]
```

Ingredientes:
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `p` = Placa de presión de heavy weighted (`minecraft:heavy_weighted_pressure_plate`)
- `t` = Hilo (`minecraft:string`)

### Arcoíris flag (`cluttered:animated_flag_rainbow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[n][i][n]
[r][y][p]
[o][g][b]
```

Ingredientes:
- `b` = Azul wool (`minecraft:blue_wool`)
- `g` = Verde wool (`minecraft:green_wool`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `n` = Hierro nugget (`minecraft:iron_nugget`)
- `o` = Naranjo wool (`minecraft:orange_wool`)
- `p` = Morado wool (`minecraft:purple_wool`)
- `r` = Rojo wool (`minecraft:red_wool`)
- `y` = Amarillo wool (`minecraft:yellow_wool`)

### Azul bicycle (`cluttered:bicycle_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][ ][ ]
[i][d][i]
[g][ ][g]
```

Ingredientes:
- `d` = Tinte azul (`minecraft:blue_dye`)
- `g` = Grindstone (`minecraft:grindstone`)
- `i` = Hierro bars (`minecraft:iron_bars`)

### Azul bicycle with flores (`cluttered:bicycle_with_flowers_blue`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Azul bicycle (`cluttered:bicycle_blue`)
- etiqueta Flores (`#minecraft:flowers`)

### Azul birdhouse (`cluttered:birdhouse_blue`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tinte azul (`minecraft:blue_dye`)
- Wood birdhouse (`cluttered:birdhouse_unpainted`)

### Azul flor shelf vela (`cluttered:flower_shelf_candle_blue`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d]
[w]
```

Ingredientes:
- `d` = Tinte celeste (`minecraft:light_blue_dye`)
- `w` = Panal (`minecraft:honeycomb`)

### Azul gumball machine (`cluttered:gumball_machine_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[g][s][g]
[ ][i][ ]
```

Ingredientes:
- `d` = Tinte azul (`minecraft:blue_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `s` = Sugar (`minecraft:sugar`)

### Azul retro fridge (`cluttered:retro_fridge_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][i]
[i][f][i]
[i][b][i]
```

Ingredientes:
- `b` = Block of hierro (`minecraft:iron_block`)
- `d` = Tinte azul (`minecraft:blue_dye`)
- `f` = Packed ice (`minecraft:packed_ice`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Azul retro toaster (`cluttered:retro_toaster_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][l]
[i][m][i]
```

Ingredientes:
- `d` = Tinte azul (`minecraft:blue_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `m` = Bloque de magma (`minecraft:magma_block`)

### Azul sandseal plush (`cluttered:sand_seal_plush_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][w][b]
[w][s][w]
```

Ingredientes:
- `b` = etiqueta Buttons (`#minecraft:buttons`)
- `s` = etiqueta Arena (`#minecraft:sand`)
- `w` = Azul wool (`minecraft:blue_wool`)

### Azul tarrey town planter (`cluttered:tarrey_town_planter_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][d][w]
[w][b][w]
[w][b][w]
```

Ingredientes:
- `b` = Bloque de hueso (`minecraft:bone_block`)
- `d` = Tierra (`minecraft:dirt`)
- `w` = Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Baking ingredients (`cluttered:sweetheart_baking_set_ingredients`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Bowl (`minecraft:bowl`)
- Cocoa beans (`minecraft:cocoa_beans`)
- Egg (`minecraft:egg`)
- Wheat crops (`minecraft:wheat`)

### Beige tarrey town planter (`cluttered:tarrey_town_planter_beige`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][b][p]
[w][b][w]
```

Ingredientes:
- `b` = Bloque de hueso (`minecraft:bone_block`)
- `d` = Tierra (`minecraft:dirt`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = etiqueta Logs (`#minecraft:logs`)

### Bi flag (`cluttered:animated_flag_bisexual`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[n][i][n]
[m][p][b]
[m][p][b]
```

Ingredientes:
- `b` = Azul wool (`minecraft:blue_wool`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `m` = Magenta wool (`minecraft:magenta_wool`)
- `n` = Hierro nugget (`minecraft:iron_nugget`)
- `p` = Morado wool (`minecraft:purple_wool`)

### Biblioteca de cottage (`cluttered:cottage_bookcase`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][s][b]
[b][b][b]
[b][c][b]
```

Ingredientes:
- `b` = Tablones de abedul (`minecraft:birch_planks`)
- `c` = Cofre (`minecraft:chest`)
- `s` = Estantería (`minecraft:bookshelf`)

### Biblioteca de fwish (`cluttered:fwish_bookcase`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][f][f]
[s][s][s]
[s][s][s]
```

Ingredientes:
- `f` = etiqueta Fishes (`#minecraft:fishes`)
- `s` = Estantería (`minecraft:bookshelf`)

### Biblioteca de pequeño (`cluttered:small_bookcase`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][b][d]
[d][b][d]
```

Ingredientes:
- `b` = Estantería (`minecraft:bookshelf`)
- `d` = Tablones de roble oscuro (`minecraft:dark_oak_planks`)

### Blanco retro fridge (`cluttered:retro_fridge_white`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][i]
[i][f][i]
[i][b][i]
```

Ingredientes:
- `b` = Block of hierro (`minecraft:iron_block`)
- `d` = Tinte blanco (`minecraft:white_dye`)
- `f` = Packed ice (`minecraft:packed_ice`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Blanco retro toaster (`cluttered:retro_toaster_white`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][l]
[i][m][i]
```

Ingredientes:
- `d` = Tinte blanco (`minecraft:white_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `m` = Bloque de magma (`minecraft:magma_block`)

### Frasco de mermelada de damasco (`cluttered:jam_jar_apricot`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][h][g]
[g][s][g]
```

Ingredientes:
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `g` = Vidrio (`minecraft:glass`)
- `h` = Bayas dulces (`minecraft:sweet_berries`)
- `s` = Azúcar (`minecraft:sugar`)

### Frasco de mermelada de arándano (`cluttered:jam_jar_blueberry`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][h][g]
[g][s][g]
```

Ingredientes:
- `d` = Tinte azul (`minecraft:blue_dye`)
- `g` = Vidrio (`minecraft:glass`)
- `h` = Bayas dulces (`minecraft:sweet_berries`)
- `s` = Azúcar (`minecraft:sugar`)

### Frasco de mermelada de cereza (`cluttered:jam_jar_cherry`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][h][g]
[g][s][g]
```

Ingredientes:
- `d` = Tinte rojo (`minecraft:red_dye`)
- `g` = Vidrio (`minecraft:glass`)
- `h` = Bayas dulces (`minecraft:sweet_berries`)
- `s` = Azúcar (`minecraft:sugar`)

### Frasco de miel (`cluttered:jam_jar_honey`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][h][g]
[g][s][g]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `g` = Vidrio (`minecraft:glass`)
- `h` = Botella de miel (`minecraft:honey_bottle`)
- `s` = Azúcar (`minecraft:sugar`)

### Frasco de mermelada de naranja (`cluttered:jam_jar_orange`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][h][g]
[g][s][g]
```

Ingredientes:
- `d` = Tinte naranjo (`minecraft:orange_dye`)
- `g` = Vidrio (`minecraft:glass`)
- `h` = Bayas dulces (`minecraft:sweet_berries`)
- `s` = Azúcar (`minecraft:sugar`)

### Frasco de mermelada de frutilla (`cluttered:jam_jar_strawberry`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][h][g]
[g][s][g]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `g` = Vidrio (`minecraft:glass`)
- `h` = Bayas dulces (`minecraft:sweet_berries`)
- `s` = Azúcar (`minecraft:sugar`)

### Frasco pequeño de mermelada de damasco (`cluttered:mini_jam_jar_apricot`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- Frasco de mermelada de damasco (`cluttered:jam_jar_apricot`)

### Frasco pequeño de mermelada de arándano (`cluttered:mini_jam_jar_blueberry`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- Frasco de mermelada de arándano (`cluttered:jam_jar_blueberry`)

### Frasco pequeño de mermelada de cereza (`cluttered:mini_jam_jar_cherry`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- Frasco de mermelada de cereza (`cluttered:jam_jar_cherry`)

### Frasco pequeño de miel (`cluttered:mini_jam_jar_honey`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- Frasco de miel (`cluttered:jam_jar_honey`)

### Frasco pequeño de mermelada de naranja (`cluttered:mini_jam_jar_orange`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- Frasco de mermelada de naranja (`cluttered:jam_jar_orange`)

### Frasco pequeño de mermelada de frutilla (`cluttered:mini_jam_jar_strawberry`) x4

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- Frasco de mermelada de frutilla (`cluttered:jam_jar_strawberry`)

### Frasco de mermelada de damasco desde pequeños (`cluttered:jam_jar_apricot_from_mini`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- 4x Frasco pequeño de mermelada de damasco (`cluttered:mini_jam_jar_apricot`)

### Frasco de mermelada de arándano desde pequeños (`cluttered:jam_jar_blueberry_from_mini`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- 4x Frasco pequeño de mermelada de arándano (`cluttered:mini_jam_jar_blueberry`)

### Frasco de mermelada de cereza desde pequeños (`cluttered:jam_jar_cherry_from_mini`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- 4x Frasco pequeño de mermelada de cereza (`cluttered:mini_jam_jar_cherry`)

### Frasco de miel desde pequeños (`cluttered:jam_jar_honey_from_mini`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- 4x Frasco pequeño de miel (`cluttered:mini_jam_jar_honey`)

### Frasco de mermelada de naranja desde pequeños (`cluttered:jam_jar_orange_from_mini`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- 4x Frasco pequeño de mermelada de naranja (`cluttered:mini_jam_jar_orange`)

### Frasco de mermelada de frutilla desde pequeños (`cluttered:jam_jar_strawberry_from_mini`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes:
- 4x Frasco pequeño de mermelada de frutilla (`cluttered:mini_jam_jar_strawberry`)

### Blossom garland (`cluttered:garland_blossom`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[f][ ][f]
[ ][f][ ]
```

Ingredientes:
- `f` = etiqueta Pequeño flores (`#minecraft:small_flowers`)
- `s` = Hilo (`minecraft:string`)

### Blueberry muffin (`cluttered:blueberry_muffin`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Dyes azul (`#forge:dyes/blue`)
- Pastry plate (`cluttered:pastry_plate`)
- Sugar (`minecraft:sugar`)
- Sweet berries (`minecraft:sweet_berries`)

### Botón de arce fluorescente (`cluttered:fluorescent_maple_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Botón de hongo azul (`cluttered:blue_mushroom_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de hongo azul (`cluttered:blue_mushroom_planks`)

### Botón de hongo rojo (`cluttered:red_mushroom_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Botón de manzano silvestre (`cluttered:crabapple_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Botón de manzano silvestre florido (`cluttered:flowering_crabapple_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de manzano silvestre florido (`cluttered:flowering_crabapple_planks`)

### Botón de sauce (`cluttered:willow_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de sauce (`cluttered:willow_planks`)

### Botón de sauce florido (`cluttered:flowering_willow_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de sauce florido (`cluttered:flowering_willow_planks`)

### Botón de sicomoro (`cluttered:sycamore_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de sicomoro (`cluttered:sycamore_planks`)

### Botón de álamo (`cluttered:poplar_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de álamo (`cluttered:poplar_planks`)

### Botón de álamo florido (`cluttered:flowering_poplar_button`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tablones de álamo florido (`cluttered:flowering_poplar_planks`)

### Box of paints (`cluttered:box_of_paints`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][b][y]
[p][c][p]
```

Ingredientes:
- `b` = Tinte azul (`minecraft:blue_dye`)
- `c` = Bowl (`minecraft:bowl`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `r` = Tinte rojo (`minecraft:red_dye`)
- `y` = Tinte amarillo (`minecraft:yellow_dye`)

### Brass key (`cluttered:brass_key`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][c]
[c][ ]
[c][n]
```

Ingredientes:
- `c` = Lingote de cobre (`minecraft:copper_ingot`)
- `n` = Hierro nugget (`minecraft:iron_nugget`)

### Briefcase (`cluttered:briefcase_blank`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][t][ ]
[l][c][l]
[ ][l][ ]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `l` = Leather (`minecraft:leather`)
- `t` = Tripwire hook (`minecraft:tripwire_hook`)

### Bulletin board (`cluttered:bulletin_board`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][i][l]
```

Ingredientes:
- `i` = Item frame (`minecraft:item_frame`)
- `l` = etiqueta Logs (`#minecraft:logs`)

### Bunny bookends (`cluttered:bunny_book_ends`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][r][ ]
[b][b][b]
[ ][r][ ]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `r` = Rabbit hide (`minecraft:rabbit_hide`)

### Bunny garland (`cluttered:garland_bunny`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[w][p][w]
[ ][w][ ]
```

Ingredientes:
- `p` = Papel (`minecraft:paper`)
- `s` = Hilo (`minecraft:string`)
- `w` = Tinte blanco (`minecraft:white_dye`)

### Caged bulb (`cluttered:caged_bulb`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][i][ ]
[i][l][i]
[ ][i][ ]
```

Ingredientes:
- `i` = Hierro bars (`minecraft:iron_bars`)
- `l` = Farol (`minecraft:lantern`)

### Cama de hongo azul (`cluttered:blue_mushroom_bed`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][b][r]
```

Ingredientes:
- `b` = etiqueta Beds (`#minecraft:beds`)
- `r` = Hongo azul cap (`cluttered:blue_mushroom_cap`)

### Cama de hongo rojo (`cluttered:red_mushroom_bed`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][b][r]
```

Ingredientes:
- `b` = etiqueta Beds (`#minecraft:beds`)
- `r` = Hongo rojo cap (`cluttered:red_mushroom_cap`)

### Cama de madera oscura geometric (`cluttered:darkwood_bed_geometric`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s]
[g][o]
[s][s]
```

Ingredientes:
- `g` = Cama de cian (`minecraft:cyan_bed`)
- `o` = Cama de naranjo (`minecraft:orange_bed`)
- `s` = Tronco de abeto (`minecraft:spruce_log`)

### Cama de madera oscura quilted (`cluttered:darkwood_bed_quilted`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s]
[b][l]
[s][s]
```

Ingredientes:
- `b` = Cama de azul (`minecraft:blue_bed`)
- `l` = Cama de celeste (`minecraft:light_blue_bed`)
- `s` = Tronco de abeto (`minecraft:spruce_log`)

### Cama de madera oscura southern flair (`cluttered:darkwood_bed_southern_flair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s]
[g][r]
[s][s]
```

Ingredientes:
- `g` = Cama de verde (`minecraft:green_bed`)
- `r` = Cama de rojo (`minecraft:red_bed`)
- `s` = Tronco de abeto (`minecraft:spruce_log`)

### Cama de pastel (`cluttered:pastel_bed`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][w]
[w][b][w]
```

Ingredientes:
- `b` = etiqueta Beds (`#minecraft:beds`)
- `p` = Tinte morado (`minecraft:purple_dye`)
- `w` = Tablones de warped (`minecraft:warped_planks`)

### Canasta of flores (`cluttered:basket_of_flowers`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][t][f]
[w][ ][w]
[w][w][w]
```

Ingredientes:
- `f` = etiqueta Pequeño flores (`#minecraft:small_flowers`)
- `t` = etiqueta Flores altas (`#minecraft:tall_flowers`)
- `w` = Bloque de wicker (`cluttered:wicker_block`)

### Canasta of produce (`cluttered:basket_of_produce`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][p][g]
[w][ ][w]
[w][w][w]
```

Ingredientes:
- `c` = Carrot (`minecraft:carrot`)
- `g` = Wheat crops (`minecraft:wheat`)
- `p` = Potato (`minecraft:potato`)
- `w` = Bloque de wicker (`cluttered:wicker_block`)

### Card index (`cluttered:card_index`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[c][n][c]
[p][p][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `n` = Papel (`minecraft:paper`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Cardboard box (`cluttered:cardboard_box_open`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][p]
[p][p][p]
```

Ingredientes:
- `p` = Papel (`minecraft:paper`)

### Cat mugs (`cluttered:cat_mugs_cluttered`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
```

Ingredientes:
- `p` = Maceta (`minecraft:flower_pot`)

### Cauldron poster (`cluttered:cauldron_poster`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][c][p]
[p][p][p]
```

Ingredientes:
- `c` = Cauldron (`minecraft:cauldron`)
- `p` = Papel (`minecraft:paper`)

### Cinnamon bun (`cluttered:cinnamon_bun`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Crops wheat (`#forge:crops/wheat`)
- Miel bottle (`minecraft:honey_bottle`)
- Pastry plate (`cluttered:pastry_plate`)

### Cluttered bulletin board (`cluttered:bulletin_board_cluttered`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Bulletin board (`cluttered:bulletin_board`)
- Papel (`minecraft:paper`) x3

### Cluttered marrón desk (`cluttered:desk_brown_cluttered`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Candles (`#minecraft:candles`)
- Libro (`minecraft:book`)
- Maceta (`minecraft:flower_pot`)
- Marrón desk (`cluttered:desk_brown`)

### Cluttered verde desk (`cluttered:desk_green_cluttered`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Candles (`#minecraft:candles`)
- Libro (`minecraft:book`)
- Maceta (`minecraft:flower_pot`)
- Verde desk (`cluttered:desk_green`)

### Cobre watering can (`cluttered:watering_can_copper`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][ ][i]
[i][b][i]
[i][i][i]
```

Ingredientes:
- `b` = Bowl (`minecraft:bowl`)
- `i` = Lingote de cobre (`minecraft:copper_ingot`)

### Coffee grinder (`cluttered:coffee_grinder`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][i][l]
[i][b][i]
[p][p][p]
```

Ingredientes:
- `b` = Cocoa beans (`minecraft:cocoa_beans`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Colgante de moon (`cluttered:moon_pendant`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][s][g]
[g][g][ ]
[ ][g][g]
```

Ingredientes:
- `g` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- `s` = Hilo (`minecraft:string`)

### Colgante de star (`cluttered:stars_pendant`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s]
[g]
[s]
```

Ingredientes:
- `g` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- `s` = Hilo (`minecraft:string`)

### Croissant (`cluttered:croissant`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Egg (`minecraft:egg`)
- etiqueta Crops wheat (`#forge:crops/wheat`)
- Pastry plate (`cluttered:pastry_plate`)

### Cupid bench (`cluttered:cupid_bench`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][f][f]
[p][p][p]
[f][ ][f]
```

Ingredientes:
- `f` = Valla decorativa de mármol (`cluttered:marble_picket_fence`)
- `p` = Losa de mármol (`cluttered:marble_slab`)

### Cómoda de mermaid (`cluttered:mermaid_dresser`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][n][p]
[p][c][p]
[p][p][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `n` = Nautilus shell (`minecraft:nautilus_shell`)
- `p` = Prismarine fragmento (`minecraft:prismarine_shard`)

### Decorativo pineapple (`cluttered:pineapple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g]
[c]
[d]
```

Ingredientes:
- `c` = Cactus (`minecraft:cactus`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `g` = Pasto corto (`minecraft:short_grass`)

### Drying herbs (`cluttered:drying_herbs`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[g][f][g]
```

Ingredientes:
- `f` = Fern (`minecraft:fern`)
- `g` = Pasto corto (`minecraft:short_grass`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Endtable decor (`cluttered:endtable_decor`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Libro (`minecraft:book`)
- Maceta (`minecraft:flower_pot`)
- Painting (`minecraft:painting`)

### Envelope stack (`cluttered:envelope_stack`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][w][ ]
[p][p][p]
```

Ingredientes:
- `p` = Papel (`minecraft:paper`)
- `w` = Panal (`minecraft:honeycomb`)

### Estantería de bambú (`cluttered:bamboo_bookshelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][s][b]
[b][s][b]
[b][s][b]
```

Ingredientes:
- `b` = Block of bambú (`minecraft:bamboo_block`)
- `s` = Estantería (`minecraft:bookshelf`)

### Estantería de pastel madera block (`cluttered:wooden_block_bookshelf_pastel`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[b][b][b]
[s][y][s]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `p` = Tinte rosado (`minecraft:pink_dye`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `y` = Tinte amarillo (`minecraft:yellow_dye`)

### Eyes (`cluttered:eye_block`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[m][m][m]
[s][b][s]
[m][m][m]
```

Ingredientes:
- `b` = Bloque de brain coral (`minecraft:brain_coral_block`)
- `m` = En bruto beef (`minecraft:beef`)
- `s` = Spider eye (`minecraft:spider_eye`)

### Fabric bolts (`cluttered:fabric_bolts`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][g][ ]
[b][g][p]
[b][ ][p]
```

Ingredientes:
- `b` = Azul wool (`minecraft:blue_wool`)
- `g` = Verde wool (`minecraft:green_wool`)
- `p` = Morado wool (`minecraft:purple_wool`)

### Farol de colosseo (`cluttered:colosseo_wall_lantern`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][ ][l]
[i][i][i]
[i][i][ ]
```

Ingredientes:
- `i` = Hierro bars (`minecraft:iron_bars`)
- `l` = Farol (`minecraft:lantern`)

### Farol de hoppin park (`cluttered:hoppin_park_lantern`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f]
[l]
[p]
```

Ingredientes:
- `f` = etiqueta Flores (`#minecraft:flowers`)
- `l` = Farol (`minecraft:lantern`)
- `p` = Tinte rosado (`minecraft:pink_dye`)

### Farol de sea gem (`cluttered:sea_gem_lantern`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][p][g]
[g][g][g]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = Prismarine crystals (`minecraft:prismarine_crystals`)

### Filing box (`cluttered:filing_box`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][c][p]
[p][ ][p]
[p][p][p]
```

Ingredientes:
- `c` = Lingote de cobre (`minecraft:copper_ingot`)
- `p` = Papel (`minecraft:paper`)

### Flor shelf plant (`cluttered:flower_shelf_plant`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[v][v]
[p][v]
```

Ingredientes:
- `p` = Maceta (`minecraft:flower_pot`)
- `v` = Enredaderas (`minecraft:vine`)

### Flor tea kettle (`cluttered:flower_tea_kettle`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][t][ ]
[g][f][g]
[g][g][g]
```

Ingredientes:
- `f` = etiqueta Flores (`#minecraft:flowers`)
- `g` = Blanco glazed terracota (`minecraft:white_glazed_terracotta`)
- `t` = Tripwire hook (`minecraft:tripwire_hook`)

### Fluorescent tarrey town planter (`cluttered:tarrey_town_planter_fluorescent`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][d][w]
[w][b][w]
[w][b][w]
```

Ingredientes:
- `b` = Bloque de hueso (`minecraft:bone_block`)
- `d` = Tierra (`minecraft:dirt`)
- `w` = Tablones de arce fluorescente (`cluttered:fluorescent_maple_planks`)

### Gabinete de amarillo (`cluttered:kitchen_set_yellow_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de amarillo half (`cluttered:kitchen_set_yellow_cabinet_mini`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de amarillo inner (`cluttered:kitchen_set_yellow_cabinet_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[d][c][d]
[p][g][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de amarillo open (`cluttered:kitchen_set_yellow_cabinet_open`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[ ][c][ ]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de amarillo outer (`cluttered:kitchen_set_yellow_cabinet_outer_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g]
[d][c]
[p][g]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de amarillo vidrio (`cluttered:kitchen_set_yellow_cabinet_glass`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[g][c][g]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de blanco (`cluttered:kitchen_set_white_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte blanco (`minecraft:white_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de blanco half (`cluttered:kitchen_set_white_cabinet_mini`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte blanco (`minecraft:white_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de blanco inner (`cluttered:kitchen_set_white_cabinet_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[d][c][d]
[p][g][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte blanco (`minecraft:white_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de blanco open (`cluttered:kitchen_set_white_cabinet_open`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[ ][c][ ]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte blanco (`minecraft:white_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de blanco outer (`cluttered:kitchen_set_white_cabinet_outer_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g]
[d][c]
[p][g]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte blanco (`minecraft:white_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de blanco vidrio (`cluttered:kitchen_set_white_cabinet_glass`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[g][c][g]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte blanco (`minecraft:white_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de china (`cluttered:china_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][w][p]
[p][g][p]
[p][w][p]
```

Ingredientes:
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Blanco glazed terracota (`minecraft:white_glazed_terracotta`)

### Gabinete de cluttered dorado (`cluttered:dorado_cabinet_cluttered`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Bowl (`minecraft:bowl`)
- Gabinete de dorado (`cluttered:dorado_cabinet`)
- Papel (`minecraft:paper`)
- Vidrio bottle (`minecraft:glass_bottle`)

### Gabinete de cluttered havana (`cluttered:havana_cabinet_cluttered`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Bowl (`minecraft:bowl`)
- Gabinete de havana (`cluttered:havana_cabinet`)
- Papel (`minecraft:paper`)
- Vidrio bottle (`minecraft:glass_bottle`)

### Gabinete de cluttered murex (`cluttered:murex_cabinet_cluttered`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Bowl (`minecraft:bowl`)
- Gabinete de murex (`cluttered:murex_cabinet`)
- Papel (`minecraft:paper`)
- Vidrio bottle (`minecraft:glass_bottle`)

### Gabinete de dorado (`cluttered:dorado_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][c][p]
[s][s][s]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = Tablones de abeto (`minecraft:spruce_planks`)
- `s` = Losa de roble (`minecraft:oak_slab`)

### Gabinete de general store (`cluttered:general_store_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][c][p]
[p][s][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)
- `s` = etiqueta Saplings (`#minecraft:saplings`)

### Gabinete de havana (`cluttered:havana_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][c][p]
[s][s][s]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)
- `s` = Losa de roble (`minecraft:oak_slab`)

### Gabinete de lima (`cluttered:kitchen_set_light_green_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte lima (`minecraft:lime_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de lima half (`cluttered:kitchen_set_light_green_cabinet_mini`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte lima (`minecraft:lime_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de lima inner (`cluttered:kitchen_set_light_green_cabinet_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[d][c][d]
[p][g][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte lima (`minecraft:lime_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de lima open (`cluttered:kitchen_set_light_green_cabinet_open`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[ ][c][ ]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte lima (`minecraft:lime_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de lima outer (`cluttered:kitchen_set_light_green_cabinet_outer_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g]
[d][c]
[p][g]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte lima (`minecraft:lime_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de lima vidrio (`cluttered:kitchen_set_light_green_cabinet_glass`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[g][c][g]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte lima (`minecraft:lime_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de madera oscura (`cluttered:darkwood_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s]
[j][r]
[b][b]
```

Ingredientes:
- `b` = Barrel (`minecraft:barrel`)
- `j` = Vidrio bottle (`minecraft:glass_bottle`)
- `r` = Libro (`minecraft:book`)
- `s` = Losa de abeto (`minecraft:spruce_slab`)

### Gabinete de marrón (`cluttered:kitchen_set_brown_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de marrón half (`cluttered:kitchen_set_brown_cabinet_mini`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de marrón inner (`cluttered:kitchen_set_brown_cabinet_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[d][c][d]
[p][g][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de marrón open (`cluttered:kitchen_set_brown_cabinet_open`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[ ][c][ ]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de marrón outer (`cluttered:kitchen_set_brown_cabinet_outer_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g]
[d][c]
[p][g]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de marrón vidrio (`cluttered:kitchen_set_brown_cabinet_glass`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[g][c][g]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de morado (`cluttered:kitchen_set_purple_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte morado (`minecraft:purple_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de morado half (`cluttered:kitchen_set_purple_cabinet_mini`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte morado (`minecraft:purple_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de morado inner (`cluttered:kitchen_set_purple_cabinet_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[d][c][d]
[p][g][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte morado (`minecraft:purple_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de morado open (`cluttered:kitchen_set_purple_cabinet_open`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[ ][c][ ]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte morado (`minecraft:purple_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de morado outer (`cluttered:kitchen_set_purple_cabinet_outer_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g]
[d][c]
[p][g]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte morado (`minecraft:purple_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de morado vidrio (`cluttered:kitchen_set_purple_cabinet_glass`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[g][c][g]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte morado (`minecraft:purple_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de murex (`cluttered:murex_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][c][p]
[s][s][s]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)
- `s` = Losa de roble oscuro (`minecraft:dark_oak_slab`)

### Gabinete de pastel (`cluttered:pastel_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][p][ ]
[w][c][w]
[ ][p][ ]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = Tinte rosado (`minecraft:pink_dye`)
- `w` = Tablones de warped (`minecraft:warped_planks`)

### Gabinete de rosado (`cluttered:kitchen_set_pink_cabinet`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de rosado half (`cluttered:kitchen_set_pink_cabinet_mini`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de rosado inner (`cluttered:kitchen_set_pink_cabinet_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[d][c][d]
[p][g][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de rosado open (`cluttered:kitchen_set_pink_cabinet_open`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[ ][c][ ]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de rosado outer (`cluttered:kitchen_set_pink_cabinet_outer_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g]
[d][c]
[p][g]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gabinete de rosado vidrio (`cluttered:kitchen_set_pink_cabinet_glass`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][d][p]
[g][c][g]
[p][d][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Gato negro garland (`cluttered:garland_black_cat`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[b][p][b]
[ ][b][ ]
```

Ingredientes:
- `b` = Tinte negro (`minecraft:black_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = Hilo (`minecraft:string`)

### Ham sandwich (`cluttered:ham_sandwich`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Bread (`minecraft:bread`)
- Cooked porkchop (`minecraft:cooked_porkchop`)
- Pastry plate (`cluttered:pastry_plate`)

### Hand drill (`cluttered:hand_drill`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][ ]
[i][l]
[p][i]
```

Ingredientes:
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = Stonecutter (`minecraft:stonecutter`)

### Hanging cloth (`cluttered:hanging_cloth`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][p][p]
[r][r][r]
```

Ingredientes:
- `p` = Rosado carpet (`minecraft:pink_carpet`)
- `r` = Rojo carpet (`minecraft:red_carpet`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Hanging grass pot (`cluttered:hanging_plant_pot_grass`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s]
[f]
[p]
```

Ingredientes:
- `f` = Pasto corto (`minecraft:short_grass`)
- `p` = Maceta (`minecraft:flower_pot`)
- `s` = Tripwire hook (`minecraft:tripwire_hook`)

### Hanging plant shelves (`cluttered:hanging_shelves_plants`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][c][s]
[s][p][s]
```

Ingredientes:
- `c` = Maceta (`minecraft:flower_pot`)
- `p` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `s` = Hilo (`minecraft:string`)

### Hanging pottery shelves (`cluttered:hanging_shelves_pottery`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][c][s]
[s][p][s]
```

Ingredientes:
- `c` = Arcilla (`minecraft:clay`)
- `p` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `s` = Hilo (`minecraft:string`)

### Heavenly ornamental array (`cluttered:heavenly_ornamental_array`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[f][m][f]
```

Ingredientes:
- `f` = Colgante de star (`cluttered:stars_pendant`)
- `m` = Colgante de moon (`cluttered:moon_pendant`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Hello kitty pedestal (`cluttered:pedestal_hk`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[ ][w][ ]
[p][p][p]
```

Ingredientes:
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `w` = Blanco wool (`minecraft:white_wool`)

### Hongo azul tv (`cluttered:blue_mushroom_tv`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][l][ ]
[r][p][r]
[r][s][r]
```

Ingredientes:
- `l` = Lightning rod (`minecraft:lightning_rod`)
- `p` = Tinted vidrio (`minecraft:tinted_glass`)
- `r` = Hongo azul cap (`cluttered:blue_mushroom_cap`)
- `s` = Redstone dust (`minecraft:redstone`)

### Hongo jars (`cluttered:mushroom_jars`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[m][b]
[g][g]
```

Ingredientes:
- `b` = Marrón hongo (`minecraft:brown_mushroom`)
- `g` = Vidrio bottle (`minecraft:glass_bottle`)
- `m` = Hongo rojo (`minecraft:red_mushroom`)

### Hongo rojo tv (`cluttered:red_mushroom_tv`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][l][ ]
[r][p][r]
[r][s][r]
```

Ingredientes:
- `l` = Lightning rod (`minecraft:lightning_rod`)
- `p` = Tinted vidrio (`minecraft:tinted_glass`)
- `r` = Hongo rojo cap (`cluttered:red_mushroom_cap`)
- `s` = Redstone dust (`minecraft:redstone`)

### Jam jars (`cluttered:jam_jars`) x3

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Miel bottle (`minecraft:honey_bottle`)
- Sweet berries (`minecraft:sweet_berries`)
- Vidrio bottle (`minecraft:glass_bottle`) x2

### Kitchen scale (`cluttered:analog_kitchen_scale`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][p][ ]
[ ][c][ ]
[i][i][i]
```

Ingredientes:
- `c` = Compass (`minecraft:compass`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `p` = etiqueta Madera pressure plates (`#minecraft:wooden_pressure_plates`)

### Lavaplatos de amarillo counter (`cluttered:kitchen_set_yellow_counter_sink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `b` = Bucket (`minecraft:bucket`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Lavaplatos de blanco counter (`cluttered:kitchen_set_white_counter_sink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `b` = Bucket (`minecraft:bucket`)
- `d` = Tinte blanco (`minecraft:white_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Lavaplatos de gato negro (`cluttered:black_cat_sink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][b][t]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `b` = Bucket (`minecraft:bucket`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)
- `t` = Morado subway tiles (`cluttered:subway_tiles_purple`)

### Lavaplatos de lima counter (`cluttered:kitchen_set_light_green_counter_sink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `b` = Bucket (`minecraft:bucket`)
- `d` = Tinte lima (`minecraft:lime_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Lavaplatos de marrón counter (`cluttered:kitchen_set_brown_counter_sink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `b` = Bucket (`minecraft:bucket`)
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Lavaplatos de morado counter (`cluttered:kitchen_set_purple_counter_sink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `b` = Bucket (`minecraft:bucket`)
- `d` = Tinte morado (`minecraft:purple_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Lavaplatos de rosado counter (`cluttered:kitchen_set_pink_counter_sink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `b` = Bucket (`minecraft:bucket`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Lavaplatos de sweetheart (`cluttered:sweetheart_sink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][b][t]
[p][p][p]
[p][p][p]
```

Ingredientes:
- `b` = Bucket (`minecraft:bucket`)
- `p` = Tablones de jungle (`minecraft:jungle_planks`)
- `t` = Mármol subway tiles (`cluttered:marble_subway_tiles`)

### Lesbian flag (`cluttered:animated_flag_lesbian`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[n][i][n]
[o][w][p]
[o][w][p]
```

Ingredientes:
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `n` = Hierro nugget (`minecraft:iron_nugget`)
- `o` = Naranjo wool (`minecraft:orange_wool`)
- `p` = Rosado wool (`minecraft:pink_wool`)
- `w` = Blanco wool (`minecraft:white_wool`)

### Lunar observatory globe (`cluttered:lunar_observatory_globe`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][b][g]
[ ][g][ ]
[ ][g][ ]
```

Ingredientes:
- `b` = etiqueta Storage blocks oro (`#forge:storage_blocks/gold`)
- `g` = etiqueta Ingots oro (`#forge:ingots/gold`)

### Lunar observatory jars (`cluttered:lunar_observatory_jar`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- Potion (`minecraft:potion`) x2

### Lunar observatory libros (`cluttered:lunar_observatory_books`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][b][ ]
[g][b][g]
[ ][b][ ]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `g` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)

### Lunar observatory papel canasta (`cluttered:lunar_observatory_basket_of_papers`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[r][p][r]
[r][r][r]
```

Ingredientes:
- `p` = Papel (`minecraft:paper`)
- `r` = Rojo wool (`minecraft:red_wool`)

### Lámpara de amarillo pendant (`cluttered:osson_pendant_yellow`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[i][l][i]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Farol (`minecraft:lantern`)

### Lámpara de bee (`cluttered:bee_lamp`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][l][b]
```

Ingredientes:
- `b` = Panal (`minecraft:honeycomb`)
- `l` = Lámpara de redstone (`minecraft:redstone_lamp`)

### Lámpara de blanco pendant (`cluttered:osson_pendant_white`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[i][l][i]
```

Ingredientes:
- `d` = Tinte blanco (`minecraft:white_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Farol (`minecraft:lantern`)

### Lámpara de enojado bee (`cluttered:bee_lamp_angry`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Lámpara de bee (`cluttered:bee_lamp`)
- Redstone dust (`minecraft:redstone`)

### Lámpara de flor desk (`cluttered:flower_desk_lamp`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[v][s][l]
[v][ ][ ]
[m][m][ ]
```

Ingredientes:
- `l` = Lámpara de redstone (`minecraft:redstone_lamp`)
- `m` = Musgo carpet (`minecraft:moss_carpet`)
- `s` = Spore blossom (`minecraft:spore_blossom`)
- `v` = Enredaderas (`minecraft:vine`)

### Lámpara de hongo azul (`cluttered:blue_mushroom_lamp`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r]
[l]
[s]
```

Ingredientes:
- `l` = Lámpara de redstone (`minecraft:redstone_lamp`)
- `r` = Hongo azul cap (`cluttered:blue_mushroom_cap`)
- `s` = etiqueta Tronco de hongo azul (`#cluttered:blue_mushroom_log`)

### Lámpara de hongo rojo (`cluttered:red_mushroom_lamp`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r]
[l]
[s]
```

Ingredientes:
- `l` = Lámpara de redstone (`minecraft:redstone_lamp`)
- `r` = Hongo rojo cap (`cluttered:red_mushroom_cap`)
- `s` = etiqueta Tronco de hongo rojo (`#cluttered:red_mushroom_log`)

### Lámpara de lima pendant (`cluttered:osson_pendant_sage_green`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[i][l][i]
```

Ingredientes:
- `d` = Tinte lima (`minecraft:lime_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Farol (`minecraft:lantern`)

### Lámpara de marrón pendant (`cluttered:osson_pendant_brown`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[i][l][i]
```

Ingredientes:
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Farol (`minecraft:lantern`)

### Lámpara de naranjo pendant (`cluttered:osson_pendant_orange`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[i][l][i]
```

Ingredientes:
- `d` = Tinte naranjo (`minecraft:orange_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Farol (`minecraft:lantern`)

### Lámpara de negro pendant (`cluttered:osson_pendant_black`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[i][l][i]
```

Ingredientes:
- `d` = Tinte negro (`minecraft:black_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Farol (`minecraft:lantern`)

### Lámpara de panal (`cluttered:honeycomb_lamp`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[h]
[l]
[m]
```

Ingredientes:
- `h` = Bloque de panal (`minecraft:honeycomb_block`)
- `l` = Lámpara de redstone (`minecraft:redstone_lamp`)
- `m` = Musgo carpet (`minecraft:moss_carpet`)

### Lámpara de pie de antiguo (`cluttered:antique_standing_lamp`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][g][y]
[ ][l][ ]
[ ][f][ ]
```

Ingredientes:
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `g` = Verde stained vidrio pane (`minecraft:green_stained_glass_pane`)
- `l` = Lámpara de redstone (`minecraft:redstone_lamp`)
- `r` = Rojo stained vidrio pane (`minecraft:red_stained_glass_pane`)
- `y` = Amarillo stained vidrio pane (`minecraft:yellow_stained_glass_pane`)

### Lámpara de pie de cottage (`cluttered:cottage_standing_lamp`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][b][w]
[ ][d][ ]
[ ][d][ ]
```

Ingredientes:
- `b` = Lámpara de redstone (`minecraft:redstone_lamp`)
- `d` = Tablones de roble oscuro (`minecraft:dark_oak_planks`)
- `w` = Blanco carpet (`minecraft:white_carpet`)

### Lámpara de rojo pendant (`cluttered:osson_pendant_red`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[i][l][i]
```

Ingredientes:
- `d` = Tinte rojo (`minecraft:red_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Farol (`minecraft:lantern`)

### Lámpara de stained vidrio (`cluttered:stained_glass_lamp`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[n][y][n]
[y][l][y]
[ ][i][ ]
```

Ingredientes:
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lámpara de redstone (`minecraft:redstone_lamp`)
- `n` = Hierro nugget (`minecraft:iron_nugget`)
- `y` = Amarillo stained vidrio pane (`minecraft:yellow_stained_glass_pane`)

### Lámpara de steampunk (`cluttered:steampunk_lamp`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c]
[s]
[c]
```

Ingredientes:
- `c` = Lingote de cobre (`minecraft:copper_ingot`)
- `s` = Farol de soul (`minecraft:soul_lantern`)

### Lámpara de verde pendant (`cluttered:osson_pendant_racing_green`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[i][l][i]
```

Ingredientes:
- `d` = Tinte verde (`minecraft:green_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Farol (`minecraft:lantern`)

### Maceta de gato negro (`cluttered:cat_plant_pot_black`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][f][ ]
[b][p][b]
[ ][b][ ]
```

Ingredientes:
- `b` = Tinte negro (`minecraft:black_dye`)
- `f` = etiqueta Flores (`#minecraft:flowers`)
- `p` = Maceta (`minecraft:flower_pot`)

### Maceta de hanging (`cluttered:hanging_plant_pot_flowers`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s]
[f]
[p]
```

Ingredientes:
- `f` = etiqueta Flores (`#minecraft:flowers`)
- `p` = Maceta (`minecraft:flower_pot`)
- `s` = Hilo (`minecraft:string`)

### Maceta de naranjo cat (`cluttered:cat_plant_pot_orange`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][f][ ]
[o][p][o]
[ ][o][ ]
```

Ingredientes:
- `f` = etiqueta Flores (`#minecraft:flowers`)
- `o` = Tinte naranjo (`minecraft:orange_dye`)
- `p` = Maceta (`minecraft:flower_pot`)

### Madera oscura clock (`cluttered:darkwood_clock`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Clock (`minecraft:clock`)
- Tronco de abeto (`minecraft:spruce_log`)

### Madera oscura geometric sofa (`cluttered:darkwood_sofa_geometric`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][c]
```

Ingredientes:
- `c` = Sillón de madera oscura geometric (`cluttered:darkwood_chair_geometric`)

### Madera oscura quilted sofa (`cluttered:darkwood_sofa_quilted`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][c]
```

Ingredientes:
- `c` = Sillón de madera oscura quilted (`cluttered:darkwood_chair_quilted`)

### Madera oscura southern flair sofa (`cluttered:darkwood_sofa_southern_flair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][c]
```

Ingredientes:
- `c` = Sillón de madera oscura southern flair (`cluttered:darkwood_chair_southern_flair`)

### Marrón desk (`cluttered:desk_brown`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][p][p]
[f][ ][f]
```

Ingredientes:
- `f` = Valla de roble oscuro (`minecraft:dark_oak_fence`)
- `p` = Tablones de roble oscuro (`minecraft:dark_oak_planks`)
- `s` = Losa de roble oscuro (`minecraft:dark_oak_slab`)

### Mermaid pearl (`cluttered:mermaid_pearl`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][p][ ]
[c][ ][c]
```

Ingredientes:
- `c` = etiqueta Ingots cobre (`#forge:ingots/copper`)
- `p` = Corazón of the sea (`minecraft:heart_of_the_sea`)

### Mesa (`cluttered:table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[f][ ][f]
```

Ingredientes:
- `f` = Valla de roble oscuro (`minecraft:dark_oak_fence`)
- `s` = Losa de roble oscuro (`minecraft:dark_oak_slab`)

### Mesa auxiliar de amatista (`cluttered:endtable_amethyst`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Mesa auxiliar de wood (`cluttered:endtable_wood`)
- Tinte morado (`minecraft:purple_dye`)

### Mesa auxiliar de bubblegum (`cluttered:endtable_bubblegum`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Mesa auxiliar de wood (`cluttered:endtable_wood`)
- Tinte rosado (`minecraft:pink_dye`)

### Mesa auxiliar de charcoal (`cluttered:endtable_charcoal`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Mesa auxiliar de wood (`cluttered:endtable_wood`)
- Tinte negro (`minecraft:black_dye`)

### Mesa auxiliar de madera oscura (`cluttered:darkwood_endtable`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][s][ ]
[s][b][s]
[ ][s][ ]
```

Ingredientes:
- `b` = Estantería (`minecraft:bookshelf`)
- `s` = Tronco de abeto (`minecraft:spruce_log`)

### Mesa auxiliar de meadow (`cluttered:endtable_meadow`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Mesa auxiliar de wood (`cluttered:endtable_wood`)
- Tinte lima (`minecraft:lime_dye`)

### Mesa auxiliar de negro rose (`cluttered:rose_end_table_black`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][r][p]
[s][d][s]
[s][ ][s]
```

Ingredientes:
- `d` = Tinte negro (`minecraft:black_dye`)
- `p` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `r` = Rose bush (`minecraft:rose_bush`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Mesa auxiliar de periwinkle (`cluttered:endtable_periwinkle`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Mesa auxiliar de wood (`cluttered:endtable_wood`)
- Tinte cian (`minecraft:cyan_dye`)

### Mesa auxiliar de rose (`cluttered:rose_end_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][r][p]
[s][d][s]
[s][ ][s]
```

Ingredientes:
- `d` = Tinte blanco (`minecraft:white_dye`)
- `p` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `r` = Rose bush (`minecraft:rose_bush`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Mesa auxiliar de sunshine (`cluttered:endtable_sunshine`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Mesa auxiliar de wood (`cluttered:endtable_wood`)
- Tinte amarillo (`minecraft:yellow_dye`)

### Mesa auxiliar de wood (`cluttered:endtable_wood`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[s][b][s]
[s][ ][s]
```

Ingredientes:
- `b` = etiqueta Madera buttons (`#minecraft:wooden_buttons`)
- `p` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Mesa de amarillo puzzle piece (`cluttered:puzzle_piece_table_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][s][d]
[ ][f][ ]
[ ][f][ ]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de antiguo mini (`cluttered:antique_mini_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[ ][s][ ]
[s][ ][s]
```

Ingredientes:
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Mesa de azul confectionary (`cluttered:confectionery_table_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][d][d]
[s][s][s]
[f][ ][f]
```

Ingredientes:
- `d` = Tinte azul (`minecraft:blue_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de azul puzzle piece (`cluttered:puzzle_piece_table_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][s][d]
[ ][f][ ]
[ ][f][ ]
```

Ingredientes:
- `d` = Tinte azul (`minecraft:blue_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de cottage side (`cluttered:cottage_side_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][d][d]
[s][b][s]
[s][ ][s]
```

Ingredientes:
- `b` = Botón de roble oscuro (`minecraft:dark_oak_button`)
- `d` = Tablones de roble oscuro (`minecraft:dark_oak_planks`)
- `s` = Tronco de abedul sin corteza (`minecraft:stripped_birch_log`)

### Mesa de gato negro (`cluttered:black_cat_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[p][ ][p]
[p][ ][p]
```

Ingredientes:
- `p` = Tablones de sauce (`cluttered:willow_planks`)
- `t` = Morado subway tiles (`cluttered:subway_tiles_purple`)

### Mesa de hongo azul (`cluttered:blue_mushroom_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r][r]
[ ][p][ ]
```

Ingredientes:
- `p` = etiqueta Tronco de hongo azul (`#cluttered:blue_mushroom_log`)
- `r` = Hongo azul cap (`cluttered:blue_mushroom_cap`)

### Mesa de hongo rojo (`cluttered:red_mushroom_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r][r]
[ ][p][ ]
```

Ingredientes:
- `p` = etiqueta Tronco de hongo rojo (`#cluttered:red_mushroom_log`)
- `r` = Hongo rojo cap (`cluttered:red_mushroom_cap`)

### Mesa de imperial (`cluttered:imperial_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r][r]
[s][s][s]
[f][b][f]
```

Ingredientes:
- `b` = Tinte negro (`minecraft:black_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `r` = Tinte rojo (`minecraft:red_dye`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de limón (`cluttered:lemon_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[y][y][y]
[y][y][y]
[ ][l][ ]
```

Ingredientes:
- `l` = Lima concreto (`minecraft:lime_concrete`)
- `y` = Amarillo concreto (`minecraft:yellow_concrete`)

### Mesa de lunar observatory (`cluttered:lunar_observatory_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][o][s]
[f][ ][f]
```

Ingredientes:
- `f` = Valla de abeto (`minecraft:spruce_fence`)
- `o` = Losa de roble (`minecraft:oak_slab`)
- `s` = Tablones de abeto (`minecraft:spruce_planks`)

### Mesa de lunar observatory pedestal (`cluttered:lunar_observatory_pedestal_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][r][r]
[s][s][s]
[ ][f][ ]
```

Ingredientes:
- `f` = Valla de abeto (`minecraft:spruce_fence`)
- `r` = Rojo carpet (`minecraft:red_carpet`)
- `s` = Losa de abeto (`minecraft:spruce_slab`)

### Mesa de madera oscura (`cluttered:darkwood_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[d][ ][d]
```

Ingredientes:
- `d` = Taburete de madera oscura (`cluttered:darkwood_stool`)
- `s` = Losa de abeto (`minecraft:spruce_slab`)

### Mesa de pastel (`cluttered:pastel_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][o][w]
[p][p][p]
[c][ ][c]
```

Ingredientes:
- `c` = Valla de crimson (`minecraft:crimson_fence`)
- `o` = Rosado carpet (`minecraft:pink_carpet`)
- `p` = Losa de warped (`minecraft:warped_slab`)
- `w` = Blanco carpet (`minecraft:white_carpet`)

### Mesa de pastel amarillo puzzle piece (`cluttered:puzzle_piece_table_pastel_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][s][w]
[ ][f][ ]
[ ][f][ ]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `w` = Tinte blanco (`minecraft:white_dye`)

### Mesa de pastel azul puzzle piece (`cluttered:puzzle_piece_table_pastel_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][s][d]
[ ][f][ ]
[ ][f][ ]
```

Ingredientes:
- `d` = Tinte celeste (`minecraft:light_blue_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de pastel morado puzzle piece (`cluttered:puzzle_piece_table_pastel_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][s][d]
[ ][f][ ]
[ ][f][ ]
```

Ingredientes:
- `d` = Tinte morado (`minecraft:purple_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de pastel rosado puzzle piece (`cluttered:puzzle_piece_table_pastel_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][s][d]
[ ][f][ ]
[ ][f][ ]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de rojo puzzle piece (`cluttered:puzzle_piece_table_red`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][s][d]
[ ][f][ ]
[ ][f][ ]
```

Ingredientes:
- `d` = Tinte rojo (`minecraft:red_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de rosado confectionary (`cluttered:confectionery_table_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][d][d]
[s][s][s]
[f][ ][f]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de sewing (`cluttered:sewing_table_with_tablecloth`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][l][p]
[s][s][s]
[f][ ][f]
```

Ingredientes:
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `l` = etiqueta Flores (`#minecraft:flowers`)
- `p` = Morado carpet (`minecraft:purple_carpet`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesa de sweetheart (`cluttered:sweetheart_table`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[p][ ][p]
[p][ ][p]
```

Ingredientes:
- `p` = Tablones de jungle (`minecraft:jungle_planks`)
- `t` = Mármol subway tiles (`cluttered:marble_subway_tiles`)

### Mesa de verde puzzle piece (`cluttered:puzzle_piece_table_green`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][s][g]
[ ][f][ ]
[ ][f][ ]
```

Ingredientes:
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `g` = Tinte verde (`minecraft:green_dye`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Mesón de amarillo (`cluttered:kitchen_set_yellow_counter`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de amarillo inner (`cluttered:kitchen_set_yellow_counter_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de blanco (`cluttered:kitchen_set_white_counter`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte blanco (`minecraft:white_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de blanco inner (`cluttered:kitchen_set_white_counter_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `d` = Tinte blanco (`minecraft:white_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de gato negro (`cluttered:black_cat_counter_drawers`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[p][c][p]
[p][p][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = Tablones de sauce (`cluttered:willow_planks`)
- `t` = Morado subway tiles (`cluttered:subway_tiles_purple`)

### Mesón de lima (`cluttered:kitchen_set_light_green_counter`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte lima (`minecraft:lime_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de lima inner (`cluttered:kitchen_set_light_green_counter_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `d` = Tinte lima (`minecraft:lime_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de marrón (`cluttered:kitchen_set_brown_counter`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de marrón inner (`cluttered:kitchen_set_brown_counter_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `d` = Tinte marrón (`minecraft:brown_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de morado (`cluttered:kitchen_set_purple_counter`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte morado (`minecraft:purple_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de morado inner (`cluttered:kitchen_set_purple_counter_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `d` = Tinte morado (`minecraft:purple_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de rosado (`cluttered:kitchen_set_pink_counter`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][c][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de rosado inner (`cluttered:kitchen_set_pink_counter_inner_corner`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][d][p]
[p][p][p]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Piedra crafting materials (`#minecraft:stone_crafting_materials`)

### Mesón de sweetheart (`cluttered:sweetheart_counter_drawers`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[t][t][t]
[p][c][p]
[p][p][p]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = Tablones de jungle (`minecraft:jungle_planks`)
- `t` = Mármol subway tiles (`cluttered:marble_subway_tiles`)

### Mini ace flag (`cluttered:mini_flag_ace`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][w][p]
[b][w][p]
[s][ ][ ]
```

Ingredientes:
- `b` = Negro carpet (`minecraft:black_carpet`)
- `p` = Morado carpet (`minecraft:purple_carpet`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = Blanco carpet (`minecraft:white_carpet`)

### Mini arcoíris flag (`cluttered:mini_flag_rainbow`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][y][p]
[o][g][b]
[s][ ][ ]
```

Ingredientes:
- `b` = Azul carpet (`minecraft:blue_carpet`)
- `g` = Verde carpet (`minecraft:green_carpet`)
- `o` = Naranjo carpet (`minecraft:orange_carpet`)
- `p` = Morado carpet (`minecraft:purple_carpet`)
- `r` = Rojo carpet (`minecraft:red_carpet`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `y` = Amarillo carpet (`minecraft:yellow_carpet`)

### Mini bi flag (`cluttered:mini_flag_bi`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[m][p][b]
[m][p][b]
[s][ ][ ]
```

Ingredientes:
- `b` = Azul carpet (`minecraft:blue_carpet`)
- `m` = Magenta carpet (`minecraft:magenta_carpet`)
- `p` = Morado carpet (`minecraft:purple_carpet`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Mini cactus set (`cluttered:mini_cactus_set`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][c]
[p][p]
```

Ingredientes:
- `c` = Cactus (`minecraft:cactus`)
- `p` = Maceta (`minecraft:flower_pot`)

### Mini hanging terrariums (`cluttered:mini_hanging_terrariums`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[s][ ][s]
[m][ ][f]
```

Ingredientes:
- `f` = etiqueta Flores (`#minecraft:flowers`)
- `m` = Hongo rojo (`minecraft:red_mushroom`)
- `p` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `s` = Hilo (`minecraft:string`)

### Mini lesbian flag (`cluttered:mini_flag_lesbian`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[o][w][p]
[o][w][p]
[s][ ][ ]
```

Ingredientes:
- `o` = Naranjo carpet (`minecraft:orange_carpet`)
- `p` = Rosado carpet (`minecraft:pink_carpet`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `w` = Blanco carpet (`minecraft:white_carpet`)

### Mini nonbinary flag (`cluttered:mini_flag_nonbinary`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[y][p][b]
[y][p][b]
[s][ ][ ]
```

Ingredientes:
- `b` = Negro carpet (`minecraft:black_carpet`)
- `p` = Morado carpet (`minecraft:purple_carpet`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `y` = Amarillo carpet (`minecraft:yellow_carpet`)

### Mini pan flag (`cluttered:mini_flag_pan`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[m][y][c]
[m][y][c]
[s][ ][ ]
```

Ingredientes:
- `c` = Cian carpet (`minecraft:cyan_carpet`)
- `m` = Magenta carpet (`minecraft:magenta_carpet`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `y` = Amarillo carpet (`minecraft:yellow_carpet`)

### Mini trans flag (`cluttered:mini_flag_trans`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][p][b]
[b][p][b]
[s][ ][ ]
```

Ingredientes:
- `b` = Celeste carpet (`minecraft:light_blue_carpet`)
- `p` = Rosado carpet (`minecraft:pink_carpet`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Mixing bowl (`cluttered:sweetheart_baking_set_bowl`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Bowl (`minecraft:bowl`)
- etiqueta Varillas madera (`#forge:rods/wooden`)
- Lingote de hierro (`minecraft:iron_ingot`)

### Moon wall decoration (`cluttered:moon_decoration`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][g][g]
[g][ ][ ]
[ ][g][g]
```

Ingredientes:
- `g` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)

### Morado bicycle (`cluttered:bicycle_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][ ][ ]
[i][d][i]
[g][ ][g]
```

Ingredientes:
- `d` = Tinte morado (`minecraft:purple_dye`)
- `g` = Grindstone (`minecraft:grindstone`)
- `i` = Hierro bars (`minecraft:iron_bars`)

### Morado bicycle with flores (`cluttered:bicycle_with_flowers_purple`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Flores (`#minecraft:flowers`)
- Morado bicycle (`cluttered:bicycle_purple`)

### Morado flor shelf vela (`cluttered:flower_shelf_candle_purple`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d]
[w]
```

Ingredientes:
- `d` = Tinte morado (`minecraft:purple_dye`)
- `w` = Panal (`minecraft:honeycomb`)

### Morado gumball machine (`cluttered:gumball_machine_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[g][s][g]
[ ][i][ ]
```

Ingredientes:
- `d` = Tinte morado (`minecraft:purple_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `s` = Sugar (`minecraft:sugar`)

### Morado retro fridge (`cluttered:retro_fridge_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][i]
[i][f][i]
[i][b][i]
```

Ingredientes:
- `b` = Block of hierro (`minecraft:iron_block`)
- `d` = Tinte morado (`minecraft:purple_dye`)
- `f` = Packed ice (`minecraft:packed_ice`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Morado retro toaster (`cluttered:retro_toaster_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][l]
[i][m][i]
```

Ingredientes:
- `d` = Tinte morado (`minecraft:purple_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `m` = Bloque de magma (`minecraft:magma_block`)

### Morado spool of hilo (`cluttered:spool_of_thread_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][g][s]
[s][p][s]
```

Ingredientes:
- `g` = Tinte morado (`minecraft:purple_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = Hilo (`minecraft:string`)

### Morado tarrey town planter (`cluttered:tarrey_town_planter_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][d][w]
[w][b][w]
[w][b][w]
```

Ingredientes:
- `b` = Bloque de hueso (`minecraft:bone_block`)
- `d` = Tierra (`minecraft:dirt`)
- `w` = Tablones de sauce (`cluttered:willow_planks`)

### Negro retro fridge (`cluttered:retro_fridge_black`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][i]
[i][f][i]
[i][b][i]
```

Ingredientes:
- `b` = Block of hierro (`minecraft:iron_block`)
- `d` = Tinte negro (`minecraft:black_dye`)
- `f` = Packed ice (`minecraft:packed_ice`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Negro retro toaster (`cluttered:retro_toaster_black`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][l]
[i][m][i]
```

Ingredientes:
- `d` = Tinte negro (`minecraft:black_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `m` = Bloque de magma (`minecraft:magma_block`)

### Newspaper pile (`cluttered:newspaper_pile_short`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p]
[i]
[p]
```

Ingredientes:
- `i` = Ink sac (`minecraft:ink_sac`)
- `p` = Papel (`minecraft:paper`)

### Nonbinary flag (`cluttered:animated_flag_nonbinary`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[n][i][n]
[y][p][b]
[y][p][b]
```

Ingredientes:
- `b` = Negro wool (`minecraft:black_wool`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `n` = Hierro nugget (`minecraft:iron_nugget`)
- `p` = Morado wool (`minecraft:purple_wool`)
- `y` = Amarillo wool (`minecraft:yellow_wool`)

### Notepad (`cluttered:yellow_notepad`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][c][s]
[p][p][p]
```

Ingredientes:
- `c` = etiqueta Coals (`#minecraft:coals`)
- `g` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Novakid safe (`cluttered:safe_novakid`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][i][i]
[i][c][i]
[i][b][i]
```

Ingredientes:
- `b` = Block of hierro (`minecraft:iron_block`)
- `c` = Cofre (`minecraft:chest`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Office supplies a (`cluttered:office_supplies_a`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Hilo (`minecraft:string`)
- Lingote de hierro (`minecraft:iron_ingot`)
- Redstone dust (`minecraft:redstone`)
- Slimeball (`minecraft:slime_ball`)

### Office supplies b (`cluttered:office_supplies_b`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Coals (`#minecraft:coals`)
- Lingote de hierro (`minecraft:iron_ingot`)
- Palo (`minecraft:stick`)
- Papel (`minecraft:paper`)

### Open libro (`cluttered:book_open`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Leather (`minecraft:leather`) x2
- Libro (`minecraft:book`)

### Otomana de cottage (`cluttered:cottage_ottoman`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][w][p]
[p][w][p]
```

Ingredientes:
- `p` = Rosado wool (`minecraft:pink_wool`)
- `w` = Blanco wool (`minecraft:white_wool`)

### Otomana de fwish (`cluttered:fwish_ottoman`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][b][b]
[f][f][f]
```

Ingredientes:
- `b` = Azul wool (`minecraft:blue_wool`)
- `f` = etiqueta Fishes (`#minecraft:fishes`)

### Otomana de madonna (`cluttered:madonna_ottoman`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][l][g]
[b][b][b]
```

Ingredientes:
- `b` = Negro wool (`minecraft:black_wool`)
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `l` = Lapislázuli (`minecraft:lapis_lazuli`)

### Pain au chocolat (`cluttered:chocolate_croissant`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Cocoa beans (`minecraft:cocoa_beans`)
- Croissant (`cluttered:croissant`)
- Sugar (`minecraft:sugar`)

### Paint water jar (`cluttered:paint_water_jar`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Brush (`minecraft:brush`)
- Vidrio bottle (`minecraft:glass_bottle`)

### Pan flag (`cluttered:animated_flag_pansexual`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[n][i][n]
[m][y][c]
[m][y][c]
```

Ingredientes:
- `c` = Cian wool (`minecraft:cyan_wool`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `m` = Magenta wool (`minecraft:magenta_wool`)
- `n` = Hierro nugget (`minecraft:iron_nugget`)
- `y` = Amarillo wool (`minecraft:yellow_wool`)

### Pancake stack (`cluttered:pancake_stack`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Egg (`minecraft:egg`)
- Miel bottle (`minecraft:honey_bottle`)
- Pastry plate (`cluttered:pastry_plate`)
- Sugar (`minecraft:sugar`)
- Wheat crops (`minecraft:wheat`)

### Papel pile (`cluttered:paper_pile`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
[p][p]
[p][p]
```

Ingredientes:
- `p` = Papel (`minecraft:paper`)

### Pastel amarillo flor shelf vela (`cluttered:flower_shelf_candle_pastel_yellow`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d]
[h]
[w]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `h` = Tinte blanco (`minecraft:white_dye`)
- `w` = Panal (`minecraft:honeycomb`)

### Pastel birdhouse (`cluttered:birdhouse_pastel`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tinte rosado (`minecraft:pink_dye`)
- Wood birdhouse (`cluttered:birdhouse_unpainted`)

### Pastel bunny plush (`cluttered:pastel_bunny_plushie`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][p]
[p][b][p]
[p][p][p]
```

Ingredientes:
- `b` = Cian wool (`minecraft:cyan_wool`)
- `p` = Rosado wool (`minecraft:pink_wool`)

### Pastel de berry (`cluttered:berry_cake`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][c][b]
[s][e][s]
[w][c][w]
```

Ingredientes:
- `b` = Milk bucket (`minecraft:milk_bucket`)
- `c` = Sweet berries (`minecraft:sweet_berries`)
- `e` = Egg (`minecraft:egg`)
- `s` = Sugar (`minecraft:sugar`)
- `w` = Wheat crops (`minecraft:wheat`)

### Pastel de corazón (`cluttered:heart_cake`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][c][b]
[s][e][s]
[w][c][w]
```

Ingredientes:
- `b` = Milk bucket (`minecraft:milk_bucket`)
- `c` = Beetroot (`minecraft:beetroot`)
- `e` = Egg (`minecraft:egg`)
- `s` = Sugar (`minecraft:sugar`)
- `w` = Wheat crops (`minecraft:wheat`)

### Pastel light (`cluttered:pastel_light`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p]
[l]
[s]
```

Ingredientes:
- `l` = Farol (`minecraft:lantern`)
- `p` = Tinte rosado (`minecraft:pink_dye`)
- `s` = Palo (`minecraft:stick`)

### Pastel rubik's cube (`cluttered:rubiks_cube_pastel`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][y][ ]
[c][i][p]
[ ][w][ ]
```

Ingredientes:
- `c` = Tinte cian (`minecraft:cyan_dye`)
- `i` = Hierro nugget (`minecraft:iron_nugget`)
- `p` = Tinte rosado (`minecraft:pink_dye`)
- `w` = Tinte blanco (`minecraft:white_dye`)
- `y` = Tinte amarillo (`minecraft:yellow_dye`)

### Pastry plate (`cluttered:pastry_plate`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p]
```

Ingredientes:
- `p` = Blanco glazed terracota (`minecraft:white_glazed_terracotta`)

### Pequeño bush (`cluttered:small_bush`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l]
[s]
```

Ingredientes:
- `l` = etiqueta Hojas (`#minecraft:leaves`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Pequeño cauldron set (`cluttered:small_cauldron_set`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Cauldron (`minecraft:cauldron`)
- Rojo carpet (`minecraft:red_carpet`)
- Vidrio bottle (`minecraft:glass_bottle`)

### Pequeño vidrio jars (`cluttered:small_glass_jars`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Vidrio bottle (`minecraft:glass_bottle`) x2

### Picnic canasta (`cluttered:picnic_basket`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][ ][b]
[i][w][i]
[i][i][i]
```

Ingredientes:
- `b` = Azul carpet (`minecraft:blue_carpet`)
- `i` = Bloque de wicker (`cluttered:wicker_block`)
- `w` = Blanco carpet (`minecraft:white_carpet`)

### Plant ladder (`cluttered:plant_ladder`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[l][p][ ]
[l][s][p]
[l][s][s]
```

Ingredientes:
- `l` = Ladder (`minecraft:ladder`)
- `p` = Maceta (`minecraft:flower_pot`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Pok ta pok hoop (`cluttered:pok_ta_pok_hoop`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[b][ ][b]
[s][b][s]
```

Ingredientes:
- `b` = Piedra ladrillos (`minecraft:stone_bricks`)
- `s` = Piedra (`minecraft:stone`)

### Pok ta pok snake hoop (`cluttered:pok_ta_pok_hoop_snakes`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][b][s]
[b][ ][b]
[s][b][s]
```

Ingredientes:
- `b` = Cincelado piedra ladrillos (`minecraft:chiseled_stone_bricks`)
- `s` = Andesite (`minecraft:andesite`)

### Polaroid camera (`cluttered:polaroid_camera`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][l][ ]
[i][t][s]
[i][i][ ]
```

Ingredientes:
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lámpara de redstone (`minecraft:redstone_lamp`)
- `s` = Spyglass (`minecraft:spyglass`)
- `t` = Tinted vidrio (`minecraft:tinted_glass`)

### Polaroid garland b (`cluttered:garland_polaroid_b`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Polaroid garland a (`cluttered:garland_polaroid_a`)

### Prepared picnic canasta (`cluttered:picnic_basket_prepared`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Bread (`minecraft:bread`)
- Manzana (`minecraft:apple`)
- Picnic canasta (`cluttered:picnic_basket`)

### Repisa de amarillo flor (`cluttered:flower_shelf_yellow`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][p][d]
[p][ ][p]
[d][s][d]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Repisa de azul flor (`cluttered:flower_shelf_blue`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][p][d]
[p][ ][p]
[d][s][d]
```

Ingredientes:
- `d` = Tinte celeste (`minecraft:light_blue_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Repisa de fence (`cluttered:fence_shelf_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][f][f]
[f][q][f]
[p][p][p]
```

Ingredientes:
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `q` = Maceta (`minecraft:flower_pot`)

### Repisa de madera oscura geometric (`cluttered:darkwood_decorative_shelves_geometric`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][c][t]
[s][s][s]
[b][b][b]
```

Ingredientes:
- `b` = Estantería (`minecraft:bookshelf`)
- `c` = Naranjo carpet (`minecraft:orange_carpet`)
- `s` = Losa de abeto (`minecraft:spruce_slab`)
- `t` = Cian carpet (`minecraft:cyan_carpet`)

### Repisa de madera oscura quilted (`cluttered:darkwood_decorative_shelves_quilted`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][c][t]
[s][s][s]
[b][b][b]
```

Ingredientes:
- `b` = Estantería (`minecraft:bookshelf`)
- `c` = Azul carpet (`minecraft:blue_carpet`)
- `s` = Losa de abeto (`minecraft:spruce_slab`)
- `t` = Celeste carpet (`minecraft:light_blue_carpet`)

### Repisa de madera oscura southern flair (`cluttered:darkwood_decorative_shelves_southern_flair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][c][t]
[s][s][s]
[b][b][b]
```

Ingredientes:
- `b` = Estantería (`minecraft:bookshelf`)
- `c` = Verde carpet (`minecraft:green_carpet`)
- `s` = Losa de abeto (`minecraft:spruce_slab`)
- `t` = Rojo carpet (`minecraft:red_carpet`)

### Repisa de morado flor (`cluttered:flower_shelf_purple`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][p][d]
[p][ ][p]
[d][s][d]
```

Ingredientes:
- `d` = Tinte magenta (`minecraft:magenta_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Repisa de pastel amarillo flor (`cluttered:flower_shelf_pastel_yellow`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][p][d]
[p][ ][p]
[d][s][w]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `w` = Tinte blanco (`minecraft:white_dye`)

### Repisa de pequeño (`cluttered:small_shelf`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
```

Ingredientes:
- `s` = Losa de abeto (`minecraft:spruce_slab`)

### Repisa de pequeño rosado (`cluttered:small_shelf_pink`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
```

Ingredientes:
- `s` = Losa de manzano silvestre (`cluttered:crabapple_slab`)

### Repisa de potion (`cluttered:potion_shelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][w][g]
[w][p][w]
[l][w][l]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `l` = Vidrio pane (`minecraft:glass_pane`)
- `p` = Potion (`minecraft:potion`)
- `w` = Tablones de sauce (`cluttered:willow_planks`)

### Repisa de retro cafe (`cluttered:retro_cafe_shelf`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[l][b][c]
[s][s][s]
```

Ingredientes:
- `b` = Vidrio bottle (`minecraft:glass_bottle`)
- `c` = Cauldron (`minecraft:cauldron`)
- `l` = Hueso (`minecraft:bone`)
- `p` = Losa de mangle (`minecraft:mangrove_slab`)
- `s` = Estantería (`minecraft:bookshelf`)

### Repisa de rosado flor (`cluttered:flower_shelf_pink`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][p][d]
[p][ ][p]
[d][s][d]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Repisa de verde flor (`cluttered:flower_shelf_green`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][p][d]
[p][ ][p]
[d][s][d]
```

Ingredientes:
- `d` = Tinte lima (`minecraft:lime_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Rito libros (`cluttered:rito_wooden_books`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[b][b][b]
[f][f][f]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `f` = Feather (`minecraft:feather`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Rojo birdhouse (`cluttered:birdhouse_red`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Tinte rojo (`minecraft:red_dye`)
- Wood birdhouse (`cluttered:birdhouse_unpainted`)

### Rojo gumball machine (`cluttered:gumball_machine_red`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][i][d]
[g][s][g]
[ ][i][ ]
```

Ingredientes:
- `d` = Tinte rojo (`minecraft:red_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `s` = Sugar (`minecraft:sugar`)

### Rojo retro fridge (`cluttered:retro_fridge_red`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][i]
[i][f][i]
[i][b][i]
```

Ingredientes:
- `b` = Block of hierro (`minecraft:iron_block`)
- `d` = Tinte rojo (`minecraft:red_dye`)
- `f` = Packed ice (`minecraft:packed_ice`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Rojo retro toaster (`cluttered:retro_toaster_red`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][l]
[i][m][i]
```

Ingredientes:
- `d` = Tinte rojo (`minecraft:red_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `m` = Bloque de magma (`minecraft:magma_block`)

### Rojo sandseal plush (`cluttered:sand_seal_plush_red`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][w][b]
[w][s][w]
```

Ingredientes:
- `b` = etiqueta Buttons (`#minecraft:buttons`)
- `s` = etiqueta Arena (`#minecraft:sand`)
- `w` = Rojo wool (`minecraft:red_wool`)

### Rojo tarrey town planter (`cluttered:tarrey_town_planter_red`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][d][w]
[w][b][w]
[w][b][w]
```

Ingredientes:
- `b` = Bloque de hueso (`minecraft:bone_block`)
- `d` = Tierra (`minecraft:dirt`)
- `w` = Tablones de hongo rojo (`cluttered:red_mushroom_planks`)

### Ropero de hongo azul (`cluttered:blue_mushroom_wardrobe`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][c][r]
[r][c][r]
[ ][p][ ]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = etiqueta Tronco de hongo azul (`#cluttered:blue_mushroom_log`)
- `r` = Hongo azul cap (`cluttered:blue_mushroom_cap`)

### Ropero de hongo rojo (`cluttered:red_mushroom_wardrobe`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][c][r]
[r][c][r]
[ ][p][ ]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = etiqueta Tronco de hongo rojo (`#cluttered:red_mushroom_log`)
- `r` = Hongo rojo cap (`cluttered:red_mushroom_cap`)

### Ropero de pastel (`cluttered:pastel_wardrobe`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][p][w]
[c][w][c]
[w][p][w]
```

Ingredientes:
- `c` = Cofre (`minecraft:chest`)
- `p` = Tinte rosado (`minecraft:pink_dye`)
- `w` = Tablones de warped (`minecraft:warped_planks`)

### Rosado bicycle (`cluttered:bicycle_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][ ][ ]
[i][d][i]
[g][ ][g]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `g` = Grindstone (`minecraft:grindstone`)
- `i` = Hierro bars (`minecraft:iron_bars`)

### Rosado bicycle with flores (`cluttered:bicycle_with_flowers_pink`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- etiqueta Flores (`#minecraft:flowers`)
- Rosado bicycle (`cluttered:bicycle_pink`)

### Rosado flor shelf vela (`cluttered:flower_shelf_candle_pink`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d]
[w]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `w` = Panal (`minecraft:honeycomb`)

### Rosado retro fridge (`cluttered:retro_fridge_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][i]
[i][f][i]
[i][b][i]
```

Ingredientes:
- `b` = Block of hierro (`minecraft:iron_block`)
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `f` = Packed ice (`minecraft:packed_ice`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Rosado retro toaster (`cluttered:retro_toaster_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][l]
[i][m][i]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `m` = Bloque de magma (`minecraft:magma_block`)

### Rosado spool of hilo (`cluttered:spool_of_thread_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][g][s]
[s][p][s]
```

Ingredientes:
- `g` = Tinte rosado (`minecraft:pink_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = Hilo (`minecraft:string`)

### Rosado tarrey town planter (`cluttered:tarrey_town_planter_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][d][w]
[w][b][w]
[w][b][w]
```

Ingredientes:
- `b` = Bloque de hueso (`minecraft:bone_block`)
- `d` = Tierra (`minecraft:dirt`)
- `w` = Tablones de manzano silvestre (`cluttered:crabapple_planks`)

### Rover briefcase (`cluttered:briefcase_rover`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Briefcase (`cluttered:briefcase_blank`)
- Papel (`minecraft:paper`)
- Tinte azul (`minecraft:blue_dye`)

### Rover mug (`cluttered:rover_mug`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][p]
[p][c][p]
```

Ingredientes:
- `c` = Maceta (`minecraft:flower_pot`)
- `p` = Tinte azul (`minecraft:blue_dye`)

### Row of libros (`cluttered:row_of_small_books`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][d][ ]
[b][b][b]
[ ][d][ ]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `d` = Tinte azul (`minecraft:blue_dye`)

### Row of pastel libros (`cluttered:row_of_small_books_pastel`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][d][ ]
[b][b][b]
[ ][d][ ]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)
- `d` = Tinte rosado (`minecraft:pink_dye`)

### Rubik's cube (`cluttered:rubiks_cube`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][y][ ]
[b][i][r]
[ ][g][ ]
```

Ingredientes:
- `b` = Tinte azul (`minecraft:blue_dye`)
- `g` = Tinte verde (`minecraft:green_dye`)
- `i` = Hierro nugget (`minecraft:iron_nugget`)
- `r` = Tinte rojo (`minecraft:red_dye`)
- `y` = Tinte amarillo (`minecraft:yellow_dye`)

### Salt & pepper (`cluttered:salt_pepper_shakers`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d][ ][p]
[s][ ][w]
[b][ ][b]
```

Ingredientes:
- `b` = Vidrio bottle (`minecraft:glass_bottle`)
- `d` = Dried kelp (`minecraft:dried_kelp`)
- `p` = Polvo de blaze (`minecraft:blaze_powder`)
- `s` = Sugar (`minecraft:sugar`)
- `w` = Pumpkin seeds (`minecraft:pumpkin_seeds`)

### Scattered papers (`cluttered:scattered_papers`) x2

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[p][p][p]
```

Ingredientes:
- `p` = Papel (`minecraft:paper`)

### Scissors & hilo (`cluttered:scissors_and_thread`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Hilo (`minecraft:string`) x2
- Lingote de hierro (`minecraft:iron_ingot`)

### Seaweed planter (`cluttered:seaweed_planter`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i]
[c]
```

Ingredientes:
- `c` = Decorated pot (`minecraft:decorated_pot`)
- `i` = Seagrass (`minecraft:seagrass`)

### Seltzer cans (`cluttered:seltzer_cans`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Hierro nugget (`minecraft:iron_nugget`) x3
- Vidrio bottle (`minecraft:glass_bottle`)

### Sewing clutter (`cluttered:sewing_clutter`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][c][l]
```

Ingredientes:
- `c` = Lima carpet (`minecraft:lime_carpet`)
- `l` = Lámpara de redstone (`minecraft:redstone_lamp`)
- `s` = Scissors & hilo (`cluttered:scissors_and_thread`)

### Sewing mannequin (`cluttered:sewing_mannequin`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][w][ ]
[t][a][t]
[s][ ][s]
```

Ingredientes:
- `a` = Armor stand (`minecraft:armor_stand`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)
- `t` = Hilo (`minecraft:string`)
- `w` = Blanco wool (`minecraft:white_wool`)

### Shelf of libros (`cluttered:row_of_small_books_shelved`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Repisa de pequeño (`cluttered:small_shelf`)
- Row of libros (`cluttered:row_of_small_books`)

### Shelf of pastel libros (`cluttered:row_of_small_books_pastel_shelved`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Repisa de pequeño rosado (`cluttered:small_shelf_pink`)
- Row of pastel libros (`cluttered:row_of_small_books_pastel`)

### Silla de cottage (`cluttered:cottage_chair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][ ][ ]
[s][b][b]
[b][ ][b]
```

Ingredientes:
- `b` = Tablones de abedul (`minecraft:birch_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Silla de cushioned cottage (`cluttered:cottage_chair_cushioned`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p]
[c]
```

Ingredientes:
- `c` = Silla de cottage (`cluttered:cottage_chair`)
- `p` = Rosado carpet (`minecraft:pink_carpet`)

### Silla de imperial (`cluttered:imperial_chair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][r][r]
[f][s][s]
[f][b][f]
```

Ingredientes:
- `b` = Tinte negro (`minecraft:black_dye`)
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `r` = Tinte rojo (`minecraft:red_dye`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Silla de manzana (`cluttered:apple_chair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[a][ ][ ]
[p][p][p]
[s][ ][s]
```

Ingredientes:
- `a` = Manzana (`minecraft:apple`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Silla de pastel (`cluttered:pastel_chair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][c][ ]
[s][ ][s]
[ ][p][ ]
```

Ingredientes:
- `c` = Cian wool (`minecraft:cyan_wool`)
- `p` = Taburete de pastel (`cluttered:pastel_stool`)
- `s` = Palo (`minecraft:stick`)

### Silla de unliving (`cluttered:unliving_chair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][w][ ]
[w][p][w]
[w][c][w]
```

Ingredientes:
- `c` = Silla de cottage (`cluttered:cottage_chair`)
- `p` = Phantom membrane (`minecraft:phantom_membrane`)
- `w` = Blanco carpet (`minecraft:white_carpet`)

### Sillón de amarillo (`cluttered:armchair_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Amarillo wool (`minecraft:yellow_wool`)

### Sillón de azul (`cluttered:armchair_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Azul wool (`minecraft:blue_wool`)

### Sillón de blanco (`cluttered:armchair_white`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Blanco wool (`minecraft:white_wool`)

### Sillón de celeste (`cluttered:armchair_light_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Celeste wool (`minecraft:light_blue_wool`)

### Sillón de cian (`cluttered:armchair_cyan`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Cian wool (`minecraft:cyan_wool`)

### Sillón de corazón (`cluttered:armchair_heart`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Rose bush (`minecraft:rose_bush`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Blanco wool (`minecraft:white_wool`)

### Sillón de cottage (`cluttered:cottage_armchair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][ ][p]
[p][w][p]
[p][w][p]
```

Ingredientes:
- `p` = Rosado wool (`minecraft:pink_wool`)
- `w` = Blanco wool (`minecraft:white_wool`)

### Sillón de flor (`cluttered:armchair_flower`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oxeye daisy (`minecraft:oxeye_daisy`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Rosado wool (`minecraft:pink_wool`)

### Sillón de fuchsia (`cluttered:armchair_fuchsia`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Amapola (`minecraft:poppy`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Magenta wool (`minecraft:magenta_wool`)

### Sillón de fwish (`cluttered:fwish_armchair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][s][f]
[f][s][f]
```

Ingredientes:
- `f` = etiqueta Fishes (`#minecraft:fishes`)
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)

### Sillón de gato negro (`cluttered:armchair_black_cat`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Wither rose (`minecraft:wither_rose`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Negro wool (`minecraft:black_wool`)

### Sillón de gris (`cluttered:armchair_gray`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Gris wool (`minecraft:gray_wool`)

### Sillón de gris claro (`cluttered:armchair_light_gray`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Gris claro wool (`minecraft:light_gray_wool`)

### Sillón de lima (`cluttered:armchair_lime`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Lima wool (`minecraft:lime_wool`)

### Sillón de limón (`cluttered:armchair_lemon`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Diente de león (`minecraft:dandelion`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Celeste wool (`minecraft:light_blue_wool`)

### Sillón de madera oscura geometric (`cluttered:darkwood_chair_geometric`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][c][f]
[f][o][f]
[f][f][f]
```

Ingredientes:
- `c` = Cian carpet (`minecraft:cyan_carpet`)
- `f` = Valla de abeto (`minecraft:spruce_fence`)
- `o` = Naranjo wool (`minecraft:orange_wool`)

### Sillón de madera oscura quilted (`cluttered:darkwood_chair_quilted`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][b][f]
[f][l][f]
[f][f][f]
```

Ingredientes:
- `b` = Azul carpet (`minecraft:blue_carpet`)
- `f` = Valla de abeto (`minecraft:spruce_fence`)
- `l` = Celeste wool (`minecraft:light_blue_wool`)

### Sillón de madera oscura southern flair (`cluttered:darkwood_chair_southern_flair`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][g][f]
[f][r][f]
[f][f][f]
```

Ingredientes:
- `f` = Valla de abeto (`minecraft:spruce_fence`)
- `g` = Verde carpet (`minecraft:green_carpet`)
- `r` = Rojo wool (`minecraft:red_wool`)

### Sillón de magenta (`cluttered:armchair_magenta`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Magenta wool (`minecraft:magenta_wool`)

### Sillón de marfil (`cluttered:armchair_ivory`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Lily of the valley (`minecraft:lily_of_the_valley`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Blanco wool (`minecraft:white_wool`)

### Sillón de marrón (`cluttered:armchair_brown`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Marrón wool (`minecraft:brown_wool`)

### Sillón de melon (`cluttered:armchair_watermelon`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Rosado tulip (`minecraft:pink_tulip`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Lima wool (`minecraft:lime_wool`)

### Sillón de morado (`cluttered:armchair_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Morado wool (`minecraft:purple_wool`)

### Sillón de naranjo (`cluttered:armchair_orange`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Naranjo wool (`minecraft:orange_wool`)

### Sillón de negro (`cluttered:armchair_black`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Negro wool (`minecraft:black_wool`)

### Sillón de rojo (`cluttered:armchair_red`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Rojo wool (`minecraft:red_wool`)

### Sillón de rosado (`cluttered:armchair_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Rosado wool (`minecraft:pink_wool`)

### Sillón de starry (`cluttered:armchair_starry`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Sunflower (`minecraft:sunflower`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Azul wool (`minecraft:blue_wool`)

### Sillón de strawberry (`cluttered:armchair_strawberry`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Rojo tulip (`minecraft:red_tulip`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Rosado wool (`minecraft:pink_wool`)

### Sillón de verde (`cluttered:armchair_green`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[g][w][g]
[p][p][p]
```

Ingredientes:
- `g` = Oro nugget (`minecraft:gold_nugget`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Verde wool (`minecraft:green_wool`)

### Sketchbook (`cluttered:sketchbook_single`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][c][s]
[p][p][p]
```

Ingredientes:
- `c` = etiqueta Coals (`#minecraft:coals`)
- `g` = Tinte verde (`minecraft:green_dye`)
- `p` = Papel (`minecraft:paper`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Sliced bread (`cluttered:sliced_bread`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b]
[p]
```

Ingredientes:
- `b` = Bread (`minecraft:bread`)
- `p` = Placa de presión de heavy weighted (`minecraft:heavy_weighted_pressure_plate`)

### Sofá de dos puestos de lovely (`cluttered:lovely_love_seat_basic`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[c][w][c]
```

Ingredientes:
- `c` = Rosado concreto (`minecraft:pink_concrete`)
- `w` = Rosado wool (`minecraft:pink_wool`)

### Sofá de dos puestos de negro lovely (`cluttered:lovely_love_seat_black`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][w][w]
[c][w][c]
```

Ingredientes:
- `c` = Negro concreto (`minecraft:black_concrete`)
- `w` = Rosado wool (`minecraft:pink_wool`)

### Spice jars (`cluttered:small_spice_jars`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Polvo de blaze (`minecraft:blaze_powder`)
- Cocoa beans (`minecraft:cocoa_beans`)
- Dried kelp (`minecraft:dried_kelp`)
- Hanging roots (`minecraft:hanging_roots`)
- Pequeño vidrio jars (`cluttered:small_glass_jars`)

### Stack of libros (`cluttered:stack_of_books`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][ ]
[b][b]
```

Ingredientes:
- `b` = Libro (`minecraft:book`)

### Starry garland (`cluttered:garland_starry`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[w][ ][w]
[ ][w][ ]
```

Ingredientes:
- `s` = Hilo (`minecraft:string`)
- `w` = Colgante de star (`cluttered:stars_pendant`)

### Steampunk globe (`cluttered:steampunk_globe`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][c][ ]
[c][m][c]
[s][ ][s]
```

Ingredientes:
- `c` = Lingote de cobre (`minecraft:copper_ingot`)
- `m` = Antiguo map (`cluttered:antique_map`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Sunflower garland (`cluttered:garland_sunflower`) x4

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[w][ ][w]
[ ][w][ ]
```

Ingredientes:
- `s` = Hilo (`minecraft:string`)
- `w` = Sunflower (`minecraft:sunflower`)

### Surtido vidrio jars (`cluttered:assorted_glass_jars`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Vidrio bottle (`minecraft:glass_bottle`) x3

### Table with tablecloth (`cluttered:table_with_white_tablecloth`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][b][c]
[s][s][s]
[f][ ][f]
```

Ingredientes:
- `b` = Azul carpet (`minecraft:blue_carpet`)
- `c` = Blanco carpet (`minecraft:white_carpet`)
- `f` = Valla de roble oscuro (`minecraft:dark_oak_fence`)
- `s` = Losa de roble oscuro (`minecraft:dark_oak_slab`)

### Taburete de button (`cluttered:button_stool`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][b][ ]
[p][p][p]
[s][ ][s]
```

Ingredientes:
- `b` = etiqueta Madera buttons (`#minecraft:wooden_buttons`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Taburete de madera oscura (`cluttered:darkwood_stool`) x2

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Madera axe (`minecraft:wooden_axe`)
- Tronco de abeto (`minecraft:spruce_log`)

### Taburete de pastel (`cluttered:pastel_stool`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][c][c]
[p][ ][p]
```

Ingredientes:
- `c` = Cian wool (`minecraft:cyan_wool`)
- `p` = Morado wool (`minecraft:purple_wool`)

### Taburete de rover (`cluttered:rover_stool`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[r][b][r]
[s][ ][s]
```

Ingredientes:
- `b` = Azul wool (`minecraft:blue_wool`)
- `r` = Rojo wool (`minecraft:red_wool`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Tall newspaper pile (`cluttered:newspaper_pile_tall`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p]
[p]
```

Ingredientes:
- `p` = Newspaper pile (`cluttered:newspaper_pile_short`)

### Tall stack of libros (`cluttered:stack_of_books_tall`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b]
[b]
```

Ingredientes:
- `b` = Stack of libros (`cluttered:stack_of_books`)

### Tarrytown stove (`cluttered:tarrytown_stove`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][i][ ]
[i][i][i]
[i][c][i]
```

Ingredientes:
- `c` = Campfire (`minecraft:campfire`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Teddy bear (`cluttered:teddy_bear`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][b][ ]
[b][b][b]
[b][ ][b]
```

Ingredientes:
- `b` = Marrón wool (`minecraft:brown_wool`)

### Terrario de amarillo hongo luminoso (`cluttered:glowshroom_terrarium_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][m][g]
[l][p][l]
```

Ingredientes:
- `d` = Tinte amarillo (`minecraft:yellow_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `l` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- `m` = Hongo rojo (`minecraft:red_mushroom`)
- `p` = Podzol (`minecraft:podzol`)

### Terrario de azul hongo luminoso (`cluttered:glowshroom_terrarium_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][m][g]
[l][p][l]
```

Ingredientes:
- `d` = Tinte celeste (`minecraft:light_blue_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `l` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- `m` = Hongo rojo (`minecraft:red_mushroom`)
- `p` = Podzol (`minecraft:podzol`)

### Terrario de hongo rojo (`cluttered:mushroom_terrarium_red`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][m][g]
[g][p][g]
```

Ingredientes:
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `m` = Hongo rojo (`minecraft:red_mushroom`)
- `p` = Podzol (`minecraft:podzol`)

### Terrario de marrón hongo (`cluttered:mushroom_terrarium_brown`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[g][m][g]
[g][p][g]
```

Ingredientes:
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `m` = Marrón hongo (`minecraft:brown_mushroom`)
- `p` = Podzol (`minecraft:podzol`)

### Terrario de morado hongo luminoso (`cluttered:glowshroom_terrarium_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][m][g]
[l][p][l]
```

Ingredientes:
- `d` = Tinte morado (`minecraft:purple_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `l` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- `m` = Hongo rojo (`minecraft:red_mushroom`)
- `p` = Podzol (`minecraft:podzol`)

### Terrario de rosado hongo luminoso (`cluttered:glowshroom_terrarium_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][m][g]
[l][p][l]
```

Ingredientes:
- `d` = Tinte rosado (`minecraft:pink_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `l` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- `m` = Hongo rojo (`minecraft:red_mushroom`)
- `p` = Podzol (`minecraft:podzol`)

### Terrario de verde hongo luminoso (`cluttered:glowshroom_terrarium_green`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][d][g]
[g][m][g]
[l][p][l]
```

Ingredientes:
- `d` = Tinte lima (`minecraft:lime_dye`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `l` = Polvo de piedra luminosa (`minecraft:glowstone_dust`)
- `m` = Hongo rojo (`minecraft:red_mushroom`)
- `p` = Podzol (`minecraft:podzol`)

### Tocadiscos de amarillo (`cluttered:record_player_yellow`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][j][p]
[p][y][p]
```

Ingredientes:
- `j` = Jukebox (`minecraft:jukebox`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `y` = Tinte amarillo (`minecraft:yellow_dye`)

### Tocadiscos de azul (`cluttered:record_player_blue`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][j][p]
[p][b][p]
```

Ingredientes:
- `b` = Tinte azul (`minecraft:blue_dye`)
- `j` = Jukebox (`minecraft:jukebox`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Tocadiscos de blanco (`cluttered:record_player_white`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][j][p]
[p][w][p]
```

Ingredientes:
- `j` = Jukebox (`minecraft:jukebox`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `w` = Tinte blanco (`minecraft:white_dye`)

### Tocadiscos de marrón (`cluttered:record_player_brown`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][j][p]
[p][b][p]
```

Ingredientes:
- `b` = Tinte marrón (`minecraft:brown_dye`)
- `j` = Jukebox (`minecraft:jukebox`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Tocadiscos de morado (`cluttered:record_player_purple`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][j][p]
[p][b][p]
```

Ingredientes:
- `b` = Tinte morado (`minecraft:purple_dye`)
- `j` = Jukebox (`minecraft:jukebox`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Tocadiscos de rojo (`cluttered:record_player_red`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][j][p]
[p][r][p]
```

Ingredientes:
- `j` = Jukebox (`minecraft:jukebox`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `r` = Tinte rojo (`minecraft:red_dye`)

### Tocadiscos de rosado (`cluttered:record_player_pink`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][j][p]
[p][b][p]
```

Ingredientes:
- `b` = Tinte rosado (`minecraft:pink_dye`)
- `j` = Jukebox (`minecraft:jukebox`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Traditional radio (`cluttered:traditional_radio`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][p][ ]
[n][j][n]
[p][p][p]
```

Ingredientes:
- `j` = Jukebox (`minecraft:jukebox`)
- `n` = Bloque de note (`minecraft:note_block`)
- `p` = etiqueta Tablones (`#minecraft:planks`)

### Trans flag (`cluttered:animated_flag_transgender`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[n][i][n]
[b][p][b]
[b][p][b]
```

Ingredientes:
- `b` = Celeste wool (`minecraft:light_blue_wool`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `n` = Hierro nugget (`minecraft:iron_nugget`)
- `p` = Rosado wool (`minecraft:pink_wool`)

### Turquoise retro fridge (`cluttered:retro_fridge_turquoise`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][i]
[i][f][i]
[i][b][i]
```

Ingredientes:
- `b` = Block of hierro (`minecraft:iron_block`)
- `d` = Tinte cian (`minecraft:cyan_dye`)
- `f` = Packed ice (`minecraft:packed_ice`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Turquoise retro toaster (`cluttered:retro_toaster_turquoise`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[i][d][l]
[i][m][i]
```

Ingredientes:
- `d` = Tinte cian (`minecraft:cyan_dye`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)
- `l` = Lever (`minecraft:lever`)
- `m` = Bloque de magma (`minecraft:magma_block`)

### Two flor pots (`cluttered:two_flower_pots`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][f]
[p][p]
```

Ingredientes:
- `f` = etiqueta Flores (`#minecraft:flowers`)
- `p` = Maceta (`minecraft:flower_pot`)

### Ventana de retro cafe shelf (`cluttered:retro_cafe_shelf_window`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][g][p]
[g][g][g]
```

Ingredientes:
- `g` = Morado stained vidrio pane (`minecraft:purple_stained_glass_pane`)
- `p` = Losa de mangle (`minecraft:mangrove_slab`)

### Verde desk (`cluttered:desk_green`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][s][s]
[p][p][p]
[f][ ][f]
```

Ingredientes:
- `f` = Valla de sicomoro (`cluttered:sycamore_fence`)
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)
- `s` = Losa de sicomoro (`cluttered:sycamore_slab`)

### Verde flor shelf vela (`cluttered:flower_shelf_candle_green`) x3

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[d]
[w]
```

Ingredientes:
- `d` = Tinte lima (`minecraft:lime_dye`)
- `w` = Panal (`minecraft:honeycomb`)

### Verde nightstand (`cluttered:nightstand_green`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[c][f][c]
[p][p][p]
[s][ ][s]
```

Ingredientes:
- `c` = Rosado carpet (`minecraft:pink_carpet`)
- `f` = Sunflower (`minecraft:sunflower`)
- `p` = Tablones de sicomoro (`cluttered:sycamore_planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Verde sandseal plush (`cluttered:sand_seal_plush_green`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[b][w][b]
[w][s][w]
```

Ingredientes:
- `b` = etiqueta Buttons (`#minecraft:buttons`)
- `s` = etiqueta Arena (`#minecraft:sand`)
- `w` = Verde wool (`minecraft:green_wool`)

### Verde spool of hilo (`cluttered:spool_of_thread_green`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s][p][s]
[s][g][s]
[s][p][s]
```

Ingredientes:
- `g` = Tinte verde (`minecraft:green_dye`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = Hilo (`minecraft:string`)

### Verde tarrey town planter (`cluttered:tarrey_town_planter_green`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[w][d][w]
[w][b][w]
[w][b][w]
```

Ingredientes:
- `b` = Bloque de hueso (`minecraft:bone_block`)
- `d` = Tierra (`minecraft:dirt`)
- `w` = Tablones de sicomoro (`cluttered:sycamore_planks`)

### Vial stand (`cluttered:vial_stand`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[p][p][p]
[j][s][j]
[p][p][p]
```

Ingredientes:
- `j` = Potion (`minecraft:potion`)
- `p` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

### Vidrio flor vase (`cluttered:glass_vase_of_flowers`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][f][ ]
[g][b][g]
[ ][g][ ]
```

Ingredientes:
- `b` = Water bucket (`minecraft:water_bucket`)
- `f` = etiqueta Flores (`#minecraft:flowers`)
- `g` = etiqueta Vidrio (`#forge:glass`)

### Violet screen (`cluttered:violet_screen`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][f][f]
[p][p][p]
[f][f][f]
```

Ingredientes:
- `f` = etiqueta Madera fences (`#minecraft:wooden_fences`)
- `p` = Peony (`minecraft:peony`)

### Vitrina de pastry (`cluttered:pastry_display_case`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[g][g][g]
[m][g][p]
[c][g][r]
```

Ingredientes:
- `c` = Croissant (`cluttered:croissant`)
- `g` = Vidrio pane (`minecraft:glass_pane`)
- `m` = Blueberry muffin (`cluttered:blueberry_muffin`)
- `p` = Pain au chocolat (`cluttered:chocolate_croissant`)
- `r` = Cinnamon bun (`cluttered:cinnamon_bun`)

### Watering can (`cluttered:watering_can`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][ ][i]
[i][b][i]
[i][i][i]
```

Ingredientes:
- `b` = Bowl (`minecraft:bowl`)
- `i` = Lingote de hierro (`minecraft:iron_ingot`)

### Wedding arch (`cluttered:wedding_arch`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[f][f][f]
[f][ ][f]
[f][ ][f]
```

Ingredientes:
- `f` = Valla decorativa de wood (`cluttered:wooden_picket_fence`)

### Wine bottles (`cluttered:wine_bottles`) x1

- Tipo: Mesa de crafteo - sin forma

Ingredientes sin forma:
- Manzana (`minecraft:apple`)
- Sugar (`minecraft:sugar`) x2
- Sweet berries (`minecraft:sweet_berries`)
- Vidrio bottle (`minecraft:glass_bottle`) x3

### Wine rack (`cluttered:wine_bottle_rack`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[s]
[w]
[s]
```

Ingredientes:
- `s` = etiqueta Madera slabs (`#minecraft:wooden_slabs`)
- `w` = Wine bottles (`cluttered:wine_bottles`)

### Wood birdhouse (`cluttered:birdhouse_unpainted`) x1

- Tipo: Mesa de crafteo - con forma

Patrón:

```text
[ ][p][ ]
[p][f][p]
[p][s][p]
```

Ingredientes:
- `f` = Feather (`minecraft:feather`)
- `p` = etiqueta Tablones (`#minecraft:planks`)
- `s` = etiqueta Varillas madera (`#forge:rods/wooden`)

## blocks

### Reclaimed ladrillos (`cluttered:antique_bricks`) x1

- Tipo: Horno

- Entrada: Ladrillos (`minecraft:bricks`)
- Experiencia: `0.1`
- Tiempo de cocción: `200` ticks
