#include <Arduino.h>

#include "LedController.h"
#include "Leds.h"

void setup() {
    led::init();
    LedController leds = LedController.getInstance();
}
void loop() {}