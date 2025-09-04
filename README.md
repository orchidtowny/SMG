# Orchid Simple Material Generators

- Bumps required Java version to 17
- Bumps Slimefun4 API version from RC-28 to RC-29
- Improved null safety
- Terracotta gen ticks reduced from 10 to 4
- Migrated to Gradle & improved dev env
- Auto-update disabled by default in config
- Add quartz & advanced quartz gen (tick rate of 8)
- Add copper ingot & advanced copper ingot gen (tick rate of 8)
- Add packed mud gen (tick rate of 4)

## Todo
- Add deepslate gen (tick rate of 8)
- Add concrete gen (tick rate of 4)

# Info
SimpleMaterialGenerators (SMG for short) is a SlimeFun4 addon that helps alleviate some of the grind by providing simple generators that create simple materials.<br>

## What it adds
It currently adds generators for:<br>
Cobblestone, Stone, Smooth Stone, Diorite, Granite, Andesite, Dirt, Gravel, Sand, Glass, Netherrack, & Soul Sand<br>
There is an advanced tier of every generator that utilizes Supreme components if that plugin is on the server, else, core slimefun items<br>

## Using the generators
The generators by themselves will do nothing - at least not until they have a chest (directly) above them.<br>
(There's a multiblock example in the SMG category).<br>
Then they will start producing items.<br>
The `Rate` of their production is measured in Slimefun `Ticks`.<br>
The `Quantity` of their production is measured in # of items.<br>

## Downloads
You can download the latest version from [here]() [TODO]<br>

## Plans
There are plans to add more generators in the future (once I figure out how to do it)<br>
Namely generators for Water, Lava and dusts.<br>
