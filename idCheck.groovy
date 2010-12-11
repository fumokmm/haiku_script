class idに {
  // http://bit.ly/aZQ5R4
  static def アルファベットの重複があるか = { id ->
    !id ?: id.any{ id.count(it) > 1 }
  }
  // http://bit.ly/bqCAZ1
  static def ハイフンが付いているか = { id ->
    !id ?: id.contains('-')
  }
  // http://bit.ly/aQysVk
  static def アンダーバーが付いているか = { id ->
    !id ?: id.contains('_')
  }
}

assert idに.アルファベットの重複があるか('fumokmm')
assert idに.ハイフンが付いているか('test-test')
assert idに.アンダーバーが付いているか('test_test')
