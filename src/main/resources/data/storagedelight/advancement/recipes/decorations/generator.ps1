$woods = @(
    "acacia", "bamboo", "birch", "cherry", "crimson",
    "dark_oak", "jungle", "mangrove", "oak", "pale_oak", "spruce", "warped"
)

Write-Host "What material do you want for the countertop?"
$material = Read-Host "> "
$material = $material.Trim().Replace(" ", "_")

$outputDir = "generated_advancements"
New-Item -ItemType Directory -Force -Path $outputDir | Out-Null

foreach ($wood in $woods) {
    $jsonContent = @"
{
  "parent": "minecraft:recipes/root",
  "criteria": {
    "has_${material}_slab": {
      "conditions": {
        "items": [
          {
            "items": "minecraft:${material}_slab"
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
      "has_${material}_slab"
    ]
  ],
  "rewards": {
    "recipes": [
      "storagedelight:${wood}_cabinet_with_${material}_countertop"
    ]
  }
}
"@

    $filename = "${wood}_cabinet_with_${material}_countertop.json"
    $filepath = Join-Path $outputDir $filename

    $jsonContent | Out-File -FilePath $filepath -Encoding utf8

    Write-Host "Generated $filename"
}