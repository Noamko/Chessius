#include "Leds.h"

void led::init() {
    for (int i = RGB_PORT_MIN; i <= RGB_PORT_MAX; i++) {
        pinMode(i, OUTPUT);
    }
}

void led::set_single(Led led, int value) {
    // should add here an if statement to check if led is initiated
    // should we do it in a class?
    digitalWrite()
}