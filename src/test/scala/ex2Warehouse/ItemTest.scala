package ex2Warehouse

import ex.Item
import org.junit.Assert.assertEquals
import org.junit.Test
import util.Sequences.Sequence

class ItemTest:

  @Test def testItemCreation(): Unit =

    val item = Item(code = 0, name = "Item0", "tag1", "tag2")
    assertEquals(0, item.code)
    assertEquals("Item0", item.name)
    assertEquals(Sequence("tag1", "tag2"), item.tags)
