int ledPin1 = 9;
int ledPin2 = 10;
int ledPin3 = 11;

void setup()
{
  pinMode(ledPin1, OUTPUT);
  pinMode(ledPin2, OUTPUT);
  pinMode(ledPin3, OUTPUT);
}

void loop()
{
	analogWrite(ledPin1, random(256));
	analogWrite(ledPin2, random(256));
	analogWrite(ledPin3, random(256));
  delay(random(100));
}