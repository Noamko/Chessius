#ifndef RGB_HANDALER_H
#define RGB_HANDALER_H

#include <Arduino.h>

#include "pinout.h"

namespace led {
typedef struct Led {
    int index;
    short pin;
    short value;
} Led;

typedef struct LedArray {
    Led* leds;

} LedArray;

void set_single(Led led, int value);
void init();
}  // namespace led
#endif