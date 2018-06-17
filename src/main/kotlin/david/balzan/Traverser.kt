package david.balzan

import david.balzan.Traverser.Companion.processTree
import org.junit.Assert
import org.junit.Test
import java.util.*

typealias Row = List<Int>
typealias Tree = List<Row>


class Traverser {
    class Solution(var value: Int, val path: LinkedList<Int>) {
        fun addHead(headValue: Int): Solution {
            path.push(headValue)
            return Solution(headValue + value, path)
        }
    }

    companion object {


        private fun processRow(row: Row, lowerSolutions: List<Solution>): List<Solution> {
            require(row.size == lowerSolutions.size - 1)
            val leftRightSolutions = lowerSolutions.zip(lowerSolutions.drop(1))
            val minBelowSolutions = leftRightSolutions.map { (left, right) ->
                if (left.value <= right.value) left else right
            }
            return row.zip(minBelowSolutions).map { (value, belowSolution) ->
                belowSolution.addHead(value)
            }
        }

        fun processTree(tree: Tree): Solution {
            val reversedTree = tree.reversed()
            val bottomSize = reversedTree.first().size
            val emptySolutions = IntRange(0, bottomSize).map {
                Solution(0, LinkedList())
            }
            val finalSolution = reversedTree.fold(emptySolutions) { solution, row -> processRow(row, solution) }
            return finalSolution.first()
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