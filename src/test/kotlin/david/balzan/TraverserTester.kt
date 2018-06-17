package david.balzan

import david.balzan.Traverser.Companion.processTree
import org.junit.Assert
import org.junit.Test

class TraverserTester {
    @Test
    fun `test simple balanced tree`() {
        val tree = listOf(listOf(1), listOf(1, 2), listOf(1, 2, 3), listOf(1, 2, 3, 4))
        val solution = processTree(tree)

        Assert.assertEquals("1, 1, 1, 1", solution.path.joinToString())
    }

    @Test(expected = IllegalArgumentException::class)
    fun `test unbalanced tree`() {
        val tree = listOf(listOf(1), listOf(1, 2), listOf(1, 2, 3), listOf(1, 2, 4))
        val solution = processTree(tree)
        Assert.assertEquals("1, 1, 1, 1", solution.path.joinToString())
    }
}