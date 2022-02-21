byte ledPin[] = {2,4,6,8,10,13};
int ledDelay;
int potPin = 2;

void setup()
{
  for(int i = 0; i<6; i++){
  	pinMode(ledPin[i], OUTPUT);
  }
}

void loop(){
  ledDelay = analogRead(potPin);
  for(int i = 0; i<6; i++){
    digitalWrite(ledPin[i], HIGH);
    delay(ledDelay);
    digitalWrite(ledPin[i], LOW);
    delay(ledDelay);
  }
}