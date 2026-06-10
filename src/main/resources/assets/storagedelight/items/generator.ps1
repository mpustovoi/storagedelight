$woods = @(
    "acacia", "bamboo", "birch", "cherry", "crimson",
    "dark_oak", "jungle", "mangrove", "oak", "pale_oak", "spruce", "warped"
)

Write-Host "What material do you want for the countertop?"
$material = Read-Host "> "
$material = $material.Trim().Replace(" ", "_")

$outputDir = "generated_item_models"
New-Item -ItemType Directory -Force -Path $outputDir | Out-Null

foreach ($wood in $woods) {
    $jsonContent = @"
{
  "model": {
    "type": "minecraft:model",
    "model": "storagedelight:item/${wood}_cabinet_with_${material}_countertop"
  }
}
"@

    $filename = "${wood}_cabinet_with_${material}_countertop.json"
    $filepath = Join-Path $outputDir $filename

    $jsonContent | Out-File -FilePath $filepath -Encoding utf8

    Write-Host "Generated $filename"
}