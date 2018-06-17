package david.balzan

import david.balzan.Traverser.Companion.processTree
import java.io.BufferedReader
import java.io.InputStreamReader


fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val tree = reader.use {
        it.readLines()
                .map { l ->
                    l.split(" ")
                            .map { s -> s.toInt() }
                }
    }

    val solution = processTree(tree)
}

