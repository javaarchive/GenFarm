#!/bin/sh
./gradlew build
cp build/libs/fabric-example-mod-1.0.0.jar server/mods/genfarm.jar
