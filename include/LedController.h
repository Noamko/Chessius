#pragma once

class LedController {
   private:
    LedController(/* args */) = default;

   public:
    static LedController& getInstance() {
        static LedController instance;
        return instance;
    }
    ~LedController();
};