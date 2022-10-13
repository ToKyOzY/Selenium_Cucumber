
  Feature: US009 Class work

    Scenario Outline:
      When kullanici https://editor.datatables.net/ adresine gider
      Then new butonuna basar
      And "<first name>" girer
      And "<last name>" girer
      And "<position>" girer
      And "<office>" girer
      And "<extension>" girer
      And "<start date>" girer
      And "<salary>" girer
      And Create tusuna basar
      When kullanici "<first name>" ile arama yapar
      Then isim bolumunde "<first name>" oldugunu dogrular
      Examples:
        | first name | last name | position | office | extension | start date | salary |

      #5 farki kullanii bilgisi girer

      
