#!/bin/bash

# take destination input
# if no destination was provided, default to ~/.minecraft/mods/
DEST="$1"
if [[ -z "$DEST" ]]; then
    DEST="$HOME/.minecraft/mods/"
fi

# clean the output directory and build the mod
./gradlew clean
./gradlew build

# rename and copy the mod to the destination
mv -f build/reobfJar/output.jar build/ys1219s-mod.jar
cp -rf build/ys1219s-mod.jar "$DEST"