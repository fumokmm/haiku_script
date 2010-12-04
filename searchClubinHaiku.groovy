// Usage: groovy searchClubinHaiku.groovy > list.txt
import hatenahaiku4j.*

def api = new HatenaHaikuAPIHTML()

int page = 1
def getList = { api.getKeywordList('部', page++) }
def result = [] as HashSet

// 繰り返しキーワードリストを取得
list = getList()
while (list) {
    result.addAll( list.findAll{ it.title.endsWith('部') }*.title )
    list = getList()
}

// 出力
println( result.sort().collect{ "[[$it]]" }.join('\n') )
