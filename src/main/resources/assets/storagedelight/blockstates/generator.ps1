$woods = @(
    "acacia", "bamboo", "birch", "cherry", "crimson",
    "dark_oak", "jungle", "mangrove", "oak", "pale_oak", "spruce", "warped"
)

Write-Host "What material do you want for the countertop?"
$material = Read-Host "> "
$material = $material.Trim().Replace(" ", "_")

$outputDir = "generated_blockstates"
New-Item -ItemType Directory -Force -Path $outputDir | Out-Null

foreach ($wood in $woods) {
    $baseModel = "storagedelight:block/${wood}_cabinet_with_${material}_countertop"
    $openModel = "${baseModel}_open"

    $jsonContent = @"
{
  "variants": {
    "facing=north,open=false": {
      "model": "$baseModel"
    },
    "facing=east,open=false": {
      "model": "$baseModel",
      "y": 90
    },
    "facing=south,open=false": {
      "model": "$baseModel",
      "y": 180
    },
    "facing=west,open=false": {
      "model": "$baseModel",
      "y": 270
    },
    "facing=north,open=true": {
      "model": "$openModel"
    },
    "facing=east,open=true": {
      "model": "$openModel",
      "y": 90
    },
    "facing=south,open=true": {
      "model": "$openModel",
      "y": 180
    },
    "facing=west,open=true": {
      "model": "$openModel",
      "y": 270
    }
  }
}
"@

    $filename = "${wood}_cabinet_with_${material}_countertop.json"
    $filepath = Join-Path $outputDir $filename

    $jsonContent | Out-File -FilePath $filepath -Encoding utf8

    Write-Host "Generated $filename"
}