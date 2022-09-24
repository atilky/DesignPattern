# 設計模式(Design Pattern) 讀書心得
###### tags: `讀書筆記`

[TOC] 
# 設計模式(Design Pattern)
+ Each pattern is a three-part rule,which expresses a relation between a certain context, a problem, and a solution
+ 每一個模式(Pattern)都是在
  某個環境下(Context)下
  針對某個問題(Problem)
  提出的解決方案(Solution)
+ 九大屬性
    + 名稱及分類(Name/Classifiction)
        + 模式主要分為三類
            + 行為類
            + 結構類
            + 創建類
            
    + 意圖(Intent)
        + 目的/預期成效
    + 動機(Motivation)
        + 如何解決問題
        + 此設計模式要解決什麼問題
    + 適用場景(Applicability)
    + 物件導向架構圖(Structure)
        + 類別圖
    + 物件實體參與者說明(Participants)
    + 參與者之間的互動說明(Collaborations)
    + 套用此模式的之後的優缺點(Consequences)
    + 不同語言下的各種實作方式(Implenentations)
+ 設計模式的優點
    + 提供軟體設計的客觀度量
        + 客觀描述
    + 再利用的解決方案
        + 用前輩得經驗來解決問題
    + 確立通用術語
        + 同事間的溝通
    + 使用物件導向技巧來提升軟體品質

# 策略模式(Strategy Pattern)
+ 組合爆炸
    + 當一個類別責任擁有太多責任時,而當每個責任都需要多型分支時,則組合就會爆炸
    + 這也是濫用繼承的結果
+ 我們在設計時會常講的話就是
    + 這個類別的責任是什麼?
    + 他的責任應該有什麼?

+ 現在遇到的困難
    + 用switch操作,擴充太複雜
    + 使用多型,會發生組合爆炸
+ 英雄的責任是什麼,技能是否可以拆開

# 設計模式基本介紹
## 設計模式的七大原則
+ 單一職責原則
+ 接口隔離原則
+ 依賴倒轉原則
+ 里氏替換原則
+ 開閉原則OCP
+ 迪米特原則
+ 合成復用原則

## 設計模式的的目的
+ 代碼重要性(相同代碼不需要重複寫)
+ 可讀性(讓其他人好理解)
+ 可擴展性
+ 可靠性(當新增功能後,不影響原本功能)
+ 高內聚,低耦合

## 單一職責原則(single responsibility)
+ 介紹:
    + 對類來說,一個類只需要負責一項職責,如類A負責兩個不同職責(A1,A2),當職責A1需求變更時,可能造成A2的錯誤,所以需要將類A分成A1 跟 A2

+ 細節
    + 降低複雜度,一個類只負責一個職責
    + 提高類的可讀性跟可維護性
    + 降低類修改的風險
    + 如果類的邏輯夠簡單或方法夠少,可以在方法級別實現單一職責原則

## 接口隔離原則(Interface Segregation Principle)
+ 介紹: 
    + 客戶端不應該依賴它不需要的接口,一個類對另外一個類的依賴應該建立在最小的接口上
