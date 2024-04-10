package ex2Warehouse

import ex.Warehouse
import ex.Item
import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import util.Sequences.Sequence
import util.Optionals.Optional.*

class WareHouseTest:
  var wh: Warehouse = Warehouse()

  @Test def testStoreItem(): Unit =
    val itemCode = 44
    val item = Item(itemCode, "nameItem", "tag1")
    wh.store(item)
    assertEquals(Just(item), wh.retrieve(44))

  @Test def testSearchItems(): Unit =
    val item = Item(10, "item2", "tag2")
    wh.store(item)
    assertEquals(Sequence(item), wh.searchItems("tag2"))

  @Test def testRemoveItem(): Unit =
    val itemToRemove = Item(0, "item0", "tag2", "tag1")
    wh.store(itemToRemove)
    wh.remove(itemToRemove)
    assertEquals(Empty(), wh.retrieve(0))

  @Test def testContainsItem(): Unit =
    val absentItemCode = 999
    val item = Item(10, "item2", "tag2")
    wh.store(item)
    assertTrue(wh.contains(10))
    assertFalse(wh.contains(absentItemCode))