#!/bin/bash

# take destination input
# if no destination was provided, default to ~/.minecraft/mods/
DEST="$1"
if [[ -z "$DEST" ]]; then
    DEST="$HOME/.minecraft/mods/"
fi

# clean the output directory and build the mod
echo "Building..."
./gradlew clean &> /dev/null
./gradlew build &> /dev/null
echo "Built mod!"

# rename and copy the mod to the destination
echo "Copying mod to: $DEST"
mv -f build/reobfJar/output.jar build/ys1219s-mod.jar &> /dev/null
cp -rf build/ys1219s-mod.jar "$DEST" &> /dev/null
echo "Copied!"