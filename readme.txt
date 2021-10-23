Adapter Design Pattern - 
I have created Adapter design pattern where StockExchange and NSEBSEStocks are the Interfaces, ViewBSEStock and ViewNSEStock is concrete classes, StockAdapter is adapter class implementing the NSEBSEStocks interface and Stocks is a concrete class implements NSEBSEStocks. My main class is StockAdapterMain.

Command Design Pattern - 
I have created Command Design Pattern where Order is the interface, Stock is the request class, BuyStock and SellStock is a concrete class implements Order, Broker is the broker class. The StockMain is the main class. In result we can see if the stock is bought or sold.

Facade Design Pattern - 
I have created StockFacadeMain as the main class, Stock as interface, BSEStock, IPOStock and NSEStock as concrete classes implementing the same interface and Broker as facade class.

Factory Design Pattern - 
I have created StockFactoryMain as the main class, Stock as interface, BSEStock, IPOStock and NSEStock as concrete classes implementing the same interface and Broker as factory class to generate object of concrete class.