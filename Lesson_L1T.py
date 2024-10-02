def on_button_pressed_a():
    basic.show_string("Hello, my name is Abdullah.")
input.on_button_pressed(Button.A, on_button_pressed_a)

def on_button_pressed_ab():
    basic.show_leds("""
        . . . . .
        . . . . .
        . . . . #
        . . . . .
        . . . . .
        """)
    game.pause()
    basic.show_leds("""
        . . . . .
        . . . . .
        . . . # .
        . . . . .
        . . . . .
        """)
    game.pause()
    basic.show_leds("""
        . . . . .
        . . . . .
        . . # . .
        . . . . .
        . . . . .
        """)
    game.pause()
    basic.show_leds("""
        . . . . .
        . . . . .
        . # . . .
        . . . . .
        . . . . .
        """)
    game.pause()
    basic.show_leds("""
        . . . . .
        . . . . .
        # . . . .
        . . . . .
        . . . . .
        """)
    basic.clear_screen()
input.on_button_pressed(Button.AB, on_button_pressed_ab)

def on_button_pressed_b():
    basic.show_string("" + str(input.temperature()))
input.on_button_pressed(Button.B, on_button_pressed_b)

def on_gesture_shake():
    basic.show_string("" + str(randint(1, 6)))
input.on_gesture(Gesture.SHAKE, on_gesture_shake)