+ 範例
+ ![](https://i.imgur.com/4BscrGW.png)
+ ![](https://i.imgur.com/KNEDxif.png)

## 依賴倒轉原則(Dependency Inversion Principle)
+ 介紹
    + 高層模塊不應該依賴低層模塊,兩者都應該依賴抽象
    + 抽象不應該依賴細節,細節應該依賴抽象
    + 依賴倒轉的中心思想是面相接口編程

+ 注意事項
    + 低模塊都要有抽象類或接口,或是兩者都有
        + 盡量都可以有個接口
    + 變量的聲明類盡量是抽象類或接口,這樣我們的變量引用和實際對象間,就存在一個緩衝層
    + 

+ 依賴關係傳遞的三種方式和應用
    + 接口傳遞
    + 建構傳遞
    + setting傳遞

## 里氏替换原则

## 開閉原則(Open Closed Principle)
+ 介紹
    + 模塊和函數應該對(提供方)擴展開放,對(使用方)修改關閉
    + 用抽象構建框架,用實現拓展細節
    + 當軟件需要變化時,盡量透過軟件實現的行為來實現變化,而不是修改已有的代碼

+ 方式1的優缺點com.principle.ocp.Ocp
    + 好理解,好寫
    + 缺點是違反OCP原則,對擴展開放(提供方),對修改關閉(使用方),當我們給類增加新功能時,盡量不要修改代碼

+ 方式1 改進com.principle.ocp.improve.Ocp
    + 思路:把創建shape當作抽象,讓繼承去實現就好
    + 使用方的代碼就不需要修改


## 迪米特原則(demeter)

+ 介紹
    + 降低耦合
    + 又稱最少知道原則:**一個類對自己依賴的類知道的越少越好**
    + 類對外除了提供的public方法，不對外洩露任何信息(對於被依賴的類不管多麼復雜，盡量將邏輯封裝在類的內部)
    + 只與直接的朋友通信
        + 直接朋友
            + 宣告變數
            + 方法的參數
            + 方法的return
        + 不是直接朋友
            + 方法中的類不是直接的朋友
    + 耦合的方式很多，依賴，關聯，組合，聚合等。其中，我們稱出現成員變量，方法參數，方法返回值中的類為直接的朋友，而出現在**局部變量中的類不是直接的朋友**。也就是說，陌生的類最好不要以局部變量的形式出現在類的內部
 
+ 範例
  com.principle.demeter.Demeter的printAllEmployee()
    
+ 改進com.principle.demeter.improve.Demeter
    + 應該避免類中出現非直接朋友關係的耦合

## 合成復用原則（Composite Reuse Principle）
+ 介紹
    + 原則是盡量使用合成/聚合的方式，而不是使用繼承
+ ![](https://i.imgur.com/a4i9Bwl.png)

# UML
![](https://i.imgur.com/iCJpVJp.png)

## 依賴關系（Dependence）

+ 介紹 : 只要在類中用到了對方，那麼他們之間就存在依賴關系。如果沒有對方，連編繹都會失敗
+ 舉例 : 
    + 類中用到了對方
    + 如果是類的成員屬性
    + 如果是方法的返回類型
    + 是方法接收的參數類型
    + 方法中使用到
+ com.principle.uml.dependence

## 泛化(繼承)關系(generalization）
+ 介紹 : 如果A類繼承B類,他們存在泛化關係

## 實現關系(implementation）
+ 介紹 : A類實現B類, 也是依賴關係的特例
+ com.principle.uml.implementation 
+ ![](https://i.imgur.com/Akx1eTu.png)

## 關聯關係(Association)
+ 介紹 : 
    + 類與類之間的關係,也是依賴關係的特例
    + 具有導航姓,即雙向關係或單向關係
    + 一對一 或 一對多  或 多對一
    
## 聚合關係(Aggregation)
+ 介紹 :
    + 表示的是整體和部分的關系，整體與部分可以分開
    + 聚合關系是關聯關系的特例
    + 具有關 聯的導航性與多重性
+ 範例 : 
+ com.principle.uml.aggregation
+ ![](https://i.imgur.com/8lV8z9b.png)


## 組合關係(Composition)
+ 介紹 :
    + 表示的是整體和部分的關系，但是**整體與部分不可以分開**
    + 類可以分開 -> 聚合
    + 類不可以分開 -> 組合
+ 範例 : 
+ com.principle.uml.composition
+ ![](https://i.imgur.com/zWQzquG.png)

# 設計模式的概述和分類
## 設計模式分為三種類型,共23種
+ 創建型模式
    + **單例模式**
    + 抽象工廠模式
    + 原型模式
        + 解決淺拷貝根深拷貝
    + 建造者模式
    + **工廠模式**
+ 結構型模式 -> 在軟件模式下思考
    + 適配器模式
    + 橋接模式
    + **裝飾模式**
        + 解決類爆炸問題
    + 組合模式
    + 外觀模式
    + 享元模式
    + **代理模式**
+ 行為者模式 -> 站在方法這角度來思考
    + 模板方法模式
    + 命令模式
    + 訪問者模式
    + 迭代器模式
    + **觀察者模式**
    + 中介者模式
    + 備忘錄模式
    + 解釋器模式(Interprete模式)
    + 狀態模式
    + 策略模式
    + 職責鏈模式(責任鏈模式)

# 單例模式(singleton)
+ 介紹:
    + 從設計層面,保證某個類只能存在一個對象實例，並且該類只提供一個取得其對象實例的方法(靜態方法)
## 單例模式的八種方法
+ 餓漢式(靜態常量)
+ 餓漢式(靜態代碼塊)
+ 餓漢式(線程不安全)
+ 餓漢式(線程安全,同步方法)
+ 餓漢式(線程安全,同步代碼塊)
+ 雙重檢查
+ 靜態內部類
+ 枚舉
### 餓漢式(靜態常量)應用實例
+ 介紹
    + 構造器私有化(防止 new )
    + 類的內部創建對象
    + 向外暴露一個靜態的公共方法
    + 代碼實現
+ 餓漢式(靜態常量)優缺點
    + 優點
        + 在類裝載時就完成實例化。避免了線程同步問題
    + 缺點
        + 在類裝載的時候就完成實例化，沒有達到懶加載(Lazy Loading)的效果。如果從始至終從未使用過這個實例，則會造成內存的浪費
        + 如果在其他類裝載機制下,會造成不必要的浪費
    + 總結
        + 可用,可能造成內存的浪費
+ 範例
    + com.singleton.type1.SingletonTest01
### 餓漢式(靜態代碼塊)應用實例
+ 跟餓漢式(靜態常量)一樣,只是放在靜態代碼塊
+ 範例
    + com.singleton.type2.SingletonTest02

### 懶漢式(線程不安全)
+ 介紹
    + 起到了Lazy Loading的效果，但是只能在單線程下使用
    + 如果在多線程下，一個線程進入了if (singleton == null)判斷語句塊，還未來得及往下執行，另一個線程也通過了這個判斷語句，這時便會產生多個實例。所以在多線程環境下不可使用這種方式
+ 結論
    + 在實際開發中，不要使用這種方式

+ 範例 : com.singleton.type3.SingletonTest03
    
### 懶漢式(線程，同步方法)
+ 介紹 
    + 加上synchronized
+ 優缺點
    + 解決了線程不安全問題
    + 效率差
+ 結論：在實際開發中，不推薦使用這種方式
+ 範例 : com.singleton.type3.SingletonTest03

### 懶漢式(線程，同步代碼塊)
+ 介紹
    + 先判斷null,在加上synchronized
    + 無法解決線程問題,效率也低
+ 範例 : 無

### 雙重檢查
+ 介紹 : 
    + 用兩次的if(singletion == null)檢查,保證線程安全問題跟懶加載問題
    + 推薦使用 
+ 範例 : com.singleton.type6.SingletonTest06

### 靜態內部類
+ 介紹 :
    + 當類裝載時,靜態類內部類不會裝載,保證懶加載
    + 被調用時,才會裝載,並且只會裝載一次
    + 類在裝載時,JVM會幫我們保證線程的安全問題
    + 推薦使用
+ 範例 : com.singleton.type7.SingletonTest07

### 枚舉(enum)
+ 介紹 :
    + 使用枚舉來實現單例模式。不僅能避免多線程同步問題，而且還能防止反序列化重新創建新的對象
    + 推薦使用
+ 範例 : com.singleton.type8.SingletonTest08

## 單例模式的注意事項

# 工廠模式
+ 需求
    + 披薩的種類很多(比如 GreekPizz、CheesePizz 等)
    + 披薩的製作有 prepare，bake, cut, box
    + 完成披薩店訂購功能
+ 優點
    + 好理解,好操作
+ 缺點
    + 違反OCP原則:對擴展開放,對修改關閉
    + 新增pizza種類,需要修改代碼
+ UML
    + ![](https://i.imgur.com/jZNSsZs.png)
+ 如何改進
    + ![](https://i.imgur.com/FUP8nQW.png)


+ 介紹 
    +  簡單工廠模式是由一個工廠對象決定創建出哪一種產品類的實例
    +  定義了一個創建對象的類，由這個類來封裝實例化對象的行為
    +  當我們會用到大量的創建某種、某類或者某批對象時，就會使用到工廠模式

# 工廠方法模式
+ 需求
    + 披薩項目新的需求：客戶在點披薩時，可以點不同口味的披薩，比如 北京的奶酪pizza、北京的胡椒pizza 或者是倫敦的奶酪pizza、倫敦的胡椒pizza。
+ 思考
    + 使用工廠模式
    + 創建很多簡單工廠類,北京factory,倫敦factor是可以
    + 但可維護姓跟擴展性不好
    + 所以使用工廠方法模式

+ 介紹
    + 定義了一個創建對象的抽象方法，由子類決定要實例化的類。工廠方法模式將對象的實例化推遲到子類

+ 設計方案
    + 將披薩項目的實例化功能抽象成抽象方法，在不同的口味點餐子類中具體實現
    + ![](https://i.imgur.com/n6hH7xD.png)

+ 範例 : 
    + com.factory.factorymethod.pizzastore.order
    + com.factory.factorymethod.pizzastore.pizza

# 抽象工廠方法模式


+ UML
    + ![](https://i.imgur.com/0yoXrAL.png)


# 抽象工廠方法模式2 by tunling
+ 應用場景
    + 程序員需要處理不同系列相關產品時,但你不希望它依賴這些產品的具體類時
+ 優點
    + 可以確認你從工廠得到產品彼此兼容
    + 可以避免具體產品和客戶端代碼之前的緊密耦合
    + 符合單一職責原則
    + 符合開閉原則 

+ UML
+ ![](https://i.imgur.com/JXiH4zK.png)



# 原型模式
+ 需求
    + 現在有一只羊tom，姓名為: tom, 年齡為：1，顏色為：白色，請編寫程序創建和tom羊 屬性完全相同的10只羊
    + ![](https://i.imgur.com/SpKCuwz.png)
    + com.prototype.old
+ 優點
    + 好寫
+ 缺點
    + 創建一個新的對象,需要重新獲取原始對象的屬性,如果class夠複雜,效率低
    + 需要重新初始化對象,而不是動態獲得,不夠靈活
    + 如果要複製的對象新增/刪除屬性,client端也要改
    + 違反OCP原則
+ 用原型模式改進
    + 使用clone方法,可以將對象複製,但前提是須要實現Cloneable接口,該接口表示該類有複製的能力,就是原型模式
+ 介紹
    + 在原形class(要被複製的class)客製clone的方法
    + 讓創建class在創建另外一個可訂製或可複製的clas時,不需要知道細節
    + 創建類使用原形class的clone方法來複製或訂製另一個原形類
    + 原型模式預設為淺拷貝
    + ![](https://i.imgur.com/4DjZ7Wz.png)
    + com.prototype.improve
+ 哪邊有使用
    + Spring bean的創建
+ 淺拷貝
    + 如果class的屬性是基本類型,使用clone後,會複製到新的記憶體
    + 如果class的屬性是class,使用clone後,只會複製指向位置,並指向原本的class的class,變成都指向同一個位置,在這種狀況下,只要修改複製前的class的class,就會影響到複製後的class的class
    + Object的clone默認為淺拷貝
    + com.prototype.shallowcopy
+ 深拷貝
    + class的屬性是class,會複製一個新的記憶體位置給他,並將class的class的所有屬性都複製過去
    
+ 深拷貝的實現
    + 重寫clone方法實現深拷貝
    + 使用序列化跟反序列化
    + com.prototype.deepcopy

# 建造者模式
+ 需求
    + 需要建房子：這一過程為打樁、砌牆、封頂
    + 房子有各種各樣的，比如普通房，高樓，別墅，各種房子的過程雖然一樣，但是要求不要相同的
+ 實作
    + ![](https://i.imgur.com/0RJdFoI.png)
    + com.builder.old
+ 缺點
    + 沒有設計緩存層對象,不好拓展跟維護
    + 產品跟流程封裝在一起,耦合性太強
+ 介紹
    + 將復雜對象的建造流程抽象出來（抽象類別），使這個抽象過程的不同實現方法可以構造出不同表現（屬性）的對象
    + 是一步一步創建一個復雜的對象，它允許用戶只通過指定復雜對象的類型和內容就可以構建它們，用戶不需要知道內部的具體構建細節
+ 建造者的四個角色
    + Product(產品)
        + 具體的產品class
    + Builder(抽象建造者)
        + 創建一個product的抽象或接口
    + ConcreteBuilder(具體建構者)
        + 實現接口,建構和裝配各個零件
    + Director(指揮者)
        + 實現Builder接口,讓client可以傳入Builder.class
        + 控制產品的生產流程
        + 隔離客戶(client)跟產品(CommonHouse 跟 HightHouse)
    + ![](https://i.imgur.com/cuaDahy.png)
+ 範例
    + com.builder.improve

+ 哪邊有使用
    + StringBuilder
+ 注意事項
    + client不必知道產品內部的組成的細節,將產品與流程解偶和,使用相同的創建流程可以創建不同的產品對象
    + 用戶使用不同的建造者,可以得到不同的產品對象
    + 新增新的具體建造者(commonHouse),不需要修改原有類的代碼,符合OCP
    + 如果產品流程差異很大,就不適合建造者模式
+ 抽象工廠 VS 建造者模式 
    + https://www.youtube.com/watch?v=BcwVLx6XLBA&list=PLmOn9nNkQxJH-C-qEI2rpewHTI9ITpMkt&index=59&ab_channel=%E5%B0%9A%E7%A1%85%E8%B0%B7IT%E5%9F%B9%E8%AE%AD%E5%AD%A6%E6%A0%A1


# 適配器模式
+ 介紹
    + 讓原本因接口不匹配不能一起工作的兩個類可以協同工作
    + 分為三類：類適配器模式、對象適配器模式、接口適配器模式
+ 工作原理
    + 將一個類的接口轉為另外一種接口,讓原本不相容的類可以兼容
    + 解偶 : 從用戶的角度看不到被適配者
    + 用戶 -> 輸出目標(destination target) <- 適配器(adapter) <- 被適配者(source)
## 類適配器模式
+ 介紹
    + 適配器(adapter) 繼承 被適配者(source)
    + 適配器(adapter) 實現 輸出目標(destination target)接口
    + 完成 被適配者 -> 輸出目標
    + ![](https://i.imgur.com/O8lf4sV.png)
    + com.adapter.classadapter
+ 注意事項
    + 適配器需要繼承被適配者,然後還要求輸出目標必須為接口,所以有一定的侷限性
    + 適配器繼承被適配者,增加使用成本

## 對象配器模式
+ 介紹
    + 適配器改成持有被適配者的實例,解決兼容性
    + 持有 src類，實現 dst 類接口
    + 根據「合成復用原則」，在系統中盡量使用關聯關系來替代繼承關系
    + 對象適配器模式是適配器模式常用的一種
    + ![](https://i.imgur.com/5AMEmCQ.png)
    + com.adapter.objectadapter
    + 
## 接口適配器模式(Default Adapter Pattern)
+ 介紹
    + 適用於一個接口不想使用其所有的方法的情況
    + 當不需要全部實現接口提供的方法時，可先設計一個抽象類實現接口，並為該接口中每個方法提供一個空方法，抽象類的子類可有選擇地覆蓋父類的某些方法來實現需求
    + ![](https://i.imgur.com/Vp085OF.png)
    + com.adapter.interfaceadapter

# 橋接模式
+ 需求
    + 針對不同手機類型的不同品牌實現操作流程
    + 手機
    + ![](https://i.imgur.com/3Rw4HZT.png)
+ 問題
    + 類別爆炸,如果我們增加手機的樣式(旋轉式),就需要增加各樣品
    + 違反單一職責原則,當我們增加手機樣式,也要同時增加所有品牌手機
+ 基本介紹
    + 將介面與抽象放在兩個不同的類層次中,使兩個層次可以獨立改變
    + 橋接模式基於類的最小設計原則,通過封裝,聚合,繼承等行為讓不同的類承擔不同的職責
    + 把抽象跟介面分開,從而可以保持各部分的獨立性及對應他們功能的擴展
+ ![](https://i.imgur.com/K80NkfV.png)
+ ![](https://i.imgur.com/T9bsItO.png)
+ com.bridge

# 裝飾者模式(Decorator)
+ 需求 (星巴克咖啡訂單項目)
    + 咖啡種類/單品咖啡：Espresso(意大利濃咖啡)、ShortBlack、LongBlack(美式咖啡)、Decaf(無因咖啡)
    + 調料：Milk、Soy(豆漿)、Chocolate
    + 擴展新的咖啡種類時，具有良好的擴展性、改動方便、維護方便
    + 使用OO的來計算不同種類咖啡的費用: 客戶可以點單品咖啡，也可以單品咖啡+調料組合
+ 作法
    + Drink 是一個抽象類
    + des就是對咖啡的描述
    + cost() 方法就是計算費用，Drink 類中做成一個抽象方法
    + Decaf 就是單品咖啡， 繼承Drink, 並實現cost
    + Espress && Milk 就是單品咖啡+調料， 這個組合很多
+ ![](https://i.imgur.com/CBS3dyn.png)
+ 問題
    + 類別爆炸,當我們新增咖啡或調味,類的組合就會變多
+ 裝飾者模式
    + 動態的方式將新功能附加到對象上,在對象功能擴展方面,比繼承更有彈性,也符合OOP
+ 裝飾者原理
    + 1.裝飾者模式就像一個打包快遞
        + 主體 : 陶瓷,衣服(Component),被裝飾者
        + 包裝 : 報紙填充,木板(Decorator)
    + 2.Component
        + 主體: 類似前面的drink
    + 3.ConcreteComponent和Decorator

# 組合模式（Composite Pattern）
+ 需求
    + 編寫程序展示一個學校院系結構
    + 要在一個頁面中展示出學校的院系組成，一個學校有多個學院，一個學院有多個科系
    + 一般設計是會用繼承
    + 但管理的操作不方便，比如對學院、系的添加，刪除，遍歷等
    + 解決方式:把學校、學院、系都看做組織結構
    + 組合模式 
+ 介紹
    + 又叫部分整體模式
    + 創建了對象組的樹形結構，將對象組合成樹狀結構以表示「整體-部分」的層次關系
    + 可以讓client用一致性的方式處裡個別對象及組合對象
+ 解決的問題
    + 當處裡的對象類似一棵樹形的結構,而我們要對節點和葉子節點操作時,可以提供一致性的方式
+ 示意圖
    + ![](https://i.imgur.com/2No69zA.png)
+ 實作
    + ![](https://i.imgur.com/6C7FYL9.png)
    + com.composite
+ 哪邊有用到
    + Component : Map
        + 抽象的構建
    + CompositeComponent : HashMap
        + 中間的構建,用來實現相關方法
    + Leaf : Node
        + 是HashMap的靜態內部類,裡面就沒有put方法
+ 注意事項
    + 如果節點和葉子節點的方法和屬性都不一樣,不適合用組合模式

+ 組合的概念是「上層模組使用下層模組」
```java=
import java.io.*;   
import java.util.*;   
// class College  
class College {   
    public String name;   
    public String address;   
    College(String name, String address)   
    {   
        this.name = name;   
        this.address = address;   
    }   
}   
// University has more than one college.   
class University {   
    // reference to refer to list of college.   
    private final List<College> colleges;   
    University(List<College> colleges)  
    {  
        this.colleges = colleges;  
    }   
    // Getting total number of colleges  
    public List<College> getTotalCollegesInUniversity()   
    {   
        return colleges;   
    }   
}   
class CompositionExample {   
    public static void main(String[] args)   
    {   
        // Creating the Objects of College class.   
        College c1   
            = new College("ABES Engineering College", "Ghaziabad");   
        College c2   
            = new College("AKG Engineering College", "Ghaziabad");   
        College c3 = new College("ACN College of Engineering & Management Sudies",   
                           "Aligarh");   
        // Creating list which contains the no. of colleges.   
        List<College> college = new ArrayList<College>();   
        college.add(c1);   
        college.add(c2);   
        college.add(c3);   
        University university = new University(college);   
        List<College> colleges = university.getTotalCollegesInUniversity();   
        for (College cg : colleges) {   
            System.out.println("Name : " + cg.name   
                               + " and "  
                               + " Address : " + cg.address);   
        }   
    }   
}  
```

# 外觀模式(facade)
+ 需求
    + 組建一個家庭影院
    + DVD播放器、投影儀、自動屏幕、環繞立體聲、爆米花機等功能
+ 傳統寫法
```java=
	public static void main() {
		//1. 創建相關的對象
		//  DVDClass, ProjectClass, StereoClass  
		//2. 調用創建的各個對象的一系列方法
		//    各種方法
		//3. 調用DVDPlayer 對象的play方法
	}
```
+ 問題
    + 創建相關對象,使用相關方法，造成過程混亂
    + 不好維護
+ 解決思路
    + 提供一個界面,統一要使用的方法(ready, play, pause, end),用來訪問子系統的街口
    + 屏蔽內部子系統的細節
    + 調用端只需跟這個接口發生調用，而無需關心這個子系統的內部細節
+ 基本介紹
    + 也叫"過程模式"
    + 外觀模式為子系統中的一組接口提供一個一致的界面
    + 此模式定義了一個高層接口，這個接口使得這一子系統更加容易使用
    + 調用端只需跟這個接口發生調用，而無需關心這個子系統的內部細節
    + 外觀模式就是解決多個復雜接口帶來的使用困難，起到簡化用戶操作的作用
+ UML
    + ![](https://i.imgur.com/Xl17S06.png)
    + 外觀類(Facade): 為調用端提供統一的調用接口, 外觀類知道哪些子系統負責處理請求,從而將調用端的請求代理給適當子系統對象
    + 子系統的集合:處理Facade 對象指派的任務，他是功能的實際提供者
+ 程式碼
    + package com.facade
    
# 享元模式(flyweight)
+ 基本介紹
    + 常用於底層開發,解決系統效能問題
    + 解決重複對象的內存浪費問題,當系統中有大量相似對象時,可以從緩衝池拿,降低系統內存
    + String pool,數據連結池
+ UML
    + ![](https://i.imgur.com/XVoaGsq.png)


+ 內部狀態和外部狀態
    + 內部狀態(相對穩定)
        + 對象共享出來的信息,不會隨環境而有變化
    + 外部狀態(常變化的)
        + 會隨環境而有變化,不可共享的狀態

# 外觀模式(facade)-tuling
+ 使用時機
    + 當系統太過複雜了,用來整合
    + 當想要將系統整合時,可以使用facade
+ 優點
    + 簡化客戶端的運用
+ 缺點


# 策略模式
+ 使用時機
    + 當因為一個類因為有不同的行為,造成if...else帶來的複雜和難以維護
+ 使用
    + 使用介面,定義出行為,將一個類裡面的行為給拆分出來
    + 例如一個類有殭屍和行為,將行為拆分出來
+ 優點 
    + 避免使用過多的if else
    + 容易拓展
    + 靈活的替換行為