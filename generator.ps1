$woods = @(
    "acacia", "bamboo", "birch", "cherry", "crimson",
    "dark_oak", "jungle", "mangrove", "oak", "spruce", "warped"
)

Write-Host "What material do you want for the countertop?"
$material = Read-Host "> "
$material = $material.Trim().Replace(" ", "_")

# Handle the specific case for stone bricks slab naming
$slabMaterial = $material
if ($material -eq "stone_bricks") {
    $slabMaterial = "stone_brick"
}

# Base paths
$baseAssets = "src/main/resources/assets/storagedelight"
$baseData = "src/main/resources/data/storagedelight"

# Target directories
$blockstatesDir = Join-Path $baseAssets "blockstates"
$itemsDir = Join-Path $baseAssets "items"
$blockModelsDir = Join-Path $baseAssets "models/block"
$itemModelsDir = Join-Path $baseAssets "models/item"
$advancementsDir = Join-Path $baseData "advancements/recipes/decorations"
$lootTablesDir = Join-Path $baseData "loot_tables/blocks"
$recipesDir = Join-Path $baseData "recipes"

# Ensure directories exist
$directories = @($blockstatesDir, $itemsDir, $blockModelsDir, $itemModelsDir, $advancementsDir, $lootTablesDir, $recipesDir)
foreach ($dir in $directories) {
    if (-not (Test-Path $dir)) {
        New-Item -ItemType Directory -Force -Path $dir | Out-Null
    }
}

foreach ($wood in $woods) {
    $filename = "${wood}_cabinet_with_${material}_countertop.json"
    $baseModel = "storagedelight:block/${wood}_cabinet_with_${material}_countertop"
    $openModel = "${baseModel}_open"

    # --- 1. Blockstates ---
    $blockstatesContent = @"
{
  "variants": {
    "facing=north,open=false": { "model": "$baseModel" },
    "facing=east,open=false": { "model": "$baseModel", "y": 90 },
    "facing=south,open=false": { "model": "$baseModel", "y": 180 },
    "facing=west,open=false": { "model": "$baseModel", "y": 270 },
    "facing=north,open=true": { "model": "$openModel" },
    "facing=east,open=true": { "model": "$openModel", "y": 90 },
    "facing=south,open=true": { "model": "$openModel", "y": 180 },
    "facing=west,open=true": { "model": "$openModel", "y": 270 }
  }
}
"@
    $blockstatesContent | Out-File -FilePath (Join-Path $blockstatesDir $filename) -Encoding utf8

    # --- 2. Items definition ---
    $itemsContent = @"
{
  "model": {
    "type": "minecraft:model",
    "model": "storagedelight:item/${wood}_cabinet_with_${material}_countertop"
  }
}
"@
    $itemsContent | Out-File -FilePath (Join-Path $itemsDir $filename) -Encoding utf8

    # --- 3. Block Models ---
    $blockModelContent = @"
{
  "parent": "minecraft:block/cube_bottom_top",
  "textures": {
    "down": "storagedelight:block/${wood}_cabinet_side",
    "east": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_side",
    "north": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_front",
    "south": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_side",
    "up": "minecraft:block/${material}",
    "west": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_side",
    "particle": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_front"
  }
}
"@
    $blockModelContent | Out-File -FilePath (Join-Path $blockModelsDir $filename) -Encoding utf8

    $blockModelOpenContent = @"
{
  "parent": "minecraft:block/cube_bottom_top",
  "textures": {
    "down": "storagedelight:block/${wood}_cabinet_side",
    "east": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_side",
    "north": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_front_open",
    "south": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_side",
    "up": "minecraft:block/${material}",
    "west": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_side",
    "particle": "storagedelight:block/${wood}_cabinet_with_${material}_countertop_front_open"
  }
}
"@
    $blockModelOpenContent | Out-File -FilePath (Join-Path $blockModelsDir "${wood}_cabinet_with_${material}_countertop_open.json") -Encoding utf8

    # --- 4. Item Models ---
    $itemModelContent = @"
{
  "parent": "storagedelight:block/${wood}_cabinet_with_${material}_countertop"
}
"@
    $itemModelContent | Out-File -FilePath (Join-Path $itemModelsDir $filename) -Encoding utf8

    # --- 5. Advancements ---
    $advancementContent = @"
{
  "parent": "minecraft:recipes/root",
  "criteria": {
    "has_${slabMaterial}_slab": {
      "conditions": {
        "items": [
          {
            "items": "minecraft:${slabMaterial}_slab"
          }
        ]
      },
      "trigger": "minecraft:inventory_changed"
    },
    "has_the_recipe": {
      "conditions": {
        "recipe": "storagedelight:${wood}_cabinet_with_${material}_countertop"
      },
      "trigger": "minecraft:recipe_unlocked"
    }
  },
  "requirements": [
    [
      "has_the_recipe",
      "has_${slabMaterial}_slab"
    ]
  ],
  "rewards": {
    "recipes": [
      "storagedelight:${wood}_cabinet_with_${material}_countertop"
    ]
  }
}
"@
    $advancementContent | Out-File -FilePath (Join-Path $advancementsDir $filename) -Encoding utf8

    # --- 6. Loot Tables ---
    $lootTableContent = @"
{
  "type": "minecraft:block",
  "pools": [
    {
      "name": "pool1",
      "rolls": 1,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "storagedelight:${wood}_cabinet_with_${material}_countertop"
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}
"@
    $lootTableContent | Out-File -FilePath (Join-Path $lootTablesDir $filename) -Encoding utf8

    # --- 7. Recipes ---
    $recipeContent = @"
{
  "type": "minecraft:crafting_shaped",
  "category": "misc",
  "pattern": [
    "AAA",
    "C C",
    "BBB"
  ],
  "key": {
    "A": {
      "item": "minecraft:${slabMaterial}_slab"
    },
    "B": {
      "item": "minecraft:${wood}_slab"
    },
    "C": {
      "item": "minecraft:${wood}_trapdoor"
    }
  },
  "result": {
    "id": "storagedelight:${wood}_cabinet_with_${material}_countertop"
  }
}
"@
    $recipeContent | Out-File -FilePath (Join-Path $recipesDir $filename) -Encoding utf8

    Write-Host "Generated all files for $wood cabinet with $material countertop."
}

Write-Host "Finished generating all files!"