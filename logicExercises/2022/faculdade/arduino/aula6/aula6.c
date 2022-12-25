#include <LiquidCrystal.h> //lib do LCD
LiquidCrystal lcd (8, 9, 4, 5, 6, 7);
int numRows = 2; //linhas
int numCols = 16; //colunas
int i = 0;
void setup()
{
  lcd.begin(numRows, numCols); //incio
  lcd.clear(); //limpa o lcd
}

void loop()
{
	lcd.setCursor(0, 0); //ajusta cursor
 	lcd.print("Arduino");
  	delay(1000);
  	lcd.clear();
    lcd.setCursor(0,1);
    lcd.print("Rules");
    delay(1000);
    lcd.clear();
}