package david.balzan

import david.balzan.Traverser.Companion.processTree
import org.junit.Assert
import org.junit.Test
import java.util.*

typealias Row = List<Int>
typealias Tree = List<Row>


class Traverser {
    class Solution(var value: Int, val path: LinkedList<Int>)

    companion object {


        fun processTree(tree: Tree): Solution {
            return Solution(0, LinkedList())
        }
    }
}

class TraverserTester {
    @Test
    fun `test simple balanced tree`() {
        val tree = listOf(listOf(1), listOf(1, 2), listOf(1, 2, 3), listOf(1, 2, 3, 4))
        val solution = processTree(tree)

        Assert.assertEquals("1, 1, 1, 1", solution.path.joinToString())
    }
}