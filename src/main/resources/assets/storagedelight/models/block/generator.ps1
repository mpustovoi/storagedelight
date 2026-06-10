$woods = @(
    "acacia", "bamboo", "birch", "cherry", "crimson",
    "dark_oak", "jungle", "mangrove", "oak", "pale_oak", "spruce", "warped"
)

Write-Host "What material do you want for the countertop?"
$material = Read-Host "> "
$material = $material.Trim().Replace(" ", "_")

$outputDir = "generated_block_models"
New-Item -ItemType Directory -Force -Path $outputDir | Out-Null

foreach ($wood in $woods) {

    $baseJsonContent = @"
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

    $baseFilename = "${wood}_cabinet_with_${material}_countertop.json"
    $baseFilepath = Join-Path $outputDir $baseFilename
    $baseJsonContent | Out-File -FilePath $baseFilepath -Encoding utf8
    Write-Host "Generated $baseFilename"


    $openJsonContent = @"
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

    $openFilename = "${wood}_cabinet_with_${material}_countertop_open.json"
    $openFilepath = Join-Path $outputDir $openFilename
    $openJsonContent | Out-File -FilePath $openFilepath -Encoding utf8
    Write-Host "Generated $openFilename"
}