#!/usr/bin/env kotlin

import java.io.File

val versionFile = File("entrypoint.sh")

println(versionFile.absolutePath)

var version = ""

versionFile.readLines().forEach { line ->
    if (line.contains("version=")) {
        val startIndex = line.indexOf('=') + 1
        val endIndex = line.indexOf( '>', startIndex)

        version = line.substring(startIndex, endIndex).trim()
    }
}

val process: Process = ProcessBuilder("/bin/bash", "-c", "echo NEW_VERSION=$version >> \"\$GITHUB_OUTPUT\"")
    .inheritIO()
    .start()

process.waitFor()