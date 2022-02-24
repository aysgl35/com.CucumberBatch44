Feature: US1007 Scenario Outlin ile amazon search

  Scenario Outline: TC12 amazonda bir listedeki tum elemntleri aratma
    Given kullanici "AmazonUrl" sayfasina gider
    Then "<aranacakEleman>" icin arama yapar
    And sonuclarin "<aranacakEleman>" icerdigini test eder

    Examples:
    |aranacakEleman|
    |Apple|
    |Java|
    |Samsung|
    |Armut|
    |nutella|